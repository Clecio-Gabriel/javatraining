# Códigos das aulas 2 e 3

Os exemplos acompanham a apresentação **Java para programadores C++ + Classes, objetos, métodos e construtores em Java**.

## Aula 2 — Java para programadores C++

- `Ola.cpp` e `OlaJava.java`: anatomia mínima de um programa nas duas linguagens.
- `Media.cpp` e `ConversaoCppParaJava.java`: conversão completa de um pequeno algoritmo.
- `EntradaSaida.java`: entrada com `Scanner` e saída com `System.out`.
- `ControleFluxo.java`: `for` e `if/else`.
- `SwitchModerno.java`: expressão `switch` com a sintaxe de seta.
- `ArraysEStrings.java`: arrays, `for-each`, conversão numérica e `String`.
- `OperacoesString.java`: imutabilidade e operações de texto.
- `IgualdadeString.java`: identidade com `==` e conteúdo com `equals`.
- `TiposEReferencias.java`: primitivos, referências, alias e passagem por valor.

## Aula 3 — Classes, objetos, métodos e construtores

- `Personagem.java`: atributos, métodos, `this`, sobrecarga e membro `static`.
- `Recompensa.java`: objeto pequeno e imutável.
- `Missao.java`: composição, estado mutável e sobrecarga de construtores.
- `UsoPersonagem.java`: criação, chamadas de método e consulta de estado.
- `Colaboracao.java`: fluxo completo entre `Personagem`, `Missao` e `Recompensa`.

## Compilar e executar Java

Use um JDK 17 ou superior. Dentro desta pasta:

```bash
javac *.java
java OlaJava turma
java ControleFluxo 5
java SwitchModerno 2
java ArraysEStrings
java OperacoesString
java IgualdadeString
java TiposEReferencias
java UsoPersonagem
java Colaboracao
```

Os programas que leem o teclado podem ser executados separadamente:

```bash
java EntradaSaida
java ConversaoCppParaJava
```

## Compilar e executar C++

```bash
g++ Ola.cpp -o ola
./ola

g++ Media.cpp -o media
./media
```

Na prática em grupo, cada classe pública deve permanecer em um arquivo de mesmo nome. Comece pelo fluxo comum, acrescente um caso-limite e finalize demonstrando uma tentativa de uso inválido.
