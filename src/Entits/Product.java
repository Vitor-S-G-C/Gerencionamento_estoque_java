package Entits;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        // o this.*** está referenciando os atributos do objeto atual da classe Product,
        // para diferenciá-los dos parâmetros com o mesmo nome
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return  " Produto: " + name + " | Valor: R$ " + String.format("%.2f", price) + " | Estoque: " + quantity;
    }
}
