package EstudosProva;

import java.util.Scanner;

public class Exe27 {
public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);

    int horaChegada, minChegada, horaSaida, minSaida;
    int chegadaMinutos, saidaMinutos; //Guarda os horários convertidos para minutos
    int horasEstacionamento, minutosEstacionamento; //Guarda as horas e os minutos do estacionamento
    int tempoMinutosEstacionada; //Guarda o tempo total que a pessoa ficou estacionada
    float preco; //Guarda o preço que será cobrado

    System.out.println("Digite a sua hora de chegada:");
    horaChegada = sc.nextInt();

    System.out.println("Digite os minutos da sua chegada: ");
    minChegada = sc.nextInt();

    System.out.println("Digite a hora da sua saida: ");
    horaSaida = sc.nextInt();

    System.out.println("Digite os minutos da sua saida: ");
    minSaida = sc.nextInt();


    //ver se as entradas sao validas
    if(horaSaida < horaChegada || horaChegada < 0  || horaChegada > 23 || horaSaida < 0 || horaSaida > 23 || minChegada < 0 || minChegada > 59 || minSaida < 0 || minSaida > 59 ){
        System.out.println("Entrada inválida");

    //ver se as entradas sao validas
    }else if(horaSaida == horaChegada && minSaida < minChegada){
        System.out.println("O horario de saida deve ser depois do horario de chegada! ");

    }else{
        //converter o horario de chegada para minutos
        chegadaMinutos = horaChegada * 60 + minChegada;

        //Converte o horário de saída inteiro para minutos
        saidaMinutos = horaSaida * 60 + minSaida;

        //Calcula quantos minutos a pessoa ficou estacionada
        tempoMinutosEstacionada = saidaMinutos - chegadaMinutos;

        //Descobre quantas horas completas foram usadas
        horasEstacionamento = tempoMinutosEstacionada / 60;

        //Descobre quantos minutos sobraram
        minutosEstacionamento = tempoMinutosEstacionada % 60;

    //Se sobraram 30 minutos ou mais, arredonda para a próxima hora             
    if (minutosEstacionamento >= 30){
        horasEstacionamento++;

    //Se ficou menos de 30 minutos, cobra pelo menos 1 hora
    }if(horasEstacionamento == 0){
        horasEstacionamento = 1;

    //Calcula o preço de acordo com a quantidade de horas    
    }if(horasEstacionamento <= 2){

        //A 1ª e a 2ª hora custam R$ 5,00 cada
        preco = horasEstacionamento * 5.0f;

    }else if(horasEstacionamento <= 4){
        // As 2 primeiras horas custam R$ 5,00
        // As horas restantes custam R$ 7,50
        preco = 2 * 5.0f + (horasEstacionamento - 2) * 7.50f;

    }else{
        // As 2 primeiras horas custam R$ 5,00
        // A 3ª e a 4ª hora custam R$ 7,50 
        // As horas restantes custam R$ 10,00
        preco = 2 * 5.0f + 2 *  7.50f + (horasEstacionamento - 4) * 10.0f;
    }

    // Mostra o tempo que a pessoa ficou estacionada
    System.out.println("Tempo estacionado: " + horasEstacionamento + " horas:");

    // Mostra o preço com duas casas decimais
    System.out.printf("Preço cobrado = R$%.2f%n", preco);    
}
}
}
