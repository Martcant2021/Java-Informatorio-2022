import java.util.Scanner;

// Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
// informatorio => i=2
public class Ejercicio9 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int cont = 0;
        System.out.print("Escriba su texto: ");
        String Frase = scan.nextLine();

        System.out.print("Escriba la palabra a contar: ");
        String Letra = scan.nextLine();
        for(int i=0; i<Frase.length(); i++){
            if(Frase.charAt(i) == Letra.charAt(0)){
                cont ++;
            }
        }
        if(cont !=0){
            System.out.println(cont);
        }else{
            System.out.println("No se encuentra el caracter solicitado");
        }

    }
}
