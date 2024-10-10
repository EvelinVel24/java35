import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class JugadorTest {

    @Test
    public void testCrearJugador() {
        // Create a mock for the Jugador class
        Jugador mockJugador = mock(Jugador.class);
        when(mockJugador.getNombre()).thenReturn("Juan");
        when(mockJugador.getEdad()).thenReturn(20);
        when(mockJugador.getNumero()).thenReturn(10);

        // Verify the method interaction
        verify(mockJugador).getNombre();
        verify(mockJugador).getEdad();
        verify(mockJugador).getNumero();
    }
}
