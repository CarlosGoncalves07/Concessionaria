package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Venda {


    Scanner teclado = new Scanner(System.in);

    public boolean realizarVenda(Veiculo objVeiculo, Cliente objCliente) {
        if (objCliente.dinheiroDisponivel >= objVeiculo.preco) {


            System.out.println("Ola " + objCliente.nome);
            System.out.println("------Informe o veiculo escolhido------");
            teclado.nextLine();
            System.out.println("----Parabens otima escolha----");
            System.out.println("Você acaba de adquirir um " + objVeiculo.modelo);
            System.out.println("No precinho de " + objVeiculo.preco);
        } else {
            boolean b = objCliente.dinheiroDisponivel < objVeiculo.preco;}{

            System.out.println("Escolha um veiculo mais compativel com a sua realdade");


            return true;


        }


    }


    }
