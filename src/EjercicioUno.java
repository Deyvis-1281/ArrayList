import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {

    public static void main(String[] arg){

        String nombreUno = "Apple";
        String nombreDos = "Banana";
        String nombreTres = "Cherry";

        List<String> listFruits = new ArrayList();

        //Se agregan los elementos
        listFruits.add(nombreUno);
        listFruits.add(nombreDos);
        listFruits.add(nombreTres);

        System.out.println(listFruits.size());
        System.out.println(listFruits);

        listFruits.remove(1);
        System.out.println(listFruits);

        listFruits.set(1, "orange");
        System.out.println(listFruits);

    }

}
