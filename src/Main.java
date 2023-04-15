import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;import static java.awt.SystemColor.menu;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao(" descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao(" descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bottcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.IncreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosIncritos());

        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-----------");

        Dev devJackson = new Dev();
        devJackson.setNome("Jackson");
        devJackson.IncreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jackson:" + devJackson.getConteudosIncritos());
        devJackson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jackson:" + devJackson.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Jackson:" + devJackson.getConteudosConcluidos());
        System.out.println("XP:" + devJackson.calcularTotalXp());






    }
}