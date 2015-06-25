/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Tabelas.Autenticacao;
import dao.GenericDAO;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import utilitários.VerificaComandos;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

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
        c.setBackground(Color.WHITE); // Define a cor de fundo
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
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
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLnome_jogador = new javax.swing.JLabel();
        jLnome_personagem = new javax.swing.JLabel();
        jLvida_personagem = new javax.swing.JLabel();
        jLnome_campanha = new javax.swing.JLabel();
        jpAraDePintar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 442, 370, 23));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 450, 360));

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jButton2.setText("Comandos");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 442, 110, -1));

        jButton3.setText("Itens");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 442, 81, -1));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 200, 240));

        jLnome_jogador.setText("jLabel1");

        jLnome_personagem.setText("jLabel1");

        jLvida_personagem.setText("jLabel1");

        jLnome_campanha.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLnome_personagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLnome_jogador)
                .addGap(129, 129, 129)
                .addComponent(jLvida_personagem)
                .addGap(125, 125, 125)
                .addComponent(jLnome_campanha)
                .addGap(119, 119, 119))
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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 640, -1));

        javax.swing.GroupLayout jpAraDePintarLayout = new javax.swing.GroupLayout(jpAraDePintar);
        jpAraDePintar.setLayout(jpAraDePintarLayout);
        jpAraDePintarLayout.setHorizontalGroup(
            jpAraDePintarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpAraDePintarLayout.setVerticalGroup(
            jpAraDePintarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        getContentPane().add(jpAraDePintar, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 64, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String string = jTextField1.getText();
        if (string != "") {
            try {
                // divide string em uma arraiy para verificar por partes
                String[] comands = string.split(" ");
                //posi = Integer.parseInt(string);

                jTextArea1.setText(jTextArea1.getText() + "Jogador diz: " + string); // mostra no texto da historia

                jTextArea1.setText(jTextArea1.getText() + "\n" + "Mestre: " + vercom.verificaComando(comands) + '\n');
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
        // limpa comando digitado
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
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLnome_campanha;
    private javax.swing.JLabel jLnome_jogador;
    private javax.swing.JLabel jLnome_personagem;
    private javax.swing.JLabel jLvida_personagem;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpAraDePintar;
    // End of variables declaration//GEN-END:variables

}
