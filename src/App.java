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
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(""); //certo
                    System.out.print("Resposta: ");
                    input= ler.next().charAt(0);

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
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(""); //certo
                    System.out.print("Resposta: ");
                    input= ler.next().charAt(0);

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
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(""); //certo
                    System.out.print("Resposta: ");
                    input= ler.next().charAt(0);

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
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(""); //certo
                    System.out.print("Resposta: ");
                    input= ler.next().charAt(0);

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
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(""); //certo
                    System.out.print("Resposta: ");
                    input= ler.next().charAt(0);

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
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(""); //certo
                    System.out.print("Resposta: ");
                    input= ler.next().charAt(0);

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
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(""); //certo
                    System.out.print("Resposta: ");
                    input= ler.next().charAt(0);

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
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(""); //certo
                    System.out.print("Resposta: ");
                    input= ler.next().charAt(0);

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
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(""); //certo
                    System.out.print("Resposta: ");
                    input= ler.next().charAt(0);

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
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(""); //certo
                    System.out.print("Resposta: ");
                    input= ler.next().charAt(0);

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