// Dizi Toplamı: Bir tamsayı dizisinin tüm elemanlarının toplamını bulan bir Java metodunu yazın.

/*public class Main{
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
}*/

// Dizi Ortalaması:Bir double dizisinin değerlerinin ortalamasını hesaplayan bir Java programı yazın

/*public class Main{
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);

        System.out.print("Beş tane sayı giriniz: ");
        double num1 = get.nextDouble();
        double num2 = get.nextDouble();
        double num3 = get.nextDouble();
        double num4 = get.nextDouble();
        double num5 = get.nextDouble();

        double dizi[]={num1,num2,num3,num4,num5};

        double ortalama = ortalama(dizi);

        System.out.println("Dizinin ortalaması: "+ortalama);

    }

    public static double ortalama(double[] dizi) {

        double toplam =0;

        for(double sayı: dizi){
            toplam += sayı;
        }

        return toplam / dizi.length;
    }
}*/

//Dizi Ters Çevirme: Bir dizinin elemanlarını yerinde ters çeviren bir metod yazın.

public class Main {
    public static void main(String[] args) {

        int dizi[] = {1,2,3,4,5};
        System.out.print("Orijinal dizi: ");
        diziyazdir(dizi);

        terscevir(dizi);

        System.out.print("Ters Çevrilmiş Dizi: ");
        diziyazdir(dizi);

    }

    public static void terscevir(int dizi[]){
        int baslangic =0;
        int bitis= dizi.length -1;

        while(baslangic < bitis){
            int temp = dizi[baslangic];
            dizi[baslangic] = dizi[bitis];
            dizi[bitis]= temp;

            baslangic ++;
            bitis --;
        }
    }

    public static void diziyazdir(int dizi[]){
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
        System.out.println();
    }

}