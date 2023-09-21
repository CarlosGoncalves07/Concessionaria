package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Cliente refListCliente = new Cliente();
    Funcionario refListFuncionario = new Funcionario();
    Veiculo refListVeiculo = new Veiculo();

    Scanner teclado = new Scanner(System.in);
    Venda objVenda = new Venda();

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
                    refListVeiculo.adicionarVeiculo(objVeiculo);
                    break;

                case 3:
                    Funcionario objFuncionario = new Funcionario();
                    objFuncionario.cadastrarFuncionario();
                    refListFuncionario.adicionarFuncionario(objFuncionario);
                    break;

                case 4:
                    refListCliente.listCliente();
                    System.out.println("Informe o nome do cliente: ");
                    String nomeComprador = teclado.nextLine();

                    refListVeiculo.listarVeiculos();
                    System.out.println("Informe o modelo do veiculo: ");
                    String modeloVeiculo = teclado.nextLine();

                    refListFuncionario.listFuncionario();
                    System.out.println("Informe o nome do vendedor: ");
                    String nomeVendedor = teclado.nextLine();

                    Cliente objComprador = refListCliente.pesquisarComprador(nomeComprador);

                    Veiculo objVeiculoVenda = refListVeiculo.localizarVeiculoCompra(modeloVeiculo);

                    Funcionario objVendedor = refListFuncionario.pesquisarVendedor(nomeVendedor);

                    boolean formaPagamento = objVenda.avaliaFormaPagamento();

                    boolean validaVenda = false;
                    boolean validaFinanciamento = false;

                    if (formaPagamento) {
                        validaVenda = objVenda.realizarVenda(objVeiculoVenda, objComprador);
                    } else {
                        validaFinanciamento = objVenda.realizarFinanciamento(objComprador, objVeiculoVenda);
                    }

                    if (validaVenda || validaFinanciamento){

                        System.out.println("//// ---- Parabens ---- ////");
                        objComprador.dinheiroDisponivel -= objVeiculoVenda.preco;
                        System.out.println("");

                       objComprador.dinheiroDisponivel -= objVeiculoVenda.preco;
                       System.out.println("O saldo do cliente é: " + objComprador.dinheiroDisponivel);

                       objVendedor.receberComissao(objVeiculoVenda);
                       System.out.println("O funcionario recebeu: " + objVendedor.comissao);
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
                        validaVeiculo = refListVeiculo.pesquisarVeiculo(veiculoPesquisado);
                    }else {
                        System.out.println("Impossivel realizar pesquisa!");
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
                default:
                    throw new IllegalStateException("Unexpected value: " + escolhaUsuario);
            }

            if (escolhaUsuario < 1 || escolhaUsuario > 9){
                System.out.println("Escolha uma opção Válida !");
            }

        }



    }

}
