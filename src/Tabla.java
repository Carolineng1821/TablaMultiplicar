public class Tabla {

    public void generarTabla(int numero, int limite){

        if (limite > 0 && numero >= 1) {
            for (int i = 1; i <= limite; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("Invalido");
        }

    }

}
