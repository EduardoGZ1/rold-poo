import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
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

            String opcao = JOptionPane.showInputDialog(menu);

            if (opcao == null) {
                break;
            }

            switch (opcao) {
                case "1" -> {
                    System.out.println("[Entrar Despesa] -> funcionalidade selecionada (a implementar).");
                    JOptionPane.showMessageDialog(null, "Entrar Despesa selecionado.");
                }
                case "2" -> {
                    System.out.println("[Anotar Pagamento] -> funcionalidade selecionada (a implementar).");
                    JOptionPane.showMessageDialog(null, "Anotar Pagamento selecionado.");
                }
                case "3" -> {
                    System.out.println("[Listar Despesas em Aberto no período] -> funcionalidade selecionada (a implementar).");
                    JOptionPane.showMessageDialog(null, "Listar Despesas em Aberto selecionado.");
                }
                case "4" -> {
                    System.out.println("[Listar Despesas Pagas no período] -> funcionalidade selecionada (a implementar).");
                    JOptionPane.showMessageDialog(null, "Listar Despesas Pagas selecionado.");
                }
                case "5" -> {
                    System.out.println("[Gerenciar Tipos de Despesa] -> funcionalidade selecionada (a implementar).");
                    JOptionPane.showMessageDialog(null, "Gerenciar Tipos de Despesa selecionado.");
                }
                case "6" -> {
                    System.out.println("[Gerenciar Usuários] -> funcionalidade selecionada (a implementar).");
                    JOptionPane.showMessageDialog(null, "Gerenciar Usuários selecionado.");
                }
                case "7" -> {
                    System.out.println("Saindo... Obrigado.");
                    JOptionPane.showMessageDialog(null, "Saindo do sistema. Obrigado!");
                    running = false;
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }
}