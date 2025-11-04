import java.util.Scanner;

public class PenilaianKelompok22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        double nilai, totalNilai, rataNilai;

        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai kelompok " + i + ": " + rataNilai);
            System.out.println();

            i++;

            double rataTertinggi = 0;
            int kelompokTerbaik = 0;


            if (rataNilai > rataTertinggi) {
             rataTertinggi = rataNilai;
             kelompokTerbaik = i - 1;
            }

            System.out.println("\nKelompok dengan rata-rata tertinggi adalah Kelompok ke-" 
                    + kelompokTerbaik + " dengan rata-rata " + rataTertinggi);
        }

    }
}
