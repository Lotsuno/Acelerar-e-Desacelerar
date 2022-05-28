public class carro {
    String marca, cor;
    Integer velocidade, ano;
    

void aceleracao(Integer acelerar){
     velocidade += acelerar;
   }

void freio(Integer freiar){
      velocidade -= freiar;
   }

}