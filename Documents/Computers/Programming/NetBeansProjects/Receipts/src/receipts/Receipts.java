package receipts;
public class Receipts {
    public static void main(String[] args) {
        int lumber_bought =5;
        double lumber_price = 8;
        
        System.out.println("Welcome to Homedepot!");
        System.out.println("123 Any Street");
        System.out.println("705-777-7777");
        System.out.println("");
        System.out.println("");
        System.out.println("Lumber 2x4     "+lumber_bought+"       $"+lumber_price+"     $"+subtotal(lumber_bought,lumber_price));
         System.out.println("subTotal     $32.00");
         System.out.println("tax     $4.16");
         System.out.println("Total Due     $36.16");

    }
    public static double subtotal(int quantity,double price){
        return quantity *price;
    }
}
