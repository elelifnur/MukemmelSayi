import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args){
        int n;
        int sayac=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        n= input.nextInt();

        for(int i=1; i < n; i++){
            if(n % i == 0){
                sayac+=i;

            }
        }
        if(sayac==n){
            System.out.println(n+" Mükemmel sayıdır");
        }else{
            System.out.println(n+" Mükemmel sayı değildir.");
        }
    }
}
