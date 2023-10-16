import java.util.Scanner;
public class WhileGaji08Modif {

    public static void main(String[] args) {
        Scanner scan08 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan08.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihlah jabatan - Direktur, Manajer, Karyawan, Pegawai");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan08.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan08.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            }else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            else if (jabatan.equalsIgnoreCase("Pegawai")) {
                gajiLembur = jumlahJamLembur * 50000;
            } else {
                System.out.println("Jabatan Invalid");
            }

            totalGajiLembur += gajiLembur;
        }

        System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}
