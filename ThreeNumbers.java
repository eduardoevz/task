import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese el primer entero: ");
        int num1 = scanner.nextInt();

        System.out.print("ingrese el segundo entero: ");
        int num2 = scanner.nextInt();

        System.out.print("ingrese el tercer entero: ");
        int num3 = scanner.nextInt();

        //encontrar los numeros mas pequeños

        int small1 = Math.min(num1, Math.min(num2, num3));
        int small2 = Math.max(Math.min(num1, num2), Math.min(num2, num3));

        //encontrar los numeros mas grandes 
        int large1 = Math.max(num1, Math.max(num2, num3));
        int large2 = Math.min(Math.max(num1, num2), Math.max(num2, num3));

        //calcular la suma de los numeros mas pequeños
        int sumSmall = small1 + small2;

        //calcular la resta de los numeros mas grandes
        int diffLarge = large1 - large2;

        //mostrar los resultados
        System.out.println("la suma de los numeros mas pequeños es: " + sumSmall);
        System.out.println("la diferencia de los numeros mas grandes es: " + diffLarge);

        // determinar el numero mas grande y mostrarlo en pantalla
        if (num1 == small1 && num1 == small2 && num1 == small2) {
            System.out.println("All three numbers are the same, so none of them is the largest.");
        } else {
            if (num1 == small1) {
                System.out.println("el numero mas grande es " + Math.max(num2, num3));
            } else if (num2 == small1) {
                System.out.println("el numero mas grande es is " + Math.max(num1, num3));
            } else if (num3 == small1) {
                System.out.println("el numero mas grande es is " + Math.max(num1, num2));
            } else if (num1 == small2) {
                System.out.println("el numero mas grande es " + Math.max(num3, large1));
            } else if (num2 == small2) {
                System.out.println("el numero mas grande es is " + Math.max(num1, large1));
            } else {
                System.out.println("el numero mas grande es " + Math.max(num1, num2));
            }
        }
    }
}