package entity;

import java.util.ArrayList;

public class Dokon {
        private ArrayList<Product> orderlist = new ArrayList<Product>();
        private boolean payment = false;
        private boolean register = false;
        public void addProdToOrder(ArrayList<Product> orderlist) {
            this.orderlist = orderlist;
        }
        public void addOrder(Product product) {
            orderlist.add(product);
        }
        public boolean isPayment() {
            return payment;
        }
        public void setPayment(boolean s) {
            payment = s;
        }

        public boolean isRegister() {
            return register;
        }

        public void setRegister(boolean s) {
            register = s;
        }

    }

