package Unidade5;

public class ExemploComWhile {
public static void main(String[] args) {
    int numero = 0;
    while(true){
        if(numero % 2 ==0){
            System.out.println(numero);
        }
        numero++;
        if(numero >=1000){
            continue;
        }
        System.out.println("oi");
        if(numero>1010){
            break;
        }
    }
}
}
