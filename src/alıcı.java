import java.util.Scanner;
public class alıcı {
    public static void main(String[] args) {
        Scanner tarayıcı = new Scanner(System.in);
        System.out.println("Kenar sayısını giriniz");
        int kenarSayisi = tarayıcı.nextInt();
        verici o =new verici();
        int sonuç = o.içAciToplamı(kenarSayisi);
        System.out.println("İç açıların toplamı :"+sonuç);
    }
}
