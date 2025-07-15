import entits.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product details:");
        System.out.print("Enter the product name: ");
        String name = sc.nextLine();
        System.out.print("Enter the product price: ");
        double price = sc.nextDouble();
        System.out.print("Product quantity in stock: ");
        int quantity = sc.nextInt();


        System.out.println("=== PRODUCT DATA ===");
        Product product = new Product(name, price, quantity);
        System.out.println(product);

        System.out.print("How many products will be added to stock? ");
        int addQuantity = sc.nextInt();
        product.addProduct(addQuantity);
        System.out.println("=== UPDATED PRODUCT DATA ===");
        System.out.println(product);

        System.out.print("How many products were sold? ");
        int removeQuantity = sc.nextInt();
        product.removeProduct(removeQuantity);
        System.out.println("=== UPDATED PRODUCT DATA ===");
        System.out.println(product);

        sc.close();
    }
}
