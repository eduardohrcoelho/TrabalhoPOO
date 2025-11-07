import java.util.ArrayList;

public class Jogador {
  protected String nome;
  protected int pontuacao;
  protected Tabuleiro meuTabuleiro;

  private ArrayList<String> jogadasFeitas;

  public Jogador() {
  }

  public Jogador(String nome, int pontuacao, Tabuleiro meuTabuleiro) {
    this.nome = nome;
    this. pontuacao = 0;
    this.meuTabuleiro = new Tabuleiro();

    this.jogadasFeitas = new ArrayList<String>();
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setPontuacao(int pontuacao) {
    this.pontuacao = pontuacao;
  }

  public int getPontuacao() {
    return this.pontuacao;
  }

  public void getTabuleiro(Tabuleiro meuTabuleiro) {
    this.meuTabuleiro = meuTabuleiro;
  }

  public Tabuleiro setTabuleiro() {
    return this.meuTabuleiro;
  }

  // Coloca tesouros no tabuleiro
  public boolean jaJogou(int linha, int coluna) {
    String coordenada = linha + "," + coluna;
    return this.jogadasFeitas.contains(coordenada);
  }

  public void atacar(int linha, int coluna){
    if(jaJogou(linha, coluna)){
      System.out.println("Erro: Voce ja procurou um tesouro ai. Tente outra posicao");
    }else{ 
      registrarTentativa(linha, coluna);
    }
  }

  public void registrarTentativa(int linha, int coluna){
    
  }

  public int receberAtaque(int linha, int coluna){
    
  }
  
  public void adicionarPontos(int pontuacao){
    
  }
}
