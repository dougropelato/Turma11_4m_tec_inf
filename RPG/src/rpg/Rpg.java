/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import Tabelas.PericiaPersonagem;
import Tabelas.TalentosPersonagem;
import dao.GenericDAO;
import formularios.JFMestre;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import tabelas.Armas;
import tabelas.Pericias;
import tabelas.Personagens;
import tabelas.Talentos;

/**
 *
 * @author Douglas
 */
public class Rpg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException {

//        JFMestre m = new JFMestre();;
//        m.setVisible(true);
        Personagens pp = new Personagens();

        pp.setCodigo_personagem(1);

        Talentos tts = new Talentos();

        tts.setCodigo_talento(6);

        aplicaTalento(pp, tts);

    }

    public static void aplicaTalento(Personagens pp, Talentos tts) throws SQLException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException {

        GenericDAO gd = new GenericDAO();
        String sql = "";

        TalentosPersonagem tp = new TalentosPersonagem();

        List<Object> lista = null;
        lista = gd.listar2(Talentos.class, tts);
        String bns = null;

        for (Object obj : lista) {
            Talentos tt = (Talentos) obj;
            bns = tt.getBonus_talento();
        }

        String[] bonus = bns.split(";");

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

            System.out.println(bonus[2]);
            sql += " Pontos_de_pericia = " + bnn + "";
            sql += " WHERE codigo_personagem = " + pp.getCodigo_personagem() + " AND Codigo_pericia = " + codgobous;
        }
        gd.executaSql(sql);
    }
}
