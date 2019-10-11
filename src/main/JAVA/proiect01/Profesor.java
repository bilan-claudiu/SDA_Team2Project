package main.JAVA.proiect01;

import java.util.List;

 class Profesor {

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VARIABILE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    private String nume;
    private String prenume;
    private String email;
    private String telefon;
    private List<String> gradList;
    private int anAngajare;
    private boolean activ;
    private List<Materie> listMaterii;
    private String grad;

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/


    public Profesor(String nume, String prenume, String email, String telefon, int anAngajare, boolean activ, String grad) {

        this.nume = nume;
        this.prenume = prenume;

        infoName(nume, prenume);

        if (checkEmail(email) == true) {
            this.email = email;
        }
        if (checkPhone(telefon) == true) {
            this.telefon = telefon;
        }

        this.grad = grad;

        checkGrad(grad);

        if (checkAnAngajare(anAngajare) == true)

            this.anAngajare = anAngajare;

        this.activ = checkFreedom(activ);
    }

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

     public Profesor(String nume, String prenume) {

        this.nume = nume;
        this.prenume = prenume;
    }

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    // afisare nume+prenume

    public void infoName(String nume, String prenume) {

        System.out.println("______________");
        System.out.println("Profesor :  " + " \t" + this.nume + "\t" + this.prenume);
        System.out.println("--------------");

    }

    //regex @)

    private boolean containEmailSign(String email) {

        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);

    }

    //verificare format mail

    public boolean checkEmail(String email) {

        if (containEmailSign(email)) {
            System.out.println("Email: " + email);
            return true;
        } else {
            System.out.println("Eroare! Adresa de email profesor nu contine @");
        }
        return false;
    }

    // verificare tel LUNGIME+CIFRE

    public boolean checkPhone(String telefon) {

        if ((checkphone(telefon) == true) && (checkPhoneLength(telefon) == true)) {
            System.out.println("Telefon: " + telefon);
            return true;
        } else {
            System.out.println("Eroare. Numar Telefon  invalid");
            return false;
        }
    }

    // verifica daca nr. tel contine doar cifre

    private boolean checkphone(String phonenumber) {
        String phoneNumber = "9999999998";
        String regex = "(0/91)?[7-9][0-9]{9}";
        boolean flag = (phoneNumber.matches(regex));
        return flag == true;
    }

    // verifica lungime nr.tel = 10;

    private boolean checkPhoneLength(String tel) {
        return (tel.length() == 10);
    }

    // verifica grad

    public void checkGrad(String grad) {
        String str = grad.toLowerCase();
        if (str.equals("profesor") || str.equals("asistent") || str.equals("laborant")) {
            System.out.println("Grad: " + grad);
        } else {
            System.out.println("Eroare!Grad necunoscut");
        }
    }

    // verifica an angajare

    public boolean checkAnAngajare(int an) {
        this.anAngajare = anAngajare;
        if (anAngajare >= 1970) {
            return true;
        } else {
            return false;
        }
    }

    // verifica disponibilitate profesor

    public boolean checkFreedom(boolean activ) {
        if (activ) {
            System.out.println("Profesorul  " + this.nume + " " + this.prenume + " este liber");
            return true;
        } else {
            System.out.println("Profesorul  " + this.nume + " " + this.prenume + " nu este eligibil");
        }
        return false;
    }

    @Override

    public String toString() {
        return "[" +
                nume + " " +
                prenume +
                ']';
    }
}