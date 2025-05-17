import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class CConto 
{
    public int conto;
    public String pathConto;
    public String pathTransazioniConto;
    
    public CConto()
    {
        pathConto = "conto.txt";
        pathTransazioniConto = "transazioniConto.txt";
        conto = LeggiContoFile();
    }
    
    public int LeggiContoFile() 
    { 
        try (BufferedReader br = new BufferedReader(new FileReader(pathConto))) 
        {
            String linea = br.readLine(); // Legge solo la prima riga
            if (linea != null) 
            {
            conto = Integer.parseInt(linea.trim());
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        } catch (NumberFormatException e) 
        {
            e.printStackTrace();
        }
        return conto;
    }
    
    public void ScrivereContoFile(int n)
    {
        try {
            FileWriter writer = new FileWriter(pathConto, false); // false = sovrascrive
            writer.write(Integer.toString(n)); // oppure: writer.write("" + numero);
            writer.close();
            System.out.println("file conto.txt aggiornato.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String LeggiStoricoConto()
    {
        
        try (BufferedReader br = new BufferedReader(new FileReader(pathTransazioniConto))) 
        {
            StringBuilder contenuto = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                contenuto.append(linea).append("\n");
        }
        return contenuto.toString();
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file: " + e.getMessage());
        }
        return "";
    }
    
    public String ScriviTransazioneConto(int importo, boolean n, String descrizione)
    {
        try {
            File file = new File(pathTransazioniConto);
            
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
            
            return LeggiStoricoConto(); // Aggiorna la visualizzazione
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Errore durante la scrittura nel file: " + e.getMessage());
        }
        return "";
    }
}

