import javax.swing.JOptionPane;
import model.Despesa;
import service.SistemaControle;

public class Main {
    public static void main(String[] args) {
        SistemaControle sistema = new SistemaControle();
        boolean running = true;

        while (running) {
            String menu = """
                    ==== Sistema de Controle de Despesas ====
                    1 - Adicionar Despesa (teste)
                    2 - Listar Despesas (teste)
                    3 - Sair
                    """;

            String opcao = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.PLAIN_MESSAGE);
            if (opcao == null) break;

            switch (opcao) {
                case "1" -> {
                    try {
                        String descricao = JOptionPane.showInputDialog("Descrição da despesa:");
                        if (descricao == null || descricao.isBlank()) continue;

                        String valorStr = JOptionPane.showInputDialog("Valor da despesa:");
                        if (valorStr == null || valorStr.isBlank()) continue;
                        double valor = Double.parseDouble(valorStr.replace(",", "."));

                        String categoria = JOptionPane.showInputDialog("Categoria da despesa:");
                        if (categoria == null || categoria.isBlank()) categoria = "Não informada";

                        sistema.adicionarDespesa(new Despesa(descricao, valor, categoria));
                        JOptionPane.showMessageDialog(null, "Despesa adicionada com sucesso!");
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número válido.");
                    }
                }
                case "2" -> {
                    if (sistema.listarDespesas().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma despesa cadastrada.");
                    } else {
                        StringBuilder lista = new StringBuilder("Despesas cadastradas:\n\n");
                        sistema.listarDespesas().forEach(d -> lista.append("- ").append(d).append("\n"));
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                }
                case "3" -> {
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema. Até logo!");
                    running = false;
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }
}