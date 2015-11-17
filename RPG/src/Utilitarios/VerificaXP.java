/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitários;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Micro10
 */
public class VerificaXP {
    
    private Connection conexao;
    
    public int XP(int nivel_pers, int qtd_Npc)
            throws SQLException, IllegalAccessException, NoSuchMethodException,
            IllegalArgumentException, InvocationTargetException,
            InstantiationException, ClassNotFoundException {

        int xp = 0;

        String sql = "SELECT xp_pdm WHERE Nivel_jogador_pdm ="+nivel_pers+"and ND_pdm=" +qtd_Npc;

        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        ResultSet rset = stmt.executeQuery();

        while (rset.next()) {

            xp = rset.getInt("xp_pdm");
        }

        rset.close();
        stmt.close();

        return xp;
    }
    
}
