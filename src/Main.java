import Entits.Client;
import Entits.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Para acessar o estoque Faça o cadastro");
        System.out.println("Digite seu nome");
        String nomecliente = sc.nextLine();
        // ⬆️ Crie um nome de usuario
        System.out.println("Digite seu Email");
        String emailcliente = sc.nextLine();
        // ⬆️ Coloque um email de acesso
        System.out.println("Crie uma senha");
        String senhacliente = sc.nextLine();
        // ⬆️ Crie uma senha
        Client c = new Client(nomecliente, emailcliente, senhacliente);

        System.out.println("\nDigite sua senha para confirmar:");
        String tentativa = sc.next();
        // ⬆️ Sistema de validação simples de senha

        if (tentativa == c.getPasswordClient()) {
            System.out.println("Acesso autorizado!");
            // segue o código
        } else {
            System.out.println("Senha incorreta. Encerrando programa.");
            return;
        }
        System.out.println(c);
        // ⬆️ Informações de cadastro

        System.out.println("Digite os dados do produto:");

        System.out.print("Nome do produto: ");
        String name = sc.next();
        // ⬆️ nome

        System.out.print("Preço do produto: ");
        double price = sc.nextDouble();
        //⬆️ preço
        System.out.print("Quantidade em estoque: ");
        int quantity = sc.nextInt();
        //⬆️ quantidade
        System.out.println("=== DADOS DO PRODUTO ===");
        Product p = new Product(name, price, quantity);
        System.out.println(p);
        System.out.print("Quantos produtos serão adicionados ao estoque? ");
        int addQuantity = sc.nextInt();
        p.addProduct(addQuantity);
        //⬆️ Adicionando produtos ao estoque
        System.out.println("=== DADOS ATUALIZADOS DO PRODUTO ===");
        System.out.print("Quantos produtos foram vendidos? ");
        int removeQuantity = sc.nextInt();
        p.removeProduct(removeQuantity);
        //⬆️ Removendo produtos do estoque
        System.out.println("=== "+ c.getNameClient()+" ATUALIZOU DADOS DO PRODUTO ===");
        System.out.println(p);
        String res = sc.next();
        sc.close();
    }
}
