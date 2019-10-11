package main.JAVA.proiect01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

 public class Mesaj {

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VARIABILE  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    private Student Student;
    private Date Time;
    private String Text;
    private int Grupa;

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CONSTRUCTOR  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public Mesaj(Student Sudent, String Text, int Grupa) {
        this.Student = Student;
        System.out.println("Studentul care a trimis mesajul: " + Student);
        this.Time = Time;
        System.out.println("Data: " + LocalDate.now() + "\t" + LocalTime.now());
        this.Text = Text;
        System.out.println("Text: " + Text);
        if(showMesaj(Grupa)==true) {
            this.Grupa = Grupa;
        }
    }

    /* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METODE  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    public boolean showMesaj(int Grupa) {
        if(Grupa>=1&&Grupa<=10) {
            System.out.println("Grupa: " + Grupa);
            return true;

        } else {
            System.out.println("Grupa nu exista");
            return false;
        }
    }

    @Override

    public String toString() {
        return "Mesaj[" +
                Text  +
                ']';
    }
}