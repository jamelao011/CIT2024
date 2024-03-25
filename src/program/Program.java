package program;

import java.util.Scanner;
import processo.Processo;
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Processo processo = new Processo();
        processo.N = N;
        processo.calculo(sc);
                
                if (processo.resultado == 0){
            System.out.println("Expressão inválida");
        }else {
            System.out.println(processo.resultado);
        }
        sc.close();
    }

}
