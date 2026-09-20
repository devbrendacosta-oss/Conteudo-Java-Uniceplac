
# ☕ Guia de Estudos: Introdução e Fundamentos do Java



## 📑 Índice
1. [Aula 01: História do Java](#-aula-01-história-do-java)
2. [Aula 02: Como Funciona o Java](#-aula-02-como-funciona-o-java)

---

## 🏛️ Aula 01: História do Java
🔗 **Assista à aula no YouTube:** [Curso de Java — Gustavo Guanabara](https://youtu.be/sTX0UEplF54?si=3lruQvdC7lvKRtbV)

### 🕰️ Evolução da Programação
Os primeiros computadores, como o ENIAC, não possuíam linguagens de programação. Eram programados manualmente por meio de fios e válvulas. Com o tempo, surgiram linguagens de alto nível (como Pascal), que possuem comandos mais próximos da linguagem humana. 

Porém, o computador só entende linguagem de máquina. Por isso, surgiu a figura do **compilador**.

> ⚠️ **IMPORTANTE:** Compilador é o programa responsável por traduzir o código-fonte (escrito pelo humano) para uma linguagem que a máquina consiga executar. (Fluxo: `Código-fonte ➔ Compilador ➔ Código executável`)

### ⚠️ O Problema das Plataformas e a Linguagem C
Antigamente, um programa compilado para MS-DOS não funcionava em Mac OS ou Linux. O programador precisava reescrever ou adaptar o código para cada sistema. A **Linguagem C** ajudou nisso, permitindo usar praticamente o mesmo código-fonte em compiladores diferentes. 
Posteriormente, surgiu o **C++**, que acrescentou o recurso de *Orientação a Objetos* à linguagem C.

### 🌱 O Surgimento do Java (Green Team)
Desenvolvido na **Sun Microsystems** no início dos anos 90, o projeto foi criado pela *Green Team*, liderada por **James Gosling**. O objetivo inicial era fazer diferentes aparelhos e eletrodomésticos se comunicarem.

*   **Star Seven (*7):** Dispositivo touch-screen criado na época para controlar aparelhos domésticos. Nele surgiu o mascote **Duke**.
*   **Oak:** Foi o primeiro nome da linguagem, inspirado em um carvalho na janela de Gosling.
*   **A Mudança para Java:** O projeto inicial não vingou nos eletrodomésticos, mas a internet estava crescendo. A equipe adaptou a tecnologia para a Web (projeto HotJava). Como "Oak" já tinha registro comercial, fizeram um *brainstorming* e escolheram **Java**, em homenagem ao café consumido pela equipe (daí o logo da xícara).

### 🌍 A Multiplataforma (WORA)
O grande diferencial do Java é resumido na frase: **"Escreva uma vez e execute em qualquer lugar"** (*Write Once, Run Anywhere*). Isso é possível graças à **JVM** (Máquina Virtual Java).

> 💡 **FRASE PARA DECORAR:** 
> `Código Java ➔ Compilador ➔ Bytecode ➔ JVM ➔ Execução`

---

### 📅 Linha do Tempo do Java
*   **1990:** Formação da Green Team.
*   **1991:** Desenvolvimento do projeto e criação do Star Seven (*7).
*   **1992:** Projeto Oak é colocado de lado.
*   **1994:** Reaproveitamento da tecnologia para a Web.
*   **1995:** Ganha o nome Java e começa a se destacar.
*   **2004:** Uso de Java pela NASA na exploração de Marte.
*   **2006:** Passa a ter código aberto (Open Source) sob a licença GPL.
*   **2009:** Oracle adquire a Sun Microsystems.

> 🚫 **ATENÇÃO:** Java e JavaScript são linguagens **diferentes**. O nome JavaScript foi apenas uma jogada de marketing na época do sucesso do Java.

---

## ⚙️ Aula 02: Como Funciona o Java
🔗 **Assista à aula no YouTube:** [Curso de Java — Gustavo Guanabara](https://youtu.be/v_ZCtgwbS3o?si=ZGqI0Vd8zjcEpN-A)

### 🔄 Compilação Tradicional vs. Compilação Java

*   **Tradicional (Ex: C):** `Código-Fonte ➔ Compilador ➔ Executável Específico (Windows/Linux/Mac)`.
*   **Java:** `Código-Fonte (.java) ➔ Compilador (javac) ➔ Bytecode (.class) ➔ JVM ➔ Sistema Operacional`.

> 🧠 **O que é o Bytecode?** Ele não é um executável de Windows ou Linux. É um código intermediário que só a JVM entende. É ele que garante que o Java rode em qualquer sistema.

### 🧩 A Sopa de Letrinhas: JVM, JRE e JDK

Para não se confundir, entenda a hierarquia das ferramentas Java:

| Sigla | Nome | O que é / O que faz? | Público Alvo |
| :---: | :--- | :--- | :--- |
| **JVM** | *Java Virtual Machine* | Executa o Bytecode. É a máquina virtual. | Máquina |
| **JRE** | *Java Runtime Environment* | **JVM + Bibliotecas.** Fornece o ambiente para *rodar* os programas. | Usuário Final |
| **JDK** | *Java Development Kit* | **JRE + Ferramentas (javac, debugger).** Kit para *desenvolver* programas. | Programador |

> 🛠️ **PARA DECORAR:**
> *   **JVM** ➔ Executa.
> *   **JRE** ➔ Permite executar.
> *   **JDK** ➔ Permite desenvolver.

### 🔬 O interior da JVM
A Máquina Virtual Java possui componentes internos essenciais:
1.  **Class Loader:** Carrega as classes para a memória.
2.  **Verificador:** Garante que o Bytecode é seguro.
3.  **Interpretador:** Executa as instruções.
4.  **Gerenciador de Memória:** Otimiza o uso da RAM.
5.  **Compilador JIT (Just-In-Time):** Identifica partes do código muito usadas e as transforma em código nativo da máquina para **melhorar o desempenho**.

### 💻 IDE e Ferramentas
Escrever código no bloco de notas é inviável profissionalmente. Para isso usamos as **IDEs** (*Ambiente de Desenvolvimento Integrado*), que trazem editor de código, autocompletar, gerenciador de arquivos e compilação em um só lugar.
*   **Exemplos de IDEs:** NetBeans (usada no curso), Eclipse, IntelliJ IDEA.
*   **Debugger:** Ferramenta presente nas IDEs que ajuda o programador a encontrar e corrigir erros, acompanhando o código linha por linha.

---
*Anotações baseadas no material gratuito do **Curso em Vídeo**. Organizado por [Seu Nome/Usuário do GitHub].*
