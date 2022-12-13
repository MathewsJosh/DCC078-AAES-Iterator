package padroescomportamentais.iterator;

import java.util.Iterator;

public class Estatisticas {

    public static Integer contarUsuariosAtivosRede(RedeSocial redeSocial) {
        int quantidade = 0;
        for (Usuario usuario : redeSocial) {
            if (usuario.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalUsuariosRede(RedeSocial redeSocial) {
        int quantidade = 0;
        for (Iterator a = redeSocial.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
