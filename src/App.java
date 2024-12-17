import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> lista_de_pontos = new ArrayList<Integer>();
        char input;
        int pontos = 0;

        do {
            System.out.print("Quer começar o quiz? [s/n] ");
            input = ler.nextLine().charAt(0);

            if (input == 'n' || input == 'N') {
                break;
            } else if (input == 's' || input == 'S');
            else {
                System.out.println("Entrada inválida! abortando!");
                break;
            }

            System.out.print("Escreva seu nome: ");
            nomes.add(ler.nextLine());

            System.out.println("1. Qual a velocidade máxima permitida em vias urbanas, salvo sinalização em contrário?");
            System.out.println("A) 30 km/h");
            System.out.println("B) 50 km/h"); //certo
            System.out.println("C) 60 km/h");
            System.out.println("D) 80 km/h");
            System.out.println("E) 100 km/h");
            System.out.print("Resposta: ");
            input= ler.nextLine().charAt(0);
            
            if (input == 'b' || input == 'B') {
                pontos++;
            }

            System.out.println("2. O uso do cinto de segurança é obrigatório para: ");
            System.out.println("A) Apenas o motorista");
            System.out.println("B) Apenas os passageiros da frente");
            System.out.println("C) Apenas para crianças");
            System.out.println("D) Todos os ocupantes do veículo"); //certo
            System.out.println("E) Somente para passageiros acima de 18 anos");
            System.out.print("Resposta: ");
            input= ler.nextLine().charAt(0);

            if (input == 'b' || input == 'B') {
                pontos++;
            }

            System.out.println("3. Qual a idade mínima para conduzir uma motocicleta no Brasil?");
            System.out.println("A) 14 Anos");
            System.out.println("B) 16 Anos");
            System.out.println("C) 17 Anos");
            System.out.println("D) 18 Anos"); //certo
            System.out.println("E) 21 Anos");
            System.out.print("Resposta: ");
            input= ler.nextLine().charAt(0);

            if (input == 'b' || input == 'B') {
                pontos++;
            }

            System.out.println("4. Qual o limte de pontos na CNH para que o condutor tenha sua habilitação suspensa, considerando o limite padrão?");
            System.out.println("A) 20 pontos");
            System.out.println("B) 30 pontos");
            System.out.println("C) 40 pontos"); //certo
            System.out.println("D) 50 pontos");
            System.out.println("E) 60 pontos");
            System.out.print("Resposta: ");
            input= ler.nextLine().charAt(0);
            if (input == 'b' || input == 'B') {
                pontos++;
            }


            System.out.println("5. Segundo o Código de Trânsito Brasileiro (CTB), o que caracteriza uma infração gravíssima multiplicada por três (fator multiplicador)?");
            System.out.println("A) Estacionar em local proibido");
            System.out.println("B) Ultrapassar em faixa contínua");
            System.out.println("C) irigir sob efeito de álcool"); //certo
            System.out.println("D) Não usar cinto de segurança");
            System.out.println("E) Transitar na contramão em via de mão única");
            System.out.print("Resposta: ");
            input= ler.nextLine().charAt(0);

            if (input == 'b' || input == 'B') {
                pontos++;
            }

            System.out.println("6. Qual dessas infrações pode levar à cassação direta da CNH?");
            System.out.println("A) Não portar documento do veículo");
            System.out.println("B) Estacionar em vaga de idoso sem permissão");
            System.out.println(""); //certo
            System.out.println("");
            System.out.println("");
            System.out.print("Resposta: ");
            input= ler.nextLine().charAt(0);

            if (input == 'b' || input == 'B') {
                pontos++;
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(""); //certo
            System.out.print("Resposta: ");
            input= ler.nextLine().charAt(0);

            if (input == 'b' || input == 'B') {
                pontos++;
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(""); //certo
            System.out.println("");
            System.out.println("");
            System.out.print("Resposta: ");
            input= ler.nextLine().charAt(0);

            if (input == 'b' || input == 'B') {
                pontos++;
            }

            System.out.println(""); 
            System.out.println(""); //certo
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.print("Resposta: ");
            input= ler.nextLine().charAt(0);

            if (input == 'b' || input == 'B') {
                pontos++;
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(""); //certo
            System.out.println("");
            System.out.print("Resposta: ");
            input= ler.nextLine().charAt(0);

            if (input == 'b' || input == 'B') {
                pontos++;
            }

            System.out.println("você fez " + pontos + " pontos");
            lista_de_pontos.add(pontos);
            pontos = 0;

        } while (true);


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


        System.out.println("Rodada terminada!\nRanking:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.printf("%sº lugar: %s - %s pontos\n", i+1, nomes.get(i), lista_de_pontos.get(i));
        }
        
        ler.close();
    }
}