import java.util.Scanner;

public class Ejercicio3 {
    // Confeccionar un programa que dado un número entero 
    // como dato de entrada imprima la secuencia de números (incrementos de 1)
// 1
// 1 2
// 1 2 3
// 1 2 3 4 
// 1 2 3 4 5

    public static void main(String[] args) {
        System.out.print("Numero:");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.close();
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=((n+1)-i); j++){
            System.out.print(j);
            }
            // for(int k=n; k>=((n+1)-i); k--){
            //     System.out.print(k);
            // }
            System.out.println();
        }


        

    }

}
