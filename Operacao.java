class Operacao {

  Logador logador = new Logador();
  Conta oriConta = new Conta();
  Conta desConta = new Conta();
  float valor;
  private int numeroContaOri = oriConta.getNumero();
  private int numeroContaDes = desConta.getNumero();

  public Operacao() {
    
  }
  
  public void transfere(int ori,int des,float valor) {
    
  }

  public void debitar(float valor) {
    
  }

  public void creditar(float valor) {
    
  }

  public void imprimir() {
    logador.imprimir("retirada", numeroContaOri, valor);
    logador.imprimir("deposito", numeroContaDes, valor);
  }

}