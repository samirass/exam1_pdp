package entity;
import java.util.ArrayList;

public class Sotuvchi {
    private String ID;
    private String login;
    private String password;
    private String Product[];

   public Sotuvchi(){
   }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getProduct() {
        return Product;
    }

    public void setProduct(String[] product) {
        Product = product;
    }
}
