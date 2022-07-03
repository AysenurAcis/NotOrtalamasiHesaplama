import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişken tanımlıyoruz
        int mat, fizik, kimya, tarih, turkce, muzik;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri alır
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce= inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik= inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();


        int toplam = (mat + fizik + kimya + turkce + muzik + tarih );
        double snc = toplam / 6;
        System.out.println("Ortalamanız :" + snc);

        // Ortalamaya göre geçme - kalma belirleyen koşul ifadesi
        String sonuc = snc >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız" ;
        System.out.println(sonuc);

    }
}