import java.util.Scanner;

// Crear una aplicación que solicite de entrada los datos de una persona en este orden:
// Nombre y Apellido
// Edad
// Dirección
// Ciudad
// Luego imprimirá el siguiente mensaje:
// {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

public class Ejercicio8 {
    
    String NombreYApellido;
    String Edad;
    String Apellido;
    String Direccion;
    String Ciudad;
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio8 Persona = new Ejercicio8();
        System.out.print("Nombre y apellido: ");
        Persona.NombreYApellido = scan.nextLine();
        System.out.print("Edad: ");
        Persona.Edad = scan.nextLine();
        System.out.print("Direccion: ");
        Persona.Direccion = scan.nextLine();
        System.out.print("Ciudad: ");
        Persona.Ciudad = scan.nextLine();
        System.out.printf("%s - %s - %s - %s", Persona.Ciudad, Persona.Direccion, Persona.Edad, Persona.NombreYApellido);
    }
}
