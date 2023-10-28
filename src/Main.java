import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int us;
        int alt;
        Scanner input = new Scanner(System.in);
        System.out.print("Üstü alınacak sayıyı giriniz: ");
        alt = input.nextInt();
        System.out.print("Üstü giriniz: ");
        us = input.nextInt();

        //3^4 = 3*3*3*3 = 81

        int toplam = 1;

        int i = 1;
        while (i<=us){
            toplam *= alt;
            i++;
        }
        System.out.println(toplam);
    }
}
