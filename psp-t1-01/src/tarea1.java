public class tarea1 {

    public static void main(String[] args) {
        // Sí o sí tienen que haber 2 argumentos introducidos
        if (args.length != 2) {
            System.out.println("ERROR, Debes ingresar como argumentos: P/R C/N");
            return;
        }

        String ejecProcesos = args[0];
        String programa = args[1];

        // Ruta del Chrome
        String rutaChrome = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

        // Si es P o R, ejecuta un proceso u otro
        try {
            if ("P".equalsIgnoreCase(ejecProcesos)) {

                // Si es N o C, ejecuta un programa u otro
                if ("N".equalsIgnoreCase(programa)) {
                    // ProcessBuilder Notepad
                    ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
                    Process process = processBuilder.start();
                    process.waitFor();
                } else if ("C".equalsIgnoreCase(programa)) {
                    // ProcessBuilder Chrome
                    ProcessBuilder processBuilder = new ProcessBuilder(rutaChrome);
                    Process process = processBuilder.start();
                    process.waitFor();
                } else {
                    System.out.println("ERROR, El segundo argumento debe ser C o N");
                }

            } else if ("R".equalsIgnoreCase(ejecProcesos)) {

                // Si es N o C, ejecuta un programa u otro
                if ("N".equalsIgnoreCase(programa)) {
                    // Runtime Notepad
                    Runtime runtime = Runtime.getRuntime();
                    Process process = runtime.exec("notepad.exe");
                    process.waitFor();
                } else if ("C".equalsIgnoreCase(programa)) {
                    // Runtime Chrome
                    Runtime runtime = Runtime.getRuntime();
                    Process process = runtime.exec(rutaChrome);
                    process.waitFor();
                } else {
                    System.out.println("ERROR, El segundo argumento debe ser C o N");
                }

            } else {
                System.out.println("ERROR, Debes ingresar P/R y C/N como argumentos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
