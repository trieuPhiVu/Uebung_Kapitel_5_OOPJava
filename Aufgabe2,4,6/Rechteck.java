public class Rechteck {
        private double laenge;
        private double breite;
        //Setter Laenge
        public void setLaenge(double laenge) {
            this.laenge = laenge;
        }
        //Getter Laenge
        public double getLaenge() {
            return this.laenge;
        }
        //Setter Breite
        public void setBreite(double breite) {
            this.breite = breite;
        }
        //Getter Breiter
        public double getBreite() {
            return this.breite;
        }
        //Setter Seite
        public void setSeite(double laenge, double breite) {
            this.laenge = laenge;
            this.breite = breite;
        }
        //Konstruktor ohne Parameter
        public Rechteck() {
            this.laenge = 0;
            this.breite = 0;
        }
        //Konstruktor mit @ Parameter
        public Rechteck(double laenge, double breite) {
            try{
                if (laenge > breite) {
                    this.laenge = laenge;
                    this.breite = breite;
                }
                else {
                    throw new Exception("die Laenge muss grosser als Breite sein");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        // Methoden
        public double getLangeSeite() {
            return (this.laenge > this.breite) ? this.laenge : this.breite;
        }

        public double getKurzeSeite() {
            return (this.breite < this.laenge) ? this.breite : this.laenge;
        }

        public double getDiagonale() {
            return Math.sqrt(Math.pow(this.laenge, 2) * Math.pow(this.breite, 2));
        }

        public double getUmfang() {
            return 2 * this.laenge + 2 * this.breite;
        }

        public double getFlaeche() {
            return this.laenge * this.breite;
        }

        //Aufgabe 4 Vergrößen und Verkleinen methoden für Länge und Breite
        public void laengeVergroessern(double laenge) {
            this.laenge += laenge;
        }

        public void breiteVergroessern(double breite) {
            this.breite += breite;
        }

        public void laengeVerkleinen(double laenge) {
            this.laenge -= laenge;
        }

        public void breiteVerkleinen(double breite) {
            this.breite -= breite;
        }
}