import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BancaGUI extends javax.swing.JFrame {
       
    private CConto c = new CConto();               // Istanza conto principale
    private CContoPrimo p = new CContoPrimo();     // Istanza conto "primo" (con saldo disponibile)

    public BancaGUI() 
    {
        initComponents();                         // Inizializza i componenti GUI
        
        //getContentPane().setBackground(new java.awt.Color(40, 40, 40)); // Sfondo finestra
        
        setLocationRelativeTo(null);              // Centra la finestra sullo schermo

        LabelConto.setText("" + c.conto);         // Mostra saldo conto principale
        LabelContoPrimo.setText("" + p.saldodisponibile); // Mostra saldo conto primo
        
        textAreaTransazioniConto.setEditable(false);        // Imposta area testo transazioni come non modificabile
        textAreaTransazioniConto.setText(c.LeggiStoricoConto().toString()); // Carica storico transazioni conto
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrittaContoPrimo = new javax.swing.JLabel();
        LabelContoPrimo = new javax.swing.JLabel();
        textAreaTransazioniConto = new java.awt.TextArea();
        jLabel2 = new javax.swing.JLabel();
        LabelConto = new javax.swing.JLabel();
        buttonPreleva = new javax.swing.JButton();
        buttonDeposita = new javax.swing.JButton();
        textFieldPreleva = new javax.swing.JTextField();
        textFieldDeposita = new javax.swing.JTextField();
        scrittaConto = new javax.swing.JLabel();
        ButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANCA JASON");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        scrittaContoPrimo.setFont(new java.awt.Font("Source Code Pro Medium", 1, 18)); // NOI18N
        scrittaContoPrimo.setText("SALDO DISPONIBILE");
        scrittaContoPrimo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        LabelContoPrimo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        LabelContoPrimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelContoPrimo.setText(" ");
        LabelContoPrimo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        textAreaTransazioniConto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Transazioni Conto");

        LabelConto.setBackground(new java.awt.Color(255, 255, 255));
        LabelConto.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        LabelConto.setForeground(new java.awt.Color(0, 0, 0));
        LabelConto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelConto.setText(" ");
        LabelConto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelConto.setIconTextGap(10);

        buttonPreleva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonPreleva.setText("Preleva");
        buttonPreleva.setPreferredSize(new java.awt.Dimension(100, 45));
        buttonPreleva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPreleva(evt);
            }
        });

        buttonDeposita.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonDeposita.setText("Deposita");
        buttonDeposita.setMaximumSize(new java.awt.Dimension(100, 45));
        buttonDeposita.setMinimumSize(new java.awt.Dimension(100, 45));
        buttonDeposita.setPreferredSize(new java.awt.Dimension(100, 45));
        buttonDeposita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeposita(evt);
            }
        });

        textFieldPreleva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldPreleva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldPrelevaKeyPressed(evt);
            }
        });

        textFieldDeposita.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        scrittaConto.setFont(new java.awt.Font("Source Code Pro Medium", 1, 18)); // NOI18N
        scrittaConto.setText("CONTO");
        scrittaConto.setToolTipText("");
        scrittaConto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        ButtonLogin.setText("LOGIN");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });
        ButtonLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonLoginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(670, 670, 670)
                        .addComponent(ButtonLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(scrittaConto)
                        .addGap(105, 105, 105)
                        .addComponent(LabelConto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(buttonPreleva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(textFieldPreleva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(scrittaContoPrimo)
                        .addGap(38, 38, 38)
                        .addComponent(LabelContoPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(buttonDeposita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(textFieldDeposita, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textAreaTransazioniConto, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(306, 306, 306))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ButtonLogin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(scrittaConto))
                    .addComponent(LabelConto)
                    .addComponent(buttonPreleva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(textFieldPreleva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(scrittaContoPrimo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LabelContoPrimo))
                    .addComponent(buttonDeposita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(textFieldDeposita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(textAreaTransazioniConto, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPreleva(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPreleva
        // Gestione prelievo da conto
        
        try
        {
            String testo = textFieldPreleva.getText();     // Prende il testo inserito dall'utente
            int valore = Integer.parseInt(testo.trim());   // Tenta di convertire in intero

            if(valore > c.conto)                            // Controlla saldo sufficiente
                JOptionPane.showMessageDialog(this, "Attenzione: saldo insufficiente!", "Attenzione", JOptionPane.WARNING_MESSAGE);

            else
            {
                // Chiede conferma all'utente per prelievo
                int conferma = JOptionPane.showConfirmDialog(this,
                    "Sei sicuro di voler prelevare dal conto " + valore + " euro?",
                    "Conferma prelievo",
                    JOptionPane.OK_CANCEL_OPTION);

                if (conferma == JOptionPane.OK_OPTION)
                {
                    // Chiede descrizione della transazione
                    String descrizione = JOptionPane.showInputDialog(this, "Inserisci descrizione prelievo");
                    
                    c.conto -= valore;                  // Aggiorna saldo conto principale
                    ScrivereConto(c.conto);             // salva saldo su file

                    // Aggiunge al saldo disponibile del conto primo il 10% del prelievo
                    p.saldodisponibile += (int)((valore / 100.0) * 10);
                    ScrivereContoPrimo(p.saldodisponibile);  // Aggiorna GUI e salva saldo conto primo

                    // Aggiorna area transazioni con nuova transazione (prelievo)
                    textAreaTransazioniConto.setText(c.ScriviTransazioneConto(valore, false, descrizione));

                    // Registra transazione nel conto primo (credito 10%)
                    p.ScriviTransazioneContoPrimo((int)((valore / 100.0) * 10), true, ("10% su prelievo da conto: " + descrizione));
                }
            }
        } catch (NumberFormatException e)
        {
            // Gestione errore se l'input non è un numero valido
            JOptionPane.showMessageDialog(this, "Errore: inserisci un numero valido!", "Errore", JOptionPane.ERROR_MESSAGE);
            System.out.println("" + e);
        }

        textFieldPreleva.setText("");  // Pulisce campo input prelievo dopo operazione
    
    }//GEN-LAST:event_buttonPreleva

    private void buttonDeposita(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeposita
        // Gestione deposito su conto principale
        
        try
        {
            String deposito = textFieldDeposita.getText();  // Legge valore da campo deposito
            int valore = Integer.parseInt(deposito.trim()); // Converte in intero

            // Chiede conferma deposito
            int conferma = JOptionPane.showConfirmDialog(this,
                "Sei sicuro di voler depositare sul conto " + valore + " euro?",
                "Conferma deposito",
                JOptionPane.OK_CANCEL_OPTION);

            if (conferma == JOptionPane.OK_OPTION)
            {
                // Controlla che il nuovo saldo non superi il saldo disponibile nel conto primo
                if((c.conto+valore) <= p.saldodisponibile)
                {
                    String descrizione = JOptionPane.showInputDialog(this, "Inserisci descrizione deposito");

                    c.conto += valore;                  // Aggiorna saldo conto principale
                    ScrivereConto(c.conto);             // salva su file
                    textAreaTransazioniConto.setText(c.ScriviTransazioneConto(valore, true, descrizione)); // Aggiorna storico transazioni
                }
                else
                {
                    // Messaggio di errore se deposito troppo alto
                    JOptionPane.showMessageDialog(this, "Errore: non puoi depositare un valore cosi grande nel conto!", "Errore", JOptionPane.ERROR_MESSAGE);
                    System.out.println("non puoi depositare un valore cosi grande nel conto");
                }
            }

        } catch (NumberFormatException e)
        {
            // Gestione errore input non valido
            JOptionPane.showMessageDialog(this, "Errore: inserisci un numero valido!", "Errore", JOptionPane.ERROR_MESSAGE);
            System.out.println("" + e);
        }

        textFieldDeposita.setText("");  // Pulisce campo input deposito dopo operazione
   
    }//GEN-LAST:event_buttonDeposita

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
    
    // Gestione login utente con password

        String input = JOptionPane.showInputDialog(this, "Inserisci la password:");

        if (input != null) { // Controlla che non abbia premuto "Annulla"
            if (input.equals(Password.leggiPassword())) {  // Controlla password corretta
                
                setState(JFrame.ICONIFIED); // Minimizza finestra corrente
                
                // Crea e mostra seconda finestra passando i conti
                Seconda_Finestra nuovaFinestra = new Seconda_Finestra(c, p);
                nuovaFinestra.setVisible(true);
                  
                // Listener che esegue operazioni al momento della chiusura della seconda finestra
                nuovaFinestra.addWindowListener(new java.awt.event.WindowAdapter() {

                @Override
                public void windowClosed(java.awt.event.WindowEvent e) {
                    // Aggiorna saldi e storico transazioni dopo chiusura finestra secondaria
                    ScrivereConto(c.conto);
                    ScrivereContoPrimo(p.saldodisponibile);
                    textAreaTransazioniConto.setText(c.LeggiStoricoConto());
                    setState(JFrame.NORMAL);    // Ripristina finestra principale
                }
                });
                
            } else {
                JOptionPane.showMessageDialog(this, "Password sbagliata!", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void ButtonLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonLoginKeyPressed
        // Gestione login tramite pressione tasto Enter sul pulsante login
        if(evt.getKeyChar() == KeyEvent.VK_ENTER)
        {
            String input = JOptionPane.showInputDialog(this, "Inserisci la password:");

            if (input != null) {
                if (input.equals(Password.leggiPassword())) {

                    setState(JFrame.ICONIFIED);

                    Seconda_Finestra nuovaFinestra = new Seconda_Finestra(c, p);
                    nuovaFinestra.setVisible(true);

                    nuovaFinestra.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosed(java.awt.event.WindowEvent e) {
                        ScrivereConto(c.conto);
                        ScrivereContoPrimo(p.saldodisponibile);
                        textAreaTransazioniConto.setText(c.LeggiStoricoConto());
                        setState(JFrame.NORMAL);
                    }
                    });

                } else {
                    JOptionPane.showMessageDialog(this, "Password sbagliata!", "Errore", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_ButtonLoginKeyPressed

    private void textFieldPrelevaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPrelevaKeyPressed
    
        if(evt.getKeyChar() == KeyEvent.VK_ENTER)
        {     
        try
        {
            String testo = textFieldPreleva.getText();
            int valore = Integer.parseInt(testo.trim());

            if(valore > c.conto)
            JOptionPane.showMessageDialog(this, "Attenzione: saldo insufficiente!", "Attenzione", JOptionPane.WARNING_MESSAGE);

            else
            {
                int conferma = JOptionPane.showConfirmDialog(this,
                    "Sei sicuro di voler prelevare dal conto " + valore + " euro?",
                    "Conferma prelievo",
                    JOptionPane.OK_CANCEL_OPTION);

                if (conferma == JOptionPane.OK_OPTION)
                {
                    String descrizione = JOptionPane.showInputDialog(this, "Inserisci descrizione prelievo");
                    
                    c.conto -= valore;
                    ScrivereConto(c.conto);

                    p.saldodisponibile += (int)((valore / 100.0) * 10);
                    ScrivereContoPrimo(p.saldodisponibile);

                    textAreaTransazioniConto.setText(c.ScriviTransazioneConto(valore, false, descrizione));
                    p.ScriviTransazioneContoPrimo((int)((valore / 100.0) * 10), true, ("10% su prelievo da conto: " + descrizione));
                }
            }
        } catch (NumberFormatException e)
        {
            // Il testo inserito non è un numero valido
            JOptionPane.showMessageDialog(this, "Errore: inserisci un numero valido!", "Errore", JOptionPane.ERROR_MESSAGE);
            System.out.println("" + e);
        }

        textFieldPreleva.setText("");
        }
    }//GEN-LAST:event_textFieldPrelevaKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BancaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancaGUI().setVisible(true);
            }
        });
    }
    // Metodo per aggiornare saldo conto principale in GUI e salvarlo su file
    public void ScrivereConto(int n)
    {
        LabelConto.setText("" + c.conto);
        c.ScrivereContoFile(c.conto);
    }
    
    // Metodo per aggiornare saldo conto primo in GUI e salvarlo su file
    public void ScrivereContoPrimo(int n)
    {
        LabelContoPrimo.setText("" + p.saldodisponibile);
        p.ScrivereContoPrimoFile(p.saldodisponibile);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JLabel LabelConto;
    private javax.swing.JLabel LabelContoPrimo;
    private javax.swing.JButton buttonDeposita;
    private javax.swing.JButton buttonPreleva;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel scrittaConto;
    private javax.swing.JLabel scrittaContoPrimo;
    private java.awt.TextArea textAreaTransazioniConto;
    private javax.swing.JTextField textFieldDeposita;
    private javax.swing.JTextField textFieldPreleva;
    // End of variables declaration//GEN-END:variables
}
