# Changelog - Sistema de Controle de Despesas

## v0.0.1 - Primeiro Commit

Data: 04/11/2025

### Descrição

- Repositório criado e clonado.
- Implementado menu principal em Java (arquivo: src/Main.java).
- O menu utiliza **JOptionPane** para interação com o usuário (exibição e entrada de opções).
- Cada opção selecionada exibe mensagens no console (System.out.println) e em janelas de diálogo.
- Estrutura inicial do projeto criada.
- Arquivo docs/README.md adicionado com changelog.

## v0.0.2 - Separação de Prioridades, POC e MVP

Data: 04/11/2025

### Descrição

- Estrutura de pacotes criada: model e service.
- Implementadas classes base:
  - model.Despesa
  - model.TipoDespesa (Ainda não está sendo utilizada, apenas o modelo inicial foi feito)
  - model.Usuario (Ainda não está sendo utilizada, apenas o modelo inicial foi feito)
  - service.SistemaControle
- Criada POC para adicionar e listar despesas em memória.
- Definida estrutura do MVP (Produto Mínimo Viável):
  - Menu principal (JOptionPane)
  - Classes de domínio
  - Lógica central no pacote service.

A ideia da Classe TipoDespesa seria a de estruturar corretamente a categoria de despesa dos objetos da classe Despesa, permitindo a edição das mesmas.
A ideia da Classe Usuario é fazer o controle de acesso do sistema, permitindo que no futuro tenhamos a persistência em BD de acordo com o UUID.
