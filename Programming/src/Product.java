import java.util.*;
public class Product {
    ArrayList <Product> newProduct= new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    String productName;
    double price, salePrice;

  Product(){
      System.out.println("Hey what's up! ");
  }

  void display(){
      Product p1=new Product();
      System.out.println("Product Name: "+p1.productName);
      System.out.println("Product Price: "+p1.salePrice);

  }
  public static void main(String[] args){
      Product p1=new Product();
      Product p2=new Product();
      Product p3=new Product();


      new Product();

  }
}
