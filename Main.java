
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println(" ");
            System.out.print("Input kode biner (maksimal 8 digit): ");
            String inputBiner = input.nextLine();

            // limit LEngth input kode biner
            if (inputBiner.length() > 8) {
                System.out.println("Input melebihi 8 digit.");
            } else {
                try {
                    long angkaDesimal = Long.parseLong(inputBiner, 2);
                    //System.out.println("Decimal equivalent: " + angkaDesimal);
                    System.out.println("Angka desimal dari " + inputBiner + " adalah: " + angkaDesimal);
                } catch (NumberFormatException e) {
                    System.out.println("Input biner tidak valid. Masukkan kode biner dengan benar.");
                }
            }

            Scanner recheck = new Scanner(System.in);
            String choose = "";
            System.out.print("Apakah anda ingin mengecek kode biner yg lain? (Y/N) : ");
            choose = recheck.next();
            System.out.println();

            if (choose.equals("N")|| choose.equals("n")) {
                System.out.print("Terima Kasih.. ");
                System.out.println();

                break;
            }
        }
    }
}