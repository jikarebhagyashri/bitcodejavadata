public class Main {
    public static void main(String[] args) {

        System.out.println("Company = " + Emp.getCompany());

        Emp e1 = new Emp(101,"Shaa",100);
        Emp e2 = new Emp(102, "Vishal", 500);

        e1.Display();
        e2.Display();


        e1.setCompany("BitCode");
        System.out.println(e1.getCompany());

        e1.Display();
        e2.Display();


    }
}