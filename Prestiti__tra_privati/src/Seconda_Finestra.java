import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Seconda_Finestra extends javax.swing.JFrame {

    private CConto c;
    private CContoPrimo p;
    
    public Seconda_Finestra(CConto conto, CContoPrimo contoPrimo) 
    {
        this.c = conto;
        this.p = contoPrimo;
        
        initComponents();
        
        //getContentPane().setBackground(new java.awt.Color(255, 255, 255)); // esempio: grigio scuro

        LabelSaldo.setText("" + p.saldodisponibile);
        textAreaTransazioniSaldo.setEditable(false);
        textAreaTransazioniSaldo.setText(p.LeggiStoricoContoPrimo());
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    private Seconda_Finestra() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textAreaTransazioniSaldo = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        scrittaSaldo = new javax.swing.JLabel();
        LabelSaldo = new javax.swing.JLabel();
        buttonPrelevaSaldo = new javax.swing.JButton();
        buttonDepositaSaldo = new javax.swing.JButton();
        textFieldPrelevaSaldo = new javax.swing.JTextField();
        textFieldDepositaSaldo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AREA RISERVATA BANCA JASON");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        textAreaTransazioniSaldo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textAreaTransazioniSaldo.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Transazioni Saldo");

        scrittaSaldo.setFont(new java.awt.Font("Source Code Pro Medium", 1, 18)); // NOI18N
        scrittaSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scrittaSaldo.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\JBank.jpg")); // NOI18N
        scrittaSaldo.setText("SALDO");
        scrittaSaldo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LabelSaldo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        LabelSaldo.setForeground(new java.awt.Color(0, 0, 0));
        LabelSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSaldo.setText(" ");
        LabelSaldo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        LabelSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LabelSaldo.setOpaque(true);

        buttonPrelevaSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonPrelevaSaldo.setText("Preleva Saldo");
        buttonPrelevaSaldo.setPreferredSize(new java.awt.Dimension(155, 45));
        buttonPrelevaSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrelevaSaldoActionPerformed(evt);
            }
        });

        buttonDepositaSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonDepositaSaldo.setText("Deposito Saldo");
        buttonDepositaSaldo.setPreferredSize(new java.awt.Dimension(155, 45));
        buttonDepositaSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDepositaSaldo(evt);
            }
        });

        textFieldPrelevaSaldo.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPrelevaSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldPrelevaSaldo.setForeground(new java.awt.Color(51, 51, 51));
        textFieldPrelevaSaldo.setOpaque(true);

        textFieldDepositaSaldo.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDepositaSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldDepositaSaldo.setForeground(new java.awt.Color(51, 51, 51));
        textFieldDepositaSaldo.setText(" ");
        textFieldDepositaSaldo.setOpaque(true);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cambia Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton2)
                        .addGap(549, 549, 549)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(scrittaSaldo)
                        .addGap(18, 18, 18)
                        .addComponent(LabelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(buttonPrelevaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldPrelevaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(buttonDepositaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldDepositaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(textAreaTransazioniSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrittaSaldo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(LabelSaldo)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(buttonPrelevaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(textFieldPrelevaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonDepositaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(textFieldDepositaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(textAreaTransazioniSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDepositaSaldo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDepositaSaldo
        try
        {
            String testo = textFieldDepositaSaldo.getText();
            int valore = Integer.parseInt(testo.trim());

            int conferma = JOptionPane.showConfirmDialog(this,
                "Sei sicuro di voler depositare sul conto primo " + valore + " euro?",
                "Conferma deposito",
                JOptionPane.OK_CANCEL_OPTION);

            if (conferma == JOptionPane.OK_OPTION) 
            {
                String descrizione = JOptionPane.showInputDialog(this, "Inserisci descrizione deposito");
                c.conto += valore;
                p.saldodisponibile += valore;
                    
                ScrivereConto(c.conto);
                ScrivereContoPrimo(p.saldodisponibile);

                textAreaTransazioniSaldo.setText(p.ScriviTransazioneContoPrimo(valore, true, descrizione));
                c.ScriviTransazioneConto(valore, true, ("deposito da conto primo: " + descrizione));
            }
            
        } catch (NumberFormatException e)
        {
            // Il testo inserito non è un numero valido
            JOptionPane.showMessageDialog(this, "Errore: inserisci un numero valido!", "Errore", JOptionPane.ERROR_MESSAGE);
            System.out.println("" + e);
        }

        textFieldDepositaSaldo.setText("");
    }//GEN-LAST:event_buttonDepositaSaldo

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonPrelevaSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrelevaSaldoActionPerformed
        try
        {
            String testo = textFieldPrelevaSaldo.getText();
            int valore = Integer.parseInt(testo.trim());

            if(valore >= c.conto)
            {
                JOptionPane.showMessageDialog(this, "Attenzione: saldo insufficiente!", "Attenzione", JOptionPane.WARNING_MESSAGE);
                textFieldPrelevaSaldo.setText("");
            }
            else
            {
                int conferma = JOptionPane.showConfirmDialog(this,
                    "Sei sicuro di voler depositare sul conto primo " + valore + " euro?",
                    "Conferma deposito",
                    JOptionPane.OK_CANCEL_OPTION);

                if (conferma == JOptionPane.OK_OPTION) 
                {
                    String descrizione = JOptionPane.showInputDialog(this, "Inserisci descrizione prelievo");
                    c.conto -= valore;
                    p.saldodisponibile -= valore;
                    
                    ScrivereConto(c.conto);
                    ScrivereContoPrimo(p.saldodisponibile);

                    textAreaTransazioniSaldo.setText(p.ScriviTransazioneContoPrimo(valore, false, descrizione));
                    
                }
            }
        } catch (NumberFormatException e)
        {
            // Il testo inserito non è un numero valido
            JOptionPane.showMessageDialog(this, "Errore: inserisci un numero valido!", "Errore", JOptionPane.ERROR_MESSAGE);
            System.out.println("" + e);
        }

        textFieldPrelevaSaldo.setText("");
    }//GEN-LAST:event_buttonPrelevaSaldoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String input = JOptionPane.showInputDialog(this, "Inserisci la nuova password:");
        Password.scriviPassword(input);
        JOptionPane.showMessageDialog(this, "Password cambiata con successo!", "Successo", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Seconda_Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seconda_Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seconda_Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seconda_Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seconda_Finestra().setVisible(true);
            }
        });
    }
    
    public void ScrivereContoPrimo(int n)
    {
        LabelSaldo.setText("" + p.saldodisponibile);
        p.ScrivereContoPrimoFile(p.saldodisponibile);
    }

    public void ScrivereConto(int n)
    {
        c.ScrivereContoFile(c.conto);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelSaldo;
    private javax.swing.JButton buttonDepositaSaldo;
    private javax.swing.JButton buttonPrelevaSaldo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel scrittaSaldo;
    private java.awt.TextArea textAreaTransazioniSaldo;
    private javax.swing.JTextField textFieldDepositaSaldo;
    private javax.swing.JTextField textFieldPrelevaSaldo;
    // End of variables declaration//GEN-END:variables
}
