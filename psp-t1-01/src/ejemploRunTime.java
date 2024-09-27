import java.io.IOException;

public class ejemploRunTime {
    public static void main(String[] args) {
        try {
            // Inicia el Bloc de Notas
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
