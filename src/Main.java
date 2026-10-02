import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Tabla tabla = new Tabla();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el número de la tabla que deseas generar");
        int numero = scanner.nextInt();
        System.out.println("¿Hasta qué número quieres generar la tabla?");
        int limite = scanner.nextInt();
        tabla.generarTabla(numero, limite);
    }

}