import java.util.Scanner;
public class forCiftOrtalamaBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int average=0;
        int sayac=0;

        System.out.print("Bir sayı giriniz:");
        int sayi = input.nextInt();

        for(int i=1;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                average=average+i;
                sayac=sayac+1;

                System.out.println("SAYI "+ (sayac)+": "+i);
            }
        }
        System.out.println("Ortalama:"+ average/sayac);
    }

}





