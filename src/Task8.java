import java.util.List;

public class Task8 {

    public void ListAr(List<Profesor> list, String Grad) {
        Grad = Grad.toLowerCase();
        if (Grad.equals("asistent") || Grad.equals("profesor") || Grad.equals("laborant")) {
            for (Profesor prof : list) {
                boolean flag = prof.getGrad().equals(Grad);
                if (flag) {
                    System.out.println(prof.getNume() + " " + prof.getPrenume());
                }
            }
        } else {
            System.out.println("Grad profesor necunoscut");
        }
    }







}