package academy.devdojo.maratonajava.introducao;

public class Aula07Array03 {
    public static void main(String[] args) {

        String[] nomes = new String[5];

        nomes[0] = "Wendel";
        nomes[1] = "Itadori";
        nomes[2] = "Frodo";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        //o for apresentado na pt04 faz isso
    }
}
