package service;

import model.Despesa;
import java.util.ArrayList;
import java.util.List;

public class SistemaControle {
    private List<Despesa> despesas = new ArrayList<>();

    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
        System.out.println("Despesa adicionada: " + despesa);
    }

    public List<Despesa> listarDespesas() {
        return despesas;
    }
}
