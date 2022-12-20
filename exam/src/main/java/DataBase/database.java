package DataBase;

import entity.Admin;
import entity.Card;
import entity.Client;
import entity.Sotuvchi;
import java.util.Scanner;

public class database {
    public static String admin;
    public static Scanner intScanner;
    public static Scanner strScanner;
    public static String sotuvchi;
    public database(){
    }

    static{

        intScanner = new Scanner(System.in);
        strScanner = new Scanner(System.in);
      //  admin = new Admin("1","ssamiras","230507"
      //         ,new Card("123412341234","ssamiras","10000.0");

    }

}
