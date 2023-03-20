public class Main {
    public static void main(String[] args) {
      Math m1 = Math.getInstance();
      System.out.println(m1.add(100,200));

      Math m2 = Math.getInstance();
      System.out.println(m2.sub(500,300));

      Math m3 = Math.getInstance();
      System.out.println(m3.sub(1000,500));

      System.out.println((m1 == m2 ) + " " + (m2 == m3));

    }

}