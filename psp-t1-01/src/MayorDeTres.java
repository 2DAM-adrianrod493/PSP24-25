public class MayorDeTres {
    public static void main(String[] args) {
        // Sí o sí tienen que haber 3 argumentos introducidos
        if (args.length != 3) {
            System.out.println("ERROR, Debes ingresar 3 números enteros como argumentos.");
            return;
        }

        try {
            // Convertimos los argumentos a enteros
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

            int i = 1;

            // Bucle para indicar los argumentos
            for (String arg : args) {

                System.out.println("Argumento " + i++ + " es: " + arg);

            }

            System.out.println("- - - - - - - - - -");

            // Imprimimos por pantalla el número mayor
            System.out.println("Argumento Mayor: " + mayor);

        } catch (NumberFormatException e) {
            System.out.println("ERROR, Debes ingresar números enteros OBLIGATORIAMENTE.");
        }
    }
}

