package service;

import java.util.ArrayList;
import java.util.List;
import model.Despesa;

public class SistemaControle {
    private List<Despesa> despesas = new ArrayList<>();

    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
    }

    public List<Despesa> listarDespesas() {
        return despesas;
    }

    public List<Despesa> listarDespesasEmAberto() {
        List<Despesa> abertas = new ArrayList<>();
        for (Despesa d : despesas) {
            if (!d.isPaga()) abertas.add(d);
        }
        return abertas;
    }

    public List<Despesa> listarDespesasPagas() {
        List<Despesa> pagas = new ArrayList<>();
        for (Despesa d : despesas) {
            if (d.isPaga()) pagas.add(d);
        }
        return pagas;
    }

    public boolean pagarDespesa(int index) {
        if (index >= 0 && index < despesas.size()) {
            despesas.get(index).setPaga(true);
            return true;
        }
        return false;
    }
}
