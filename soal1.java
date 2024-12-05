import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" masukan bilangan anda");
        int bilangan = input.nextInt();


        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
    }
}    