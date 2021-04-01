class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Cozinha cozMin = new Cozinha();
    cozMin.tipo = "Mineira";
    cozMin.numeroPratos = 10;
    cozMin.tempoPreparo = 30;
    cozMin.numeroCozinheiros = 10;
    cozMin.horaAbertura = 14;
    cozMin.horaFecha = 20;
    cozMin.pratoPrincipal = "Feijoada";
    cozMin.ingredientes = ("Feijão", "Farinha", "Arroz", "Carne de Porco", "Linguiça");
    cozMin.funcionario = ("Paulo", "Arthur");

    Cozinha cozIt = new Cozinha();
    cozIt.tipo = "Italiana";
    cozIt.numeroPratos = 30;
    cozIt.tempoPreparo = 20;
    cozIt.numeroCozinheiros = 50;
    cozIt.horaAbertura = 13;
    cozIt.horaFecha = 22;
    cozIt.pratoPrincipal = "Yaksoba";
    cozIt.ingredientes = ("Molho", "Macarrão", "Carne");
    cozIt.funcionario = ("Pedro", "Felipe");

    Cozinha cozChi = new Cozinha();
    cozChi.tipo = "Chinesa";
    cozChi.numeroPratos = 15;
    cozChi.tempoPreparo = 20;
    cozChi.numeroCozinheiros = 30;
    cozChi.horaAbertura = 10;
    cozChi.horaFecha = 21;
    cozChi.pratoPrincipal = "Yaksoba";
    cozChi.ingredientes = ("Champion", "Brócolis", "Macarrão", "Carne");
    cozChi.funcionario = ("Carlos", "Diego");

  }
}