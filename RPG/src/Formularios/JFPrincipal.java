/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Color;
import java.awt.Container;
import Tabelas.Autenticacao;
import dao.GenericDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import Utilitarios.VerificaComandos;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexjonas
 */
public class JFPrincipal extends javax.swing.JFrame {
    
    Autenticacao auth = Autenticacao.getInstance();
    
    public static JFPrincipal instance;
    
    public static JFPrincipal getInstance() throws SQLException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InstantiationException, InvocationTargetException, ClassNotFoundException {
        if (instance == null) {
            instance = new JFPrincipal();
        }
        return instance;
    }
    
    int posi = 0;
    ArrayList arrayListDescPosicao = new ArrayList();
    VerificaComandos vercom = new VerificaComandos();
    
    public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    /**
     * Creates new form formprincipal
     */
    public JFPrincipal() throws SQLException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        initComponents();
        centralizarComponente();
        jLnome_campanha.setText("");
        jLnome_jogador.setText("");
        jLnome_personagem.setText("");
        jLvida_personagem.setText("");
        
        Container c = getContentPane();
//        c.setBackground(Color.WHITE); // Define a cor de fundo
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //  setSize(1000, 1000);
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLnome_jogador = new javax.swing.JLabel();
        jLnome_personagem = new javax.swing.JLabel();
        jLvida_personagem = new javax.swing.JLabel();
        jLnome_campanha = new javax.swing.JLabel();
        jLstatus = new javax.swing.JLabel();
        jpAraDePintar = new jPintar();
        jbPericias = new javax.swing.JButton();
        jbUsar = new javax.swing.JButton();
        jbColetar = new javax.swing.JButton();
        jbFalar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Comandos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLnome_jogador.setText("jLabel1");

        jLnome_personagem.setText("jLabel1");

        jLvida_personagem.setText("jLabel1");

        jLnome_campanha.setText("jLabel1");

        jLstatus.setText("jLstatus");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLnome_jogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(jLnome_personagem)
                        .addGap(129, 129, 129)
                        .addComponent(jLvida_personagem)
                        .addGap(125, 125, 125)
                        .addComponent(jLnome_campanha)
                        .addGap(119, 119, 119))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLstatus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome_jogador)
                    .addComponent(jLnome_personagem)
                    .addComponent(jLvida_personagem)
                    .addComponent(jLnome_campanha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLstatus))
        );

        javax.swing.GroupLayout jpAraDePintarLayout = new javax.swing.GroupLayout(jpAraDePintar);
        jpAraDePintar.setLayout(jpAraDePintarLayout);
        jpAraDePintarLayout.setHorizontalGroup(
            jpAraDePintarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        jpAraDePintarLayout.setVerticalGroup(
            jpAraDePintarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jbPericias.setText("Pericias");

        jbUsar.setText("Usar");

        jbColetar.setText("Coletar");

        jbFalar.setText("Falar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpAraDePintar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbPericias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbUsar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbColetar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbFalar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(14, 14, 14)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(jpAraDePintar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jbPericias)
                    .addComponent(jbUsar)
                    .addComponent(jbColetar)
                    .addComponent(jbFalar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

// TODO add your handling code here:
        String string = jTextField1.getText();
        String mestre = "";
        if (string != "") {
            try {
                // divide string em uma arraiy para verificar por partes
                String[] comands = string.split(" ");
                //posi = Integer.parseInt(string);

                jTextArea1.setText(jTextArea1.getText() + "Jogador diz: " + string + "\n"); // mostra no texto da historia

                mestre = vercom.verificaComando(comands);
                
                jTextArea1.setText(jTextArea1.getText() + "Mestre: " + mestre + '\n');
                
                if (mestre.equalsIgnoreCase("lpt")) {
                    jTextArea1.setText(""); // limpa tela
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
//        // limpa comando digitado
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        jTextField1.setFocusable(true);

    }//GEN-LAST:event_formComponentShown

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1.doClick();
            
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("comandos");
        jButton1.doClick();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFPrincipal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchMethodException ex) {
                    Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvocationTargetException ex) {
                    Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLnome_campanha;
    private javax.swing.JLabel jLnome_jogador;
    private javax.swing.JLabel jLnome_personagem;
    private javax.swing.JLabel jLstatus;
    private javax.swing.JLabel jLvida_personagem;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbColetar;
    private javax.swing.JButton jbFalar;
    private javax.swing.JButton jbPericias;
    private javax.swing.JButton jbUsar;
    private javax.swing.JPanel jpAraDePintar;
    // End of variables declaration//GEN-END:variables

}
