import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class example {
    public static void fibonacchi(){
            /*
Fibonacci dizisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
*/

    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    0-1-1-2-3-5-8-13-21-34....
    */
        List<Integer> fibonacchi = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");

        int sayi = scan.nextInt();


        fibonacchi.add(0);
        fibonacchi.add(1);

        int i = 1;

        if (sayi <= 1) {
            System.out.println("Lutfen 1 'den buyuk bir sayi giriniz");
        } else {
            while (fibonacchi.get(i) < sayi) {
                fibonacchi.add(fibonacchi.get(i) + fibonacchi.get(i - 1));
                i++;// bir basamak ilerlesin
            }
            if (fibonacchi.get(fibonacchi.size() - 1) > sayi) {//fibonacchide yer almiyorsa
                fibonacchi.remove(fibonacchi.size() - 1);//son elemani sil
                System.out.println("Girdiginiz sayi fibonacchide yer almiyor .Girilen sayiya kadarki fibonachi " + fibonacchi);
            } else {
                System.out.println("Girdiginiz sayi bir fibonacchi sayisidir " + fibonacchi);
            }
        }

    }


    public static void main(String[] args) {

        //asal ve tek sayılara bakalım


        boolean asalMi=true;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num= scan.nextInt();
        if (num%2==0){
            System.out.println("bu sayi tek sayi değildir");
        }else {
            fibonacchi();


        }
    }}