import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> lista_de_pontos = new ArrayList<Integer>();

        char input;
        String inputNome = "";
        int pontos = 0;

        //loop infinito até break
        do {

            System.out.print("Quer começar o quiz? [s/n] ");
            input = ler.next().charAt(0);

            //S continua o código, N quebra o loop e qualquer outro manda uma mensagem de erro e loopa.
            do {
                try {
                    if (input != 'n' && input != 'N' && input != 's' && input != 'S') {
                        throw new RuntimeException();
                    }
                    break;
                } catch (RuntimeException e) {
                    System.out.print("Entrada inválida. Tente novamente: ");
                    input = ler.next().charAt(0);
                }
            } while (input != 'n' && input != 'N' && input != 's' && input != 'S');

            if (input == 'n' || input == 'N') {
                break;
            }

            ler.nextLine();
            System.out.print("Escreva seu nome: ");

            do {
                try {
                    inputNome = ler.nextLine();

                    if (inputNome.isEmpty()) {
                        throw new RuntimeException();
                    }
                    nomes.add(inputNome);
                } catch (RuntimeException e) {
                    System.out.print("Nome não informado. Tente novamente: ");
                }
            } while (inputNome.isEmpty());

            //perguntinhas

            do {
                try {
                    System.out.println("1) Qual é a principal difereça еntrе аѕ рlасаѕ dе trаnѕіtо dе соr vеrmеlhа (fundо brаnсо соm bоrdаѕ е dеѕеnhоѕ еm vеrmеlhо) е аѕ dе соr аmаrеlа (fundо аmаrеlо соm bоrdаѕ е dеѕеnhоѕ еm рrеtо)?");
                    System.out.println("A) Vermelhas são utilizadas em regiões urbanas e as amarelas em rodovias.");
                    System.out.println("B) Vermelhas são regulamentares e as amarelas são relativas a advertências."); //certo
                    System.out.println("C) Vermelhas são proibitivas e amarelas são permitivas.");
                    System.out.println("D) Vermelhas são oficiais e constantes na lei, as amarelas não.");
                    System.out.println("E) Vermelhas são utilizadas em regiões quentes e as amarelas em regiões mais frias.");
                    System.out.print("Resposta: ");
                    input = ler.next().charAt(0);

                    if (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E') {
                        throw new RuntimeException();
                    } else if (input == 'b' || input == 'B') {
                        pontos++;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Resposta invalida. Tente novamente: ");
                }
            } while (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E');

            do {
                try {
                    System.out.println("2) А рlаса dе аdvеrtênсіа quе ѕіmbоlіzа “аnіmаіѕ ѕеlvаgеnѕ”, quе аdvеrtе ао соndutоr dо vеíсulо раrа а роѕѕіbіlіdаdе dе рrеѕеnçа, аdіаntе, dе аnіmаіѕ ѕеlvаgеnѕ nа vіа, é rерrеѕеntаdа реlо dеѕеnhо dе quаl аnіmаl?");
                    System.out.println("A) Leão");
                    System.out.println("B) Tigre");
                    System.out.println("C) Cervo"); //certo
                    System.out.println("D) Girafa");
                    System.out.println("E) Tamanduá");
                    System.out.print("Resposta: ");
                    input = ler.next().charAt(0);

                    if (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E') {
                        throw new RuntimeException();
                    } else if (input == 'b' || input == 'B') {
                        pontos++;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Resposta invalida. Tente novamente: ");
                }
            } while (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E');

            do {
                try {
                    System.out.println("3) А рlаса dе rеgulаmеntаçãо dе “рrоіbіdо еѕtасіоnаr” é rерrеѕеntаdа реlа lеtrа Е соm umа fаіха trаnѕvеrѕаl nа соr vеrmеlhа. О quе rерrеѕеntа еѕtа mеѕmа рlаса, роrém соm duаѕ fаіхаѕ trаnѕvеrѕаіѕ еm fоrmа dе Х?");
                    System.out.println("A) Proibido estacionar nos dois sentidos.");
                    System.out.println("B) Proibido estacionar em 45 graus.");
                    System.out.println("C) Proibido estacionar de ré.");
                    System.out.println("D) Proibido parar e estacionar."); //certo
                    System.out.println("E) Proibido parar em fila dupla.");
                    System.out.print("Resposta: ");
                    input = ler.next().charAt(0);

                    if (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E') {
                        throw new RuntimeException();
                    } else if (input == 'b' || input == 'B') {
                        pontos++;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Resposta invalida. Tente novamente: ");
                }
            } while (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E');

            do {
                try {
                    System.out.println("4) Qual o significado da placa de transito representada por um triângulo invertido (de cabeça para baixo) vermelho?");
                    System.out.println("A) Alfândega.");
                    System.out.println("B) Obras na pista.");
                    System.out.println("C) Dê a preferência."); //certo
                    System.out.println("D) Reduza a velocidade para fiscalização.");
                    System.out.println("E) Estreitamento de pista."); 
                    System.out.print("Resposta: ");
                    input = ler.next().charAt(0);

                    if (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E') {
                        throw new RuntimeException();
                    } else if (input == 'b' || input == 'B') {
                        pontos++;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Resposta invalida. Tente novamente: ");
                }
            } while (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E');

            do {
                try {
                    System.out.println("5) Um condutor que teve sua CNH cassada poderá requerer sua reabilitação após");
                    System.out.println("A) 1 ano");
                    System.out.println("B) 2 anos"); //certo
                    System.out.println("C) 3 anos");
                    System.out.println("D) 6 meses");
                    System.out.println("E) 5 anos"); 
                    System.out.print("Resposta: ");
                    input = ler.next().charAt(0);

                    if (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E') {
                        throw new RuntimeException();
                    } else if (input == 'b' || input == 'B') {
                        pontos++;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Resposta invalida. Tente novamente: ");
                }
            } while (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E');

            do {
                try {
                    System.out.println("6) Dirigir veículo sem possuir a Carteira de Habilitação ou Permissão para Dirigir é uma infração");
                    System.out.println("A) grave");
                    System.out.println("B) média");
                    System.out.println("C) leve");
                    System.out.println("D) gravíssima"); //certo
                    System.out.println("E) não é uma infração"); 
                    System.out.print("Resposta: ");
                    input = ler.next().charAt(0);

                    if (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E') {
                        throw new RuntimeException();
                    } else if (input == 'b' || input == 'B') {
                        pontos++;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Resposta invalida. Tente novamente: ");
                }
            } while (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E');

            do {
                try {
                    System.out.println("7) ");
                    System.out.println("A) ");
                    System.out.println("B) ");
                    System.out.println("C) ");
                    System.out.println("D) ");
                    System.out.println("E) ");
                    System.out.print("Resposta: ");
                    input = ler.next().charAt(0);

                    if (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E') {
                        throw new RuntimeException();
                    } else if (input == 'b' || input == 'B') {
                        pontos++;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Resposta invalida. Tente novamente: ");
                }
            } while (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E');

            do {
                try {
                    System.out.println("8) ");
                    System.out.println("A) ");
                    System.out.println("B) ");
                    System.out.println("C) ");
                    System.out.println("D) ");
                    System.out.println("E) ");
                    System.out.print("Resposta: ");
                    input = ler.next().charAt(0);

                    if (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E') {
                        throw new RuntimeException();
                    } else if (input == 'b' || input == 'B') {
                        pontos++;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Resposta invalida. Tente novamente: ");
                }
            } while (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E');

            do {
                try {
                    System.out.println("9) ");
                    System.out.println("A) ");
                    System.out.println("B) ");
                    System.out.println("C) ");
                    System.out.println("D) ");
                    System.out.println("E) "); 
                    System.out.print("Resposta: ");
                    input = ler.next().charAt(0);

                    if (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E') {
                        throw new RuntimeException();
                    } else if (input == 'b' || input == 'B') {
                        pontos++;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Resposta invalida. Tente novamente: ");
                }
            } while (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E');

            do {
                try {
                    System.out.println("10) ");
                    System.out.println("A) ");
                    System.out.println("B) ");
                    System.out.println("C) ");
                    System.out.println("D) ");
                    System.out.println("E) "); 
                    System.out.print("Resposta: ");
                    input = ler.next().charAt(0);

                    if (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E') {
                        throw new RuntimeException();
                    } else if (input == 'b' || input == 'B') {
                        pontos++;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Resposta invalida. Tente novamente: ");
                }
            } while (input != 'a' && input != 'A' && input != 'b' && input != 'B' && input != 'c' && input != 'C' && input != 'd' && input != 'D' && input != 'e' && input != 'E');

            //printa os pontos, adiciona-os em uma lista e zera-os para o proximo jogador
            System.out.println("você fez " + pontos + " pontos");
            lista_de_pontos.add(pontos);
            pontos = 0;

        } while (true);


        //bubble sort de nomes e pontos
        int aux = 0;
        String auxString;

        for(int i = 0; i < lista_de_pontos.size(); i++){
            for(int j = 0; j < lista_de_pontos.size()-1; j++){
                if(lista_de_pontos.get(j) < lista_de_pontos.get(j+1)){
                    aux = lista_de_pontos.get(j);
                    auxString = nomes.get(j);

                    lista_de_pontos.set(j, lista_de_pontos.get(j+1));
                    lista_de_pontos.set(j+1, aux);

                    nomes.set(j, nomes.get(j+1));
                    nomes.set(j+1, auxString);
                }
            }
        }


        //printar ranking
        if (nomes.isEmpty() == false) {
            System.out.println("Rodada terminada!\nRanking:");
            for (int i = 0; i < nomes.size(); i++) {
                System.out.printf("%sº lugar: %s - %s pontos\n", i+1, nomes.get(i), lista_de_pontos.get(i));
            }
            }
        
        ler.close();
    }
}
