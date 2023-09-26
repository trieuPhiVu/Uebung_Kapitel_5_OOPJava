public class Kreis {
    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Kreis() {
        this.radius = 0;
    }
    
    public Kreis(double radius) {
        this.radius = radius;
    }

    public double getUmfang() {
        return Math.PI * 2 * radius;
    }

    public double getFlaeche() {
        return Math.PI * Math.pow(radius, 2);
    }
     //Aufgabe 5 Erstellen eine Methode mit Parameter von Umfang und Flaeche. dann die radius wird gerechnet
    public double setUmfang(double umfang) {
         return umfang / (2 * Math.PI);
     }

    public double setFlaeche(double flaeche) {
         return Math.sqrt(flaeche / Math.PI);
     }
     //Aufgabe 6: Erstellung eine Tabelle , um zu Umfang und Flaeche mit Distanz 5 zi zeigen
     public void ShowTabelle() {
        this.radius = 5;
        System.out.println("Radius"+"          "+"Umfang"+"          "+"Flaeche");
        for (int i = 0; i < 30; i++) {
            System.out.println(this.radius + "          " + getUmfang() + "          " + getFlaeche());
            this.radius += 5;
        }
     }
}
