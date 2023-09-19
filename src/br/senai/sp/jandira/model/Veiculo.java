package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculo {
    String modelo, marca, cor, placa, combustivel;
    double preco;
    int ano;

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

public boolean pesquisarVeiculo( String veiculoPesuqisado){
    for (Veiculo veiculo : listVeiculos){
            if(veiculo.modelo.equalsIgnoreCase(veiculoPesuqisado)){
                modelo = teclado.nextLine();
                return true;
            }
    }
    return false;
}

}
