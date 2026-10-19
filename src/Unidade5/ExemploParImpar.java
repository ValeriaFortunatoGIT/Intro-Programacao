package Unidade5;

public class ExemploParImpar {
public static void main(String[] args) {
    for(int i = 0; i <=100;i++){
        if(i % 2 ==0){
            System.out.println(i + " é par");
        }else{
            System.out.println(i + " é impar");
        }
    }
//somente par
    for(int i = 100; i < 1000; i++){
        if(i % 2 == 0){
            System.out.println(i);
        }
    }
}
}
