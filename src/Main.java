import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>DECLARARE STUDENTI SI LISTA DE STUDENTI>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Student st1 = new Student("Ionescu", "Maria", "ionescumaria@yahoo.com",
                "08.12.2000", "0770453678", 3);

        Student st2 = new Student("Popescu", "Raul", "popraul@gmail.com",
                "23.07.1998", "0778657432", 5);

        Student st3 = new Student("Avram", "Adelina", "avramade@gmail.com",
                "26.12.1995", "076528478", 2);

        Student st4 = new Student("Marincu", "Loredana", "marinculore@gmail.com",
                "08.10.1990", "0724569587", 3);

        Student st5 = new Student("Badau", "Vlad", "badauvlad@gmail.com",
                "26.12.1995", "0723546789", 4);





        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>DECLARARE PROFESORIE SI LISTA DE PROFESORI temporara>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Profesor tempprof1 = new Profesor("Popa", "Vasile");
        Profesor tempprof2 = new Profesor("Mitica", "Emanuel");
        Profesor tempprof3 = new Profesor("Belei", "Andrei");
        Profesor tempprof4 = new Profesor("Manusa", "Iulia");
        Profesor tempprof5 = new Profesor("Lata", "Dana");
        List<Profesor> listTempProf = new ArrayList<>();
        listTempProf.add(tempprof1);
        listTempProf.add(tempprof2);
        listTempProf.add(tempprof3);
        listTempProf.add(tempprof4);
        listTempProf.add(tempprof5);

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>MATERII SI LISTA DE MATERII>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        Materie materie1 = new Materie("Chimie", "CH", "Chime organica si anorganica", listTempProf);
        Materie materie2 = new Materie("Fizica", "FZ", "Fizica atomica", listTempProf);
        Materie materie3 = new Materie("Electronica", "ED", "Electronica Digitala", listTempProf);
        Materie materie4 = new Materie("Programare", "PG", "Java", listTempProf);
        Materie materie5 = new Materie("Biologie", "BG", "Biologie Celulara", listTempProf);
        List<Materie> listMaterii = new ArrayList<>();
        listMaterii.add(materie1);
        listMaterii.add(materie2);
        listMaterii.add(materie3);
        listMaterii.add(materie4);
        listMaterii.add(materie5);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Profesor si lista de profesori>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Profesor profesor1 = new Profesor("Matei", "Andrei", "mateiA@yahoo.com",
                "0777097685", 1978, true, "profesor");
        Profesor profesor2 = new Profesor("Constantin", "Andreea", "constandrea@gmail.com",
                "0777064545", 1990, false, "asistent");
        Profesor profesor3 = new Profesor("Ramneantu", "Adrian", "radrian@gmail.com",
                "023417856", 2006, true, "laborant");
        Profesor profesor4 = new Profesor("Stoleru", "MArius", "stolerum@gmail.com",
                "0719635447", 2016, false, "asistent");
        Profesor profesor5 = new Profesor("Santa", "Lucia", "santalucia@gmail.com",
                "0756963524", 2009, true, "profesor");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Locatie>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Locatie locatie = new Locatie("B105", 346, true, "Str Parvan");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Mesaj+ lista mesaje>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Mesaj mesaj = new Mesaj(st1, "Mesaj1", 4);
        List<Mesaj> listmesaj = new ArrayList<>();
        listmesaj.add(mesaj);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Grupa>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        Grupa grupa = new Grupa(4, 6, studentList, listmesaj);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Orar>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Orar orar = new Orar(grupa, profesor1, locatie, "15.10.2019", "08:00", "14:00", "Chimie organica", materie1);
    }
}