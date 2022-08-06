import java.util.Scanner;
public class kod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo :");
        double A = input.nextDouble();
        System.out.print("\nElma kaç kilo :");
        double E = input.nextDouble();
        System.out.print("\nDomates kaç kilo :");
        double D = input.nextDouble();
        System.out.print("\nMuz kaç kilo :");
        double M = input.nextDouble();
        System.out.print("\nPatlıcan kaç kilo :");
        double P = input.nextDouble();
        double top = (A*2.17) + (E*3.67) + (D*1.11) + (M*0.95) + (P*5);
        System.out.print("\nToplam tutar :"+ top);


    }

}
