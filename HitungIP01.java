import java.util.Scanner;

public class HitungIP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = input.nextLine();

        System.out.print("Masukkan jumlah SKS: ");
        int jumlahMataKuliah = input.nextInt();
        
        double totalIP = 0.0;
        int totalSKS = 0;
        int mataKuliahPerbaikan = 0;

        for (int i = 1; i <= jumlahMataKuliah; i++) {
            input.nextLine();  // Membersihkan newline dari buffer
            System.out.print("Masukkan nama mata kuliah ke-" + i + ": ");
            String namaMataKuliah = input.nextLine();

            System.out.print("Masukkan indeks nilai (A/B+/B/C+/C/D/E) mata kuliah ke-" + i + ": ");
            String indeksNilai = input.nextLine();

            System.out.print("Masukkan jumlah SKS mata kuliah ke-" + i + ": ");
            int sks = input.nextInt();

            if (indeksNilai.equals("A")) {
                totalIP += 4.0 * sks;
            } else if (indeksNilai.equals("B+")) {
                totalIP += 3.5 * sks;
            } else if (indeksNilai.equals("B")) {
                totalIP += 3.0 * sks;
            } else if (indeksNilai.equals("C+")) {
                totalIP += 2.5 * sks;
            } else if (indeksNilai.equals("C")) {
                totalIP += 2.0 * sks;
            } else if (indeksNilai.equals("D") || indeksNilai.equals("E")) {
                mataKuliahPerbaikan++;
            }

            totalSKS += sks;
        }

        double ip = totalIP / totalSKS;

        System.out.println("\nNama Mahasiswa: " + namaMahasiswa);
        System.out.println("Indeks Prestasi (IP): " + ip);
        System.out.println("Total Mata Kuliah: " + jumlahMataKuliah);
        System.out.println("Total SKS: " + totalSKS);
        System.out.println("Jumlah Mata Kuliah Perbaikan/Remidi: " + mataKuliahPerbaikan);
    }
}