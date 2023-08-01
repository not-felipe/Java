/**
 * <h1>SmartTv</h1>
 * A SmartTv tem a funcionalidade de simular uma Tv em funcionamento
 * 
 * @author Felipe Alves
 * @version 1.0
 * @since 01/08/2023
 */

public class SmartTv {
  
  private boolean estaLigada = false;
  private int canal = 1;
  private int volume = 20;

/**
 * Este método é utilizado para alternar o status da Televisão (Ligar/Desligar)
 */
public void alternarStatus(){
  this.estaLigada = !estaLigada;
}

/**
 * Este método é utilizado para aumentar o volume da televisão em 1 unidade (quando está ligada)
 */
public void aumentarVolume(){
  if(this.estaLigada)
  this.volume ++;
}

/**
 * Este método é utilizado para diminuir o volume da 1 televisão em 1 unidade (quando está ligada)
 */
public void diminuirVolume(){
  if(this.estaLigada)
  this.volume --;
}

/**
 * Este método é utilizado para trocar de canal (aumenta 1 unidade)
 */
public void trocarCanalCima(){
  if(this.estaLigada)
  this.canal ++;
}

/**
 * Este método é utilizado para trocar de canal (diminui 1 unidade)
 */
public void trocarCanalBaixo(){
  if(this.estaLigada){
  this.canal --;
  if(canal < 0) canal = 0;
  }
}

/**
 * Imprime, caso a televisão esteja ligada, as informações
 */
public void imprimirInformacoes(){
  if (this.estaLigada) {
    System.out.println("Televisão está ligada");
    System.out.println("Canal: " + this.canal);
    System.out.println("Volume: " + this.volume);
  } else {
    System.out.println("Televisão está desligada");
  }
}

}
