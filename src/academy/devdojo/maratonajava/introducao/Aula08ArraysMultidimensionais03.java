package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais03 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1, 2, 3, 4, 5};
        arrayInt[1] = new int[]{1, 2, 3, 4, 5};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5};
        //ou tambem

        int[][] arrayInt2 = {{1, 2, 3}, {4, 5, 6}, {1, 2, 3}};

        for (int[] arrayBase : arrayInt2){
            System.out.println("\n------");
            for(int i: arrayBase){
                System.out.print(i);
            }
        }
    }
}
