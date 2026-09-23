package Unidade4;

public class FasesDaVida {
public static void main(String[] args) {
    int idade = 5;
    String resultado;
    if(idade >= 0 && idade <=5){
        resultado = "Bebe da mamae";
    }else if(idade >= 6 && idade <=12){
        resultado = "Criança";
    }else if(idade >=13 && idade<= 18){
        resultado = "Adolescente";
    }else if(idade >= 18 && idade <=60){
        resultado = "Adulto";
    }else{
        resultado = "Melhor Idade";
    }
}
}
