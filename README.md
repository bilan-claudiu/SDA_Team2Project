# SDA_Team2Project
Sda Team Project - echipa 2 (Flavia, Adelina, Alexandru, Robert, Claudiu)

Model
        Student
        Grupa
        Mesaj
        Profesor
        Orar
        Locatie
        Materie
        
 Student
    Nume - text, obligatoriu
    Prenume - text, obligatoriu
    Email - text, obligatoriu, validare format si unicitate
    Data_nasterii - data, obligatoriu
    Telefon - text, validare format
    Grupa - numeric, intre 1 si 10. Reprezinta grupa din care face parte studentul

Grupa
    IdGrupa - numeric,obligatoriu intre 1 si 10.
    An - obligatoriu intre 1 si 6. Reprezinta anul din care face parte grupa.
    Studenti - lista de studenti
    Mesaje- lista de mesaje asociate grupei
    
 Profesor
    Nume - text, obligatoriu
    Prenume - text, obligatoriu
    Email - text, obligatoriu, validare format
    Telefon - text, validare format
    Grad - lista, obligatoriu, Grade possible: profesor, asistent, laborant
    Anul_angajarii - numeric, obligatoriu >1970
    Activ - boolean, obligatoriu, Indica daca profesorul este activ si poate fi alocat pentru cursuri
    Materii - lista de materii predate
    
 Materie
    Denumire - text, obligatoriu
    Prescurtare - text, obligatoriu. Denumirea scurta a materiei
    Detalii - text, obligatoriu, maxim 100 caractere. Detalii despre continutul cursului / seminarului
    Profesori - lista de profesori care pot preda materia curenta
    
  Orar
    Grupa -  obligatoriu
    Profesor - obligatoriu
    Locatie - obligatoriu
    Data - data, obligatoriu
    Ora_inceput - text, obligatoriu
    Ora_sfarsit - text, obligatoriu
    Detalii - text, obligatoriu, Detalii optionale despre curs
    Materie - obligatoriu  
    
 Mesaj
    Student - obligatoriu, Studentul care a transmis mesajul
    Timp - data si timpul, obligatoriu. Timpul exact la care a fost transmis cu precizie cat mai mare (e.g. milisecunde). Precizia este necesara pentru ordonare cronologica.
    Text - text, obligatoriu. textul mesajului
    Grupa - obligatoriu, grupa unde a fost transmis mesajul
    
    
    
    
    
