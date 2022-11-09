public class Statement_ifelse {
    public static void main(String[] args) {
        int nilai_kkm, nilai_anda;
        nilai_kkm = 80;
        nilai_anda = 90;

        /*Karena nilai anda lebih besar daripada nilai kkm, maka output akan mencetak "Lulus!".
        Dan jika nilai anda ada dibawah kkm, maka output akan mencetak "Anda tidak lulus."*/
        if (nilai_anda >= nilai_kkm ) {
            System.out.println("Lulus!");
        } else {
            System.out.println("Anda tidak lulus.");
        }
    }
}