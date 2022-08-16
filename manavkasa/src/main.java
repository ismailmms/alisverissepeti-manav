
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double total,armutf=2.14,elmaf=3.67,domatf=1.11,muzf=0.95,patlıcanf=5.00;
        Scanner inp = new Scanner(System.in);

        System.out.println("Armutun Kilosunu Giriniz :");
        double armut= inp.nextDouble();

        System.out.println("Elmanın Kilosunu Giriniz :");
        double elma= inp.nextDouble();

        System.out.println("Domatesin Kilosunu Giriniz :");
        double domates= inp.nextDouble();

        System.out.println("Muzun Kilosunu Giriniz");
        double muz= inp.nextDouble();

        System.out.println("Patlicanın Kilosunu Giriniz");
        double patlican= inp.nextDouble();

        total=armut*armutf+elma*elmaf+domates*domatf+muz*muzf+patlican*patlıcanf;
        System.out.println("Toplam Alışveriş Tutarı: "+total);







    }}
