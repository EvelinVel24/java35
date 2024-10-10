public class Jugador {
    private String nombre;
    private int edad;
    private int numero;

    // Constructor
    public Jugador(String nombre, int edad, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }

    // Getter methods
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumero() {
        return numero;
    }

    // Method to create a new Jugador
    public static Jugador crearJugador(String nombre, int edad, int numero) {
        return new Jugador(nombre, edad, numero);
    }
}
