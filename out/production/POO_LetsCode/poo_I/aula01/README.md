1 - Crie a classe Jogador

 -  Cadastrar/Instanciar pelo menos um time completo 11 jogadores. 

- Criar um método que verifica a condição de jogo, ou seja, um método booleano que retornará true se o jogador está apto a jogar e false se o jogador está suspenso. Note que um jogador está suspenso pelo 3 cartão amarelo ou quando recebe um cartão vermelho. 

- Em uma outra classe, crie o método main, o qual cadastra os jogadores e ao final imprimirá a lista do time juntamente com a informação de quem está apto a jogar, conforme a figura abaixo. (Sobrescrever o método toString())

- Crie novos métodos na classe Jogador:

- aplicarCartaoAmarelo(int quantidade): void - Aplica a quantidade de cartões
informada ao jogador, adicionalmente pode tornar um jogador suspenso.

- aplicarCartaoVermelho(): void - Aplica um cartão vermelho ao jogador, torna um jogador suspenso.

- cumprirSuspencao(): void – Esse método vai zerar a quantidade de
cartões e tornar o jogador apto a jogar

- sofrerLesao(): void – Este método vai gerar aleatoriamente um lesão no jogador. A gravidade da lesão irá se refletir em uma redução da qualidade do jogador, quanto mais grave maior a redução da qualidade. Crie uma escala de redução de no mínimo 1 ponto até o máximo de 15% da qualidade total do jogador. Note que a qualidade jamais pode ficar negativa.

- executarTreinamento(): void – A exemplo do método anterior, este método vai aumentar a qualidade do jogador aleatoriamente em um número entre 1 e 3. Note que só pode ser executado 1 treinamento antes de cada partida (você deve adicionar um atributo na classe para poder controlar essa informação).
