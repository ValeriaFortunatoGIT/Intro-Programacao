package Unidade5;

public class Uni5Exe02 {
public static void main(String[] args) {
    
    int totalimpar =0, totalpar = 0;

    for(int i = 1; i <=100; i++){
    if(i % 2 ==0){
        totalpar = totalpar + i;
    }else{
        totalimpar = totalimpar + i;
    }
    }

    System.out.println("Soma de numeros pares: " + totalpar);
    System.out.println("Soma de numeros impares: " + totalimpar);
}
}
