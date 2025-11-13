import javax.swing.JOptionPane;
import model.Despesa;
import service.SistemaControle;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        SistemaControle sistema = new SistemaControle();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean running = true;

        while (running) {
            String menu = """
                    ==== Sistema de Controle de Despesas ====
                    1 - Entrar Despesa
                    2 - Anotar Pagamento
                    3 - Listar Despesas em Aberto no período
                    4 - Listar Despesas Pagas no período
                    5 - Gerenciar Tipos de Despesa
                    6 - Gerenciar Usuários
                    7 - Sair
                    """;

            String opcao = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.PLAIN_MESSAGE);
            if (opcao == null) break;

            switch (opcao) {
                case "1" -> {
                    try {
                        String descricao = JOptionPane.showInputDialog("Descrição da despesa:");
                        if (descricao == null || descricao.isBlank()) continue;

                        String valorStr = JOptionPane.showInputDialog("Valor da despesa (use ponto para decimais):");
                        if (valorStr == null) continue;
                        double valor = Double.parseDouble(valorStr);

                        String dataStr = JOptionPane.showInputDialog("Data de vencimento (dd/MM/yyyy):");
                        LocalDate data = LocalDate.parse(dataStr, fmt);

                        String tipo = JOptionPane.showInputDialog("Tipo da despesa:");
                        if (tipo == null || tipo.isBlank()) tipo = "Não informado";

                        sistema.adicionarDespesa(new Despesa(descricao, valor, data, tipo));
                        JOptionPane.showMessageDialog(null, "Despesa adicionada com sucesso!");
                    } catch (NumberFormatException | DateTimeParseException e) {
                        JOptionPane.showMessageDialog(null, "Erro: valor ou data inválidos.");
                    }
                }

                case "2" -> {
                    StringBuilder lista = new StringBuilder("Despesas em aberto:\n\n");
                    var abertas = sistema.listarDespesasEmAberto();
                    if (abertas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma despesa em aberto.");
                    } else {
                        for (int i = 0; i < abertas.size(); i++) {
                            lista.append(i).append(" - ").append(abertas.get(i)).append("\n");
                        }
                        String indiceStr = JOptionPane.showInputDialog(lista + "\nInforme o índice da despesa a pagar:");
                        if (indiceStr != null) {
                            int indice = Integer.parseInt(indiceStr);
                            if (sistema.pagarDespesa(indice))
                                JOptionPane.showMessageDialog(null, "Pagamento registrado com sucesso!");
                            else
                                JOptionPane.showMessageDialog(null, "Índice inválido.");
                        }
                    }
                }

                case "3" -> {
                    var abertas = sistema.listarDespesasEmAberto();
                    if (abertas.isEmpty()) JOptionPane.showMessageDialog(null, "Nenhuma despesa em aberto.");
                    else {
                        StringBuilder sb = new StringBuilder("Despesas em aberto:\n\n");
                        abertas.forEach(d -> sb.append("- ").append(d).append("\n"));
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                }

                case "4" -> {
                    var pagas = sistema.listarDespesasPagas();
                    if (pagas.isEmpty()) JOptionPane.showMessageDialog(null, "Nenhuma despesa paga.");
                    else {
                        StringBuilder sb = new StringBuilder("Despesas pagas:\n\n");
                        pagas.forEach(d -> sb.append("- ").append(d).append("\n"));
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                }

                case "5" -> JOptionPane.showMessageDialog(null, "Gerenciamento de tipos de despesa será adicionado na próxima versão.");
                case "6" -> JOptionPane.showMessageDialog(null, "Gerenciamento de usuários será adicionado na próxima versão.");
                case "7" -> {
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema. Até logo!");
                    running = false;
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }
}
