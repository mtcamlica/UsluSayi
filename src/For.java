import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int us;
        int alt;
        Scanner input = new Scanner(System.in);
        System.out.print("Üstü alınacak sayıyı giriniz: ");
        alt = input.nextInt();
        System.out.print("Üstü giriniz: ");
        us = input.nextInt();

        int toplam = 1;
        for(int i=1; i<=us; i++) {
            toplam *= alt;
        }
        System.out.print("Toplam: " + toplam);
    }
}
