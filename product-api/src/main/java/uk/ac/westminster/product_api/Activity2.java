package uk.ac.westminster.product_api;

public class Activity2 {
    public static void main(String[] args) {
        int quantity =3;
        double unitPrice=24.99;
        String name ="Wireless Mouse";
        boolean inStock=true;

        double total = calculatetotal(quantity,unitPrice);
        System.out.println("Price of " +name+" in Pound is : "+ total);
    }
    public static double calculatetotal(int qty, double unitprice){
        return qty*unitprice;
    }
}
