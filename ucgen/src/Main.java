import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double birinci,ikinci ,ucuncu,cevre,u,alan;
        Scanner input=new Scanner(System.in);
        System.out.println("birinci kenarı giriniz");
        birinci=input.nextInt();
        System.out.println("ikinci kenarı giriniz");
        ikinci=input.nextInt();
        System.out.println("ikinci kenarı giriniz");
        ucuncu=input.nextInt();

        cevre=birinci+ikinci+ucuncu;
        u=cevre/2;
        alan=Math.sqrt(u*(u-birinci)*(u-ikinci)*(u-ucuncu));
        System.out.println("üçgenin alanı:"+alan);



    }
}