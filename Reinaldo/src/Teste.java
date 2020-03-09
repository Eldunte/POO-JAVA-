package com.mycompany.teste;

import java.util.LinkedList;
import java.util.Scanner;
import poo.Pessoa;

public class Teste {

    Scanner sc = new Scanner(System.in);
    Pessoa p = new Pessoa();
    LinkedList<Pessoa> repositorio = new LinkedList<Pessoa>();
    String msg1 = "Valor Inválido!";
    boolean ok = false;

    public static void main(String[] args) {
        Teste t = new Teste();
        int tamanho = t.defineTamanhoLista();
        for (int i = 0; i < tamanho; i++) {

            t.definePessoa();
            t.addPessoa();
        }
     
        t.exibePessoas();
        t.MudaNome();
        t.exibePessoas();

    }

    public int defineTamanhoLista() {
        System.out.println("Digite o tamanho da lista.");
        int n = 0;
        while (!ok) {
            try {
                n = sc.nextInt();
                if (n > 0) {
                    ok = true;
                } else {
                    System.out.println(msg1);
                }
            } catch (Exception e) {
                System.out.println(msg1);
                sc.nextLine();
            }
        }
        ok = false;
        return n;
    }

    public void defineNome() {
        System.out.println("Digite o nome");
        p.setNome(sc.next());
        while (p.getNome().matches("^[a-zA-ZÁ ÃÀÇ"
                + "ÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$") == false) {
            System.out.println(msg1);
            p.setNome(sc.next());
        }

    }

    public void defineIdade() {
        System.out.println("Digite a idade");
        while (!ok) {
            try {
                p.setIdade(sc.nextInt());
                ok = true;
            } catch (Exception e) {
                System.out.println(msg1);
                sc.nextLine();
            }
        }
        ok = false;
    }

    public void defineSexo() {
        System.out.println("Digite o sexo");
        while (!ok) {
            p.setSexo(sc.next().charAt(0));
            if (p.getSexo() == 'f' || p.getSexo() == 'F'
                    || p.getSexo() == 'm' || p.getSexo() == 'M') {
                ok = true;
            } else {
                System.out.println(msg1);
                sc.nextLine();
            }
        }
        ok = false;
    }

    public void defineCpf() {
        System.out.println("Digite o CPF");
        while (!ok) {
            try {
                p.setCPF(sc.nextLong());
                ok = true;
            } catch (Exception e) {
                System.out.println(msg1);
                sc.nextLine();
            }
        }
        ok = false;
    }

    public void definePessoa() {
        p = new Pessoa();
        defineNome();
        defineIdade();
        defineSexo();
        defineCpf();

    }

    public void addPessoa() {
        repositorio.add(p);
    }

    public long digitaCPF() {
        long CPFprv = 0;
        System.out.println("Digite o CPF");
        while (!ok) {
            try {
                CPFprv = sc.nextLong();
                ok = true;

            } catch (Exception e) {

            }

        }

        ok = false;

        return CPFprv;
    }

    public void exibePessoas() {
        for (Pessoa p : repositorio) {
            System.out.println("Nome:.." + p.getNome());
            System.out.println("Idade:." + p.getIdade());
            System.out.println("Sexo:.." + p.getSexo());
            System.out.println("CPF:..." + p.getCPF());
            System.out.println();
        }
    }

    public void MudaNome() {

        for (Pessoa p : repositorio) {
            if (digitaCPF() == p.getCPF()) {
                defineNome();

            } else {

            }
            {
                System.out.println("CPF não encontrado");
            }
        }
    }

}