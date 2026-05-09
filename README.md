# 📦 Estoque Controle

Sistema de gerenciamento de estoque desenvolvido em Java puro, com arquitetura em camadas e operações de CRUD completas.

---

## 🧱 Arquitetura

O projeto segue separação de responsabilidades em três camadas:

src/
├── main/          → Ponto de entrada da aplicação
├── model/         → Entidade Produto (atributos e encapsulamento)
└── service/       → EstoqueService (lógica de negócio)

Essa estrutura reflete o princípio de responsabilidade única: a camada `model` define os dados, enquanto a `service` concentra toda a lógica de manipulação do estoque.

---

## ⚙️ Funcionalidades

| Operação | Descrição |
|---|---|
| `adicionarProduto` | Cadastra um novo produto no estoque |
| `listarProdutos` | Exibe todos os produtos cadastrados |
| `venderProduto` | Reduz o estoque de um produto por ID e quantidade |
| `removerProduto` | Remove um produto do estoque por ID |

---

## 🔍 Destaques técnicos

- **`Optional`** usado nas buscas por ID para evitar `NullPointerException`
- **`Stream` + `filter`** para localizar produtos por ID de forma declarativa
- **`ArrayList`** como estrutura de dados em memória para o estoque
- Organização em pacotes Java seguindo convenções de projeto

---

## 🚀 Como executar

**Pré-requisitos:** Java 11+ e IntelliJ IDEA (ou qualquer IDE Java)

```bash
# Clone o repositório
git clone https://github.com/magalhaesmateus/estoque-controle.git

# Abra no IntelliJ e execute a classe Main.java
```

---

## 🔭 Próximos passos

- [ ] Adicionar validação de estoque negativo na operação de venda
- [ ] Integrar banco de dados (ex: SQLite ou PostgreSQL via JDBC)
- [ ] Implementar interface de usuário via terminal (menu interativo)
- [ ] Adicionar testes unitários com JUnit

---

## 🛠️ Tecnologias

- Java 17
- IntelliJ IDEA
- Git / GitHub
