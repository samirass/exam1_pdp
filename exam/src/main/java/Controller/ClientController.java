package Controller;

import entity.Client;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
import static DataBase.database.strScanner;
public class ClientController {
    public void signIn() throws IOException {
        System.out.print(" - login: ");
        String login = strScanner.nextLine();
        System.out.print(" - password: ");
        String password = strScanner.nextLine();
        Client client = new Client();
        if (client == null) {
            System.out.println("User not found!");
            return;
        }
    }
    public void signUp() {
        Client client = new Client();
        System.out.print(" - name: ");
        String name = strScanner.nextLine();
        System.out.print(" - create a new password ");
        String password = strScanner.nextLine();
        System.out.println(" - Confirm a password");
        String confirm = strScanner.nextLine();
        if (password.equals(confirm)){
            System.out.println("Ok");
        }
       else if (!password.equals(confirm)){
            System.out.println("Wrong password!" +
                    "Enter again password"+strScanner.nextLine());
        }




    }

}