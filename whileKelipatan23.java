import java.util.Scanner;

public class whileKelipatan23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan,total,counter,i;
        total = 0;
        counter = 0;
        int rataRata = 0;
        

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        i = kelipatan;

        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
             i++;
        }

        rataRata = total/counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, rataRata);

        scan.close();
    }
}
