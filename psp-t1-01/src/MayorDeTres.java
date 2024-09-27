public class MayorDeTres {
    public static void main(String[] args) {
        // Sí o sí tienen que haber 3 argumentos introducidos
        if (args.length != 3) {
            System.out.println("ERROR, debe ingresar 3 números como argumentos.");
            return;
        }

        try {
            // Convertir los argumentos a enteros
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);

            int mayor = num1;

            if (num2 > mayor) {
                mayor = num2;
            }

            if (num3 > mayor) {
                mayor = num3;
            }

            // Imprimimos por pantalla el número mayor
            System.out.println("Número Mayor: " + mayor);

        } catch (NumberFormatException e) {
            System.out.println("ERROR, ingresa número válidos.");
        }
    }
}

