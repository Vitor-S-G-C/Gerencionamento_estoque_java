package Entits;

public class Client {

    private String nameClient ;
    private String emailClient ;
    private String passwordClient ;

    public Client(String nameClient, String emailClient,String  passwordClient){
        this.nameClient = nameClient;
        this.emailClient = emailClient;
        this.passwordClient = passwordClient;

    }


    public String getNameClient(){
        return nameClient;
    }
    public String getEmailClient(){
        return emailClient;
    }
    public String getPasswordClient(){
        return passwordClient;
    }

    @Override
    public String toString() {
        return "Usuário: " + nameClient + " | Email: " + emailClient + " | Senha: " + passwordClient;

    }
}






