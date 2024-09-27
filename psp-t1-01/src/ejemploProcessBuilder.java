import java.io.IOException;

public class ejemploProcessBuilder {
    public static void main(String[] args) {

        try {
            // Inicia el Bloc de Notas
            ProcessBuilder pb = new ProcessBuilder("notepad.exe");
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
