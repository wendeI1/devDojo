package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.marca = "Chevrolet";
        carro.ano = 2010;
        carro.modelo = "Tucson";

        carro1.marca = "Wolkswagen";
        carro1.ano = 2020;
        carro1.modelo = "Polo";

        System.out.println(carro.modelo + carro.marca + carro.ano);
        System.out.println(carro1.modelo + carro1.marca + carro1.ano);
    }
}
