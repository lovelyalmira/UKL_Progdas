import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah bilangan:");
        int n = input.nextInt(); 
        
        
        int[] array = new int[n];
        
       
        System.out.println("Masukkan bilangan-bilangannya:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        
        boolean hasDuplicate = false;

       
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Array memiliki elemen duplikat bilangan: " + array[i]);
                    hasDuplicate = true;
                }
            }
        }

        // Jika tidak ada duplikat
        if (!hasDuplicate) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }

        // Menutup scanner setelah digunakan
        input.close();
    }
}
