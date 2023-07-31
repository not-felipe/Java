public class SmartTv {
  
  private boolean estaLigada = false;
  private int canal = 1;
  private int volume = 20;

public void alternarStatus(){
  this.estaLigada = !estaLigada;
}

public void aumentarVolume(){
  if(this.estaLigada)
  this.volume ++;
}

public void diminuirVolume(){
  if(this.estaLigada)
  this.volume --;
}

public void trocarCanalCima(){
  if(this.estaLigada)
  this.canal ++;
}

public void trocarCanalBaixo(){
  if(this.estaLigada){
  this.canal --;
  if(canal < 0) canal = 0;
  }
}

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
