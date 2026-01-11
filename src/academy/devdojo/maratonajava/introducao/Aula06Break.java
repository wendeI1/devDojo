package academy.devdojo.maratonajava.introducao;

public class Aula06Break {
    public static void main(String[] args) {
        // Dado o valor de um carro, descruba em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        int valorTotal = 40000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            int valorParcela = valorTotal/parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela: " + parcela + "\nValor: R$" + valorParcela );
                System.out.println("----------------");
            }else{
                break;
            }
        }
    }
}
