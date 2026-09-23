package Unidade4;

public class ClassificaIdade {
public static void main(String[] args) {
    int idade = 19;
    if(idade >=18){
        System.out.println("Adulto");
    }else{
        if(idade<=6){
            System.out.println("Bebe da mamãe");
        }else{
            System.out.println("Criança");
        }
    }
}
}
