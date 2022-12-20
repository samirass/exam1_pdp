package Controller;

import java.io.IOException;
import java.util.Scanner;
import java.util.Scanner;

public class MainController {
   ClientController clientController = new ClientController();
   Scanner scanner = new Scanner(System.in);
    public void mainController() throws IOException {
        String startupMenu = """
                * | Welcome!
                0 | exit
                1 | sign-in
                2 | sign-up
                """;
            System.out.println(startupMenu);
            switch (scanner.nextInt()) {
                case 0 -> {
                    System.out.println(" Bye bye... ");
                    return;
                }
                case 1 ->clientController.signIn();
                case 2 ->clientController.signUp();
                default -> System.out.println("Something went wrong!");
            }
        }


}
