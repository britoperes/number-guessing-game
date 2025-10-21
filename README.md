# Number Guessing Game

Um jogo de adivinhação de números desenvolvido em Java, onde o computador escolhe um número aleatório entre 1 e 100 e o jogador tenta adivinhar.

## 📋 Sobre o Projeto

Este projeto foi desenvolvido como parte dos desafios propostos em [roadmap.sh/projects/number-guessing-game](https://roadmap.sh/projects/number-guessing-game).

## 🎮 Como Funciona

1. **Início do Jogo**: Ao iniciar, o programa exibe uma mensagem de boas-vindas e as regras do jogo.

2. **Seleção de Dificuldade**: O jogador escolhe entre três níveis de dificuldade:
   - **Fácil**: 10 tentativas
   - **Médio**: 7 tentativas
   - **Difícil**: 5 tentativas

3. **Adivinhação**: O computador gera um número aleatório entre 1 e 100, e o jogador faz suas tentativas.

4. **Feedback**: A cada tentativa, o jogo informa se o número secreto é maior ou menor que o palpite.

5. **Vitória ou Derrota**:
   - Se o jogador acertar, o jogo exibe uma mensagem de parabéns com o número de tentativas utilizadas.
   - Se as tentativas acabarem, o jogo termina.

6. **Continuar Jogando**: Após cada rodada, o jogador pode escolher jogar novamente ou encerrar.

## 🚀 Como Executar

### Pré-requisitos
- Java 11 ou superior

### Executando o Projeto

```bash
# Clone o repositório
git clone git@github.com:britoperes/number-guessing-game.git

# Navegue até o diretório do projeto
cd number-guessing-game

# Compile o código
javac -d target/classes src/main/java/com/roadmap/NumberGuessingGame.java

# Execute o jogo
java -cp target/classes com.roadmap.NumberGuessingGame
```

Ou em um único comando:

```bash
javac -d target/classes src/main/java/com/roadmap/NumberGuessingGame.java && java -cp target/classes com.roadmap.NumberGuessingGame
```

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação
- **Scanner**: Para entrada de dados do usuário
- **Random**: Para geração de números aleatórios

## 📝 Estrutura do Código

- `NumberGuessingGame.java`: Classe principal contendo toda a lógica do jogo
  - `main()`: Método principal que controla o fluxo do jogo
  - `generateSecretNumber()`: Gera um número aleatório entre 1 e 100
  - `getAttempts()`: Retorna o número de tentativas baseado na dificuldade escolhida

## 🎯 Funcionalidades

- ✅ Geração aleatória de números
- ✅ Três níveis de dificuldade
- ✅ Feedback em tempo real (maior/menor)
- ✅ Contador de tentativas
- ✅ Opção de jogar múltiplas rodadas
- ✅ Interface de linha de comando intuitiva

## 📄 Licença

Este projeto é de código aberto e está disponível para fins educacionais.

---

Desenvolvido como parte do desafio [Number Guessing Game](https://roadmap.sh/projects/number-guessing-game) do roadmap.sh
