/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Tabelas.PericiasPosicoes;
import Tabelas.Raca;
import dao.GenericDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tabelas.Classes;
import tabelas.Pericias;

/**
 *
 * @author Fabio
 */
public class JFPericias extends javax.swing.JFrame {

    GenericDAO gDAO;
    
    
    ArrayList arrayListPericia = new ArrayList();
    ArrayList arrayListDescricao = new ArrayList();
    ArrayList arrayListAtributo = new ArrayList();
    
    public void CarregaComboPericias() throws SQLException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException{
        GenericDAO genericDAO = new GenericDAO();
        
        //Limpa os campos
        arrayListPericia.clear();
        arrayListDescricao.clear();
        arrayListAtributo.clear();
        
        jCBNomePericiaAlt.removeAllItems();
        jCBNomePericiaExc.removeAllItems();
        
        jTFAtributoExc.setText(null);
        jTFNomePericiaExc.setText(null);
        jTADescricaoExc.setText(null);
        jTFPericiaAlt.setText(null);
        jTADescricaoAlt.setText(null);
        jTFAtributoPAlt.setText(null);
        
        List<Object> list = genericDAO.listar(Pericias.class);
        for (Object obj : list) {
            Pericias p = (Pericias) obj;
            arrayListPericia.add(p.getCodigo_pericia());
            arrayListDescricao.add(p.getDescricao_pericia());
            arrayListAtributo.add(p.getAtributo_principal_pericia());
            jCBNomePericiaAlt.addItem(p.getNome_pericia());
            jCBNomePericiaExc.addItem(p.getNome_pericia());
        }
    }
    
    
    
    public JFPericias() throws SQLException {
        this.gDAO = new GenericDAO();
        initComponents();
        centralizarcomponente();
    }
    
    public void centralizarcomponente(){
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) /2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLPerícia = new javax.swing.JLabel();
        jLDescrição = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescrição = new javax.swing.JTextArea();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLCadastroPerícias = new javax.swing.JLabel();
        jCBAtributo = new javax.swing.JComboBox();
        jLAtributoPrincipal = new javax.swing.JLabel();
        jTNomePericia = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jCBNomePericiaAlt = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFPericiaAlt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTADescricaoAlt = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCBAtributoAlt = new javax.swing.JComboBox();
        jTFAtributoPAlt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCBNomePericiaExc = new javax.swing.JComboBox();
        jTFNomePericiaExc = new javax.swing.JTextField();
        jTFAtributoExc = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTADescricaoExc = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLPerícia.setText("Perícia:");

        jLDescrição.setText("Descrição:");

        jTADescrição.setColumns(20);
        jTADescrição.setRows(5);
        jScrollPane1.setViewportView(jTADescrição);

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLCadastroPerícias.setText("CADASTRO DE PERÍCIAS");

        jCBAtributo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Força", "Destreza", "Constituição", "Inteligência", "Sabedoria", "Carisma" }));
        jCBAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAtributoActionPerformed(evt);
            }
        });

        jLAtributoPrincipal.setText("Atributo Principal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLCadastroPerícias))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jTNomePericia, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLDescrição)
                                .addComponent(jLPerícia))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLAtributoPrincipal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(60, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCadastroPerícias)
                .addGap(84, 84, 84)
                .addComponent(jTNomePericia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBSalvar))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(115, Short.MAX_VALUE)
                    .addComponent(jLPerícia)
                    .addGap(32, 32, 32)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLDescrição)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCBAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLAtributoPrincipal))
                    .addGap(113, 113, 113)))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jCBNomePericiaAlt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBNomePericiaAltItemStateChanged(evt);
            }
        });

        jLabel1.setText("Selecione a Perícia:");

        jLabel2.setText("Novo nome da Perícia:");

        jTFPericiaAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPericiaAltActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição da Perícia: ");

        jTADescricaoAlt.setColumns(20);
        jTADescricaoAlt.setRows(5);
        jScrollPane2.setViewportView(jTADescricaoAlt);

        jButton1.setText("Salvar Alterações");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Novo Atributo Principal:");

        jCBAtributoAlt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Força", "Destreza", "Constituição", "Inteligência", "Sabedoria", "Carisma" }));

        jTFAtributoPAlt.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFPericiaAlt))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jCBNomePericiaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jButton1)
                            .addGap(45, 45, 45)
                            .addComponent(jButton2)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFAtributoPAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBAtributoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBNomePericiaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFPericiaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFAtributoPAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAtributoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alterar", jPanel2);

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCBNomePericiaExc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBNomePericiaExcItemStateChanged(evt);
            }
        });

        jTFNomePericiaExc.setEnabled(false);

        jTFAtributoExc.setEnabled(false);

        jTADescricaoExc.setColumns(20);
        jTADescricaoExc.setRows(5);
        jTADescricaoExc.setEnabled(false);
        jScrollPane3.setViewportView(jTADescricaoExc);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jCBNomePericiaExc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFNomePericiaExc, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFAtributoExc, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(142, 142, 142))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jCBNomePericiaExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jTFNomePericiaExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jTFAtributoExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("Excluir", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed

        if (jTNomePericia.getText().equalsIgnoreCase("") || jTADescrição.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            try {
                GenericDAO gDao = new GenericDAO();

                Pericias p = new Pericias();
                p.setNome_pericia(jTNomePericia.getText());
                p.setDescricao_pericia(jTADescrição.getText());
                p.setAtributo_principal_pericia(String.valueOf(jCBAtributo.getSelectedItem()));
                gDAO.adicionar(p);

                JOptionPane.showMessageDialog(null, " Salvou, manda nude!"); // Após clicar no botão salvar, aparece tal mensagem
                   
                //Limpando campos
                jTNomePericia.setText(null);
                jTADescrição.setText(null);
                CarregaComboPericias();
            } catch (SQLException | ClassNotFoundException | IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
     JFPericias.this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFNomePericiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomePericiaActionPerformed

    }//GEN-LAST:event_jTFNomePericiaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            CarregaComboPericias();
        } catch (SQLException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jCBAtributoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAtributoPrincipalActionPerformed

    }//GEN-LAST:event_jCBAtributoPrincipalActionPerformed

    private void jCBAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAtributoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAtributoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int cod = 1;
            GenericDAO genericDAO = new GenericDAO();
            Pericias p = new Pericias();
            if (jTFPericiaAlt.getText().equals("") || jTADescricaoAlt.getText().equals("") || jTFAtributoPAlt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor insira todas as informações!"); 
            } else {
                cod=(int) arrayListPericia.get(jCBNomePericiaAlt.getSelectedIndex());    
            
                p.setCodigo_pericia(cod);
                p.setNome_pericia(jTFPericiaAlt.getText());
                p.setDescricao_pericia(jTADescricaoAlt.getText());
                p.setAtributo_principal_pericia(jCBAtributoAlt.getItemAt(jCBAtributoAlt.getSelectedIndex()).toString());
                genericDAO.alterar(p);
                //todo procedimento de alterar
                CarregaComboPericias();
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!"); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            GenericDAO genericDAO = new GenericDAO();
            Pericias pericia = new Pericias();
            PericiasPosicoes periciasPosicoes = new PericiasPosicoes();
            
            //exclui n para n
            periciasPosicoes.setCodigo_pericia((int) arrayListPericia.get(jCBNomePericiaExc.getSelectedIndex()));
            genericDAO.excluir(periciasPosicoes);
            
            //exclui pericia
            pericia.setCodigo_pericia((int) arrayListPericia.get(jCBNomePericiaExc.getSelectedIndex()));
            genericDAO.excluir(pericia);
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            CarregaComboPericias();
        } catch (SQLException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCBNomePericiaAltItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBNomePericiaAltItemStateChanged
        if (!arrayListPericia.isEmpty()) {
            try {
                GenericDAO genericDAO = new GenericDAO();
                Pericias p = new Pericias();
                
                jTADescricaoAlt.setText(null);
                jTFPericiaAlt.setText(null);
                jTFAtributoPAlt.setText(null);
                
                jTFPericiaAlt.setText((String) jCBNomePericiaAlt.getItemAt(jCBNomePericiaAlt.getSelectedIndex()));
                jTADescricaoAlt.setText((String) arrayListDescricao.get(jCBNomePericiaAlt.getSelectedIndex()));
                jTFAtributoPAlt.setText(arrayListAtributo.get(jCBNomePericiaAlt.getSelectedIndex()).toString());
            } catch (SQLException ex) {
                Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jCBNomePericiaAltItemStateChanged

    private void jTFPericiaAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPericiaAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPericiaAltActionPerformed

    private void jCBNomePericiaExcItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBNomePericiaExcItemStateChanged
        if (!arrayListPericia.isEmpty()) {
            try {
                GenericDAO genericDAO = new GenericDAO();
                Pericias p = new Pericias();
                
                jTADescricaoExc.setText(null);
                jTFAtributoExc.setText(null);
                jTFNomePericiaExc.setText(null);
                
                jTFNomePericiaExc.setText((String) jCBNomePericiaExc.getItemAt(jCBNomePericiaExc.getSelectedIndex()));
                jTADescricaoExc.setText((String) arrayListDescricao.get(jCBNomePericiaExc.getSelectedIndex()));
                jTFAtributoExc.setText(arrayListAtributo.get(jCBNomePericiaExc.getSelectedIndex()).toString());
            } catch (SQLException ex) {
                Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jCBNomePericiaExcItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFPericias.this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFPericias.this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(JFPericias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPericias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPericias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPericias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFPericias().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFPericias.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jCBAtributo;
    private javax.swing.JComboBox jCBAtributoAlt;
    private javax.swing.JComboBox jCBNomePericiaAlt;
    private javax.swing.JComboBox jCBNomePericiaExc;
    private javax.swing.JLabel jLAtributoPrincipal;
    private javax.swing.JLabel jLCadastroPerícias;
    private javax.swing.JLabel jLDescrição;
    private javax.swing.JLabel jLPerícia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTADescricaoAlt;
    private javax.swing.JTextArea jTADescricaoExc;
    private javax.swing.JTextArea jTADescrição;
    private javax.swing.JTextField jTFAtributoExc;
    private javax.swing.JTextField jTFAtributoPAlt;
    private javax.swing.JTextField jTFNomePericiaExc;
    private javax.swing.JTextField jTFPericiaAlt;
    private javax.swing.JTextField jTNomePericia;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
