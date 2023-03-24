package br.inatel.cdg.test;

import br.inatel.cdg.ProfessorService;

import java.util.ArrayList;

public class MockProfessorService implements ProfessorService {

    @Override
    public String busca(int id) {

        if (id == 214){
            return ProfessorConst.Chris;
        }else if (id == 205){
            return ProfessorConst.Vitor;
        }else if (id == 8){
            return ProfessorConst.Renan;
        }else if (id == 202){
            return ProfessorConst.Renzo;
        }else if (id == 210){
            return ProfessorConst.Marcelo;
        }else if (id == 111){
            return ProfessorConst.Igor;
        }else if (id == 100){
            return ProfessorConst.Bruno;
        }else if (id == 9){
            return ProfessorConst.Leandro;
        }else if (id == 5){
            return ProfessorConst.Luis;
        }else if (id == 20){
            return ProfessorConst.Soned;
        }else if (id >= 300){
            return ProfessorConst.INEXISTENTE;
        }
        else
            return ProfessorConst.INEXISTENTE;
    }

    @Override
    public boolean ProfessorExistente(int id) {
        //Aceitando somente IDs informados, referentes as matriculas dos professores
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(214);
        list.add(205);
        list.add(8);
        list.add(202);
        list.add(210);
        list.add(111);
        list.add(100);
        list.add(9);
        list.add(5);
        list.add(20);

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(id) || list.get(i).equals(id)){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }
}
