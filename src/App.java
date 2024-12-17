import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        char input;
        ArrayList respostasU = new ArrayList();
        ArrayList respostasR = new ArrayList(Arrays.asList('b', 'd', 'd', 'c', 'c', 'e', 'c', 'a', 'b', 'd'));
        System.out.println(respostasR);

        do {
            System.out.print("Quer começar o quiz? [s/n] ");
            input = ler.next().charAt(0);

            if (input != 's' && input != 'S') {
                break;
            }

            System.out.println("1. Qual a velocidade máxima permitida em vias urbanas, salvo sinalização em contrário?");
            System.out.println("A) 30 km/h");
            System.out.println("B) 50 km/h"); //certo
            System.out.println("C) 60 km/h");
            System.out.println("D) 80 km/h");
            System.out.println("E) 100 km/h");
            System.out.print("Resposta: ");
            respostasU.add(ler.next().charAt(0));

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(""); //certo
            System.out.println("");
            System.out.print("Resposta: ");
            respostasU.add(ler.next().charAt(0));

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(""); //certo
            System.out.println("");
            System.out.print("Resposta: ");
            respostasU.add(ler.next().charAt(0));

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(""); //certo
            System.out.println("");
            System.out.println("");
            System.out.print("Resposta: ");
            respostasU.add(ler.next().charAt(0));

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(""); //certo
            System.out.println("");
            System.out.println("");
            System.out.print("Resposta: ");
            respostasU.add(ler.next().charAt(0));

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(""); //certo
            System.out.println("");
            System.out.println("");
            System.out.print("Resposta: ");
            respostasU.add(ler.next().charAt(0));

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(""); //certo
            System.out.print("Resposta: ");
            respostasU.add(ler.next().charAt(0));

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(""); //certo
            System.out.println("");
            System.out.println("");
            System.out.print("Resposta: ");
            respostasU.add(ler.next().charAt(0));

            System.out.println(""); 
            System.out.println(""); //certo
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.print("Resposta: ");
            respostasU.add(ler.next().charAt(0));

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(""); //certo
            System.out.println("");
            System.out.print("Resposta: ");
            respostasU.add(ler.next().charAt(0));

        } while (true);
        
        ler.close();
    }
}