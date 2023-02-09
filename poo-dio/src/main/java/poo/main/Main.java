package main;

import poo.dio.Bootcamp;
import poo.dio.Cursos;
import poo.dio.Devs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Cursos> cursos = new LinkedHashSet<>();
        Cursos curso1 = new Cursos("Java", 120);
        Cursos curso2 = new Cursos("SQL", 80);
        Cursos curso3 = new Cursos("Métodos ágeis", 40);
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        Set<Devs> devs = new HashSet<>();
        Devs dev1 = new Devs("Rafael", "rafael@email.com");
        Devs dev2 = new Devs("Camila", "camila@email.com");


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setCursos(cursos);
        bootcamp.setNome("JAVA DEVELOPER");
        bootcamp.setDescricao("Bootcamp para Desenvolvedor Java");

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println("Cursos que o Rafael se inscreveu " + dev1.getCursosInscritos());
        System.out.println("Cursos que a Camila se inscreveu " + dev2.getCursosInscritos());
        System.out.println();
// Os dois devs tem todos os cursos inscritos, ainda não terminaram nenhum

        dev1.progredir();
        dev2.progredir();
        dev2.progredir();
// dev2 fez um curso a mais que o dev1

        System.out.println("Cursos que o Rafael ainda não terminou: " + dev1.getCursosInscritos());
        System.out.println("Cursos que o Rafael terminou: " + dev1.getCursosConcluidos());
        System.out.println("Total de XP do Rafael: " + dev1.calcularTotalXp());

        System.out.println();

        System.out.println("Cursos que a Camila ainda não terminou: " + dev2.getCursosInscritos());
        System.out.println("Cursos que a Camila terminou: " + dev2.getCursosConcluidos());
        System.out.println("Total de XP da Camila: " + dev2.calcularTotalXp());

    }
}