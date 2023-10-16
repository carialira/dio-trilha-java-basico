public class SmartTv{
  boolean ligada = false;
  int canal = 1;
  int volume = 12;

  public void mudarCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Trocando para o canal: " + canal);
  }

  public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }
  public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
  }

  public void ligar(){
    ligada = true;
      System.out.println("Ligando a TV");
  }
  public void desligar(){
    ligada = false;
  }
}