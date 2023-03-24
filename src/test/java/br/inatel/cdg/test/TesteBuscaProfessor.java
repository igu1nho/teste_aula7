package br.inatel.cdg.test;

import br.inatel.cdg.BuscaProfessor;
import br.inatel.cdg.Professor;
import br.inatel.cdg.ProfessorService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaProfessor {

    ProfessorService service;
    BuscaProfessor buscaProfessor;

    @Before
    public void setup(){
        //Criando o contexo do meu teste com o Mock (serviço mock)
        service = new MockProfessorService();
        buscaProfessor = new BuscaProfessor(service);
    }

    //Testes sucessivos, aos quais são baseados nos professores do Inatel
    //Sucesso 1
    @Test
    public void testeBuscaProfessorChris(){

        //Fazer uma busca
        Professor chris = buscaProfessor.buscaProfessor(214);

        //Faz assertion
        assertEquals("Chris Lima", chris.getNome());
        assertEquals("sexta-feira, as 17:30", chris.getH_atendimento());
        assertEquals("noturno", chris.getPeriodo());
        assertEquals(18, chris.getSala());
        assertEquals(4, chris.getPredio());

    }

    //Sucesso 2
    @Test
    public void testeBuscaProfessorVitor(){

        //Fazer uma busca
        Professor vitor = buscaProfessor.buscaProfessor(205);

        //Faz assertion
        assertEquals("Vitor Alexandre", vitor.getNome());
        assertEquals("quarta-feira, as 17:30", vitor.getH_atendimento());
        assertEquals("noturno", vitor.getPeriodo());
        assertEquals(22, vitor.getSala());
        assertEquals(6, vitor.getPredio());

    }

    //Sucesso 3
    @Test
    public void testeBuscaProfessorRenan(){

        //Fazer uma busca
        Professor renan = buscaProfessor.buscaProfessor(8);

        //Faz assertion
        assertEquals("Renan Duque", renan.getNome());
        assertEquals("segunda-feira, as 13:30", renan.getH_atendimento());
        assertEquals("integral", renan.getPeriodo());
        assertEquals(15, renan.getSala());
        assertEquals(3, renan.getPredio());

    }

    //Sucesso 4
    @Test
    public void testeBuscaProfessorRenzo(){

        //Fazer uma busca
        Professor renzo = buscaProfessor.buscaProfessor(202);

        //Faz assertion
        assertEquals("Renzo Paranaiba", renzo.getNome());
        assertEquals("quarta-feira, as 17:30", renzo.getH_atendimento());
        assertEquals("noturno", renzo.getPeriodo());
        assertEquals(18, renzo.getSala());
        assertEquals(4, renzo.getPredio());

    }

    //Sucesso 5
    @Test
    public void testeBuscaProfessorMarcelo(){

        //Fazer uma busca
        Professor marcelo = buscaProfessor.buscaProfessor(210);

        //Faz assertion
        assertEquals("Marcelo Vinicius", marcelo.getNome());
        assertEquals("terca-feira, as 19:30", marcelo.getH_atendimento());
        assertEquals("noturno", marcelo.getPeriodo());
        assertEquals(19, marcelo.getSala());
        assertEquals(4, marcelo.getPredio());

    }

    //Sucesso 6
    @Test
    public void testeBuscaProfessorLeandro(){

        //Fazer uma busca
        Professor leandro = buscaProfessor.buscaProfessor(9);

        //Faz assertion
        assertEquals("Leandro Mucciaroni", leandro.getNome());
        assertEquals("quinta-feira, as 10:00", leandro.getH_atendimento());
        assertEquals("integral", leandro.getPeriodo());
        assertEquals(3, leandro.getSala());
        assertEquals(1, leandro.getPredio());

    }

    //Sucesso 7
    @Test
    public void testeBuscaProfessorSoned(){

        //Fazer uma busca
        Professor soned = buscaProfessor.buscaProfessor(20);

        //Faz assertion
        assertEquals("Edson Josias", soned.getNome());
        assertEquals("segunda-feira, as 19:30", soned.getH_atendimento());
        assertEquals("noturno", soned.getPeriodo());
        assertEquals(14, soned.getSala());
        assertEquals(3, soned.getPredio());

    }

    //Sucesso 8
    @Test
    public void testeBuscaProfessorBruno(){

        //Fazer uma busca
        Professor bruno = buscaProfessor.buscaProfessor(100);

        //Faz assertion
        assertEquals("Bruno Oliveira", bruno.getNome());
        assertEquals("sexta-feira, as 8:00", bruno.getH_atendimento());
        assertEquals("integral", bruno.getPeriodo());
        assertEquals(3, bruno.getSala());
        assertEquals(1, bruno.getPredio());

    }

    //Sucesso 9
    @Test
    public void testeBuscaProfessorLuis(){

        //Fazer uma busca
        Professor luis = buscaProfessor.buscaProfessor(5);

        //Faz assertion
        assertEquals("Luis Felipe", luis.getNome());
        assertEquals("terca-feira, as 17:30", luis.getH_atendimento());
        assertEquals("noturno", luis.getPeriodo());
        assertEquals(7, luis.getSala());
        assertEquals(2, luis.getPredio());

    }

    //Sucesso 10
    @Test
    public void testeBuscaProfessorIgor(){

        //Fazer uma busca
        Professor igor = buscaProfessor.buscaProfessor(111);

        //Faz assertion
        assertEquals("Igor Luiz", igor.getNome());
        assertEquals("quinta-feira, as 10:00", igor.getH_atendimento());
        assertEquals("integral", igor.getPeriodo());
        assertEquals(10, igor.getSala());
        assertEquals(2, igor.getPredio());
    }

    //Ao tentar implementar o banco, o estágiario acabou misturando os bancos do Inatel, com a GamersClub
    //e os professores da GC acabaram indo para o banco do Inatel
    //Falha 1
    @Test
    public void testeBuscaProfessorInValido(){

        //Faz a busca de um inimigo inválido (id não cadastrado)
        boolean professorValido = buscaProfessor.verificaArrayListExistente(300);

        assertFalse(professorValido);
    }


    //Falha 2
    @Test
    public void testeBuscaProfessorFallen(){

        //Fazer uma busca
        Professor fallen = buscaProfessor.buscaProfessor(301);

        //Faz assertion
        assertEquals("Inexistente", fallen.getNome());
        assertEquals("Inexistente", fallen.getH_atendimento());
        assertEquals("Inexistente", fallen.getPeriodo());
        assertEquals(0, fallen.getSala());
        assertEquals(0, fallen.getPredio());

    }

    //Falha 3
    @Test
    public void testeBuscaProfessorColdzera(){

        //Fazer uma busca
        Professor coldzera = buscaProfessor.buscaProfessor(302);

        //Faz assertion
        assertEquals("Inexistente", coldzera.getNome());
        assertEquals("Inexistente", coldzera.getH_atendimento());
        assertEquals("Inexistente", coldzera.getPeriodo());
        assertEquals(0, coldzera.getSala());
        assertEquals(0, coldzera.getPredio());

    }

    //Falha 4
    @Test
    public void testeBuscaProfessorFerGod(){

        //Fazer uma busca
        Professor fer = buscaProfessor.buscaProfessor(303);

        //Faz assertion
        assertEquals("Inexistente", fer.getNome());
        assertEquals("Inexistente", fer.getH_atendimento());
        assertEquals("Inexistente", fer.getPeriodo());
        assertEquals(0, fer.getSala());
        assertEquals(0, fer.getPredio());

    }

    //Falha 5
    @Test
    public void testeBuscaProfessorTaco(){

        //Fazer uma busca
        Professor taco = buscaProfessor.buscaProfessor(304);

        //Faz assertion
        assertEquals("Inexistente", taco.getNome());
        assertEquals("Inexistente", taco.getH_atendimento());
        assertEquals("Inexistente", taco.getPeriodo());
        assertEquals(0, taco.getSala());
        assertEquals(0, taco.getPredio());

    }
    //Falha 6
    @Test
    public void testeBuscaProfessorFnx(){

        //Fazer uma busca
        Professor fnx = buscaProfessor.buscaProfessor(305);

        //Faz assertion
        assertEquals("Inexistente", fnx.getNome());
        assertEquals("Inexistente", fnx.getH_atendimento());
        assertEquals("Inexistente", fnx.getPeriodo());
        assertEquals(0, fnx.getSala());
        assertEquals(0, fnx.getPredio());

    }

    //Falha 7
    @Test
    public void testeBuscaProfessorFelps(){

        //Fazer uma busca
        Professor felps = buscaProfessor.buscaProfessor(306);

        //Faz assertion
        assertEquals("Inexistente", felps.getNome());
        assertEquals("Inexistente", felps.getH_atendimento());
        assertEquals("Inexistente", felps.getPeriodo());
        assertEquals(0, felps.getSala());
        assertEquals(0, felps.getPredio());

    }

    //Falha 8
    @Test
    public void testeBuscaProfessorHEN1(){

        //Fazer uma busca
        Professor hen1 = buscaProfessor.buscaProfessor(307);

        //Faz assertion
        assertEquals("Inexistente", hen1.getNome());
        assertEquals("Inexistente", hen1.getH_atendimento());
        assertEquals("Inexistente", hen1.getPeriodo());
        assertEquals(0, hen1.getSala());
        assertEquals(0, hen1.getPredio());

    }

    //Falha 9
    @Test
    public void testeBuscaProfessorLUCAS1(){

        //Fazer uma busca
        Professor lucas = buscaProfessor.buscaProfessor(308);

        //Faz assertion
        assertEquals("Inexistente", lucas.getNome());
        assertEquals("Inexistente", lucas .getH_atendimento());
        assertEquals("Inexistente", lucas .getPeriodo());
        assertEquals(0, lucas .getSala());
        assertEquals(0, lucas .getPredio());

    }

    //Falha 10
    @Test
    public void testeBuscaProfessorSteelega(){

        //Fazer uma busca
        Professor steel = buscaProfessor.buscaProfessor(309);

        //Faz assertion
        assertEquals("Inexistente", steel.getNome());
        assertEquals("Inexistente", steel.getH_atendimento());
        assertEquals("Inexistente", steel.getPeriodo());
        assertEquals(0, steel.getSala());
        assertEquals(0, steel.getPredio());

        }
}
