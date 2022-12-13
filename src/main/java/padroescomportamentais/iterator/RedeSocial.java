package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RedeSocial implements Iterable<Usuario>{

    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public RedeSocial(Usuario... usuarios) {
        this.usuarios = Arrays.asList(usuarios);
    }

    @Override
    public Iterator<Usuario> iterator() {
        return usuarios.iterator();
    }

}


