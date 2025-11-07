import java.util.*;

public class Tabuleiro {
    private Tesouro [][] mapaTesouros;

    public Tabuleiro(){
        mapaTesouros = new Tesouro[10][10];
    }

    public boolean posicionarTesouro(int linha, int coluna, Tesouro t){
        if(!(linha >= 0 && linha <= 10 && coluna >=0 && coluna <= 10)){
            System.out.println("Posição inválida!");
        }
        if(posicaoLivre(linha, coluna)){
            mapaTesouros[linha][coluna] = t;
            return true;
        }
        return false;
    }
    
    public boolean posicaoLivre(int linha, int coluna){
        if(mapaTesouros[linha][coluna] != null){
            return false;
        }
        return true;
    }

}
