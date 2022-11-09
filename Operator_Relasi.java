public class Operator_Relasi {
    public static void main(String[] args) {
        int nilai1, nilai2, nilai3;
        nilai1 = 30;
        nilai2 = 20;
        nilai3 = 30;

        /* Keterangan: 
        > : lebih besar dari.
        >= : lebih besar atau sama dengan.
        < : lebih kecil dari.
        <= : lebih kecil atau sama dengan.
        == : sama dengan.
        != : tidak sama dengan.
        */

        System.out.println("Nilai 1 = 30, Nilai 2 = 20, Nilai 3 = 30");
        System.out.println("Nilai 1 lebih besar daripada Nilai 2: " + (nilai1 > nilai2));
        System.out.println("Nilai 1 lebih kecil daripada Nilai 2: " + (nilai1 < nilai2));
        System.out.println("Nilai 1 sama dengan Nilai 3: " + (nilai1 == nilai3));
        System.out.println("Nilai 1 tidak sama dengan Nilai 3: " + (nilai1 != nilai3));
        System.out.println("Nilai 1 lebih besar sama dengan Nilai 3: " + (nilai1 >= nilai3));
        System.out.println("Nilai 1 lebih kecil sama dengan Nilai 3: " + (nilai1 <= nilai3));
    }    
}
