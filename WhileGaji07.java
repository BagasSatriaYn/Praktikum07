import java.util.Scanner;
public class WhileGaji07 {
    public static void main(String[] args) {
        
        Scanner scan07= new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur, totalGajiLembur;

        gajiLembur = 0;
        totalGajiLembur = 0;

        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan07.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manager, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan07.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan07.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("Manager")){
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("Karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            }
             else {
            System.out.println("Jabatan Invalid");
            i--;
            continue;
         }

            totalGajiLembur += gajiLembur;
     }
            System.out.println("Total gaji lembur: " + totalGajiLembur);

    }
}

    
    
