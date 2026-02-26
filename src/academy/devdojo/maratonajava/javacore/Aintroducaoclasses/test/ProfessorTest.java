package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Luiz";
        professor.idade = 24;
        professor.sexo = 'm';

        System.out.println("nome: " + professor.nome + "\nidade: " + professor.idade + "\nsexo: " + professor.sexo);
    }
}

// altamente coeso é muito bom!!!! 1 proposito por classe