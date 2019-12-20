1. [Introduzione](#introduzione)

  - [Informazioni sul progetto](#informazioni-sul-progetto)

  - [Abstract](#abstract)

  - [Scopo](#scopo)

1. [Analisi](#analisi)

  - [Analisi del dominio](#analisi-del-dominio)
  
  - [Analisi dei mezzi](#analisi-dei-mezzi)

  - [Analisi e specifica dei requisiti](#analisi-e-specifica-dei-requisiti)

  - [Use case](#use-case)

  - [Pianificazione](#pianificazione)

1. [Progettazione](#progettazione)

  - [Design dell’architettura del sistema](#design-dell’architettura-del-sistema)

  - [Design dei dati e database](#design-dei-dati-e-database)

1. [Implementazione](#implementazione)

1. [Test](#test)

  - [Protocollo di test](#protocollo-di-test)

  - [Risultati test](#risultati-test)

  - [Mancanze/limitazioni conosciute](#mancanze/limitazioni-conosciute)

1. [Consuntivo](#consuntivo)

1. [Conclusioni](#conclusioni)

  - [Sviluppi futuri](#sviluppi-futuri)

  - [Considerazioni personali](#considerazioni-personali)

1. [Sitografia](#sitografia)

1. [Allegati](#allegati)


## Introduzione

### Informazioni sul progetto

  Questo progetto é stato affidato dai professori Luca Muggiasca e Geo Petrini della SAMT (Scuola d'Arti e Mestieri di Trevano) alle classi I3AA e I3AC, nel quale sono presente pure io Daniel Josef Matt.
  Il progetto ci é stato consegnato il 07/09/2019 e dovrebbe essere consegnato il 20/12/2019, dopo le vacanze natalizie ci saranno le presentazioni su questo progetto.<br><br>



### Abstract
  Da bambini tutti abbiamo provato durante il tempo invernale di riprodurre con un foglio di carta spieghezzato e un forbice con la punta accuminata di creare il fiocco di neve piú complesso che avessimo mai visto.
  Questo progetto non é altro che un'evoluzione di quell'ambizione di un dettagliato ma stupendo fiocco di neve che avevamo da bambini, solamente che questa volta non utilizzeremo piú un pezzo di carta o una forbice, ma un programma scritto in JAVA12 che da un triangolo, che raffigura il foglio di carta piegato, incideremo poi dei punti che formeranno 1 o piu poligoni la cui area verra "tagliata" via dal triangolo. 
  Dopo la fase di taglio si potrà vedere il fiocco di neve creato dalla traslazione, che rappresenta la riapertura di un normale foglio di carta, del triangolo.


### Scopo

  Lo scopo di questo progetto, oltre a quello di realizzare un nuovo applicativo, é quello di farci imparare come si gestisce un progetto (progettazione e implementazione).


## Analisi

### Analisi del dominio
Il prodotto finale verrà utilizzato da utenti ai quali piace fare lavori manuali come creare fiocchi di neve con la carta. Quindi non avranno un'ampia conoscenza informatica e per questo l'applicativo deve essere user frendly.

### Analisi e specifica dei requisiti
Per questo progetto ci sono stati dati questi requisiti da rispettare:<br>

|ID         |Requisito          |Categoria      |Priorità | Versione|
|-----------|-------------------|---------------|---------|---------|
|001|Applicativo in Java|Linguaggio|1        |1        |
|002|Sito del progetto con possibilità di scaricarlo|Presentazione/Descrizione progetto|4|1|
|003|Il sito non deve avere colori fastidosi|struttura sito|6|1|
|004|Il sito deve contenere una piccola guida di utilizzo con degli screenshots, i requisiti del sistema, la JRE|struttura sito|6|1|
|005|Implementare interfaccia grafica| programmazione |1|1|
|006|Finestra all'avvio dimensioni minime di 1024x768|layout applicazione|4|1|
|007|Area di lavoro é un triangolo. dimensioni 50% rispetto alla finestra|area lavoro|1|1|
|008|Il triangolo deve essere sempre centrato.|layout applicazione|3|1|
|009|Triangolo é ridimensionabile.|layout applicazione|4|1|
|010|Tagli del triangolo con il mouse Left Button| Logica applicativo |1|1|
|011|I punti di taglio possono avere la forma di uno o piú poligoni.|logica applicativo|1|1|
|012|I punti del triangolo si possono resettare.|Logica applicativo|4|1|
|013|I punti di taglio possono essere spostati o rimossi.|Logica applicativo|7|1|
|014|Il/I poligono/i di taglio devono poter essere salvati o in file o DB. (Consigliato in JSON, CSV o serializzazione oggetto). con anche una miniatura|logica applicativo|6|1|
|015|Tasto di generazione del fiocco di neve prodotto che mostra un'anteprima.|Logica applicativo|1|1|
|016|Generazione in tempo reale sin dal l'inizio oppure quando vuole l'utente|logica applicativo|4|1|
|017|Possibilità di salvare il fiocco di neve in PNG o SVG (scelta dell'utente).|logica applicativo|4|1|
|018|Salvare il fiocco di neve con dimensioni correnti (finestra applicativo) o 500 o 1000.|logica applicativo|4|1|
|019|Il percorso di salvataggio puo essere di default ma meglio se lo sceglie l'utente.|logica applicativo|4|1|
|020|Consegna .jar sul sito e il .class su github.|logica applicativo|6|1|

**Spiegazione elementi tabella dei requisiti:**

**ID**: identificativo univoco del requisito

**Requisito**: breve descrizione del requisito

**Categoria**: Indica la categoria del requisito e le conoscenze che bisogna avere per completare questo reauisito

**Priorità**: indica l’importanza di un requisito nell’insieme del
progetto, definita assieme al committente. Ad esempio poter disporre di
report con colonne di colori diversi ha priorità minore rispetto al
fatto di avere un database con gli elementi al suo interno. Solitamente
si definiscono al massimo di 2-3 livelli di priorità.

**Versione**: indica la versione del requisito. Ogni modifica del
requisito avrà una versione aggiornata.

Sulla documentazione apparirà solamente l’ultima versione, mentre le
vecchie dovranno essere inserite nei diari.

### Use Case
![Use Case](UseCase/UseCaseFiocco.png)

### Pianificazione
Gantt Preventivo:<br>

![Gantt Preventivo](GANTT_Progetto/Gantt_Preventivo.PNG)

### Analisi dei mezzi

<ul>
  <li>Hardware: ASUS X556UAM</li>
  <li>Sistema Operativo usato: Windows 10 Home</li>
  <li>Software Gantt: Project Libre</li>
  <li>Ambiente di sviluppo: NetBeans 11.1</li>
  <li>Linguaggio usato per la documentazione per Documentazione: MarkDown</li>
  <li>Linguaggio prorammazione: Java 13.0</li>
  <li>Librerie Java: Batik 2.0</li>
  <li>Hosting: Infomaniak</li>
  <li>Html,Css,Javascript</li>
</ul>

## Progettazione

L'applicativo si aprira con un <a href="../imgs/GUI.JPG">menú</a> che offre la scelta di <a href="../imgs/ApriEScegliFile.JPG">aprire</a> un fiocco gia esistente per poi caricarlo nel pannello con il <a href="../imgs/Triangolo.JPG">triangolo</a> dove si potrà aggiungere altri poligoni di taglio e poi <a href="../imgs/FioccoGenerato.JPG">generare</a> il fiocco.

### Design dell’architettura del sistema

![UML Progetto](UML/UML_FioccoNeve.png)

### Design dei dati e database

Il progetto da la possibilita di salvare i fiocchi di neve su files ".csv". Su sito del progetto sono a dispoizione alcuni fiocchi di neve già generati.

### Design delle interfacce
Gui:<br>

![DesignGui](../imgs/GUI.JPG)
<br>
L'appicazione da la possibilità di aprire un file fiocco di nve già fatto o di creare un nuovo fiocco di neve.
Triangolo: 

![Triangolo](../imgs/Triangolo.JPG)
<br>
Se si vuole creare un nuovo fiocco di neve si apre una finestra con un triangolo che cliccando con il mouse si crea un poligono che andrà a tagliare questo triangolo e poi con il pulsante si aprira un'atra finestra che conterrà il fiocco di neve generato in base al taglio generato sul triangolo.
Fiocco:
<br>

![Fiocco](../imgs/FioccoGenerato.JPG)
<br>
Questa finestra contiene il fiocco generato e 2 pulsanti per salvarlo come immagine vettoriale (SVG) e come immagine raster (PNG).

## Design finale
Alla fine ho deciso per motivi di comodicita che avere solo un finestra aperta era piu comodo cosí ho inserito i pannelli del triangolo e del fiocco generato nello stesso Frame in modo da semplificare all'utente la vista del fiocco.

## Implementazione

## Definizione Classi
<ul>
  <li><b>GUI</b>: questa classe rappresena un frame iniziale che offre la possibilita di aprire o di creare un nuovo fiocco di neve tramite 2 pulsanti. Se si preme il primo, aprire, si aprirà una finestra di dialogo che permetterà di aprire file di tipo csv o xls. Mentre se si preme il secondo si aprirà il frame della classe GeneratoreFiocco</li>
  <li><b>GeneratoreFiocco</b>: questa classe é un frame che contiene 2 pannelli: uno che rappresenta il triangolo da tagliare (TriangoloPanel) e un'altro che, invece, rappresenta il fiocco (FioccoPanel) di neve generato. Sotto questi 2 pannelli ci sarà un menú di pulsanti utili alla realizzazione del fiocco.</li>
  <li><b>TriangoloPanel</b>: questa classe si occupa di disegnare un oggetto Triangolo e a ogni click del mouse aggiungere un punto a un oggetto PoligonoTaglio.</li>
  <li><b>Triangolo</b>: rappresenta un modello di triangolo con dimensioni pari al 50% rispetto all'area della finestra che lo contiene.</li>
  <li><b>PoligonoTaglio</b>: rappresenta un modello di poligono di taglio. Si occupa di ridimensionare tutti i punti di tutti i poligoni di taglio ogni volta che il panel viene ridimensionato</li>
  <li><b>TriangoloTagliato</b>: si occupa di sottrarre le aree dei poligoni di taglio all'area del trioangolo di base.</li>
  <li><b>SavePoints</b>: si occupa di salvare tutti i punti dei poligoni di taglio su un file CSV nel seguente formato:<br>x,y<br>x,y<br>x,y<br>. (Per indicare che é finito un poligono)</li>
  <li><b>LoadPoints</b>: si occupa di caricare nell'applicativo un file con il fiocco di neve già esistente. Se il file non rispetta le convenzioni stabilite aprirà il frame GeneratoreFiocco senza aprire nessun fiocco.</li>
  <li><b>FioccoPanel</b>: é un pannello che disegna il fiocco di neve generato al centro del pannello.</li>
</ul>

## Generazione Fiocco
![Codice Fiocco](Implementazione/GeneraFiocco.PNG)<br>
Il fiocco di neve viene generato specchiango il triangolo tagliato con il metodo mirrorTriangle e poi con il metodo rotate viene ruotato in base ad un angolo passato.

Per generare il fiocco vero e proprio la classe utilizza il metodo generaFiocco che fa girare 6 volte il triangolo tagliato. A ogni cicle viengono create due aree una specchiata e ruotata di un angolo multiplo di 6 e la seconda solamente ruotata sempre per lo stesso angolo dell'area precedente. 

## Test

### Protocollo di test

|Test Case      | TC-001                               |
|---------------|--------------------------------------|
|**Nome**       |Spostare e  |
|**Riferimento**|REQ-012                               |
|**Descrizione**|Import a card with KIC, KID and KIK keys with no obfuscation, but not shown with the GUI |
|**Prerequisiti**|Store on local PC: Profile\_1.2.001.xml (appendix n\_n) and Cards\_1.2.001.txt (appendix n\_n) |
|**Procedura**     | - Go to “Cards manager” menu, in main page click “Import Profiles” link, Select the “1.2.001.xml” file, Import the Profile - Go to “Cards manager” menu, in main page click “Import Cards” link, Select the “1.2.001.txt” file, Delete the cards, Select the “1.2.001.txt” file, Import the cards |
|**Risultati attesi** |Keys visible in the DB (OtaCardKey) but not visible in the GUI (Card details) |

|Test Case      | TC-001                               |
|---------------|--------------------------------------|
|**Nome**       |Download e prova programma |
|**Riferimento**|REQ-002                               |
|**Descrizione**|Scaricare dal sito l'applicativo e avviarlo|
|**Prerequisiti**|Sito completo e programma funzionante|
|**Procedura**     |Scaricare il programma del sito e testare il suo funzionamento|
|**Risultati attesi** |Non ci dovrebbere essere errori durante l'esecuzione del programma|

|Test Case      | TC-002                               |
|---------------|--------------------------------------|
|**Nome**       |Dimensioni minime e ridimensionamento |
|**Riferimento**|REQ-006                              |
|**Descrizione**|Provare a ridimensionare la pagina|
|**Prerequisiti**|Avere impostato le dimensioni minime|
|**Procedura**   |Eseguire il programma e ridimensionare la pagina al di sotto dei 1024x768|
|**Risultati attesi** |La finestra non puo andare sotto ai 1024x768|

|Test Case      | TC-003                               |
|---------------|--------------------------------------|
|**Nome**       |Taglio del triangolo (Aggiunta Punti)|
|**Riferimento**|REQ-010                               |
|**Descrizione**|Aggiungere i punti per generare i poligoni di taglio|
|**Prerequisiti**|Avere il triangolo e avere la possibilita di aggiungere punti con il mouse|
|**Procedura**     |Avviare il programma e con il mouse creare i poligoni cliccando sul pannello i punti|
|**Risultati attesi** |Cliccando sul pannello si dovrebbero aggiungere i punti e sopra ai 3 si deve formare il poligono di taglio|

|Test Case      | TC-004                               |
|---------------|--------------------------------------|
|**Nome**       |Reset dei punti |
|**Riferimento**|REQ-012                               |
|**Descrizione**|Testare il pulsante di reset dei punti|
|**Prerequisiti**|Possibilita di aggiungere punti e avere il pulsante di reset|
|**Procedura**     |Avviare il programma, aggiungere dei punti di taglio per poi rimuoverli con il tasto reset|
|**Risultati attesi** |Quando si preme il pulsante i punti del poligono di taglio si devono cancellare|

|Test Case      | TC-005                               |
|---------------|--------------------------------------|
|**Nome**       |Spostare i punti di taglio |
|**Riferimento**|REQ-0013                               |
|**Descrizione**|Spostare i punti di taglio|
|**Prerequisiti**|Avere punti di taglio e la possibilità di spostarli|
|**Procedura**     |Avviare il programma, aggiungere punti e poi spostarli con il mouse|
|**Risultati attesi** |I punti si devono spostare|

|Test Case      | TC-006                               |
|---------------|--------------------------------------|
|**Nome**       |Rimuovere i punti di taglio |
|**Riferimento**|REQ-0013                               |
|**Descrizione**|Rimuovere i punti di taglio|
|**Prerequisiti**|Avere punti di taglio e la possibilità di rimuoverli|
|**Procedura**     |Avviare il programma, aggiungere punti e poi rimuoverli con il mouse|
|**Risultati attesi** |I punti si devono rimuovere|

|Test Case      | TC-007                               |
|---------------|--------------------------------------|
|**Nome**       |Salvateggio dei poligoni di taglio su un file |
|**Riferimento**|REQ-0014                               |
|**Descrizione**|Salvare i poligoni di taglio su un file|
|**Prerequisiti**|Avere poligoni di taglio e possibilità di salvarli in file|
|**Procedura**     |Avviare il programma, aggiungere punti e poi salvarli su un file|
|**Risultati attesi** |Le coordinate dei punti devono essere state scritte sul file|

|Test Case      | TC-008                               |
|---------------|--------------------------------------|
|**Nome**       |Generazione fiocco |
|**Riferimento**|REQ-0015                               |
|**Descrizione**|Generare il fiocco di neve|
|**Prerequisiti**|Triangolo tagliato|
|**Procedura**     |Avviare il programma, aggiungere punti, tagliare il triangoli con i poligoni di taglio e poi generare il fiocco di neve con esso|
|**Risultati attesi** |Fiocco generato con il triangolo tagliato|

|Test Case      | TC-009                               |
|---------------|--------------------------------------|
|**Nome**       |Generazione Live|
|**Riferimento**|REQ-0016                               |
|**Descrizione**|Generazione live del fiocco|
|**Prerequisiti**|Triangolo tagliato e fiocco generabile|
|**Procedura**   |Avviare il programma, aggiungere punti, tagliare il triangoli con i poligoni di taglio e poi generare il fiocco di neve con esso|
|**Risultati attesi** |Fiocco generato in live con il triangolo tagliato|

|Test Case      | TC-010                               |
|---------------|--------------------------------------|
|**Nome**       |Salvataggio Img fiocco|
|**Riferimento**|REQ-0017                               |
|**Descrizione**|Salvare fiocco in PNG e SVG|
|**Prerequisiti**|Fiocco generato e possibilità di generare svg e png|
|**Procedura**   |Generare un fiocco e salvarlo in png e svg|
|**Risultati attesi** |Il fiocco generato deve essere salvato come immagine svg e png|

### Risultati test

|Test|Risultato|
|----|---------|
|TC-001|Successo|
|TC-002|Successo|
|TC-003|Successo|
|TC-004|Successo|
|TC-005|Fallito|
|TC-006|Successo|
|TC-007|Successo|
|TC-008|Successo|
|TC-009|SemiRiuscito|
|TC-010|Successo|

### Mancanze/limitazioni conosciute

L'applicativo non presenta una live fluida come richiesto ma per aggiornare il fiocco bisogna aggiungere il poligono di taglio con il pulsante <b>Add Polygon</b>. Inoltre la generazione dell'immagine raster del fiocco avviene con dimensioni già definite dal programma e non si puó cambiare.

## Consuntivo

Gantt Consuntivo:<br>
![GanttConsuntivo](GANTT_Progetto/Gantt_Consuntivo.png)


## Conclusioni

Quali sono le implicazioni della mia soluzione? Che impatto avrà?
Cambierà il mondo? È un successo importante? È solo un’aggiunta
marginale o è semplicemente servita per scoprire che questo percorso è
stato una perdita di tempo? I risultati ottenuti sono generali,
facilmente generalizzabili o sono specifici di un caso particolare? ecc

### Sviluppi futuri
  In futuro si puó implemetare la possibilità di passare le dimensioni dell'immagine raster con per esempio un label. Poi si puó modificare la live e renderla piú fluida.

### Considerazioni personali
  Da questo progetto ho imparato che la documentazione essendo una parte fondamentale di un progetto la si bisogna fare man mano che il progetto va avanti e non come ho fatto io che mi sono ritrovato a fare tutto nelle ultime settimane.

## Bibliografia

### Sitografia
https://xmlgraphics.apache.org/batik/using/svg-generator.html, Apache sito librerie per Netbeans, 20.12.2019<br>
https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/, <br>
Spiegazione comen scrivere e leggere un fil csv in javv, 20.12.2019<br>
https://getbootstrap.com/docs/4.4/getting-started/download/, BootStrap codice sorgente css, 20.12.2019<br>
https://www.w3schools.com/, W3School Web Tutorial,20.12.2019<br>
https://www.oracle.com/technetwork/java/javase/downloads/jdk13-downloads-5672538.html, Versione 13 di java, 20.12.2019<br>
http://plugins.netbeans.org/plugin/55435/easyuml, Plugin NetBeans, 20.12.2019<br>
https://app.creately.com/diagram/create, Editore Use Case Online,20.12.2019<br>
