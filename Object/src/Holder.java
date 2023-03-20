public class Holder {

    public  int Data;

    public Holder(int data) {
        Data = data;
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "Data=" + Data +
                '}';
    }
}
