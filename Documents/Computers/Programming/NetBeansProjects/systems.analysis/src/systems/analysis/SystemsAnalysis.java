package systems.analysis;

import java.util.Random;

/**
 * This was a test to check code compression, i took 20 lines and reduced it to one.
 * @author Ari
 */
public class SystemsAnalysis {

    //This method will go through the decision logic to process a
    //random order
    public static void main(String[] args) {

        boolean creditOK, inStock, waiver;

        creditOK = randomBoolean();
        inStock = randomBoolean();
        waiver = randomBoolean();

        //Code compression
        System.out.print((inStock && (creditOK | waiver)) ? "valid order" : "cannot complete order");

        /*
         if (creditOK && inStock && waiver) {
         System.out.print("valid order");
         } else if (creditOK && inStock && !waiver) {
         System.out.print("valid order");
         } else if (creditOK && !inStock && waiver) {
         System.out.print("cannot complete order");
         } else if (creditOK && !inStock && !waiver) {
         System.out.print("cannot complete order");
         } else if (!creditOK && inStock && waiver) {
         System.out.print("valid order");
         } else if (!creditOK && inStock && !waiver) {
         System.out.print("cannot complete order");
         } else if (!creditOK && !inStock && waiver) {
         System.out.print("cannot complete order");
         } else if (!creditOK && !inStock && !waiver) {
         System.out.print("cannot complete order");
         */
        /*if (inStock && (creditOK | waiver)) {
         System.out.print("valid order");
         } else if (!inStock || !creditOK && inStock && !waiver) {
         System.out.print("cannot complete order");
         }*/
    }

    public static boolean randomBoolean() {
        Random myRandom = new Random();
        if (myRandom.nextInt(2) % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
