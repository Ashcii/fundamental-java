public class Operator_Logika {
    public static void main(String[] args) {
        
        /*Operator AND (&&). Data yang dibandingkan akan bersifat true jika kedua nilai sama" true.
        Dan jika ada salah satu nilai saja yang false, maka hasilnya tetap akan false.*/
        
        /*Operator OR (||). Data yang dibandingkan akan bersifat true jika salah satu nilai/keduanya true.
        Dan akan bernilai false jika kedua hasil nilai sama" false.*/
        
        int nilaiMatematika, nilaiFisika, nilaiKimia;
        nilaiMatematika = 70;
        nilaiFisika = 80;
        nilaiKimia = 90;
       
        //Operator AND (&&)
        boolean and_a, and_b;
        and_a = nilaiMatematika < nilaiFisika && nilaiFisika > nilaiKimia; //Akan mencetak = False
        and_b = nilaiMatematika < nilaiFisika && nilaiKimia > nilaiFisika; //Akan mencetak = True

        System.out.println("Operator AND (&&)");
        System.out.println("Hasil a = " + and_a);
        System.out.println("Hasil b = " + and_b);

        //Operator OR (||)
        boolean or_a, or_b, or_c;
        or_a = nilaiMatematika < nilaiFisika || nilaiFisika > nilaiKimia; //Akan mencetak = True
        or_b = nilaiMatematika < nilaiFisika || nilaiKimia > nilaiFisika; //Akan mencetak = True
        or_c = nilaiMatematika > nilaiKimia || nilaiKimia < nilaiMatematika; //Akan mencetak = False

        System.out.println("\nOperator OR (||)");
        System.out.println("Hasil a = " + or_a);
        System.out.println("Hasil b = " + or_b);
        System.out.println("Hasil c = " + or_c);
    }
}
