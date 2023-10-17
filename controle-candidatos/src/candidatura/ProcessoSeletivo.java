package candidatura;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    System.out.println("Processo Seletivo");
    // analisarCandidato(1900.0);
    // selecaoDeCandidatos();
    // imprimirSelecionados();
    String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "MONICA", "FABRICIO", "DANIELA", "JHON", "FRANCISCA", "JULIO" };
    for (String candidato : candidatos) {
      entrandoEmcontato(candidato);
    }
  }

  static void entrandoEmcontato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do{
      atendeu = atender();
      continuarTentando = !atendeu;

      if(continuarTentando){
         tentativasRealizadas++;
      }
      else{
        System.out.println("CONTATO REALIZADO COM SUCESSO!!");
      }
    }while(continuarTentando && tentativasRealizadas <3);
    
    if(atendeu){
      System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
      
    }else{

      System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXMO TENTATIVAS " + tentativasRealizadas + " REALIZADA.");
    }
  }

static boolean atender(){
  return new Random().nextInt(3)==1;
}

  static void imprimirSelecionados(){
    String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "MONICA", "FABRICIO", "DANIELA", "JHON", "FRANCISCA", "JULIO" };
    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

    for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
    }
    for (String cand : candidatos) {
      System.out.println("O candidato selecionado foi " + cand);
      
    }

  }

  static void selecaoDeCandidatos() {
    String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "MONICA", "FABRICIO", "DANIELA", "JHON", "FRANCISCA", "JULIO" };

    int candidatoSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    while (candidatoSelecionados < 5 && candidatosAtual < candidatos.length) {
      String candidato = candidatos[candidatosAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
      if(salarioBase >= salarioPretendido){
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
        candidatoSelecionados++;
      }
      candidatosAtual++;
    }
  }

  static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800,2200);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {

      System.out.println("PLIGAR PARA O CANDIDATO");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
    } else {
      System.out.println("AGUARDANDO O RESULTAOD DOS DEMAIS CANDIDATOS");
    }
  }
}