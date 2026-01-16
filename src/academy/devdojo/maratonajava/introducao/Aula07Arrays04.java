package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {

        int[] numeros2 = {1, 2, 3, 4, 5}; //INCRIVEL!

//        for (int i = 0; i < numeros2.length; i++) {
//            System.out.println(numeros2[i]);
//        }

        for(int numeros : numeros2){ //esse for n é possivel acessar o indice, ou seja, uma ver simplificada do de cima
            System.out.println(numeros);
        }
    }
}
