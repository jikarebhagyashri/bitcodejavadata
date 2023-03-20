public class Product {
     public int id;
     public  String title;
     public  String price;

     public Product( int id, String title, String price){
         this.id = id;
         this.title = title;
         this.price = price;
     }
     public  void  Display(){
         System.out.println(" id = " + id + " title = " + title + " price = " + price);
     }

     public int getId(){
         return id;
     }
     public void  setId(int id){
         this.id = id;
     }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
