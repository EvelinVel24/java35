import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import java.util.List;

public class EquipoBasketTest {

    @Test
    public void testCrearEquipo() {
        List<Jugador> mockListaJugadores = Mockito.mock(List.class);

        // Create a mock for the EquipoBasket class
        EquipoBasket mockEquipo = mock(EquipoBasket.class);
        when(mockEquipo.getNombreEquipo()).thenReturn("Lobos");
        when(mockEquipo.getCiudad()).thenReturn("Santiago");
        when(mockEquipo.getListaJugadores()).thenReturn(mockListaJugadores);

        // Verify the method interaction
        verify(mockEquipo).getNombreEquipo();
        verify(mockEquipo).getCiudad();
        verify(mockEquipo).getListaJugadores();
    }
}
