import java.util.Scanner;
public class soal2 {    
        static void volumetabung(Double r , double t ){
            double phi = 3.14;
            double result = phi * r * r * t;
            System.out.println("volume tabung "+ result);
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("masukan nilai r");
            double r = input.nextDouble();
            System.out.println(" masukan nilai t");
            double t = input.nextDouble();
            volumetabung(r, t);
            
        }
}
