/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Eduardo
 */
public class JFMestre extends javax.swing.JFrame {
  
    public void centralizarComponente(){
     Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
     Dimension dw = getSize();
     setLocation ((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
    
    public JFMestre() {
        initComponents();
        centralizarComponente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtcampanha = new javax.swing.JButton();
        jbtmapa = new javax.swing.JButton();
        jbtmissao = new javax.swing.JButton();
        jbtvariavel = new javax.swing.JButton();
        jbtcaminho = new javax.swing.JButton();
        jbtnpc = new javax.swing.JButton();
        jbtraça = new javax.swing.JButton();
        jbtclasse = new javax.swing.JButton();
        jbtarmadura = new javax.swing.JButton();
        jbtarma = new javax.swing.JButton();
        jbtescudo = new javax.swing.JButton();
        jbtconsumivel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtcampanha.setText("Campanhas");
        jbtcampanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtcampanhaActionPerformed(evt);
            }
        });

        jbtmapa.setText("Mapas / Missões");
        jbtmapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtmapaActionPerformed(evt);
            }
        });

        jbtmissao.setText("Personagens");
        jbtmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtmissaoActionPerformed(evt);
            }
        });

        jbtvariavel.setText("Posições");
        jbtvariavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtvariavelActionPerformed(evt);
            }
        });

        jbtcaminho.setText("Caminhos");
        jbtcaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtcaminhoActionPerformed(evt);
            }
        });

        jbtnpc.setText("NPC");
        jbtnpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpcActionPerformed(evt);
            }
        });

        jbtraça.setText("Raças");
        jbtraça.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtraçaActionPerformed(evt);
            }
        });

        jbtclasse.setText("Classes");
        jbtclasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtclasseActionPerformed(evt);
            }
        });

        jbtarmadura.setText("Armaduras");
        jbtarmadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtarmaduraActionPerformed(evt);
            }
        });

        jbtarma.setText("Armas");
        jbtarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtarmaActionPerformed(evt);
            }
        });

        jbtescudo.setText("Escudos");
        jbtescudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtescudoActionPerformed(evt);
            }
        });

        jbtconsumivel.setText("Consumíveis");
        jbtconsumivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtconsumivelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Menu de Cadastros - Mestre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtcampanha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtcaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnpc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtmapa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtvariavel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtclasse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtraça, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtarmadura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtarma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtescudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtconsumivel, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtcampanha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jbtraça, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtclasse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtmapa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtarmadura, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jbtcaminho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtarma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtvariavel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtescudo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnpc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtconsumivel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtcampanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtcampanhaActionPerformed
        // TODO add your handling code here:
        JFCampanhas cam = new JFCampanhas(); 
        cam.setVisible(true);
    }//GEN-LAST:event_jbtcampanhaActionPerformed

    private void jbtmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtmapaActionPerformed
        // TODO add your handling code here:
        JFMissoes mis = new JFMissoes();
        mis.setVisible(true);
        
    }//GEN-LAST:event_jbtmapaActionPerformed

    private void jbtmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtmissaoActionPerformed
        // TODO add your handling code here:
        JFPersonagem per = new JFPersonagem();
        per.setVisible(true);
    }//GEN-LAST:event_jbtmissaoActionPerformed

    private void jbtvariavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtvariavelActionPerformed
        // TODO add your handling code here:
        JFPosicoes pos = new JFPosicoes();
        pos.setVisible(true);
    }//GEN-LAST:event_jbtvariavelActionPerformed

    private void jbtcaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtcaminhoActionPerformed
        // TODO add your handling code here:
        JFCaminhos cami = new JFCaminhos();
        cami.setVisible(true);
    }//GEN-LAST:event_jbtcaminhoActionPerformed

    private void jbtnpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpcActionPerformed
        // TODO add your handling code here:
        JFNpc npc = new JFNpc();
        npc.setVisible(true);
    }//GEN-LAST:event_jbtnpcActionPerformed

    private void jbtraçaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtraçaActionPerformed
        // TODO add your handling code here:
       Formularios.JFRaca rac = new Formularios.JFRaca();
       rac.setVisible(true);
        
    }//GEN-LAST:event_jbtraçaActionPerformed

    private void jbtclasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtclasseActionPerformed
        // TODO add your handling code here:
        JFClasses cla = new JFClasses();
        cla.setVisible(true);
    }//GEN-LAST:event_jbtclasseActionPerformed

    private void jbtarmaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtarmaduraActionPerformed
        // TODO add your handling code here:
        JFArmaduras arm = new JFArmaduras();
        arm.setVisible(true);
    }//GEN-LAST:event_jbtarmaduraActionPerformed

    private void jbtarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtarmaActionPerformed
        // TODO add your handling code here:
        JFArmas arma = new JFArmas();
        arma.setVisible(true);
    }//GEN-LAST:event_jbtarmaActionPerformed

    private void jbtescudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtescudoActionPerformed
        // TODO add your handling code here:
        JFEscudos esc = new JFEscudos();
        esc.setVisible(true);
    }//GEN-LAST:event_jbtescudoActionPerformed

    private void jbtconsumivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtconsumivelActionPerformed
        // TODO add your handling code here:
        JFConsumiveis con = new JFConsumiveis();
        con.setVisible(true);
    }//GEN-LAST:event_jbtconsumivelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMestre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtarma;
    private javax.swing.JButton jbtarmadura;
    private javax.swing.JButton jbtcaminho;
    private javax.swing.JButton jbtcampanha;
    private javax.swing.JButton jbtclasse;
    private javax.swing.JButton jbtconsumivel;
    private javax.swing.JButton jbtescudo;
    private javax.swing.JButton jbtmapa;
    private javax.swing.JButton jbtmissao;
    private javax.swing.JButton jbtnpc;
    private javax.swing.JButton jbtraça;
    private javax.swing.JButton jbtvariavel;
    // End of variables declaration//GEN-END:variables
}
