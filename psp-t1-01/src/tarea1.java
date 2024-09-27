import java.io.File;
import java.io.IOException;

public class tarea1 {

    public static void main(String[] args) {
        // Sí o sí tienen que haber 2 o 3 argumentos introducidos
        if (args.length < 2 || args.length > 3) {
            System.out.println("ERROR, Debes ingresar como argumentos: P/R C/N [ruta_fichero/url]");
            return;
        }

        String ejecProcesos = args[0];
        String programa = args[1];
        String rutaOurl = args.length == 3 ? args[2] : null;

        // Ruta del Chrome
        String rutaChrome = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

        // Si es P o R, ejecuta un proceso u otro
        try {
            if ("P".equalsIgnoreCase(ejecProcesos)) {

                // Si es N o C, ejecuta un programa u otro
                if ("N".equalsIgnoreCase(programa)) {
                    // ProcessBuilder Notepad
                    if (rutaOurl != null) {
                        File fichero = new File(rutaOurl);
                        if (fichero.exists()) {
                            ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", rutaOurl);
                            Process process = processBuilder.start();
                            process.waitFor();
                        } else {
                            System.out.println("ERROR, El archivo especificado no existe: " + rutaOurl);
                        }
                    } else {
                        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
                        Process process = processBuilder.start();
                        process.waitFor();
                    }
                } else if ("C".equalsIgnoreCase(programa)) {
                    // ProcessBuilder Chrome
                    if (rutaOurl != null) {
                        ProcessBuilder processBuilder = new ProcessBuilder(rutaChrome, rutaOurl);
                        Process process = processBuilder.start();
                        process.waitFor();
                    } else {
                        ProcessBuilder processBuilder = new ProcessBuilder(rutaChrome);
                        Process process = processBuilder.start();
                        process.waitFor();
                    }
                } else {
                    System.out.println("ERROR, El segundo argumento debe ser C o N");
                }

            } else if ("R".equalsIgnoreCase(ejecProcesos)) {

                // Si es N o C, ejecuta un programa u otro
                if ("N".equalsIgnoreCase(programa)) {
                    // Runtime Notepad
                    if (rutaOurl != null) {
                        File fichero = new File(rutaOurl);
                        if (fichero.exists()) {
                            Runtime runtime = Runtime.getRuntime();
                            Process process = runtime.exec("notepad.exe " + rutaOurl);
                            process.waitFor();
                        } else {
                            System.out.println("ERROR, El archivo especificado no existe: " + rutaOurl);
                        }
                    } else {
                        Runtime runtime = Runtime.getRuntime();
                        Process process = runtime.exec("notepad.exe");
                        process.waitFor();
                    }
                } else if ("C".equalsIgnoreCase(programa)) {
                    // Runtime Chrome
                    if (rutaOurl != null) {
                        Runtime runtime = Runtime.getRuntime();
                        Process process = runtime.exec(rutaChrome + " " + rutaOurl);
                        process.waitFor();
                    } else {
                        Runtime runtime = Runtime.getRuntime();
                        Process process = runtime.exec(rutaChrome);
                        process.waitFor();
                    }
                } else {
                    System.out.println("ERROR, El segundo argumento debe ser C o N");
                }

            } else {
                System.out.println("ERROR, Debes ingresar P/R y C/N como argumentos");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
