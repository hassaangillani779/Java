import java.util.Scanner;
public class Product {
    Scanner input = new Scanner(System.in);

    // private data members of a product
    private int prodid;
    private String prodname;
    private double costprice;
    private double saleprice;
    private int quantity;

    // constructor - 'this' is used because parameter names are same as attribute names
    public Product(int prodid, String prodname, double costprice, double saleprice, int quantity) {
        this.prodid = prodid;
        this.prodname = prodname;
        this.costprice = costprice;
        this.saleprice = saleprice;
        this.quantity = quantity;
    }

    // shows all details of one product
    public void display() {
        System.out.println("Product ID: " + prodid);
        System.out.println("Product Name: " + prodname);
        System.out.println("Cost Price: " + costprice);
        System.out.println("Sale Price: " + saleprice);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }

    // getter so we can check the name from outside the class
    public String getProdname() {
        return prodname;
    }
}


class ProductManagement {

    // looks for a product by name, prints it if found
    static void search(Product[] products, String name) {
        boolean found = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i].getProdname().equalsIgnoreCase(name)) {
                System.out.println("\n===== Product Found =====\n");
                products[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nProduct not found.");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Product[] products = new Product[5];

        // taking details of 5 products from the user
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details of Product " + (i + 1));

            System.out.print("Product ID: ");
            int id = input.nextInt();
            input.nextLine(); // clears the leftover newline

            System.out.print("Product Name: ");
            String name = input.nextLine();

            System.out.print("Cost Price: ");
            double cost = input.nextDouble();

            System.out.print("Sale Price: ");
            double sale = input.nextDouble();

            System.out.print("Quantity: ");
            int qty = input.nextInt();

            System.out.println();

            products[i] = new Product(id, name, cost, sale, qty);
        }

        // showing all products before searching
        System.out.println("===== All Products =====\n");
        for (int i = 0; i < products.length; i++) {
            products[i].display();
        }

        // searching by name
        input.nextLine(); // clears newline again before reading a string
        System.out.print("Enter product name to search: ");
        String searchName = input.nextLine();

        search(products, searchName);

        input.close();
        //Need to understand
    }
}