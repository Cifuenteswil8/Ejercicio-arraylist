package ejercicios;
import java.util.ArrayList;
import java.util.Random;

class Moneda {
    String valor, lado;
    Moneda(String v, String l) { valor = v; lado = l; }
    public String toString() { return valor + " - " + lado; }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] valores = {"1c","2c","5c","10c","25c","50c","1e","2e"};
        String[] lados = {"cara","cruz"};
        Random r = new Random();

        ArrayList<Moneda> lista = new ArrayList<>();
        lista.add(new Moneda(valores[r.nextInt(valores.length)], lados[r.nextInt(2)]));
        for (int i = 1; i < 6; i++) {
            Moneda ant = lista.get(i - 1);
            if (r.nextBoolean()) lista.add(new Moneda(ant.valor, lados[r.nextInt(2)]));
            else lista.add(new Moneda(valores[r.nextInt(valores.length)], ant.lado));
        }
        for (Moneda m : lista) System.out.println(m);
    }
}
