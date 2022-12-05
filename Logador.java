import java.util.Date;

class Logador {

  Date date = new Date();
  long time = date.getTime();

  public Logador() {
  }

  public void imprimir(String texto, int numeroConta, float valor) {
    System.out.println(time + texto + valor);
  }
  
}