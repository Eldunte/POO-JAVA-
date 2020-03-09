package poo;

import java.util.Scanner;
import poo.Pessoa;

public class POO {

    public static void main(String[] args) {

        boolean ok = false;
        int n = 0;
        String msg1 = "Valor invalido";
        String msg2 = "Tamanho inválido";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");

        while (!ok) {
            try {
                n = sc.nextInt();
                ok = true;
                if(n>=0){
                System.out.println(msg2);
               
                }
            } catch (Exception e) {
                System.out.println(msg1);
                sc.nextLine();
            }
        }

        Pessoa[] repositorio = new Pessoa[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados da Pessoa da posição " + i);
            repositorio[i] = new Pessoa(sc.next(), sc.nextInt(),
                    sc.next().charAt(0), sc.nextLong());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nome..." + repositorio[i].getNome());
            System.out.println("Idade.." + repositorio[i].getIdade());
            System.out.println("Sexo..." + repositorio[i].getSexo());
            System.out.println("CPF...." + repositorio[i].getCPF());
            System.out.println();
        }
    }
}