# Guia Completo de Estudos Java

Este repositório reúne os conteúdos estudados durante o aprendizado dos fundamentos da linguagem **Java**, com base nas aulas do curso de Java do **Gustavo Guanabara — Curso em Vídeo** e nos exercícios práticos desenvolvidos durante os estudos.

O objetivo deste README é servir não apenas como apresentação do projeto, mas também como um **material de consulta e revisão**, explicando os principais conceitos estudados, suas funções e exemplos de utilização.

---

# Sumário

* [1. História do Java](#1-história-do-java)
* [2. Como Funciona o Java](#2-como-funciona-o-java)
* [3. JDK, JRE e JVM](#3-jdk-jre-e-jvm)
* [4. IDE](#4-ide)
* [5. Primeiro Programa em Java](#5-primeiro-programa-em-java)
* [6. Estrutura de um Programa Java](#6-estrutura-de-um-programa-java)
* [7. Convenções de Nomenclatura](#7-convenções-de-nomenclatura)
* [8. Tipos de Dados e Variáveis](#8-tipos-de-dados-e-variáveis)
* [9. Entrada de Dados com Scanner](#9-entrada-de-dados-com-scanner)
* [10. Saída de Dados](#10-saída-de-dados)
* [11. Conversão de Tipos](#11-conversão-de-tipos)
* [12. Operadores Aritméticos](#12-operadores-aritméticos)
* [13. Incremento e Decremento](#13-incremento-e-decremento)
* [14. Operadores de Atribuição](#14-operadores-de-atribuição)
* [15. Classe Math](#15-classe-math)
* [16. Operadores Lógicos e Relacionais](#16-operadores-lógicos-e-relacionais)
* [17. Operador Ternário](#17-operador-ternário)
* [18. Comparação de Strings](#18-comparação-de-strings)
* [19. Estruturas Condicionais](#19-estruturas-condicionais)
* [20. Estrutura if](#20-estrutura-if)
* [21. Estrutura if/else](#21-estrutura-ifelse)
* [22. Estrutura else if](#22-estrutura-else-if)
* [23. Estrutura switch](#23-estrutura-switch)
* [24. Estruturas de Repetição](#24-estruturas-de-repetição)
* [25. Estrutura while](#25-estrutura-while)
* [26. Comando continue](#26-comando-continue)
* [27. Comando break](#27-comando-break)
* [28. Estrutura do-while](#28-estrutura-do-while)
* [29. Acumuladores](#29-acumuladores)
* [30. Estrutura for](#30-estrutura-for)
* [31. Variações do for](#31-variações-do-for)
* [32. Laços Aninhados](#32-laços-aninhados)
* [33. Métodos, Funções e Procedimentos](#33-métodos-funções-e-procedimentos)
* [34. Parâmetros](#34-parâmetros)
* [35. Retorno com return](#35-retorno-com-return)
* [36. Métodos em Classes Separadas](#36-métodos-em-classes-separadas)
* [37. Vetores](#37-vetores)
* [38. Arrays](#38-arrays)
* [39. Organização dos Arquivos](#39-organização-dos-arquivos)
* [40. Resumo Geral](#40-resumo-geral)
* [41. Pontos Importantes para Revisão](#41-pontos-importantes-para-revisão)

---

# 1. História do Java

Java surgiu como uma linguagem criada pela **Sun Microsystems**, tendo **James Gosling** como uma das principais figuras responsáveis pelo desenvolvimento.

Antes do surgimento de linguagens modernas, os computadores precisavam receber instruções muito próximas da linguagem da máquina.

Um exemplo histórico é o **ENIAC**, um dos primeiros computadores eletrônicos de grande escala. Sua programação era realizada de maneira muito diferente da programação atual, utilizando componentes físicos, fios e configurações manuais.

Com o tempo surgiram linguagens de programação de mais alto nível, permitindo que os programadores escrevessem instruções de maneira mais próxima da linguagem humana.

Porém, essas instruções ainda precisam ser transformadas para que o computador consiga executá-las.

Essa transformação é realizada por meio de um **compilador**.

## Compilador

O compilador transforma o código escrito pelo programador em uma forma que possa ser executada pelo computador.

Em uma linguagem tradicional, o fluxo pode ser representado assim:

```text
Código-Fonte
     ↓
Compilador
     ↓
Código Executável
     ↓
Sistema Operacional
```

Um dos problemas desse modelo é a dependência da plataforma.

Um programa compilado para determinado sistema pode precisar de uma nova compilação para funcionar corretamente em outro sistema.

---

# 2. Surgimento do Java

Na década de 1990, a **Sun Microsystems** criou a chamada **Green Team**, liderada por **James Gosling**.

O objetivo inicial era desenvolver uma tecnologia capaz de trabalhar com diferentes dispositivos eletrônicos.

O projeto recebeu inicialmente o nome **Oak**.

O nome fazia referência a uma árvore de carvalho localizada próxima ao escritório de James Gosling.

## Star Seven

Durante o desenvolvimento do projeto surgiu o **Star Seven (*7)**.

Tratava-se de um dispositivo com tela sensível ao toque que demonstrava a possibilidade de controlar diferentes aparelhos.

Também surgiu nesse contexto o personagem **Duke**, que posteriormente se tornou associado ao Java.

## Mudança para Java

O projeto inicialmente não conseguiu atingir o resultado comercial esperado no mercado de dispositivos domésticos.

Com o crescimento da Internet e da Web, a equipe percebeu que a tecnologia poderia ser utilizada nesse novo ambiente.

O projeto foi adaptado para a Web e passou a ser utilizado em navegadores.

Como o nome Oak já estava registrado, foi necessário escolher outro nome.

Assim surgiu o nome **Java**.

---

# 3. Como Funciona o Java

Uma das principais características do Java está na maneira como o código é compilado e executado.

Diferentemente do modelo tradicional em que o código-fonte pode ser transformado diretamente em um executável específico, Java utiliza uma etapa intermediária chamada **Bytecode**.

O processo pode ser representado assim:

```text
Código-Fonte
     ↓
   javac
     ↓
  Bytecode
     ↓
    JVM
     ↓
Sistema Operacional
```

## Código-Fonte

É o código escrito pelo programador.

Exemplo:

```java
public class Teste {

    public static void main(String[] args) {

        System.out.println("Olá!");

    }
}
```

Esse código é armazenado em um arquivo `.java`.

## javac

O `javac` é o compilador Java.

Ele recebe o código-fonte e transforma o programa em **Bytecode**.

## Bytecode

O Bytecode é um código intermediário.

Ele não é diretamente um executável específico de Windows, Linux ou outro sistema.

O Bytecode será interpretado e executado pela **JVM**.

## JVM

A JVM significa:

**Java Virtual Machine**

Em português:

**Máquina Virtual Java**.

É a responsável por executar o Bytecode.

---

# 4. JDK, JRE e JVM

Esses três conceitos são fundamentais para compreender o ambiente Java.

## JVM

A **JVM** executa o Bytecode.

```text
JVM → Executa o Bytecode
```

## JRE

A **JRE — Java Runtime Environment** fornece o ambiente necessário para executar aplicações Java.

Ela contém recursos como:

* JVM;
* bibliotecas;
* APIs necessárias para execução.

```text
JRE → Ambiente para executar Java
```

## JDK

O **JDK — Java Development Kit** é utilizado para desenvolver programas Java.

Ele reúne ferramentas necessárias para o desenvolvimento, incluindo:

* JRE;
* JVM;
* compilador `javac`;
* ferramentas de desenvolvimento;
* debugger;
* bibliotecas e APIs.

```text
JDK → Desenvolvimento
JRE → Execução
JVM → Execução do Bytecode
```

## WORA

Uma característica importante do Java é representada pela expressão:

**Write Once, Run Anywhere**

Ou:

**Escreva uma vez, execute em qualquer lugar.**

A ideia está relacionada à utilização da JVM.

---

# 5. Componentes da JVM

A JVM possui diferentes componentes responsáveis pelo processo de execução.

## Class Loader

Carrega as classes necessárias para a execução do programa.

## Verifier

Verifica o Bytecode antes da execução.

## Interpreter

Interpreta as instruções do Bytecode.

## Memory Manager

Gerencia a memória utilizada pela aplicação.

## JIT Compiler

O **JIT — Just-In-Time Compiler** pode compilar partes do código durante a execução para melhorar o desempenho.

---

# 6. IDE

IDE significa:

**Integrated Development Environment**

Em português:

**Ambiente de Desenvolvimento Integrado**.

Uma IDE reúne ferramentas que facilitam a criação de programas.

Entre seus recursos podem estar:

* editor de código;
* compilação;
* execução;
* identificação de erros;
* autocompletar;
* debugger;
* organização dos arquivos.

Durante o curso é utilizado o **NetBeans**.

Outras IDEs conhecidas incluem:

* Eclipse;
* IntelliJ IDEA.

---

# 7. Primeiro Programa em Java

O primeiro programa tradicionalmente utilizado para testar uma linguagem é o famoso:

```text
Olá, Mundo!
```

Exemplo:

```java
package primeirademonstracao;

public class PrimeiroProgramaJava {

    public static void main(String[] args) {

        System.out.print("Olá, Mundo!");

    }
}
```

Esse pequeno programa apresenta vários conceitos importantes.

---

# 8. Estrutura de um Programa Java

## Package

```java
package primeirademonstracao;
```

O `package` identifica o pacote em que a classe está organizada.

Pode ser entendido como uma forma de organização dos arquivos.

## Classe

```java
public class PrimeiroProgramaJava {
}
```

O código Java é organizado dentro de classes.

## Método main

```java
public static void main(String[] args)
```

O `main` representa o ponto de entrada do programa.

É a partir dele que a execução começa.

## System.out.print()

```java
System.out.print("Olá, Mundo!");
```

Exibe uma informação no console.

## System.out.println()

```java
System.out.println("Olá, Mundo!");
```

Também exibe uma informação, mas depois posiciona o cursor na próxima linha.

---

# 9. Convenções de Nomenclatura

As aulas apresentam algumas convenções para organizar os nomes utilizados no código.

## Classes e Interfaces

Começam com letra maiúscula e utilizam **CamelCase**.

Exemplo:

```java
NomeAluno
```

## Variáveis, atributos e métodos

Começam com letra minúscula e podem utilizar **CamelCase**.

Exemplo:

```java
nomeAluno
```

## Pacotes

São escritos em letras minúsculas.

Exemplo:

```text
primeirademonstracao
```

## Constantes

Utilizam letras maiúsculas e `_`.

Exemplo:

```java
VALOR_DE_PI
```

---

# 10. Tipos de Dados e Variáveis

Uma variável é utilizada para armazenar uma informação.

Exemplo:

```java
int idade = 3;
```

Nesse caso:

```text
int → tipo
idade → nome da variável
3 → valor
```

---

# 11. Tipos Primitivos

Os arquivos estudados apresentam diferentes tipos primitivos.

## int

Utilizado para números inteiros.

```java
int idade = 3;
```

## float

Utilizado para valores com casas decimais.

```java
float sal = 2824.54f;
```

O `f` identifica o valor como `float`.

## char

Utilizado para armazenar um caractere.

```java
char letra = 'B';
```

O caractere é colocado entre aspas simples.

## boolean

Representa um valor lógico:

```java
boolean casado = false;
```

Os valores possíveis são:

```text
true
false
```

Também fazem parte dos tipos primitivos:

```text
byte
short
long
double
```

---

# 12. Wrapper Classes

Os tipos primitivos possuem classes correspondentes.

| Tipo primitivo | Wrapper     |
| -------------- | ----------- |
| `byte`         | `Byte`      |
| `short`        | `Short`     |
| `int`          | `Integer`   |
| `long`         | `Long`      |
| `float`        | `Float`     |
| `double`       | `Double`    |
| `char`         | `Character` |
| `boolean`      | `Boolean`   |

Exemplo:

```java
Integer idade;
Float nota;
Character letra;
Boolean casado;
```

---

# 13. String

`String` é utilizada para representar textos.

Exemplo:

```java
String nome = "Brenda";
```

Uma String pode armazenar uma sequência de caracteres.

Exemplo:

```java
String mensagem = "Olá, Mundo!";
```

---

# 14. Entrada de Dados com Scanner

Para receber dados digitados pelo usuário, utiliza-se a classe `Scanner`.

Primeiro é necessário importar:

```java
import java.util.Scanner;
```

Depois criar o objeto:

```java
Scanner teclado = new Scanner(System.in);
```

A partir desse objeto é possível receber diferentes tipos de dados.

## nextLine()

Recebe uma linha de texto.

```java
String nome = teclado.nextLine();
```

## nextFloat()

Recebe um número do tipo `float`.

```java
float nota = teclado.nextFloat();
```

## nextInt()

Recebe um número inteiro.

```java
int idade = teclado.nextInt();
```

## next()

Recebe uma entrada de texto.

```java
String resposta = teclado.next();
```

---

# 15. Saída de Dados

Java possui diferentes formas de apresentar informações no console.

## print

```java
System.out.print("Olá");
```

Exibe o conteúdo sem pular automaticamente para a próxima linha.

## println

```java
System.out.println("Olá");
```

Exibe o conteúdo e pula para a próxima linha.

## printf

Permite trabalhar com formatação.

```java
System.out.printf("Nome: %s", nome);
```

## format

Também permite formatar os valores.

Exemplo utilizado nos estudos:

```java
System.out.format(
    "Sua nota de %s é %.4f \n",
    nome,
    nota
);
```

---

# 16. Formatação

Alguns formatos utilizados:

```text
%s     → String
%.2f   → número decimal com 2 casas
%.4f   → número decimal com 4 casas
```

Exemplo:

```java
System.out.format(
    "Sua nota é %.4f",
    nota
);
```

---

# 17. Conversão de Tipos

Também é possível converter valores.

## Convertendo inteiro para String

```java
Integer.toString(idade);
```

Exemplo:

```java
String valor = Integer.toString(idade);
```

## Convertendo String para inteiro

```java
Integer.parseInt(valorStr);
```

Exemplo:

```java
int idade = Integer.parseInt(valorStr);
```

---

# 18. Operadores Aritméticos

Os operadores aritméticos são utilizados para realizar cálculos.

| Operador | Operação         |
| -------- | ---------------- |
| `+`      | Adição           |
| `-`      | Subtração        |
| `*`      | Multiplicação    |
| `/`      | Divisão          |
| `%`      | Resto da divisão |

Exemplo:

```java
int soma = 10 + 5;
int subtracao = 10 - 5;
int multiplicacao = 10 * 5;
int divisao = 10 / 5;
int resto = 10 % 3;
```

---

# 19. Cálculo de Média

Um exemplo trabalhado nos códigos é o cálculo de média.

```java
float m = (n1 + n2) / 2;
```

Outra forma utilizada:

```java
float m = (n1 + n2) / 2.0f;
```

O programa soma as duas notas e divide o resultado por dois.

---

# 20. Incremento e Decremento

## Pós-incremento

```java
numero++;
```

A variável é incrementada em `1`.

## Pré-incremento

```java
++numero;
```

Também incrementa a variável em `1`, mas a posição do operador influencia a ordem em que o valor é utilizado em determinadas expressões.

O mesmo conceito pode ser aplicado ao decremento:

```java
numero--;
```

---

# 21. Operadores de Atribuição

É possível realizar operações diretamente sobre uma variável.

## +=

```java
x += 2;
```

Equivale a:

```java
x = x + 2;
```

## *=

```java
x *= 2;
```

Equivale a:

```java
x = x * 2;
```

O mesmo conceito pode ser aplicado a outros operadores.

---

# 22. Classe Math

A classe `Math` possui métodos para realizar diferentes operações matemáticas.

## Math.pow()

Calcula potência.

```java
Math.pow(2, 3);
```

Resultado:

```text
8
```

## Math.sqrt()

Calcula raiz quadrada.

```java
Math.sqrt(25);
```

Resultado:

```text
5
```

## Math.cbrt()

Calcula raiz cúbica.

```java
Math.cbrt(27);
```

Resultado:

```text
3
```

## Math.abs()

Obtém o valor absoluto.

```java
Math.abs(-10);
```

Resultado:

```text
10
```

## Math.floor()

Arredonda para baixo.

```java
Math.floor(5.8);
```

## Math.ceil()

Arredonda para cima.

```java
Math.ceil(5.2);
```

## Math.round()

Realiza arredondamento.

```java
Math.round(5.6);
```

## Math.random()

Gera um valor aleatório.

```java
Math.random();
```

Também é possível utilizar uma fórmula para gerar valores dentro de determinado intervalo.

---

# 23. Operadores Lógicos e Relacionais

Os operadores são utilizados para criar e combinar condições.

## Operadores Lógicos

### && — E

As condições precisam ser verdadeiras.

```java
idade >= 18 && idade <= 70
```

### || — OU

Uma das condições pode ser verdadeira.

```java
idade < 16 || idade > 70
```

### ^ — OU Exclusivo

Trabalha com uma condição exclusiva.

### ! — NÃO

Inverte o valor lógico.

```java
!condicao
```

---

# 24. Operadores Relacionais

São utilizados para comparar valores.

```text
== → igual
!= → diferente
>  → maior
<  → menor
>= → maior ou igual
<= → menor ou igual
```

Exemplo:

```java
idade >= 18
```

A expressão verifica se a idade é maior ou igual a `18`.

---

# 25. Operador Ternário

O operador ternário permite realizar uma escolha simples em uma única expressão.

Estrutura:

```java
condicao ? valorVerdadeiro : valorFalso;
```

Exemplo:

```java
int maior = (a > b) ? a : b;
```

Nesse caso:

```text
Se a > b → maior recebe a
Caso contrário → maior recebe b
```

---

# 26. Comparação de Strings

Para comparar o conteúdo de duas `String`, utiliza-se:

```java
.equals()
```

Exemplo:

```java
nome1.equals(nome2)
```

Nos estudos é destacado que `==` e `.equals()` possuem finalidades diferentes quando trabalhamos com `String`.

Para comparar o conteúdo textual, utiliza-se:

```java
nome1.equals(nome2)
```

---

# 27. Estruturas Condicionais

Estruturas condicionais permitem que o programa **tome decisões**.

Em vez de executar sempre o mesmo caminho, o programa verifica uma condição e escolhe qual código deverá ser executado.

As principais estruturas estudadas foram:

```text
if
if / else
else if
switch
```

---

# 28. Estrutura if

O `if` executa um bloco apenas quando a condição é verdadeira.

Exemplo:

```java
if (m > 9) {
    System.out.println("Parabéns, pequeno gafanhoto!");
}
```

Se:

```text
m > 9
```

for verdadeiro, a mensagem será exibida.

Se for falso, o programa continua seu fluxo normal.

---

# 29. Estrutura if/else

Quando existem dois caminhos possíveis, utiliza-se `if/else`.

Exemplo:

```java
if (valor % 2 == 0) {
    System.out.println("O número é PAR.");
} else {
    System.out.println("O número é ÍMPAR.");
}
```

A lógica é:

```text
Se o resto da divisão por 2 for 0
        ↓
      PAR

Caso contrário
        ↓
      ÍMPAR
```

---

# 30. Estrutura else if

Quando existem várias possibilidades, podemos utilizar `else if`.

Exemplo:

```java
if (idade < 16) {

    System.out.println("Não vota.");

} else if ((idade >= 16 && idade < 18) || (idade > 70)) {

    System.out.println("Voto opcional.");

} else {

    System.out.println("Voto obrigatório.");

}
```

O programa testa as condições na ordem em que elas aparecem.

---

# 31. Estrutura switch

O `switch` é utilizado para trabalhar com múltiplas possibilidades baseadas em um valor.

Exemplo:

```java
switch (pernas) {

    case 1:
        tipo = "Saci";
        break;

    case 2:
        tipo = "Bípede";
        break;

    case 3:
        tipo = "Tripé";
        break;

    case 4:
        tipo = "Quadrúpede";
        break;

    case 6:
    case 8:
        tipo = "Aranha";
        break;

    default:
        tipo = "ET";
        break;
}
```

## case

Representa uma possibilidade.

## break

Interrompe a execução daquele `switch`.

## default

É utilizado quando nenhum dos casos anteriores corresponde ao valor.

---

# 32. Estruturas de Repetição

Estruturas de repetição permitem executar determinado código várias vezes.

As principais estruturas estudadas foram:

```text
while
do-while
for
```

Além disso, foram estudados:

```text
continue
break
```

e os **laços aninhados**.

---

# 33. Estrutura while

O `while` executa um bloco enquanto uma condição for verdadeira.

Exemplo:

```java
int cc = 0;

while (cc < 10) {

    cc++;

    System.out.println("Cambalhota " + cc);

}
```

O funcionamento é:

```text
Verifica condição
       ↓
Condição verdadeira?
       ↓
     SIM
       ↓
Executa
       ↓
Volta para a condição
```

Quando a condição deixa de ser verdadeira, o laço termina.

---

# 34. Comando continue

O `continue` pula a execução restante da repetição atual.

Exemplo:

```java
if (contador == 2) {
    continue;
}
```

Quando `contador` é igual a `2`, a execução daquela repetição é ignorada e o laço continua.

```text
continue → pula a repetição atual
```

---

# 35. Comando break

O `break` encerra completamente o laço.

Exemplo:

```java
if (contador == 8) {
    break;
}
```

Quando essa condição acontece, o programa sai do `while`.

```text
break → encerra o laço
```

---

# 36. Estrutura do-while

O `do-while` é semelhante ao `while`, mas possui uma diferença importante:

**o bloco é executado pelo menos uma vez.**

Estrutura:

```java
do {

    // código

} while (condicao);
```

Exemplo:

```java
int cc = 0;

do {

    cc++;

    System.out.println("Cambalhota " + cc);

} while (cc < 4);
```

A condição é verificada somente depois da primeira execução.

---

# 37. Acumuladores

Um acumulador é uma variável utilizada para guardar progressivamente um resultado.

Exemplo:

```java
int soma = 0;
```

Durante o laço:

```java
soma += n;
```

Isso equivale a:

```java
soma = soma + n;
```

Assim, cada número digitado é acrescentado ao valor anterior.

Exemplo completo:

```java
int n, soma = 0;

do {

    System.out.print("Digite um número: ");
    n = teclado.nextInt();

    soma += n;

    System.out.print("Quer continuar? [S/N] ");
    resp = teclado.next();

} while (resp.equalsIgnoreCase("S"));
```

Ao final:

```java
System.out.println(
    "A soma de todos os valores introduzidos é: " + soma
);
```

---

# 38. Estrutura for

O `for` é utilizado para criar repetições controladas por uma inicialização, uma condição e uma alteração da variável de controle.

Estrutura:

```java
for (inicialização; condição; incremento) {

    // código

}
```

Exemplo:

```java
for (int cc = 1; cc <= 4; cc++) {

    System.out.println("Cambalhota " + cc);

}
```

Nesse exemplo:

```text
int cc = 1
```

é a inicialização.

```text
cc <= 4
```

é a condição.

```text
cc++
```

é o incremento.

---

# 39. Variações do for

O `for` pode ser utilizado com diferentes formas de contagem.

## Contagem normal

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

Resultado:

```text
1
2
3
4
5
6
7
8
9
10
```

## Pulando de 2 em 2

```java
for (int i = 5; i <= 15; i += 2) {
    System.out.println(i);
}
```

Resultado:

```text
5
7
9
11
13
15
```

## Contagem decrescente

```java
for (int i = 15; i >= 5; i -= 2) {
    System.out.println(i);
}
```

Resultado:

```text
15
13
11
9
7
5
```

---

# 40. Laços Aninhados

Um laço aninhado acontece quando existe um laço dentro de outro.

Exemplo:

```java
for (int i = 1; i <= 3; i++) {

    for (int j = 0; j <= 2; j += 2) {

        System.out.println(
            "I = " + i + " | J = " + j
        );

    }
}
```

O `for` interno é executado para cada repetição do `for` externo.

Podemos visualizar:

```text
FOR EXTERNO
    |
    +--- FOR INTERNO
    |       |
    |       +--- execução
    |
    +--- próxima repetição
```

Esse tipo de estrutura é importante para trabalhar com situações que possuem mais de um nível de repetição.

---

# 41. Métodos, Funções e Procedimentos

Os métodos permitem **organizar o código em blocos reutilizáveis**.

Em vez de colocar todas as instruções dentro do `main`, podemos criar métodos para executar tarefas específicas.

---

# 42. Procedimento com void

Um método `void` executa uma ação, mas não devolve um valor.

Exemplo:

```java
static void soma(int a, int b) {

    int s = a + b;

    System.out.println("A soma é " + s);

}
```

O método pode ser chamado:

```java
soma(5, 2);
```

Nesse caso:

```text
a = 5
b = 2
```

O método realiza a soma e exibe o resultado.

---

# 43. Função com Retorno

Um método também pode devolver um valor.

Exemplo:

```java
static int somar(int a, int b) {

    int s = a + b;

    return s;

}
```

Nesse caso:

```text
int
```

indica que o método retorna um valor inteiro.

Podemos armazenar o resultado:

```java
int sm = somar(5, 2);
```

E depois:

```java
System.out.println("A soma vale " + sm);
```

---

# 44. Parâmetros

Parâmetros são os valores que um método recebe.

Exemplo:

```java
static int somar(int a, int b)
```

Temos:

```text
a → primeiro parâmetro
b → segundo parâmetro
```

Quando fazemos:

```java
somar(5, 2);
```

os valores são enviados para os parâmetros.

```text
a recebe 5
b recebe 2
```

---

# 45. return

O comando `return` devolve um valor produzido pelo método.

Exemplo:

```java
return s;
```

Assim, quando fazemos:

```java
int resultado = somar(5, 2);
```

o valor retornado pelo método é armazenado em `resultado`.

---

# 46. Métodos em Classes Separadas

Também é possível criar uma classe específica para armazenar métodos.

Exemplo:

```java
public class Operacoes {

    public static String contador(int inicio, int fim) {

        String s = "";

        for (int c = inicio; c <= fim; c++) {

            s += c + " ";

        }

        return s;
    }
}
```

Outra classe pode chamar esse método:

```java
public class TesteFuncao02 {

    public static void main(String[] args) {

        String res = Operacoes.contador(1, 5);

        System.out.println(res);

    }
}
```

Nesse exemplo:

```text
TesteFuncao02
      ↓
Operacoes
      ↓
contador()
```

Isso demonstra como métodos podem ser organizados em classes diferentes.

---

# 47. Vetores

Um **vetor** é uma estrutura utilizada para armazenar vários valores do mesmo tipo.

Em vez de criar várias variáveis:

```java
int n1;
int n2;
int n3;
int n4;
```

podemos utilizar um vetor:

```java
int n[] = new int[4];
```

Assim, vários valores podem ser armazenados na mesma estrutura.

---

# 48. Índices dos Vetores

Os elementos de um vetor são acessados por índices.

O primeiro índice é:

```text
0
```

Exemplo:

```java
n[0]
n[1]
n[2]
n[3]
```

Um vetor criado com:

```java
int n[] = new int[4];
```

possui quatro posições:

```text
Índice:  0   1   2   3
         ↓   ↓   ↓   ↓
Valor:   ?   ?   ?   ?
```

---

# 49. Preenchendo um Vetor

Podemos preencher as posições individualmente:

```java
n[0] = 3;
n[1] = 5;
n[2] = 8;
n[3] = 9;
```

Também podemos criar o vetor diretamente com valores:

```java
int num[] = {3, 5, 8, 9, 2, -7, 13};
```

---

# 50. length

A propriedade:

```java
.length
```

informa a quantidade de elementos do vetor.

Exemplo:

```java
num.length
```

Se o vetor possui sete elementos:

```text
num.length = 7
```

Isso é muito útil para percorrer o vetor sem precisar informar manualmente a quantidade de posições.

---

# 51. Percorrendo um Vetor com for

Podemos utilizar o `for`:

```java
for (int c = 0; c < num.length; c++) {

    System.out.println(
        "Na posição " + c +
        " temos o valor " + num[c]
    );

}
```

A variável `c` representa o índice.

Assim:

```text
num[0]
num[1]
num[2]
...
```

são acessados durante a repetição.

---

# 52. for-each

Também é possível percorrer diretamente os valores do vetor.

Exemplo:

```java
for (int valor : vet) {

    System.out.println(valor);

}
```

Nesse caso, não precisamos controlar diretamente o índice.

A variável `valor` recebe cada elemento do vetor.

---

# 53. Arrays.fill()

A classe `Arrays` pode ser utilizada para trabalhar com vetores.

Primeiro:

```java
import java.util.Arrays;
```

Depois:

```java
Arrays.fill(v, 7);
```

Esse comando preenche as posições do vetor com o valor `7`.

---

# 54. Arrays.sort()

O método:

```java
Arrays.sort(vet);
```

organiza os valores do vetor.

Exemplo:

```text
Antes:

8 3 7 1 5

Depois:

1 3 5 7 8
```

---

# 55. Arrays.binarySearch()

O método:

```java
Arrays.binarySearch(vet, 6);
```

realiza uma busca por determinado valor.

Nos estudos, é destacado que o vetor precisa estar **ordenado antes da utilização da busca binária**.

Exemplo:

```java
Arrays.sort(vet);

int p = Arrays.binarySearch(vet, 6);
```

---

# 56. Relação Entre os Conteúdos

Os conteúdos estudados não são isolados. Eles começam a se conectar conforme o programa fica mais complexo.

Por exemplo:

```text
Variáveis
   ↓
Operadores
   ↓
Condições
   ↓
Repetições
   ↓
Métodos
   ↓
Vetores
```

Um programa pode utilizar todos esses conceitos ao mesmo tempo.

Exemplo de sequência:

```text
Scanner
   ↓
recebe dados
   ↓
Variáveis armazenam os dados
   ↓
Operadores realizam cálculos
   ↓
if verifica uma condição
   ↓
for/while repete operações
   ↓
Método organiza uma tarefa
   ↓
Vetor armazena vários valores
```

---

# 57. Resumo das Estruturas

## Condicionais

```text
if
↓
Executa se a condição for verdadeira
```

```text
if / else
↓
Escolhe entre dois caminhos
```

```text
else if
↓
Verifica várias condições
```

```text
switch
↓
Escolhe entre vários casos
```

## Repetições

```text
while
↓
Testa antes de executar
```

```text
do-while
↓
Executa antes de testar
```

```text
for
↓
Inicialização + condição + incremento
```

## Controle

```text
continue
↓
Pula a repetição atual
```

```text
break
↓
Encerra o laço
```

---

# 58. Resumo de JDK, JRE e JVM

```text
JDK
│
├── Ferramentas de desenvolvimento
├── Compilador
├── JRE
│
└── Usado para DESENVOLVER
```

```text
JRE
│
├── JVM
├── Bibliotecas
│
└── Usado para EXECUTAR
```

```text
JVM
│
└── Executa o BYTECODE
```

---

# 59. Fluxo Completo de um Programa Java

O processo pode ser resumido em:

```text
              CÓDIGO-FONTE
                   │
                   ↓
                 javac
                   │
                   ↓
                BYTECODE
                   │
                   ↓
                  JVM
                   │
                   ↓
          SISTEMA OPERACIONAL
                   │
                   ↓
               EXECUÇÃO
```

Esse é um dos conceitos fundamentais para compreender o funcionamento do Java.

---

# 60. Resumo dos Tipos de Dados

| Tipo      | Utilização     |
| --------- | -------------- |
| `byte`    | Número inteiro |
| `short`   | Número inteiro |
| `int`     | Número inteiro |
| `long`    | Número inteiro |
| `float`   | Número decimal |
| `double`  | Número decimal |
| `char`    | Caractere      |
| `boolean` | Valor lógico   |
| `String`  | Texto          |

---

# 61. Resumo dos Operadores

| Operador | Significado                |   |    |
| -------- | -------------------------- | - | -- |
| `+`      | Adição                     |   |    |
| `-`      | Subtração                  |   |    |
| `*`      | Multiplicação              |   |    |
| `/`      | Divisão                    |   |    |
| `%`      | Resto                      |   |    |
| `++`     | Incremento                 |   |    |
| `--`     | Decremento                 |   |    |
| `+=`     | Soma e atribuição          |   |    |
| `*=`     | Multiplicação e atribuição |   |    |
| `&&`     | E                          |   |    |
| `        |                            | ` | OU |
| `^`      | OU exclusivo               |   |    |
| `!`      | Negação                    |   |    |
| `==`     | Igualdade                  |   |    |
| `!=`     | Diferente                  |   |    |
| `>`      | Maior                      |   |    |
| `<`      | Menor                      |   |    |
| `>=`     | Maior ou igual             |   |    |
| `<=`     | Menor ou igual             |   |    |
| `? :`    | Operador ternário          |   |    |

---

# 62. Principais Comandos e Métodos

## Entrada

```java
Scanner teclado = new Scanner(System.in);
```

```java
teclado.nextLine();
teclado.next();
teclado.nextInt();
teclado.nextFloat();
```

## Saída

```java
System.out.print();
System.out.println();
System.out.printf();
System.out.format();
```

## Matemática

```java
Math.pow();
Math.sqrt();
Math.cbrt();
Math.abs();
Math.floor();
Math.ceil();
Math.round();
Math.random();
```

## Strings

```java
.equals();
.equalsIgnoreCase();
```

## Vetores

```java
Arrays.fill();
Arrays.sort();
Arrays.binarySearch();
```

---

# 63. Arquivos Estudados

Os códigos presentes no projeto representam diferentes partes do conteúdo estudado.

```text
primeiro_programa.java
→ Primeiro programa em Java

Tipos-Primitivos-Manipulação-de-Dados.java
→ Tipos, Scanner, entrada, saída e conversões

Operadores-Aritméticos-e-Classe-Math.java
→ Operadores, incremento, atribuição e Math

Operadores-Lógicos-e-Relacionais.java
→ Operadores lógicos, relacionais e ternário

Estruturas-Condicionais-part1.java
→ if e if/else

Estruturas-Condicionais-part2.java
→ else if e switch

Estruturas-de-Repetição-part1.java
→ while, continue e break

Estruturas-de-Repetição-part2.java
→ do-while e acumuladores

Estruturas-de-Repetição-part3.java
→ for e laços aninhados

Metodo1.java
→ Procedimento e função

Metodo2.java
→ Método com parâmetros e retorno

Metodo3.java
→ Chamada de método de outra classe

Vetores.java
→ Vetores e classe Arrays
```

---

# 64. Pontos Mais Importantes para Revisão

Para revisar os conteúdos estudados, é importante saber explicar:

### Java

* O que é Java;
* Como surgiu;
* Quem foi James Gosling;
* O que foi a Green Team;
* O que foi Oak;
* O que foi o Star Seven;
* O que é Bytecode;
* O que é JVM;
* O que significa WORA.

### Ambiente Java

* O que é JDK;
* O que é JRE;
* O que é JVM;
* Diferença entre JDK, JRE e JVM;
* O que é uma IDE;
* Para que serve o NetBeans;
* Para que serve o debugger.

### Programação Básica

* O que é uma classe;
* O que é o `main`;
* O que é uma variável;
* O que são tipos primitivos;
* O que é `String`;
* Como utilizar `Scanner`;
* Como exibir informações.

### Operadores

* Operadores aritméticos;
* Operadores relacionais;
* Operadores lógicos;
* Operador ternário;
* Incremento;
* Decremento;
* Atribuição composta;
* Classe `Math`.

### Condicionais

* `if`;
* `if/else`;
* `else if`;
* `switch`;
* `case`;
* `break`;
* `default`.

### Repetição

* `while`;
* `do-while`;
* `for`;
* `continue`;
* `break`;
* acumuladores;
* laços aninhados.

### Métodos

* O que é um método;
* O que é um procedimento;
* O que é uma função;
* `void`;
* parâmetros;
* `return`;
* chamada de métodos;
* métodos em classes diferentes.

### Vetores

* Declaração;
* índices;
* `.length`;
* preenchimento;
* `for`;
* `for-each`;
* `Arrays.fill()`;
* `Arrays.sort()`;
* `Arrays.binarySearch()`.

---

# 65. Conclusão

Este repositório reúne os principais fundamentos estudados durante a introdução à programação em **Java**.

O conteúdo começa pela história e pelo funcionamento da linguagem e evolui gradualmente para a construção de programas utilizando:

* variáveis;
* tipos de dados;
* entrada e saída;
* operadores;
* cálculos;
* estruturas condicionais;
* estruturas de repetição;
* métodos;
* funções;
* procedimentos;
* vetores.

A sequência dos conteúdos permite compreender como pequenos comandos podem ser combinados para construir programas mais completos.

O objetivo do projeto é manter os códigos organizados, registrar a evolução dos estudos e servir como **material de consulta e revisão dos fundamentos de Java**.

---

**Repositório destinado a estudos e fins acadêmicos.**

