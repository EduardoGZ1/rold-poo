package model;

public class TipoDespesa {
    private String nome;

    public TipoDespesa(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    @Override
    public String toString() {
        return "Tipo: " + nome;
    }
}
