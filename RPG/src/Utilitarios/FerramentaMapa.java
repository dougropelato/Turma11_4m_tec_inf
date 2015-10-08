/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Alexjonas
 */
public class FerramentaMapa {

    public static FerramentaMapa instance;

    public static FerramentaMapa getInstance() {
        if (instance == null) {
            instance = new FerramentaMapa();
        }
        return instance;
    }

    String nome_ferramenta;

    List<JLabel> lista = new ArrayList();

    public List<JLabel> getLista() {
        return lista;
    }

    public void setLista(List<JLabel> lista) {
        this.lista = lista;
    }

    public void addLista(JLabel componet) {
        this.lista.add(componet);
    }

    public String getNome_ferramenta() {
        return nome_ferramenta;
    }

    public void setNome_ferramenta(String nome_ferramenta) {
        this.nome_ferramenta = nome_ferramenta;
    }

}
