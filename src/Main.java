import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating players
        Jugador jugador1 = Jugador.crearJugador("Juan", 20, 10);
        Jugador jugador2 = Jugador.crearJugador("Pedro", 22, 12);

        // Adding players to the list
        List<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);

        // Creating a basketball team
        EquipoBasket equipo = EquipoBasket.crearEquipo("Lobos", "Santiago", listaJugadores);

        // Printing team information
        System.out.println("Equipo: " + equipo.getNombreEquipo());
        System.out.println("Ciudad: " + equipo.getCiudad());
        System.out.println("Jugadores:");
        for (Jugador jugador : equipo.getListaJugadores()) {
            System.out.println("- " + jugador.getNombre() + " (Número: " + jugador.getNumero() + ", Edad: " + jugador.getEdad() + ")");
        }
    }
}
