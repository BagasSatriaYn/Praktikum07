import java.util.Scanner;
    public class ForKelipatan07 {
        public static void main(String[] args) {

            Scanner input07 = new Scanner(System.in);

            int bilangan, total, counter;
            total = 0;
            counter = 0;

            System.out.print("Masukkan bilangan kelipatan (1-9) : ");
            bilangan = input07.nextInt();

            for (int i = 0; i < 50; i++) {
                if (i% bilangan == 0) {
                    total += i;
                    counter++;
            
              }
         }
             System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter,  bilangan, total);
            
             
    }
}

