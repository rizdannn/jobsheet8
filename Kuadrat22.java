import java.util.Scanner;

public class Kuadrat22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        for (int x = 1; x <= n; x++) {
            int total = 0;
            System.out.print("n = " + x + " -> jumlah kuadrat = ");

            for (int i = 1; i <= x; i++) {
                int kuadrat = i * i;
                total += kuadrat;

                System.out.print(kuadrat);
                if (i < x) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + total);
        }
    }

}
