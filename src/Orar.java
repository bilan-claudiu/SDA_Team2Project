// AUTHOR: Flavia

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Orar {

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VARIABILE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    private Grupa grupa;
    private Profesor profesor;
    private Locatie locatie;
    private Date time;
    private String ora_Inceput;
    private String ora_Sfarsit;
    private String detalii;
    private Materie materie;


    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Orar(Grupa grupa, Profesor profesor, Locatie locatie, String time, String ora_Inceput, String ora_Sfarsit, String detalii, Materie materie) {
        this.grupa = grupa;
        this.profesor = profesor;
        this.locatie = locatie;
        this.ora_Inceput = ora_Inceput;
        this.ora_Sfarsit = ora_Sfarsit;
        this.detalii = detalii;
        this.materie = materie;
    }


    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METODE  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/


    public void arataOrar() {
        System.out.println("Grupa: " + grupa);
        System.out.println("Profesor: " + profesor);
        System.out.println("Locatia: " + locatie);
        System.out.println("Data: " + LocalDate.now() + "\t" + LocalTime.now());
        System.out.println("Ora la care incepe: " + ora_Inceput);
        System.out.println("Ora la care se termina: " + ora_Sfarsit);
        System.out.println("Detali: " + detalii);
        System.out.println("Materia: " + materie);


    }


    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> GET/SET>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }


    public String getOra_Inceput() {
        return ora_Inceput;
    }

    public void setOra_Inceput(String ora_Inceput) {
        this.ora_Inceput = ora_Inceput;
    }

    public String getOra_Sfarsit() {
        return ora_Sfarsit;
    }

    public void setOra_Sfarsit(String ora_Sfarsit) {
        this.ora_Sfarsit = ora_Sfarsit;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public Materie getMaterie() {
        return materie;
    }

    public void setMaterie(Materie materie) {
        this.materie = materie;
    }
}
