public class Main {

    public static void main(String[] args) {

        /*Holder<Integer> hi = new Holder<Integer>(100);
        Holder<String> hs = new Holder<String>("Hello");
        Holder<Float> hf = new Holder<Float>(3.14f);
        Util.print1(hi);
        Util.print1(hs);
        System.out.println();
        Util.print2(hi);
        //Util.print2(hs); //will not work
        //Util.print2(hf);
        System.out.println();
        Util.print3(hi);
        Util.print3(hf);*/
        //Util.print3(hs);

        Pair<Integer, String> p1 = new Pair<Integer, String>(411001, "Pune");
        Pair<Float, String> p2 = new Pair<Float, String>(87.66f, "Demo Student");
        Pair<String, String> p3 = new Pair<String, String>("Vishal", "Pune 21");

        Util.print5(p1);
        Util.print5(p2);
        Util.print5(p3);

        System.out.println();

        Util.print6(p1);
        Util.print6(p2);
        Util.print6(p3);

        Holder<Integer> hi = new Holder<Integer>(100);
        Holder<String> hs = new Holder<String>("Hello");
        Holder<Float> hf = new Holder<Float>(3.14f);

        System.out.println();

        Data1 d1 = new Data1(100);
        Data2 d2 = new Data2(200);
        Data3 d3 = new Data3(300);

        Util.print9(d1);
        Util.print9(d2);
        /*Util.print9(p1);
        Util.print9(hs);*/

      /*  Util.print10(d1);
        Util.print10(d2);*/
        Util.print10(d3);


    }
}
