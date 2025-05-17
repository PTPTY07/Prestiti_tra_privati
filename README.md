# Prestiti_tra_privati
Funzionamento Dettagliato

Questo programma simula un sistema di microfinanza tra due utenti:

    Un "finanziatore" (che deposita fondi e guadagna interessi).

    Un "utilizzatore" (che preleva fondi e paga una piccola commissione al finanziatore).

Il meccanismo è basato su due conti:

    Conto principale (CConto): Rappresenta il denaro disponibile per i prelievi.

    Conto primo (CContoPrimo): Rappresenta il capitale del finanziatore, che riceve il 10% su ogni prelievo.

1. Struttura del Sistema
File e Dati Persistenti

    conto.txt: Saldo del conto principale (denaro disponibile per i prelievi).

    saldodisponibile.txt: Saldo del conto primo (capitale del finanziatore).

    transazioniConto.txt: Storico dei movimenti del conto principale.

    transazioniSaldoDisponibile.txt: Storico dei movimenti del conto primo.

    password.txt: Password criptata per accedere all'area riservata.

Classi Principali
Classe	Funzione
BancaGUI	Finestra principale per operazioni di deposito/prelievo.
Seconda_Finestra	Area riservata per gestire il conto primo (solo con password).
CConto	Gestisce il conto principale (prelievi/depositi).
CContoPrimo	Gestisce il conto del finanziatore (guadagna il 10% sui prelievi).
Password	Cripta e decripta la password per l'accesso.
2. Flusso di Funzionamento
A. Deposito sul Conto Principale (Finanziatore)

    L'utente inserisce un importo nel campo "Deposita" nella finestra BancaGUI.

    Il sistema verifica che il deposito non superi il saldo disponibile nel conto primo (per evitare fondi non coperti).

    Se valido, il sistema:

        Aggiunge l'importo al conto.txt.

        Registra la transazione in transazioniConto.txt.

        Aggiorna la GUI con il nuovo saldo.

B. Prelievo dal Conto Principale (Utilizzatore)

    L'utente inserisce un importo nel campo "Preleva" nella finestra BancaGUI.

    Il sistema verifica che il saldo sia sufficiente.

    Se valido, il sistema:

        Sottrae l'importo dal conto principale (conto.txt).

        Aggiunge il 10% dell'importo prelevato al conto primo (saldodisponibile.txt).

        Registra due transazioni:

            transazioniConto.txt: "-X€" (prelievo).

            transazioniSaldoDisponibile.txt: "+10% di X€" (guadagno del finanziatore).

C. Accesso all'Area Riservata (Finanziatore)

    L'utente clicca "LOGIN" e inserisce la password.

    Se corretta, si apre Seconda_Finestra, dove può:

        Visualizzare il saldo del conto primo (guadagni accumulati).

        Depositare/prelevare fondi dal conto primo.

        Cambiare la password.

3. Esempio Pratico
Scenario

    Conto principale (conto.txt): 1000€

    Conto primo (saldodisponibile.txt): 1000€

Operazione 1: Prelievo di 100€

    L'utilizzatore preleva 100€ dal conto principale.

    Il sistema:

        Riduce il conto principale a 900€.

        Aggiunge 10€ (10%) al conto primo (1010€).

    Registra:

        transazioniConto.txt: -100€ - Prelievo.

        transazioniSaldoDisponibile.txt: +10€ - Commissione prelievo.

Operazione 2: Deposito di 50€

    Il finanziatore deposita 50€ nel conto principale.

    Il sistema:

        Aumenta il conto principale a 950€.

        Verifica che il deposito non superi il saldo del conto primo.

    Registra:

        transazioniConto.txt: +50€ - Deposito.

4. Sicurezza e Persistenza

    Password criptata in Base64 (password.txt).

    Tutte le transazioni sono salvate su file e ripristinate all'avvio.

    Controlli di validità:

        Saldo insufficiente → Blocco prelievo.

        Deposito troppo alto → Blocco operazione.

5. Conclusioni
Modello di Microfinanza Simulato

    Il finanziatore mette a disposizione capitale e guadagna il 10% su ogni prelievo.

    L'utilizzatore accede ai fondi pagando una piccola commissione.

    Tutte le operazioni sono tracciate e persistenti.
