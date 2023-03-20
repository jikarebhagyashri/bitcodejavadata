public class Derived extends  Base{
    private  int D;

    public  Derived(){
        super(0);
        System.out.println("Derived()");
        this.D = 0;
    }

    public  Derived (int B, int D){
        super(B);
        System.out.println("Derived (int)");
        this.D = 0;
    }
    public  int getD(){
        return D;
    }
    public void setD(int D){
        this.D = D;
    }
    public void Display(){
        System.out.println(" derived = " + D);
        super.Display();
    }


}
