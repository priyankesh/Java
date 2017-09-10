package SpliteratorExample;

import java.util.Spliterator;
import java.util.function.Consumer;

public class EmployeeSpliterator implements Spliterator<Employee> {

  private Spliterator<String> lineSpliterator;
  private String name;
  private Integer age;
  private String department;

  public EmployeeSpliterator(Spliterator<String> lineSpliterator) {
    this.lineSpliterator = lineSpliterator;
  }

  @Override
  public boolean tryAdvance(Consumer<? super Employee> action) {
    if (this.lineSpliterator.tryAdvance(line -> this.name = line)
        && this.lineSpliterator.tryAdvance(line -> this.age = Integer.parseInt(line))
        && this.lineSpliterator.tryAdvance(line -> this.department = line)) {

      Employee e = new Employee(name, age, department);
      action.accept(e);
      return true;
    }
    return false;
  }

  @Override
  public Spliterator<Employee> trySplit() {
    return null; // It is used for parallel processing.
  }

  @Override
  public long estimateSize() {
    return lineSpliterator.estimateSize() / 3; // We have groups of three in EmployeeDetails.txt file.
  }

  @Override
  public int characteristics() {
    return lineSpliterator.characteristics();
  }

}
