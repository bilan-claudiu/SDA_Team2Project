import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task9 {

    public void MateriiAlfb(List<Materie> materiee) {
        ArrayList<String> materie1 = new ArrayList<String>();
        for (Materie materie : materiee) {
            materie1.add(materie.getDenumire());
        }
        Collections.sort(materie1);
        System.out.println(materie1);
    }
}



