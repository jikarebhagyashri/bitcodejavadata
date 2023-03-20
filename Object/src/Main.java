public class Main {
    public static void main(String[] args) {
      Object obj ;

      obj = " I Love Java";
      System.out.println(obj.toString());

      obj = " I Know Java";
      System.out.println(obj.toString());

      obj = " I Don't Know";
      System.out.println(obj.toString());

      obj = new int[4];
      System.out.println(obj.toString() + " " + obj.hashCode());
    }
}