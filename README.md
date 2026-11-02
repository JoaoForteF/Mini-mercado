# Mini-mercado

Sistema de gerenciamento de um mini-mercado desenvolvido em Java, com o objetivo de simular operações básicas de administração de estoque e atendimento no caixa.

O projeto foi desenvolvido para praticar conceitos de Programação Orientada a Objetos (POO), utilizando classes, objetos, construtores, herança, encapsulamento e estruturas de controle.

## Funcionalidades

### Sistema de acesso
- Login por matrícula e senha.
- Identificação dos perfis de gerente e atendente.
- Retorno à tela de login após finalizar as atividades.

### Área do gerente
- Cadastro de produtos.
- Verificação de códigos duplicados.
- Consulta dos produtos cadastrados no estoque.
- Geração de relatório com:
  - Quantidade de tipos de produtos cadastrados.
  - Quantidade total de unidades disponíveis.
  - Valor financeiro total do estoque.

### Área do atendente
- Registro de compras dos clientes.
- Busca de produtos pelo código.
- Adição de produtos à compra.
- Atualização automática da quantidade em estoque após cada venda.
- Verificação de produtos indisponíveis.
- Cálculo e apresentação do total da compra.
- Possibilidade de realizar vários atendimentos consecutivos.

## Estrutura do projeto

| Classe | Responsabilidade |
|---|---|
| `Principal.java` | Inicialização do programa. |
| `Mercadinho.java` | Controle do login e acesso ao sistema. |
| `Funcionarios.java` | Classe base dos funcionários. |
| `Gerente.java` | Funcionalidades administrativas. |
| `Atendente.java` | Registro e finalização das compras. |
| `Produto.java` | Representação e gerenciamento dos dados dos produtos. |
| `Estoque.java` | Cadastro, consulta, busca e controle dos produtos. |

## Conceitos de Java utilizados

- **Encapsulamento:** proteção dos atributos por meio de modificadores de acesso e métodos.
- **Herança:** utilização da classe `Funcionarios` como classe base de `Gerente` e `Atendente`.
- **Construtores:** inicialização dos objetos com seus respectivos atributos.
- **Static:** utilização de atributo estático para contabilizar os produtos criados.
- **ArrayList:** armazenamento dinâmico dos produtos cadastrados.
- **Estruturas condicionais:** utilização de `if`, `else if` e `else` para controle das operações.
- **Estruturas de repetição:** utilização de `do-while` para menus e atendimentos.

## Dados de acesso para testes

| Perfil | Matrícula | Senha |
|---|---:|---|
| Gerente | 101 | 1234 |
| Atendente | 102 | 5678 |

*As credenciais são fixas no código e destinadas exclusivamente à demonstração do projeto.*

## Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Git e GitHub

## Limitações atuais

- Os dados dos produtos são armazenados em memória durante a execução do programa.
- Ao encerrar o sistema, os produtos cadastrados e as alterações no estoque são perdidos.
- O sistema ainda não possui integração com banco de dados ou armazenamento externo.

## Possíveis melhorias futuras

- Implementação de persistência dos dados.
- Integração com Google Sheets ou banco de dados.
- Cadastro dinâmico de funcionários.
- Histórico de vendas.
- Consulta de faturamento por período.
- Funcionalidades para atualização e exclusão de produtos.

## Objetivo acadêmico

Desenvolver um sistema simples de gerenciamento comercial, aplicando na prática os fundamentos da linguagem Java e os principais conceitos de Programação Orientada a Objetos.
