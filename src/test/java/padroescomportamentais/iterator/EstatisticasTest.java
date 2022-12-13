package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstatisticasTest {

    @Test
    void deveContarUsuariosAtivosRede() {
        RedeSocial redeSocial = new RedeSocial(
                new Usuario("Romário", true, 99887766, "@romarioficial" ),
                new Usuario("Juninho Pernambucano", true, 91029384, "@JujuPepe"),
                new Usuario("Edmundo", false, 35526783, "@EdNoMundo" ),
                new Usuario("Roberto Dinamite", true, 19867389, "@betinFifa" ),
                new Usuario("Philippe Coutinho", true, 86738912, "@fefecoucou" )
        );
        assertEquals(4, Estatisticas.contarUsuariosAtivosRede(redeSocial));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        RedeSocial redeSocial = new RedeSocial(
                new Usuario("Romário", true, 99887766, "@romarioficial" ),
                new Usuario("Juninho Pernambucano", true, 91029384, "@JujuPepe"),
                new Usuario("Edmundo", false, 35526783, "@EdNoMundo" ),
                new Usuario("Roberto Dinamite", true, 19867389, "@betinFifa" ),
                new Usuario("Philippe Coutinho", true, 86738912, "@fefecoucou" )
        );
        assertEquals(5, Estatisticas.contarTotalUsuariosRede(redeSocial));
    }

}