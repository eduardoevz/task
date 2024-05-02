import java.util.Arrays;
import java.util.Scanner;

// Eduardo Emmanuel Velasquez Zelaya
// 2024-1351U
// grupo 1M1-S

public class ReverseArray {

    public static void main(String[] args) {
        int[] Arreglo = new int[5];
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce 5 numeros diferentes");

        for (int i = 0; i < Arreglo.length; i++) {
            try {
                Arreglo[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("no valido, introduce un numero ");
                i--;
                scanner.next();
            }
        }

        System.out.println("el arreglo original es " + Arrays.toString(Arreglo));
        System.out.println("el arreglo invertido es " + Arrays.toString(reverseArray(Arreglo)));
    }

    public static int[] reverseArray(int[] arr) {
        int[] ArregloReverso = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ArregloReverso[arr.length - 1 - i] = arr[i];
        }
        return ArregloReverso;
    }
}
