import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class CContoPrimo 
{
    public int saldodisponibile;
    public String pathSaldoDisponibile;
    public String pathTransazioniSaldoDisponibile;
    
    public CContoPrimo()
    {
        pathSaldoDisponibile = "saldodisponibile.txt";
        pathTransazioniSaldoDisponibile = "transazioniSaldoDisponibile.txt";
        saldodisponibile = LeggiSaldoDisponibileFile();
    }
    
    public int LeggiSaldoDisponibileFile() 
    { 
        try (BufferedReader br = new BufferedReader(new FileReader(pathSaldoDisponibile))) 
        {
            String linea = br.readLine(); // Legge solo la prima riga
            if (linea != null) 
            {
            saldodisponibile = Integer.parseInt(linea.trim());
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        } catch (NumberFormatException e) 
        {
            e.printStackTrace();
        }
        return saldodisponibile;
    }
    
    
    public void ScrivereContoPrimoFile(int n)
    {
        try {
            FileWriter writer = new FileWriter(pathSaldoDisponibile, false); // false = sovrascrive
            writer.write(Integer.toString(n)); // oppure: writer.write("" + numero);
            writer.close();
            System.out.println("file saldodisponibile.txt aggiornato.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String LeggiStoricoContoPrimo()
    {
        
        try (BufferedReader br = new BufferedReader(new FileReader(pathTransazioniSaldoDisponibile))) 
        {
        StringBuilder contenuto = new StringBuilder();
        String linea;
        while ((linea = br.readLine()) != null) {
            contenuto.append(linea).append("\n");
        }
        return contenuto.toString();
        } catch (IOException e) {
            System.out.print("Errore nella lettura del file: " + e.getMessage());
        }
        return "";
    }
    
    public String ScriviTransazioneContoPrimo(int importo, boolean n, String descrizione)
    {
        try {
            File file = new File(pathTransazioniSaldoDisponibile);
            
            //per leggere la data italiana
            
            LocalDate oggi = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String data = oggi.format(formatter);
            
            // Legge tutto il contenuto esistente
            StringBuilder contenutoEsistente = new StringBuilder();
            if (file.exists()) 
            {
                try (BufferedReader br = new BufferedReader(new FileReader(file)))
                {
                    String linea;
                    while ((linea = br.readLine()) != null) 
                    {
                        contenutoEsistente.append(linea).append("\n");
                    }
                }
            }

            // Scrive la nuova riga in testa + contenuto precedente
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) 
            {
                if(n == true)
                    bw.write("+ " + importo + "€\t" + data + ": " + descrizione);
                else
                    bw.write("- " + importo + "€\t" + data + ": " + descrizione);
                bw.newLine();
                bw.write(contenutoEsistente.toString());
            }
            
            return LeggiStoricoContoPrimo(); // Aggiorna la visualizzazione
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Errore durante la scrittura nel file: " + e.getMessage());
        }
        return "";
    }
}
