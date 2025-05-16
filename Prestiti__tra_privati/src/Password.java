import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

public class Password 
{
    private static final String FILE_PASSWORD = "C:\\Users\\User\\Documenti\\NetBeansProjects\\BancaGUI-Copia\\password.txt";

    // Funzione per salvare la password criptata
    public static void scriviPassword(String password) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PASSWORD))) {
            String passwordCriptata = Base64.getEncoder().encodeToString(password.getBytes());
            bw.write(passwordCriptata);
            System.out.println("file password.txt aggiornato con la nuova password");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    // Funzione per leggere la password criptata e decriptarla
    public static String leggiPassword() {
        String linea = "";
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PASSWORD))) {
            linea = br.readLine();
            if (linea != null) {
                byte[] decodedBytes = Base64.getDecoder().decode(linea);
                linea = new String(decodedBytes);
            }
            else
                return "";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linea;
    }
}
