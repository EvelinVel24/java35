import java.util.List;

public class EquipoBasket {
    private String nombreEquipo;
    private String ciudad;
    private List<Jugador> listaJugadores;

    // Constructor
    public EquipoBasket(String nombreEquipo, String ciudad, List<Jugador> listaJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.listaJugadores = listaJugadores;
    }

    // Getter methods
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    // Method to create a new EquipoBasket
    public static EquipoBasket crearEquipo(String nombreEquipo, String ciudad, List<Jugador> listaJugadores) {
        return new EquipoBasket(nombreEquipo, ciudad, listaJugadores);
    }
}
