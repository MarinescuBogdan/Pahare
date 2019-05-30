package Pahare;

public class Pahare {

    public static void main(String[] args) {

        String pahar1 = "Bere";
        String pahar2 = "Vin";
        String pahar3 = "";


        System.out.println(pahar1 + " este " + pahar2);

        pahar3 = pahar1;
        pahar1 = pahar2;
        pahar2 = pahar3;

        System.out.println(pahar1 + " este " + pahar2);


    }
}
