public class CircularShift {
  public static void main(String[] args) {
    String string1 = "ABCDEF";
    String string2 = "CDEFAB";
    String string3 = "ACDBEF";

    CircularShift cs = new CircularShift();

    System.out.println("S1, S2: " + cs.circular(string1, string2));
    System.out.println("S2, S1: " + cs.circular(string2, string1));
    System.out.println("S2, S3: " + cs.circular(string2, string3));
    System.out.println("S1, S3: " + cs.circular(string1, string3));
  }

  private boolean circular(String string1, String string2) {
    return (string1.length() == string2.length()
        && (string1.concat(string1).indexOf(string2) >= 0));
  }
}
