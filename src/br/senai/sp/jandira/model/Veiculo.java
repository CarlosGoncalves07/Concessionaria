package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculo {
    public String modelo, marca, cor, placa, combustivel;
    public double preco;
    public int ano;
    public String modeloVeiculo;

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);


    List<Veiculo> listVeiculos = new ArrayList<>();

    public void cadastarVeiculo(){

        System.out.println("---------  Cadastro Veiculo  ---------");
        System.out.println("Informe a Marca: ");
        marca = teclado.next();
        System.out.println("Informe o Modelo: ");
        modelo = teclado.next();
        System.out.println("Informe a cor: ");
        cor = teclado.next();
        System.out.println("Informe o combustivel: ");
        combustivel = teclado.next();
        System.out.println("Informe o ano: ");
        ano = teclado.nextInt();
        System.out.println("Informe o Preço: ");
        preco = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("--------  Cadastro Finalizado  ---------");
        System.out.println("----------------------------------------");

    }

public void adicionarVeiculo(Veiculo ObjVeiculo){
        listVeiculos.add(ObjVeiculo);


}

public void listarVeiculos(){
    for (Veiculo veiculo : listVeiculos){
        System.out.println(veiculo.modelo);
    }
}

public boolean pesquisarVeiculo(String veiculoPesuqisado){
    for (Veiculo veiculo : listVeiculos){
            if(veiculo.modelo.equalsIgnoreCase(veiculoPesuqisado)){
                return true;
            }
    }
    return false;
}

public Veiculo localizarVeiculoCompra(String modeloVeiculo) {

    for (Veiculo veiculo : listVeiculos) {
        if (veiculo.modelo.equalsIgnoreCase(modeloVeiculo)) {
            return veiculo;
        }
    }
    return null;
}


}
