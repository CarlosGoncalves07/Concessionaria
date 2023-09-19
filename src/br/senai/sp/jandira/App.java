package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Menu;
import br.senai.sp.jandira.model.Veiculo;

public class App {
    public static void main(String[] args) {

        System.out.println("/-/-/-/-/-/--/-/-/-/-/-/-/-/");
        System.out.println("/-        Bem Vindo       -/");
        System.out.println("/-      Agência Senai     -/");
        System.out.println("/-/-/-/-/-/--/-/-/-/-/-/-/-/");

        Menu objMenu = new Menu();
        objMenu.menu();

    }

}
