# Parameter und Rückgabewerte

Für die meisten Programme ist es unpraktisch, die errechneten Daten jedes Mal in der Konsole auszugeben (`print`) und anschließend wieder mit `Scanner` einzulesen. Daher können Methoden Übergabewerte (Parameter) und Rückgabewerte (Return-Values) besitzen. 

Nicht mehr sich, wie das funktioniert? Unten findest du Beispiele und Erklärungen oder schaue das Simpleclub [Video zu Methoden mit Parameter](https://youtu.be/oSDtCcDXcTM) und/oder das [Video zu Rückgabewerten](https://youtu.be/qQ79aq7HZ-U)

## Beispiele

<details>
  <summary>Auf-/Zuklappen</summary>

### Beispiel 1: Parameter

Die Definition der Parameter wird in den Klammern hinter dem Methoden-Namen gemacht und ähnelt sehr der Variablen-Definition. Der Methodenkop sieht dann beispielsweise so aus:
```java
public static void beispiel1(int ganzzahl, String text)
```

Parameter können innerhalb (also zwischen den geschweiften Klammern) einer Methode genauso wie Variablen verwendet werden - daher auch die Ähnlichkeit:
```java
public static void beispiel1(int ganzzahl, String text)
{
    System.out.println("Die Zahl "+ ganzzahl + " sieht ausgeschrieben so aus: " + text);
}
```

Der erste Wert eines Parameters wird jedes Mal beim Aufruf der entsprechenden Methode gesetzt. In BlueJ öffnet sich hierfür automatisch ein eigenes Fenster (ein sogenannter `Dialog`). Möchte man hier einen Parameter vom Typ `String` setzen, muss man wie im Programmcode auch doppelte Anführungszeichen `"..."` um den Text setzen. Beim Zahlen o.ä. braucht man das natürlich nicht.

Probiere in BlueJ aus, was passiert, wenn die die Methode `beispiel1()` ausführst.

### Beispiel 2: Rückgabewerte

Natürlich können Werte nicht nur vom Aufrufenden an die Methode übergeben werden, sondern auch anders herum. Einen solchen Wert nennt man dann Rückgabewert. 

Der Rückgabetyp (also der Typ des Rückgabewerts) wird ebenfalls im Methodenkopf festgelegt und steht immer unmittelbar vor dem Methodennamen. Wenn man keinen Rückgabewert benötigt, gibt man an dieser Stelle den Datentyp `void` an, um das für den Computer deutlich zu machen.

Beispiele für Methodenköpfe:
- `public static` **void** `beispiel1(int ganzzahl, String text)`
- `public static` **String** `beispiel2(int ganzzahl, String text)`

Als **letzter Schritt** der Methode wird dann der tatsächliche Wert zurückgegeben. Hierzu verwendet man das Schlüsselwort `return` gefolgt von einem Leerzeichen und dem Wert/der Variable deren Wert man zurückgeben möchte. Nach dem Return-Statement endet eine Methode sofort.

```java
public static String beispiel2(int ganzzahl, String text)
{
    return "Die Zahl "+ ganzzahl + " sieht ausgeschrieben so aus: " + text;
}
```

Probiere die Methode `beispiel2` in BlueJ aus und beobachte, was passiert.

### Beispiel 3: Mit Rückgabewerten arbeiten - Divide and Conquer
Mit dem Rückgabewert kann der Aufrufende (das bist entweder du oder eine andere Methode) natürlich weiterarbeiten. In `beispiel3` wird der Rückgabewert von `beispiel2` in die Variable `ausgabeText` gespeichert und anschließend auf der Konsole ausgegeben.

Diese Strukturierung gibt dem Programmierer die Möglichkeit, ein großes Problem in mehrere kleinere Probleme zu zerlegen und anschließend nacheinander oder im im Team aufgeteilt zu bearbeiten. Dieses Vorgehen ist Teil des Konzepts **Divide and Conquer** und spiegelt damit einen der wichtigsten Teile der Informatik wieder!

```java
public static void beispiel3(int ganzzahl, String text)
{
    String ausgabeText = beispiel2(ganzzahl, text);
    System.out.println(ausgabeText);
}
```

</details>

## Aufgabe
[task][Taschenrechner](AddStruct,SubStruct,MulStruct,DivStruct,AddBehave,SubBehave,MulBehave,DivBehave,ClassStruct)
Setze folgendes Klassendiagramm um und implementiere dabei auch den Inhalt der Methoden. Vergiss nicht, deine Methoden auszuprobieren, bevor du hochlädst! 

Da alle Methoden static (also Klassemethoden) sind, musst du keine Objekt erstellen, sondern kannst die Methoden direkt mit Rechtklick auf die Klasse starten.

@startuml
hide circle
class Taschenrechner {
  <color:testsColor(testAttributes[Context])></color>
  <color:testsColor(AddBehave)>+static double addieren(double z1, double  z2)</color>
  <color:testsColor(SubBehave)>+static double subtrahieren(double z1, double z2)</color>
  <color:testsColor(MulBehave)>+static double multiplizieren(double z1,double z2)</color>
  <color:testsColor(DivBehave)>+static double dividieren(double z1,double z2)</color>
}
@enduml
