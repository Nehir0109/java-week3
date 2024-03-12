import java.util.Scanner;

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

/*public class Main {
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

}*/

//Dizi Arama: Bir dizide belirli bir elemanı arayan ve indeksini döndüren bir Java fonksiyonu yazın. Eğer eleman bulunamazsa, -1 dönmelidir.

/*public class Main{
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını girin: ");
        int n = get.nextInt();
        int[] dizi= new int[n];

        System.out.print("Dizinin elemanlarını girin: ");
        for(int i=0; i<n; i++){
            System.out.print("Eleman "+(i+1) + ": ");
            dizi[i] = get.nextInt();
        }

        System.out.print("Aramak istediğiniz elemanı girin: ");
        int arananEleman = get.nextInt();

        int indeks= diziArama(dizi, arananEleman);
        if(indeks != -1){
            System.out.println("Aranan elemanın indeksi: "+ indeks);
        }else{
            System.out.println("Aranan eleman bulunamadı.");
        }


    }

    public static int diziArama(int dizi[], int arananEleman){
        for(int i=0; i<dizi.length; i++){
            if(dizi[i] == arananEleman){
                return i; //eleman bulundu indeksi döndür
            }
        }

        return -1; //eleman bulunamadı
    }
}*/

//String Uzunluğu: Verilen bir string'in uzunluğunu, length() metodunu kullanmadan hesaplayan bir metod geliştirin.

/*public class Main{
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Lütfen bir string girin: ");
        String string = get.nextLine();

        int uzunluk = uzunlukhesapla(string);
        System.out.print("Girilen stringin uzunluğu: "+ uzunluk);


    }
    public static int uzunlukhesapla (String str){
        char dizi[] = str.toCharArray();
        int uzunluk =0;

        for(char karakter: dizi){
            uzunluk ++;
        }

        return uzunluk;
    }
}*/

//String Ters Çevirme: Bir string'i StringBuilder veya StringBuffer sınıflarını kullanmadan ters çeviren bir Java fonksiyonu yazın.

/*public class Main{
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);

        System.out.print("Bir kelime ya da cümle yazınız: ");
        String string = get.nextLine();

        String tersString = terscevir(string);

        System.out.print("Girilen String: "+string+ "\n");
        System.out.print("Ters String: "+ tersString);


    }
    public static String terscevir(String str){
        char karakterler[] = str.toCharArray();

        int baslangıc =0;
        int bitis = karakterler.length - 1;

        while(baslangıc < bitis){
            char gecici = karakterler[baslangıc];
            karakterler[baslangıc] = karakterler[bitis];
            karakterler[bitis]= gecici;

            baslangıc++;
            bitis --;
        }

        return new String(karakterler);
    }
}*/

// Dizi Birleşimi: İki dizinin birleşimini bulan ve sonucu yeni bir dizi olarak döndüren bir program yazın.

/*public class Main{
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        int dizi1[]= {1,2,3,4,5};
        int dizi2[]= {6,7,8,9,10};

        int birlesimDizisi[] = birlesikdizi(dizi1,dizi2);

        System.out.print("Dizi 1: "+ Arrays.toString(dizi1)+ "\n");
        System.out.print("Dizi 2: "+ Arrays.toString(dizi2) +"\n");
        System.out.print("Birleşik Dizi: "+ Arrays.toString(birlesimDizisi));

    }

    public static int[] birlesikdizi(int dizi1[], int dizi2[]){

        int birlesimUzunluk = dizi1.length + dizi2.length;

        int birlesimDizisi[]= new int[birlesimUzunluk];

        for(int i=0; i<dizi1.length; i++){
            birlesimDizisi[i]= dizi1[i];
        }

        for(int i=0; i<dizi2.length; i++){
            birlesimDizisi[dizi1.length+ i]=dizi2[i];
        }

        return birlesimDizisi;
    }
}*/


// lokumdaki çarpım tablosu egzersizi
public class Main{
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);

        System.out.print("Kaç satır ve sütunluk bir çarpım tablosu istersiniz?: ");
        int n = get.nextInt();


        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.printf("%5d",(i*j));
            }
            System.out.println();
        }

        System.out.print("Başka bir çarpım tablosu oluşturmak ister misiniz? (Y/N): ");
        String evethayir= get.next();


        if(evethayir.equals("y") || evethayir.equals("Y")){
            System.out.print("Kaç satır ve sütunluk bir çarpım tablosu istersiniz?: ");
            n = get.nextInt();
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    System.out.printf("%5d",(i*j));
                }
                System.out.println();
            }
        }else if(evethayir.equals("n") || evethayir.equals("N")){
            System.out.println("Hoşçakalın!");
        }else{
            System.out.println("Hata!");
        }

    }
}