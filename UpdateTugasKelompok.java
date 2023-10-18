import java.util.Scanner;

public class UpdateTugasKelompok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa " + i + ": ");
            String nama = input.next();
            System.out.print("Masukkan nilai Tugas: ");
            double nilaiTugas = input.nextDouble();
            System.out.print("Masukkan nilai Quiz: ");
            double nilaiQuiz = input.nextDouble();
            System.out.print("Masukkan nilai UTS: ");
            double nilaiUTS = input.nextDouble();

            double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiQuiz * 0.3) + (nilaiUTS * 0.5);
            System.out.println("Nilai akhir " + nama + " adalah: " + nilaiAkhir);

            if (nilaiAkhir >= 80) {
                if (nilaiAkhir >= 90) {
                    System.out.println("Nilai " + nama + " adalah A");
                } else {
                    System.out.println("Nilai " + nama + " adalah B");
                }
            } else {
                if (nilaiAkhir >= 70) {
                    System.out.println("Nilai " + nama + " adalah C");
                } else if (nilaiAkhir >= 50) {
                    System.out.println("Nilai " + nama + " adalah D");
                } else {
                    System.out.println("Nilai " + nama + " adalah E");
                }
            }
        }
    }
}
