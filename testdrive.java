public class testdrive {
    public static  void main(String[] args){

      carro c1 = new carro();
      c1.marca = "Duster";
      c1.cor = "Vermelho";
      c1.velocidade = 100;
      c1.ano = 2020;
      c1.aceleracao(50);
      System.out.println("Veículo: "+ c1.marca +" | Ano: "+ c1.ano +" | Cor: "+ c1.cor +" | Velocidade atual: "+ c1.velocidade +" Km/h");

      carro c2 = new carro();
      c2.marca = "Ferrari";
      c2.cor = "Vermelho";
      c2.velocidade = 240;
      c2.ano = 2025;
      c2.freio(200);
    System.out.println("Veículo: "+ c2.marca +" | Ano: "+ c2.ano +" | Cor: "+ c2.cor +" | Velocidade atual: "+ c2.velocidade +" Km/h");

    }
}