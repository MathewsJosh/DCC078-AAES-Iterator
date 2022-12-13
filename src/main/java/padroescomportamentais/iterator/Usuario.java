package padroescomportamentais.iterator;

public class Usuario {

    private String nome;
    private boolean ativo;
    private int telefone;
    private String identificador;

    public Usuario(String nome, boolean ativo, int telefone, String identificador) {
        this.nome = nome;
        this.ativo = ativo;
        this.telefone = telefone;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
}
