# Monopoly Java

Questo progetto è una versione digitale del classico gioco da tavolo Monopoly, sviluppata in Java con interfaccia grafica. Permette a più giocatori di sfidarsi seguendo le regole tradizionali del gioco.

## Funzionalità principali
- Gestione di più giocatori
- Tabellone di gioco con proprietà, carte imprevisti e probabilità
- Carte Chance e Community Chest
- Acquisto, vendita e ipoteca delle proprietà
- Costruzione di case e hotel
- Gestione del denaro e delle transazioni
- Interfaccia grafica con immagini delle proprietà e delle carte

## Struttura del progetto
- `src/` — Codice sorgente Java e risorse grafiche
- `bin/` — File compilati e risorse per l'esecuzione (verrà creata dopo la compilazione)
- `README.md` — Questo file

## Requisiti
- Java 8 o superiore

## Come compilare ed eseguire il gioco

⚠️ **Nota:** Il file `.jar` non è incluso nel repository. Devi crearlo seguendo questi passaggi:

1. **Compila tutti i file Java** (dalla cartella principale del progetto):
   ```sh
   javac -d bin src/*.java
   ```
2. **Copia le risorse grafiche** nella cartella `bin` (se non già presenti):
   ```sh
   xcopy /E /I src\resources bin\resources
   ```
3. **Crea il file JAR eseguibile**:
   ```sh
   jar cfe monopoly-exe.jar Monopoly -C bin .
   ```
   - `Monopoly` è la classe principale
   - Assicurati che tutte le classi e le risorse siano in `bin`

4. **Esegui il file JAR**:
   ```sh
   java -jar monopoly-master.jar
   ```

**In alternativa**, puoi avviare direttamente la classe principale senza JAR:
```sh
java -cp bin Monopoly
```

## Crediti
- Sviluppato da Silla Federico e Trebbi Francesco
- Immagini e risorse: proprietà degli autori
