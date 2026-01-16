package academy.devdojo.maratonajava.introducao;

public class Aula07Array01 {
    public static void main(String[] args) {

        int[] idades = new int[10];

        for (int i = 1; i < idades.length; i ++){
            idades[i] = i;
        }

        idades[9] = 5;

        System.out.println(idades[9]);
    }
}
