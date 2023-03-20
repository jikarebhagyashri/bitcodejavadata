public class Base {


    private int B;

    public Base (){
        System.out.println("base()");
        this.B = 0;
    }
    public  Base (int B){
        System.out.println("Base(int)");
        this.B = 0;
    }
    public  int getB(){
        return B;

    }
    public void setB(int b){
        this.B = b;
    }
    public void  Display(){
        System.out.println(" Display = " + B);
    }

}
