public class Util {

    public static void print(Holder holder) {
        System.out.println(holder.getData());
    }

    public static void print1(Holder<?> holder) {
        System.out.println(holder.getData());
    }

    public static void print2(Holder<Integer> holder) {
        System.out.println(holder.getData());
    }

    public static void print3(Holder<? extends Number> holder) {
        System.out.println(holder.getData());
    }

    public static void print4(Pair pair) {
        System.out.println(pair);
    }

    public static void print5(Pair<?, ?> pair) {
        System.out.println(pair);
    }

    public static void print6(Pair<?, String> pair) {
        System.out.println(pair);
    }

    public static void print7(Pair<String, ?> pair) {
        System.out.println(pair);
    }

    public static void print8(Pair<? extends Number, String> pair) {
        System.out.println(pair);
    }

    public static void print9(Rules<?> rules) {

    }

    public static void print10(Rules<? extends Number> rules){

    }
}
