# Pet Machine Java

Simulador de uma máquina de banho para pets, executado no terminal e desenvolvido em Java para praticar abstração e encapsulamento na programação orientada a objetos.

## Funcionalidades

- Colocar e retirar um pet da máquina.
- Dar banho no pet e acompanhar seu estado de limpeza.
- Abastecer e consultar os níveis de água e shampoo.
- Verificar se a máquina está ocupada.
- Limpar a máquina e validar as condições para uso.
- Tratar opções de menu não numéricas e nomes vazios.

## Regras implementadas

| Operação ou recurso | Comportamento |
| --- | --- |
| Água | Capacidade de 30 litros; inicia cheia |
| Shampoo | Capacidade de 10 litros; inicia cheio |
| Abastecimento | Acrescenta até 2 litros por operação, respeitando a capacidade |
| Banho | Consome 10 litros de água e 2 litros de shampoo |
| Limpeza da máquina | Consome 10 litros de água e 2 litros de shampoo |
| Ocupação | Permite um pet por vez |
| Retirada de pet sujo | Deixa a máquina suja; exige limpeza antes de inserir outro pet |
| Limpeza com pet dentro | Não é permitida |

## Tecnologias

Java, biblioteca padrão (`Scanner`) e interface de linha de comando. Sem dependências externas, banco de dados ou interface gráfica.

## Como executar

Instale um **JDK 21** e confirme que `java` e `javac` estão disponíveis no terminal. O projeto original foi configurado para essa versão no IntelliJ IDEA.

Na pasta principal do projeto, execute:

```bash
javac -encoding UTF-8 -d out src/Main.java src/Pet.java src/PetMachine.java
java -cp out Main
```

No IntelliJ IDEA, abra a pasta do projeto, selecione o JDK 21 e execute o método `main` de `src/Main.java`. Se necessário, marque `src` como **Sources Root**.

## Exemplo de uso

1. Escolha `7` e informe o nome do pet.
2. Escolha `1` para dar banho.
3. Escolha `4` e `5` para consultar os recursos restantes: 20 litros de água e 8 litros de shampoo.
4. Escolha `8` para retirar o pet.
5. Escolha `0` para encerrar.

## Organização

| Arquivo | Responsabilidade |
| --- | --- |
| `src/Main.java` | Menu e interação com o usuário |
| `src/Pet.java` | Nome e estado de limpeza do pet |
| `src/PetMachine.java` | Recursos, ocupação e regras da máquina |

## Conceitos praticados

Classes e objetos, atributos privados, construtores, métodos, composição, encapsulamento, condicionais, repetição e tratamento de entrada inválida.

## Escopo

Projeto educacional. Os dados ficam apenas na memória durante a execução. O menu deve ser encerrado pela opção `0`.
