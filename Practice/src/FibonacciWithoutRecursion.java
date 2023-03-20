public class FibonacciWithoutRecursion {
    public static void main(String arge[]) {
       /* int number1 = 0;
        int number2 = 1;
        int number3;
        int i;
        int count = 5;

        System.out.println(number1 + "" + number2);

        for (i=2; i<count; ++i){
            number3 = number1 + number2;
            System.out.println("" + number3);
            number1 = number2;
            number2 = number3;
        }*/
        int i, j;
        for (i = 0; i <= 5; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


