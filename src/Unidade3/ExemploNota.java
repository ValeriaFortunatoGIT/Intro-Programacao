package Unidade3;

public class ExemploNota {
public static void main(String[] args) {
    float nota = 2.3f;
    if(nota >= 7){
        System.out.println("Aprovado");
    }else if(nota >= 3 && nota <7){
        System.out.println("Recuperação");
    }else{
        System.out.println("Reprovado");
    }
}
}
