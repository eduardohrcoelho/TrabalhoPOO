# TrabalhoPOO
# ⚔️ Caça ao Tesouro - Trabalho Prático de POO I

![Status](https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen)

Este é um projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos I do IFMG, ministrada pela Prof. Suelen Mapa de Paula.

O objetivo foi desenvolver um jogo de "Caça ao Tesouro" em Java, aplicando os conceitos fundamentais de POO. O jogo é baseado em turnos, onde dois jogadores escondem seus tesouros e tentam encontrar os do oponente em um tabuleiro 10x10.

## 📜 Regras do Jogo

* **Objetivo:** Encontrar todos os 8 tesouros do oponente.
* **Tesouros:** Cada jogador deve esconder 8 tesouros no total:
    * 3 Verdes (6.0 pontos cada)
    * 3 Amarelos (4.0 pontos cada)
    * 2 Vermelhos (10.0 pontos cada)
* **Turnos:** Os jogadores se alternam para tentar adivinhar a posição dos tesouros do oponente.
* **Condições de Vitória:** O jogo termina em duas condições:
    1.  Um jogador encontra todos os 8 tesouros do oponente.
    2.  O limite de 20 rodadas (10 para cada jogador) é atingido.
* **Vitória por Pontos:** Caso as 20 rodadas terminem, vence o jogador que acumulou a maior pontuação.
* **Validações:** O sistema impede que um jogador posicione tesouros em locais já ocupados e impede que um jogador ataque a mesma coordenada duas vezes.

## 🛠️ Conceitos de POO Aplicados

Este projeto foi estruturado para aplicar os seguintes requisitos obrigatórios:

* **Encapsulamento:** Todos os atributos das classes são `private`, com acesso controlado por métodos públicos (getters e setters, quando necessário).
* **Relações entre Classes:**
    * **Composição:** `Jogo` é composto por `Jogador`, e `Jogador` é composto por `Tabuleiro`.
    * **Agregação:** `Tabuleiro` agrega `Tesouros`.
    * **Dependência:** `Main` depende de `Jogo`, e `Jogador` depende de `Tesouro`.
* **Sobrecarga de Métodos:** A classe `Jogador` implementa a sobrecarga do método `posicionarTesouro()`, com e sem o parâmetro `cor`.
* **Collections:** A classe `Jogador` utiliza um `ArrayList<String>` para armazenar o histórico de coordenadas atacadas, validando jogadas repetidas.

## 🏗️ Estrutura das Classes

* **`Main`**: Ponto de entrada do programa. Apenas instancia e inicia o `Jogo`.
* **`Jogo`**: Classe orquestradora. Gerencia o menu, as fases do jogo (posicionamento e ataque), os turnos e as condições de vitória.
* **`Jogador`**: Armazena o estado do jogador (nome, pontuação), seu `meuTabuleiro` (Composição), seu mapa de ataque (`char[][]`) e o `ArrayList` de jogadas feitas.
* **`Tabuleiro`**: Encapsula a lógica do tabuleiro 10x10 (`Tesouro[][]`). É a única classe responsável por validar e executar o posicionamento e o recebimento de ataques.
* **`Tesouro`**: Classe de dados que armazena a `cor` e os `pontos` de um tesouro.

## 🚀 Como Executar

1.  Clone este repositório:
    ```bash
    git clone https://github.com/MateusVon/TrabalhoPOO.git
    ```
2.  Navegue até a pasta do projeto e compile os arquivos `.java`. Se estiverem em uma pasta `src`:
    ```bash
    javac src/*.java
    ```
3.  Execute a classe `Main`:
    ```bash
    java src.Main
    ```

## 👨‍💻 Autores

* Eduardo Coelho
* Mateus Von