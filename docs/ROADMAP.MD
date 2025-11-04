# ROADMAP – Sistema de Controle de Despesas

## Etapa 1 — Estrutura inicial (POC)

**Versão:** v0.0.1  
**Status:** Concluída

### Objetivos cumpridos

- Repositório criado e clonado.
- Estrutura de pastas configurada
- Menu principal implementado com `JOptionPane`.
- Cada opção exibe apenas um `println` ou `showMessageDialog`.
- `README.md` em `/docs` com changelog da entrega.

**Observação:**  
Nesta fase não há lógica funcional, apenas estrutura e interação visual inicial.

---

## Etapa 2 — Organização e priorização (MVP Design)

**Versão:** v0.0.2  
**Status:** Concluída

### Objetivos cumpridos

- Definição do escopo do MVP (funcionalidades essenciais).
- Criação das classes-base
- Organização de pacotes e correção de `package`.
- Teste de integração via `Main.java`.

---

## Etapa 3 — Funcionalidades principais (MVP funcional)

**Versão prevista:** v0.0.3  
**Status:** Em desenvolvimento

### Objetivos

- Implementar cadastro e listagem de despesas.
- Adicionar despesas com descrição, valor, data e tipo.
- Salvar temporariamente em lista (sem arquivo ainda).
- Implementar `TipoDespesa` com CRUD básico em memória.
- Criar menu de navegação entre essas funções.
- Refatorar `Main` para chamar métodos do `SistemaControle`.

---

## Etapa 4 — Persistência em arquivos de texto

**Versão prevista:** v0.0.4
**Status:** Em desenvolvimento

### Objetivos

- Implementar leitura e escrita de dados em arquivos `.txt`:
  - `despesas.txt`
  - `tipos.txt`
  - `usuarios.txt`
- Métodos de salvar e carregar dados em `service/SistemaControle.java`.
- Garantir persistência entre execuções.

---

## Etapa 5 — Usuários e criptografia de senha

**Versão prevista:** v0.0.5
**Status:** Em desenvolvimento

### Objetivos

- Implementar cadastro e login de usuários.
- Armazenar logins e senhas criptografadas.
- Associar despesas a usuários.

---

## Etapa 6 — Polimorfismo, Herança e Interfaces

**Versão prevista:** v0.0.6
**Status:** Em desenvolvimento

### Objetivos

- Criar subclasses de `Despesa` (ex: Transporte, Eventual, Supérfluo).
- Criar interface `Pagavel` e aplicar em despesas.
- Usar herança e sobrescrita para comportamentos diferenciados.
- Implementar sobrecarga e sobrescrita de construtores.

---

## Etapa 7 — Relatórios e filtros

**Versão prevista:** v0.0.7
**Status:** Em desenvolvimento

### Objetivos

- Listar despesas por período, tipo e status.
- Calcular total pago e total em aberto.
- Criar interface de exibição com resumo de gastos.

---

## Etapa 8 — Finalização e refinamento

**Versão prevista:** v1.0.0
**Status:** Em desenvolvimento

### Objetivos

- Revisar código, comentários e documentação.
- Gerar `README.md` final na raiz do projeto.
- Corrigir bugs e validar persistência.
- Melhorar a interface de uso com `JOptionPane`.

---
