/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import aplicacao.JfMapa;

/**
 *
 * @author Douglas
 */
public class Criacao_de_mapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JfMapa tela2 = new JfMapa();
        Ferramemtas ff = new Ferramemtas();
        JFCarregaMapa car = new JFCarregaMapa();

        car.setVisible(true);
        ff.setVisible(true);
        tela2.setVisible(true);

    }

}
