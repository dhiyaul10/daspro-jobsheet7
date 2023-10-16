import java.util.Scanner;
public class DoWhileCuti08Modif2 {

    public static void main(String[] args) {
        Scanner scan08 = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = scan08.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scan08.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = scan08.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    System.out.println("Silahkan masukkan jumlah hari yang sesuai. ");
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            }
        } while (true);
    }    
}
