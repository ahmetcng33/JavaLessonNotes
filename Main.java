import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ROUNDİNG METHODS
        System.out.println(Math.ceil(2.1));         // Tavana yuvarlama Return 3
        System.out.println(Math.floor(2.9));        //Aşağı yuvarlama return 2
        System.out.println(Math.rint(2.5));         //Hangisi daha yakınsa ona yuvarlar ama eşitse çifte yuvarlar
        System.out.println(Math.round(2.3));        //Yuvarlama için kullanılır floor(x + 0.5) mantığında çalışır
        //! Örnek Çözümü
        System.out.println(Math.ceil(2.1));         //return 3.0
        System.out.println(Math.ceil(-2.1));        //return -2.0
        System.out.println(Math.floor(2.1));        //return 2.0
        System.out.println(Math.floor(-2.1));       //return -3.0
        System.out.println(Math.rint(2.1));         //return 2.0
        System.out.println(Math.rint(2.5));         //return 2.0
        System.out.println(Math.rint(-2.5));        //return -2.0

        System.out.println(Math.abs(-15.0));        //Mutlak değer almaya yarar
        System.out.println(Math.max(2.5, 5));       //Büyük olanı dönderir
        System.out.println(Math.min(2.5, 5));       //Küçük olanı dönderir
        System.out.println(Math.signum(-15.0));     //işaretini dönderir return -1
        System.out.println(Math.signum(15.0));      //return 1
        System.out.println(Math.signum(0));         //return 0



        //10-15 Arası rastgele sayı üretme
        System.out.println(Math.random());          //0-1 arası rastgele bir sayı üretir
        System.out.println(10 + (int)(Math.random() * 5));      //0-1 arası sayıyı 5 le çarpıp tam kısmını aldık

        //2. Yol
        Random random = new Random();
        System.out.println(random.nextInt(100));        //rastgele int değer üretme
        System.out.println(random.nextDouble(100));     //rastgele double değer üretme

        //Multi Thread kullanıyorsak bu 3. yol yapılıcak
        int rand = ThreadLocalRandom.current().nextInt(50, 100);        //50-100 arası rastgele sayı current sayesinde direk üretme işlemi yapıyoruz
        System.out.println(rand);
    }
}