//AUTHOR: Robert

import java.util.List;

/* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VARIABILE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

public class Materie {
    public String denumire;
    public String prescurtare;
    public String detalii;
    public List<Profesor> profesori;

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Materie(String denumire, String prescurtare, String detalii, List<Profesor> profesori) {
        this.denumire = denumire;
        showdenumire(this.denumire);
        this.prescurtare = prescurtare;
        showprescurtare(this.prescurtare);
        this.profesori = profesori;
        this.detalii = detalii;
        showdetalii(detalii);


    }

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    //Afisare nume materie
    public void showdenumire(String Denumire) {
        System.out.println("Numele materiei: " + "\t" + Denumire);
    }

    //Verificare prescurtare
    public boolean showprescurtare(String Prescurtare) {
        if (!(Prescurtare.length() <= 5)) {
            System.out.println("Prescurtarea invalida");
            return false;
        }
        if (Prescurtare.substring(0, 1).equals(denumire.substring(0, 1))) {
            System.out.println("Prescurtarea: " + "\t" + Prescurtare);
            return true;
        } else {
            System.out.println("Prescurtarea invalida");
            return false;
        }
    }

    public void showdetalii(String Detalii) {
        if (Detalii.length() <= 100) {
            System.out.println("Detalii: " + Detalii);
        } else {
            System.out.println("Limita de caractere atinsa");
        }
    }

    @Override
    public String toString() {
        return "Materie["
                + denumire +
                ']';
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getPrescurtare() {
        return prescurtare;
    }

    public void setPrescurtare(String prescurtare) {
        this.prescurtare = prescurtare;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public List<Profesor> getProfesori() {
        return profesori;
    }

    public void setProfesori(List<Profesor> profesori) {
        this.profesori = profesori;
    }
}