/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitários;

import Formularios.JFPrincipal;
import Tabelas.PericiaPersonagem;
import Tabelas.TalentosPersonagem;
import dao.GenericDAO;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import tabelas.Caminhos;
import tabelas.Campanhas;
import tabelas.Pericias;
import tabelas.Personagens;
import tabelas.Posicoes;
import tabelas.Talentos;

/**
 *
 * @author Alexjonas
 */
public class Utilitarios {
    
    public void caminhos () throws SQLException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, 
            InvocationTargetException, InstantiationException, ClassNotFoundException {
        GenericDAO gDAO = new GenericDAO();
        Caminhos caminhos = new Caminhos();
        Campanhas campanha = new Campanhas();
        Posicoes posicoes = new Posicoes();

        //localiza a campanha selecionada
        campanha.setCodigo_campanha(2);  //precisa de uma verificação da campanha que o usuario seleciona
        List<Object> list = gDAO.listar2(Campanhas.class, campanha);
        for (Object obj2 : list) {
            Campanhas c = (Campanhas) obj2;
            jTextArea1.setText("Bem vindo a campanha " + c.getNome_campanha() + " \n "); //mostra nome da campanha 
            jlCampanha.setText(c.getNome_campanha());
        }

        jTextArea1.setText(jTextArea1.getText() + "Deseja seguir que caminho? \n ");

        //Lista os caminhos para o jogador selecionar o desejado
        caminhos.setCodigo_campanha(campanha.getCodigo_campanha());
        List<Object> list2 = gDAO.listar2(Caminhos.class, caminhos);

        for (Object obj3 : list2) {
            Caminhos ca= (Caminhos) obj3;
            jTextArea1.setText(jTextArea1.getText() + ca.getCodigo_caminho() + " - " + ca.getNome_caminho() + " \n ");
        }
    }
    
    public void posicoes(){
        Posicoes posicoes = new Posicoes();
        GenericDAO gDAO = new GenericDAO();

        posicoes.setCodigo_caminho(posi);
        List<Object> list3 = gDAO.listar2(Posicoes.class, posicoes);

        for (Object obj4 : list3) {
            Posicoes p = (Posicoes) obj4;

            arrayListDescPosicao.add(posicoes.getDescricao_posicao());
            System.out.println(posicoes.getDescricao_posicao());
        }
    }
    public static void aplicaTalento(Personagens pp, Talentos tts) throws SQLException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException {

        GenericDAO gd = new GenericDAO();

        String sql = "NOK";

        TalentosPersonagem tp = new TalentosPersonagem();

        List<Object> lista = null;
        lista = gd.listar2(Talentos.class, tts);
        String bns = null;
        String pre = null;

        for (Object obj : lista) {
            Talentos tt = (Talentos) obj;
            bns = tt.getBonus_talento();
            pre = tt.getRequisito_talento();

        }

        String[] bonus = bns.split(";");
        String[] req = pre.split(";");

        if (req[0].equalsIgnoreCase("personagens")) {
            lista = gd.listar2(Personagens.class, pp);
            for (Object obj : lista) {
                Personagens pps = (Personagens) obj;

                Class cls = Personagens.class;
                Field listaAtributos[] = cls.getDeclaredFields();

                for (int i = 0; i < listaAtributos.length; i++) {

                    Field fld = listaAtributos[i];
                    fld.setAccessible(true);
                    String campo = fld.getName();

                    if (campo.equalsIgnoreCase(bonus[1])) {
                        if (Integer.getInteger((String) fld.get(pps)) <= Integer.getInteger(req[2])) {
                            sql = "OK";

                        }
                    }
                }
            }
        }
        if (req[0].equalsIgnoreCase("Pericias")) {

            PericiaPersonagem PPS = new PericiaPersonagem();
            PPS.setCodigo_personagem(pp.getCodigo_personagem());
            PPS.setCodigo_pericia(tts.getCodigo_talento());

            lista = gd.listar2(PericiaPersonagem.class, PPS);

            for (Object obj2 : lista) {
                PericiaPersonagem ett1 = (PericiaPersonagem) obj2;

                if (ett1.getPontos_de_pericia() <= Integer.valueOf(req[2])) {
                    sql = "OK";
                }
            }
        }

        if (sql.equalsIgnoreCase("OK")) {

            if (bonus[0].equalsIgnoreCase("personagens")) {
                sql = "UPDATE " + bonus[0] + " SET ";
                int bnn = 0;

                Class cls = Personagens.class;
                Field listaAtributos[] = cls.getDeclaredFields();

                for (int i = 0; i < listaAtributos.length; i++) {

                    Field fld = listaAtributos[i];
                    fld.setAccessible(true);
                    String campo = fld.getName();

                    if (campo.equalsIgnoreCase(bonus[1])) {

                        bnn = Integer.valueOf(fld.get(pp).toString());
                        bnn = bnn + Integer.valueOf(bonus[2]);
                        sql += campo + " = '" + bnn + "'";

                    }
                }

                sql += " WHERE codigo_personagem = " + pp.getCodigo_personagem();

                System.out.println(sql);
                gd.executaSql(sql);
            }

            if (bonus[0].equalsIgnoreCase("Pericias")) {
                sql = "UPDATE Periciapersonagem SET ";

                int bnn = Integer.parseInt(bonus[2]);
                int codgobous = 0;
                Pericias pp2 = new Pericias();
                pp2.setNome_pericia(bonus[1]);
                lista = gd.listar2(Pericias.class, pp2);

                for (Object obj : lista) {
                    Pericias ett = (Pericias) obj;
                    codgobous = ett.getCodigo_pericia();
                }

                PericiaPersonagem PPS = new PericiaPersonagem();
                PPS.setCodigo_personagem(pp.getCodigo_personagem());
                PPS.setCodigo_pericia(codgobous);

                lista = gd.listar2(PericiaPersonagem.class, PPS);

                for (Object obj2 : lista) {
                    PericiaPersonagem ett1 = (PericiaPersonagem) obj2;
                    bnn = ett1.getPontos_de_pericia() + bnn;
                }

                PPS.setPontos_de_pericia(bnn);
                gd.alterar(PPS);
            }

        } else {
            System.out.println("Voçe nao tem os requisitos necessarios para este Telento");
        }

    }

}
