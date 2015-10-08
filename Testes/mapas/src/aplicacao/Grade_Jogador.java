/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

/**
 *
 * @author Douglas
 */
public class Grade_Jogador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JfMapa tela2 = new JfMapa();
        Ferramemtas ff = new Ferramemtas();
        carrega car = new carrega();
        
        car.setVisible(true);
        ff.setVisible(true);
        tela2.setVisible(true);
        
    }
    
}
