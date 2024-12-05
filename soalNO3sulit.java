public class  soalNO3sulit {
           public static void main(String[] args) {
            // Input array
            int[] angka = {1, 2, 2, 3, 2, 3, 4};
    
            System.out.println("Frekuensi setiap elemen dalam array:");
    
            // Perulangan pertama untuk memilih elemen
            for (int i = 0; i < angka.length; i++) {
                int count = 0; // Frekuensi elemen
                boolean sudahdihitung = false;
    
                // Cek apakah elemen sudah dihitung sebelumnya
                for (int k = 0; k < i; k++) {
                    if (angka[i] == angka[k]) {
                        sudahdihitung = true;
                        break;
                    }
                }
    
                // Jika elemen sudah dihitung, lewati
                if (sudahdihitung) {
                    continue;
                }
    
                // Hitung frekuensi elemen
                for (int j = 0; j < angka.length; j++) {
                    if (angka[i] == angka[j]) {
                        count++;
                    }
                }
    
                // Cetak hasil
                System.out.println(angka[i] + " muncul " + count + " kali");
            }
        }
    }
    
    

