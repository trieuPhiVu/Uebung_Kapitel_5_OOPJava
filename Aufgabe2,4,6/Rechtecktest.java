import javax.swing.JOptionPane;

public class Rechtecktest {
    public static void main(String[] args) {
        double laenge = Double.parseDouble(JOptionPane.showInputDialog("Gebe Sie die Laenge ein"));
        double breite = Double.parseDouble(JOptionPane.showInputDialog("Gebe Sie die Breite ein"));
        Rechteck rechteck=new Rechteck(laenge, breite);
        // System.out.println("die lange Seite: " + rechteck.getLangeSeite());
        // System.out.println("die kurze Seite: " + rechteck.getKurzeSeite());
        // System.out.println("die Diagonale: " + rechteck.getDiagonale());
        // System.out.println("der Umfang: " + rechteck.getUmfang());
        // System.out.println("die Flaeche: "+rechteck.getFlaeche());
        //Testen, indem man die eingegebewnen Wert vor der Ausgabe vergrößen bzw verkleinen
        rechteck.laengeVergroessern(10);
        rechteck.breiteVerkleinen(2);
        System.out.println(rechteck.getLaenge());
        System.out.println(rechteck.getBreite());
    }
}