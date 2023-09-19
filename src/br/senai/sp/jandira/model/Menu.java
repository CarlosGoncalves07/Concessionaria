package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Cliente refListCliente = new Cliente();
    Funcionario refListFuncionario = new Funcionario();
    Veiculo refListVeiculo = new Veiculo();

    Scanner teclado = new Scanner(System.in);
    Cliente cliente = new Cliente();
    Funcionario funcionario = new Funcionario();
    Venda objVenda = new Venda();
    Veiculo veiculo = new Veiculo();


    public void menu(){

        boolean continuar = true;

        while(continuar){



            System.out.println("----------------------------");
            System.out.println("----------   Menu  ---------");
            System.out.println("----------------------------");
            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Cadastrar Veiculo");
            System.out.println("3- Cadastrar Funcionario");
            System.out.println("4- Realizar Venda");
            System.out.println("5- Listar Veiculos");
            System.out.println("6- Listar Clientes");
            System.out.println("7- Listar Funcionario");
            System.out.println("8- Pesquisar Veiculo");
            System.out.println("9- Sair");
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");

            int escolhaUsuario = teclado.nextInt();
            teclado.nextLine();


            switch (escolhaUsuario){


                case 1:
                    Cliente objCliente = new Cliente();
                    objCliente.cadastrarCliente();
                    refListCliente.adicionarCliente(objCliente);
                    break;

                case 2:
                    Veiculo objVeiculo = new Veiculo();
                    objVeiculo.cadastarVeiculo();
                    Veiculo RefListVeiculo;
                    refListVeiculo.adicionarVeiculo(objVeiculo);
                    break;

                case 3:
                    Funcionario objFuncionario = new Funcionario();
                    objFuncionario.cadastrarFuncionario();
                    refListFuncionario.adicionarFuncionario(objFuncionario);
                    break;

                case 4:
                   boolean validaVenda = objVenda.realizarVenda(veiculo, cliente);
                   if (validaVenda){
                       cliente.dinheiroDisponivel -= veiculo.preco;
                       System.out.println("O saldo do cliente é: " + cliente.dinheiroDisponivel);
                   }
                    break;

                case 5:
                    refListVeiculo.listarVeiculos();
                    break;

                case 6:
                    refListCliente.listarCliente();
                    break;

                case 7:
                    refListFuncionario.listarFuncionario();

                    break;

                case 8:
                    System.out.println("Informe qual modelo do veiculo: ");
                    String veiculoPesquisado = teclado.nextLine();
                    boolean validaVeiculo = false;


                    if (veiculoPesquisado != null && veiculoPesquisado != ""){
                        validaVeiculo = veiculo.pesquisarVeiculo(veiculoPesquisado);
                    }else {
                        System.out.println("Impossivel realizar pesquisa!"
                        );
                    }

                    if(validaVeiculo){
                        System.out.println("Veículo disponível para compra");
                    }else {
                        System.out.println("Veículo indisponível");
                    }
                    break;

                case 9:
                    continuar = false;
                    break;
            }

            if (escolhaUsuario < 1 || escolhaUsuario > 9){
                System.out.println("Escolha uma opção Válida !");
            }

        }



    }

}
