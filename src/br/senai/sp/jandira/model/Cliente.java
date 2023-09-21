package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    /**
     * Declarar Variaveis
     *
     * */
    public String nome, email, endereco;
    public long telefone, cpf, rg;

    public double dinheiroDisponivel;

    /** Instancia o Scanner */
    Scanner teclado = new Scanner(System.in);

    List<Cliente> listCliente = new ArrayList<>();

    public void cadastrarCliente(){

        System.out.println("---------  Cadastro Cliente  ---------");
        System.out.println("Qual é o nome do Cliente: ");
        nome = teclado.nextLine();
        System.out.println("Informe o CPF: ");
        cpf = teclado.nextLong();
        System.out.println("Informe o RG: ");
        rg = teclado.nextLong();
        System.out.println("Informe o Telefone: ");
        telefone = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Informe o email: ");
        email = teclado.nextLine();
        System.out.println("Informe o endereço: ");
        endereco = teclado.nextLine();
        System.out.println("Informe quanto você tem: [R$] ");
        dinheiroDisponivel = teclado.nextDouble();
        System.out.println("--------  Cadastro Finalizado  ---------");
        System.out.println("----------------------------------------");


    }

    public void adicionarCliente(Cliente objCliente){
        listCliente.add(objCliente);
    }

    public void listarCliente(){
    for(Cliente objCliente : listCliente) {
        System.out.println(objCliente.nome);
        }
    
    }
    
    public Cliente pesquisarComprador(String nomeComprador){
        
        for (Cliente cliente : listCliente){
            if (cliente.nome.equalsIgnoreCase(nomeComprador)){
                return cliente;
                
            }
        }
        return null;
    }

    public void listCliente() {
    }
}
