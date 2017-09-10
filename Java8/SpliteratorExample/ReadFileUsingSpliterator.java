package SpliteratorExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadFileUsingSpliterator {

  public static void main(String[] args) {
    Path path = Paths.get("D:/MyWork/EmployeeDetails.txt"); // Use file given here and place it at some location and use
                                                            // that path here.
    try (Stream<String> lines = Files.lines(path)) {

      Spliterator<String> lineSpliterator = lines.spliterator();
      Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(lineSpliterator);

      Stream<Employee> employee = StreamSupport.stream(employeeSpliterator, false); // false as we dont need multi-threading.
      employee.forEach(System.out::println);

    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }
}
