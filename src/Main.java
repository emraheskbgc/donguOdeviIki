import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi , toplam = 0;

        do {
            System.out.print("Lütfen Bir Sayı Giriniz = ");
            sayi = input.nextInt();
            if (sayi %2==0 && sayi%4 ==0){
                toplam += sayi;
            }
        }while (sayi %2 == 0);

        System.out.println("toplam = " + toplam);

    }
}
