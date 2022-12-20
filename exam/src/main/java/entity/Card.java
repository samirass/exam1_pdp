package entity;

import java.util.ArrayList;
import java.util.Iterator;

public class Card {
    private String cardNumber;
    private String cardPassword;
    private Double balance;
    private ArrayList<String> history = new ArrayList();

    public Card(String cardNumber, String ssamiras, String s) {
    }
    public Card(String cardNumber, String cardPassword, Double balance) {
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.balance = balance;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.matches("[0-9]{16}")) {
            this.cardNumber = cardNumber;
        }

    }
    public String getCardPassword() {
        return this.cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        if (cardPassword.matches("[0-9]{4}")) {
            this.cardPassword = cardPassword;
        }
    }
    public Double getBalance() {
        return this.balance;
    }
    public void setBalance(Double balance) {
        if (balance > 0.0) {
            this.balance = balance;
        }
    }
    public void getHistory() {
        Iterator var1 = this.history.iterator();

        while(var1.hasNext()) {
            String s = (String)var1.next();
            System.out.println(s);
        }
    }
    public void setHistory(String str) {
        this.history.add(str);
    }
}


