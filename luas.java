import java.util.Scanner;
public class luas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KALKULATOR PERBANDINGAN\n=====================");
        int angka1, angka2;

        System.out.println("Masukkan Angka 1 : ");
        angka1 = scan.nextInt();

        System.out.println("Masukkan Angka 2 : ");
        angka2 = scan.nextInt();

        if (angka1 > angka2){
            System.out.println("Angka 1 lebih besar daripada Angka 2");
        } else{
            System.out.println("Angka 1 lebih kecil daripada Angka 2");
        }
        
        }
}
