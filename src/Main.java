import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        System.out.print("Basamak sayısını giriniz :");
        a = input.nextInt();
        for (int i = 0; i < a; i++) {
            for (int b = 1; b <= (a - i); b++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}