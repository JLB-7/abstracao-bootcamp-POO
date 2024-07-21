import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(80);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJorge = new Dev();
        devJorge.setNome("Jorge");
        devJorge.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJorge.getConteudosInscritos());
        System.out.println("-");
        devJorge.progredir();
        devJorge.progredir();
        System.out.println("Conteúdos inscritos: " + devJorge.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devJorge.getConteudosConcluidos());
        System.out.println("XP: " + devJorge.calcularTotalXp());

        System.out.println("----------");

        Dev devLuis = new Dev();
        devLuis.setNome("Luís");
        devLuis.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devLuis.getConteudosInscritos());
        System.out.println("-");
        devLuis.progredir();
        devLuis.progredir();
        devLuis.progredir();
        System.out.println("Conteúdos inscritos: " + devLuis.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devLuis.getConteudosConcluidos());
        System.out.println("XP: " + devLuis.calcularTotalXp());

    }
}