//AUTHOR: Claudiu

import java.util.ArrayList;
import java.util.List;


public class Student {

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VARIABILE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    private String nume;
    private String prenume;
    private String email;
    private String dataNastere;
    private String telefon;
    private int grupa;

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Student(String nume, String prenume, String email, String dataNastere, String telefon, int grupa) {

        this.nume = nume;
        this.prenume = prenume;
        System.out.println("______________________________________");
        System.out.println("Student nr :  " + " \t" + this.nume + "\t" + this.prenume);
        System.out.println("----------------------------------------");


        List<String> emailList = new ArrayList<String>();

        if ((!emailList.contains(email)) && (containEmailSign(email))) {
            emailList.add(email);
            this.email = email;
            System.out.println("Email: " + email);
        } else {
            System.out.println("Studentul nu a putut fi inregistrat. Adresa de email nu contine @");
        }

        this.dataNastere = dataNastere;
        System.out.println("Data nastere: " + dataNastere);

        if (checkGrupa(grupa) == true) {
            this.grupa = grupa;
        } else {
            System.out.println("Nr grupa invilid");
        }

        /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METODE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

        //verifica tel
        if ((checkPhone(telefon) == true) && (checkPhoneLength(telefon) == true)) {
            this.telefon = telefon;
            System.out.println("Telefon: " + this.telefon);
        } else {
            System.out.println("Studentul nu a putut fi inregistrat. Telefon invalid");
        }

    }

    // verifica lungime nr.tel
    public boolean checkPhoneLength(String tel) {
        return (tel.length() == 10);
    }

    // verifica nr.grupa
    public boolean checkGrupa(int gr) {
        return ((gr < 10) && (gr > 0));
    }

    //verifica nr.telefon doar cifre
    public boolean checkPhone(String phonenumber) {
        String regex = "^(\\+4|)?(07[0-8]{1}[0-9]{1}|02[0-9]{2}|03[0-9]{2}){1}?(\\s|\\.|\\-)?([0-9]{3}(\\s|\\.|\\-|)){2}$";
        boolean flag = (phonenumber.matches(regex));
        if (flag) {
            return true;
        }
        return false;
    }


    //Verifica nr.telefon contine @
    public boolean containEmailSign(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    @Override
    public String toString() {
        return nume + " " + prenume;
    }

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> GET/SET>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(String dataNastere) {
        this.dataNastere = dataNastere;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getGrupa() {
        return grupa;
    }

    public void setGrupa(int grupa) {
        this.grupa = grupa;
    }
}



