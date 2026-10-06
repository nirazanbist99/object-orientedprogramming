package uk.ac.westminster.product_api;

public class Activity3 {
    public static void main(String[] args) {
        String[] names = {"Wireless Mouse", "27-inch Monitor", "USB-Cable", "Mechanical Keyboard"};
        double[] prices= {24.99, 249.99, 8.50, 119.00};
        double catalogueTotal = 0;

        for(int i=0;i< names.length;i++){
            catalogueTotal+=prices[i];

            if(prices[i]>100){
                System.out.println("Name:"+names[i]+", Price: "+prices[i]+" -premium");
            }else{
                System.out.println("Name:"+names[i]+", Price: "+prices[i]+" -standard");
            }
        }
        System.out.println("\nCatalogue Total: "+catalogueTotal);
    }
}
