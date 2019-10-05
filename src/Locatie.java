//AUTHOR:Robert

public class Locatie {

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VARIABILE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public String Denumireloc;
    public int Capacitate;
    public boolean Activa;
    public String Adresa;

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Locatie(String denumireloc, int capacitate, boolean activa, String adresa) {
        this.Denumireloc = denumireloc;
        setDenumireloc(denumireloc);
        this.Capacitate = capacitate;
        setCapacitate(capacitate);
        this.Activa = activa;
        setActiva(activa);
        this.Adresa = adresa;

    }
    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public void setDenumireloc(String Denumireloc) {
        if (Denumireloc.length() <= 5) {
            System.out.println("Denumire locatie: " + Denumireloc);
        } else {
            System.out.println("Locatie inexistenta");
        }
    }

    public void setCapacitate(int Capacitate) {
        if (Capacitate >= 50 && Capacitate <= 300) {
            System.out.println("Locuri suficiente");
        } else {
            System.out.println("Insuficiente locuri");
        }
    }

    public boolean setActiva(boolean Activa) {
        if (Activa == true) {
            System.out.println("Sala este disponibila");
            return true;
        } else {
            System.out.println("Sala este indisponibila");
            return false;
        }
    }


    @Override
    public String toString() {

        return "["
                + Denumireloc +
                "]";
    }
}