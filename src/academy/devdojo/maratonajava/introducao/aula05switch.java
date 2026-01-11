package academy.devdojo.maratonajava.introducao;

import java.util.Random;

public class aula05switch {
    public static void main(String[] args) {
        //Informe se o dia é util ou fds com base no dia da semana

        Random random = new Random();
        int dia = random.nextInt(8);

        System.out.println(dia);

        switch (dia){
            default:
                System.out.println("Valor fora dos dias da semana.");
                break;
            case 1:
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Dia util");
                break;
            case 3:
                System.out.println("Dia util");
                break;
            case 4:
                System.out.println("Dia utili");
                break;
            case 5:
                System.out.println("Dia util");
                break;
            case 6:
                System.out.println("Dia util");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
        }
    }
}
