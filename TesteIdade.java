package Banco;

import java.util.Scanner;

public class TesteIdade {
    public static void main(String[] args) {
        Idade nome1 = new Idade("Albert Einstein", 14, 3, 1879);
        Idade nome2 = new Idade("Isaac Newton", 4, 1, 1643);
  
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o Dia de Hoje: ");
        int diaHoje = scanner.nextInt();
    
        System.out.print("Informe o Mes: ");
        int mesHoje= scanner.nextInt();
        
        System.out.print("Informe o Ano: ");
        int anoHoje = scanner.nextInt();
        
        nome1.calculaIdade(diaHoje, mesHoje, anoHoje);
        nome2.calculaIdade(diaHoje, mesHoje, anoHoje);

       
        System.out.println("" + nome1.toString());
        System.out.println("" + nome2.toString() );
    }
}

