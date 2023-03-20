import java.util.Random;

public class Emp {
    public int id;
    public String name;
    public int salary;
    public static String Company = "Bitcode";
    //private static String Company;
    public static int nextEmpId = 0;
    //private static int nextEmpId;


   /* static {
        System.out.println("static Block.....");
        Random random = new Random();
        nextEmpId = Math.abs(random.nextInt());
    }*/

    public Emp(int id, String name, int salary){
        this.id = ++nextEmpId;
        this.name = name;
        this.salary = salary;
    }

    public void Display(){
        System.out.println(" id = " + id + " name = " + name + " salary = " + salary + " company = " + Company);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public static String getCompany(){
        return Company;
    }
    public  void setCompany(String company){
        Emp.Company = company;
    }

}
