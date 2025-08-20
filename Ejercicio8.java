package ejercicios;
import java.util.ArrayList;
import java.util.Collections;

class Carta {
    String numero, palo;
    Carta(String n, String p) { numero = n; palo = p; }
    public String toString() { return numero + " de " + palo; }
}

public class Ejercicio8 {
    public static void main(String[] args) {
        String[] numeros = {"As","2","3","4","5","6","7","Sota","Caballo","Rey"};
        String[] palos = {"oros","copas","espadas","bastos"};
        ArrayList<Carta> baraja = new ArrayList<>();
        for (String n : numeros) for (String p : palos) baraja.add(new Carta(n,p));
        Collections.shuffle(baraja);
        for (int i = 0; i < 10; i++) System.out.println(baraja.get(i));
    }
}
