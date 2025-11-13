package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Despesa {
    private String descricao;
    private double valor;
    private LocalDate dataVencimento;
    private String tipoDespesa;
    private boolean paga;

    public Despesa(String descricao, double valor, LocalDate dataVencimento, String tipoDespesa) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.tipoDespesa = tipoDespesa;
        this.paga = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public String getTipoDespesa() {
        return tipoDespesa;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%s | R$ %.2f | Vencimento: %s | Tipo: %s | %s",
                descricao, valor, dataVencimento.format(fmt), tipoDespesa, (paga ? "Paga" : "Em aberto"));
    }
}
