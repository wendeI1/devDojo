package academy.devdojo.maratonajava.introducao;

public class Aula06Continue {
    public static void main(String[] args) {
        int valorTotal = 40000;

        for (int parcela = valorTotal; parcela >= 1; parcela--){
            int valorParcela = valorTotal/parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println(valorParcela + parcela);
        }
    }
}
