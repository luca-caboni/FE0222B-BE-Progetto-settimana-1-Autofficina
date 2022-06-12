## FE0222B-BE-Progetto-settimana1        Autofficina

Creare un'applicazione che simula un'autofficina.
Creare una classe Macchina che abbia le seguenti informazioni:
- nome, cilindrata, targa, prezzo, colore, numeroMarce, motoreAcceso, marcia
e i seguenti metodi:
- accendiMotore(), 
- spegniMotore(), 
- cambiaMarcia( numeroMarcia ), 
- scalaMarcia(), 
- aumentaMarcia(),
- getValore(), cioè il prezzo
- stampaInformazioni()

Quando si spegne il motore automaticamente andiamo a settare la marcia al valore 0 (folle).
Nei metodi che modificano la marcia andremo a controllare che il range rimanga tra 0 (folle) e numeroMarce, altrimenti mostreremo un messaggio di errore.

Nel main, creare 5 macchine differenti e inserirle in un array di macchine chiamato auto.
Per la classe principale creare altri 3 metodi:

- infoMacchinaPiuCostosa(),
- infoMacchina( targa ), 
- infoMacchinaColore( colore )
