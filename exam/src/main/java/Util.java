import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public interface Util {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    Scanner scanner = new Scanner(System.in);
    Scanner strScanner = new Scanner(System.in);



}

