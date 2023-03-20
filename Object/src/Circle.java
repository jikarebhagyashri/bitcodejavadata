public class Circle extends Shape{

    private   int r;

    public Circle (int x, int y , int r){
        super(x, y);
        this.r = r;
    }

    @Override
    public void Draw() {
        super.Draw();
        System.out.println("r = " + r);
    }

    public int getR(){
        return r;
    }
    public void setR(int r){
        this.r = r;
    }

    @Override
    public String toString() {
        return "x = " + getX() + " Y = " + getY() + " R = " + getR();
    }

}
