    package br.inatel.cdg;

    import com.google.gson.JsonArray;
    import com.google.gson.JsonObject;
    import com.google.gson.JsonParser;

    public class BuscaProfessor {

        ProfessorService professorService;

        public BuscaProfessor(ProfessorService service){
            this.professorService = service;
        }

        public Professor buscaProfessor(int id) {
            // id = 214-> buscando um Professor de ID 214
            //ProfessorJson é uma string que retornou do serviço
            String professorJson = professorService.busca(id);

            //jsonObject é um objeto JSON feito a partir da string de retonro
            JsonObject jsonObject = JsonParser.parseString(professorJson).getAsJsonObject();

            // obtém o array JSON do objeto JSON
            JsonArray predioJsonArray = jsonObject.getAsJsonArray("predio");

            // converte o array JSON em um array de strings
            String[] predioArray = new String[predioJsonArray.size()];
            for (int i = 0; i < predioJsonArray.size(); i++) {
                predioArray[i] = predioJsonArray.get(i).getAsString();
            }
                return new Professor(jsonObject.get("nomeDoProfessor").getAsString(),
                        jsonObject.get("horarioDeAtendimento").getAsString(),
                        jsonObject.get("periodo").getAsString(),
                        jsonObject.get("sala").getAsInt(),
                        predioArray);
            }
            public boolean verificaArrayListExistente ( int id){
                boolean ProfessorExistente = professorService.ProfessorExistente(id);

                if (ProfessorExistente) {
                    return true;
                } else {
                    return false;
                }
            }
        }
