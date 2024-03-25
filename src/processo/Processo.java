package processo;

import java.util.Scanner;

public class Processo {
    public int N;
    public int resultado = 0;

    public Processo() {}

    public int calculo(Scanner sc){        
        int soma=0;
        if(N>=1 && N<=10) {
            for (int i=0; i < N; i++) {
                int termo = sc.nextInt();
                if (termo>=10 && termo<=9999) {
                    int base = termo/10;
                    int expoente = termo%10;
                    soma += Math.pow(base, expoente);
                }else {
            resultado = 0;
            return resultado;
                }
            }
        }
    resultado = soma;
    return resultado;              
    }
}
