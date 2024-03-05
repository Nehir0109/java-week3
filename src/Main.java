// Dizi Toplamı: Bir tamsayı dizisinin tüm elemanlarının toplamını bulan bir Java metodunu yazın.

public class Main{
    public static int toplamhesapla(int[] dizi) {

        int toplam =0;

        for(int eleman: dizi){
            toplam+=eleman;
        }

        return toplam;

    }

    public static void main(String[] args) {

        int dizi[] = {1,2,3,4,5,6,7,8,9,10};

        int toplam = toplamhesapla(dizi);

        System.out.println("Dizi Toplamı: "+ toplam);
    }
}
