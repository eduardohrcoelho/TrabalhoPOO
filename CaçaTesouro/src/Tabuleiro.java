public class Tabuleiro {
  private Tesouro[][] mapaTesouros;

  public Tabuleiro() {
    this.mapaTesouros = new Tesouro[10][10];
  }

  public boolean posicionarTesouro(int linha, int coluna, Tesouro t) {
    if (!posicaoValida(linha, coluna)) { // Verificaçao de limite do tabuleiro para evitar
                                         // que o usuário tente inserir um tesouro em uma
                                         // posiçao fora dos limites da matriz.
      return false;
    }
    if (posicaoLivre(linha, coluna)) {
      this.mapaTesouros[linha][coluna] = t;
      return true;
    }
    System.out.println("Posiçao já ocupada!");
    return false;
  }

  public boolean posicaoLivre(int linha, int coluna) { // Metódo para verificar se a posiçao do mapa está livre.
    if (this.mapaTesouros[linha][coluna] != null) { // Se linha e coluna informadas forem diferente de null, retorna
                                                    // false
      // para informar que a posiçao já está ocupada.
      return false;
    }
    return true; // Se não, retorna true e confirma a posiçao livre para inserir o tesouro.
  }

  public static boolean posicaoValida(int linha, int coluna) {
    if (!(linha >= 0 && linha < 10 && coluna >= 0 && coluna < 10)) {
      System.out.println("\nPosiçao inválida! Tente novamente números de 0 a 9:");
      return false;
    }
    return true;
  }

  public Tesouro receberAtaque(int linha, int coluna) {
    if (!posicaoValida(linha, coluna)) { // Verifica se a posiçao informada é valida
      return null;
    }
    // Condiçao para verificar se acertou o tesouro e remove-lo;
    if (!posicaoLivre(linha, coluna)) {
      Tesouro achou = this.mapaTesouros[linha][coluna];
      this.mapaTesouros[linha][coluna] = null;
      return achou;
    }
    return null;
  }
}
