#### Design Pattern der OOP
# Semesterbegleitende Abschlußarbeit!
## Thema 4 Beschreibung:
Implementieren Sie einen Algorithmus zum Zeichnen von Linien zwischen zwei Rechtecken,  
die verschiedene Strategien befolgt. Die Strategien müssen austauschbar sein.
### Strategien:
- Direkte Verbindung zwischen den Mittelpunkten (A)
- Horizontale Verbindung (B)
- Vertikale Verbindung (C)

![ALT-TEXT](/documentation/resources/images/connections.png)  
Quelle: Aufgabenstellung Dr. Doga Arinir

### Prüfungsform und Organisation

Die Abschlussprüfung dieses Moduls besteht aus einer **Programmieraufgabe**, die in einem Team aus maximal **drei Personen**  
umgesetzt, dokumentiert und im Rahmen einer mündlichen Prüfung vorgestellt werden muss. Jedes Team kann **eine Aufgabe**  
aus einer Liste von Projektthemen frei auswählen. Sofern die Auswahl der einzelnen Themen nicht gleich verteilt ist, muss die  
jeweilige Gruppe in Rücksprache mit dem Dozenten ein anderes Thema wählen. Sobald das Projekt gestartet wird, ist ein  
Ändern des Themas aber nicht möglich. Die Aufgaben werden so gestaltet sein, dass das Arbeitsvolumen für die Bearbeitung  
ca. **80h** je Gruppenmitglied umfasst. Rechnen Sie für die mündliche Prüfung ferner mit ca. **15 Minuten** je Gruppenmitglied.  
Die Vorstellung Ihrer Ergebnisse (Abschlusspräsentation) erfolgt über Zoom. Die Abschlussnote errechnet sich aus den  
Einzelbenotungen für die **Implementierung** (**40%-Gewichtung** / Einzelbewertung), der **Ausarbeitung** (**30%-Gewichtung** /  
Einzelbewertung) und der **mündlichen Prüfung**  (**30%-Gewichtung** / Einzelbewertung).  

### Termine:

Im Laufe des November 2022 wird die zur Auswahl stehende Aufgabenliste publiziert. Bis zum **13.12.2022** muss eine Anmeldung  
für die Prüfung erfolgen. Zudem muss jede(r) Teilnehmer(in) bis zu diesem Zeitpunkt eine Gruppe gefunden und ein Thema  
ausgewählt haben. Die Implementierungstätigkeiten **sollten bis zum 24.02.2023** abgeschlossen werden. Die Präsentationen finden  
in der **KW 9** vom **27.02.2023** bis zum **04.03.2023** statt.

### Abgabe:

Vor der mündlichen Prüfung müssen sowohl die Implementierung als auch eine schriftliche Ausarbeitung mit einem Umfang von  
ca. 10 DIN A4 Seiten abgegeben werden. Aus der Dokumentation sollten die Anforderungen an Ihre App, der Systemkontext und  
die Softwarearchitektur hervorgehen. Beschreiben Sie stichpunktartig auch relevante Funktionen Ihrer App. Die Abgabe erfolgt  
als Bearbeitung einer Moodle-Aufgabe als einzelne ZIP-Datei, welche über die Unterverzeichnisse "/dokumentation" und  
"/implementierung" verfügen muss. Die Dokumentation ist als PDF-Dokument bereitzustellen. Die Implementierung umfasst alle  
Quellcode-Dateien, die für die Kompilierung notwendig sind (außer NPM-Pakete, bitte schließen Sie daher das "/node_modules/"  
Verzeichnis aus). Im Hauptordner der ZIP-Datei muss sich zudem eine "readme.txt" befinden. Geben Sie in dieser Datei die Namen,  
E-Mail-Adressen sowie Matrikelnummern aller Gruppenmitglieder an. Dokumentieren Sie in dieser Datei auch die einzelnen Rollen  
und die Zuständigkeiten im Projekt. **Es muss klar hervorgehen, wer welche Funktionen der App implementiert und in der Ausarbeitung  
dokumentiert hat.**

### Gruppe / Teilnehmer:
Ingo Möller  
**_Die Aufgabe wurde als Einzelarbeit ausgeführt:_**  
[Daten der Teilnehmer: ](documentation/readme.txt)

# Gedanken zur Software:

### Rechteck:

1. Was ist ein Rechteck?
2. Wie beschreibe ich ein Rechteck?
3. Wie definiere ich Ankerpunkte?

### Umgebung:

1. Wie platziert man Elemente in der Umgebung?
2. Wie berechne ich Abstände zwischen Rechtecken?
3. Wie vermeide ich Kollisionen?

### Nutzereingaben:

1. Kann der Nutzer die Strategie zur Laufzeit ändern?
2. Welche Patterns sind relevant?

### System:

- Erzeugermuster: zum Erstellen der Rechtecke wird ein Factory-Pattern verwendet.
- Verhaltensmuster: zum Ändern der Verbindungsstrategie wird das Strategy-Pattern verwendet.