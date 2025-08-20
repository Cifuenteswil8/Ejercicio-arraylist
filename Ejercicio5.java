package ejercicios;
import java.util.ArrayList;

class Disco {
    String titulo;
    Disco(String t) { titulo = t; }
    public String toString() { return titulo; }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Disco> discos = new ArrayList<>();
        discos.add(new Disco("Thriller"));
        discos.add(new Disco("Back in Black"));
        discos.add(new Disco("Hotel California"));
        for (Disco d : discos) System.out.println(d);
    }
}
