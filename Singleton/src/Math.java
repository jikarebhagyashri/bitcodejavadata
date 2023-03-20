public class Math {
    public static Math math = null;
    private  Math(){

    }
    public  static Math getInstance(){
        if ( math== null){
            math = new Math();
        }
        return  math;
    }
    public  int add (int num1, int num2) {
        return num1 + num2;
    }
    public int sub (int num1, int num2) {
        return num1 - num2;
    }

}
