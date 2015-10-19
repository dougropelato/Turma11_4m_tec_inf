package Formularios;

import Tabelas.Mapas;
import aplicacao.Ferramenta;
import aplicacao.JfMapa;
import dao.GenericDAO;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author Douglas Ropelato
 */
public final class JFMapa extends javax.swing.JFrame {

    Ferramenta ferra = Ferramenta.getInstance();

    public int posicaoGradeX;
    public int posicaoGradeY;
    public String nomeAtor;
    public JLabel ator;
    public JLabel Elemento;

    public JFMapa() {
        initComponents();
        insereGrade(10, 10); //tamx, tamy
        //  insereAtor("Nome", 0, 0); //posx, poxy do jogador
        // insereElemento("Nomeelemetno", 0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Component novo;
        JLabel nn;
        try {
            GenericDAO gg = new GenericDAO();
            Mapas mm = new Mapas();

            int ale = this.getContentPane().getComponentCount();
            for (int i = 0; i < ale; i++) {

                novo = this.getContentPane().getComponent(i);

                try {
                    nn = (JLabel) novo;

                    System.out.println(novo.getClass());
                    ferra.addLista(nn);

                    System.out.println(nn.getName().toString());
                    System.out.println(nn.getIcon().toString());
                    System.out.println(nn.getBounds());

                    mm.setNome_mapa(jTextField1.getText());
                    mm.setPosicao_x(nn.getBounds().x);
                    mm.setPosicao_y(nn.getBounds().y);
                    mm.setTamanho_x(nn.getBounds().height);
                    mm.setTamanho_y(nn.getBounds().width);
                    
                    Icon test = nn.getIcon();
                    System.out.println(test);
                    mm.setTerreno(test.toString());

                    gg.adicionar(mm);

                    System.out.println("-----------------------------------------");

                } catch (java.lang.ClassCastException e) {

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(JFMapa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(JFMapa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(JFMapa.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            System.out.println("--------------  fim  ------------------");
        } catch (SQLException ex) {
            Logger.getLogger(JFMapa.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        JFFerramemtas ff = new JFFerramemtas();
        JFCarregaMapa car = new JFCarregaMapa();

        car.setVisible(true);
        ff.setVisible(true);
                

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    public JLabel criaGrade(String nome, int x, int y) {
        JLabel grade = new JLabel();
        grade.setName(nome);
        grade.setBounds(x, y, 35, 35);
        //label.setLocation(x, y);
        grade.setIcon(new javax.swing.ImageIcon("src\\imagens\\grade.png"));

        grade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println(nome);
                setPosicaoGradeX(grade.getBounds().x);
                setPosicaoGradeY(grade.getBounds().y);
                grade.setIcon(new javax.swing.ImageIcon("src\\imagens\\" + ferra.getNome_ferramenta()));

            }
        });

        return grade;
    }

    public void moveAtor(JLabel ator, int posX, int posY) {
        ator.setLocation(posX, posY);
    }

    public void moveElemento(JLabel elemt, int posX, int posY) {
        elemt.setLocation(posX, posY);
    }

    public JLabel criaAtor(String nomeAtor, int x, int y) {

        int vem[] = new int[2];
        JLabel label = new JLabel();
        label.setName(nomeAtor);
        label.setBounds(x, y, 35, 35);
        setAtor(label);
        label.setIcon(new javax.swing.ImageIcon("src\\imagens\\ator1.png"));
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println(nomeAtor);
            }
        });

        return label;
    }

    public JLabel criaElemento(String nomeElemento, int x, int y) {

        //int vem[] = new int[2];
        JLabel label = new JLabel();
        label.setName(nomeElemento);
        label.setBounds(x, y, 35, 35);
        setElemento(label);
        label.setIcon(new javax.swing.ImageIcon("src\\imagens\\" + ferra.getNome_ferramenta()));
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println(nomeElemento);
            }
        });

        return label;
    }

    public JLabel getElemento() {
        return Elemento;
    }

    public void setElemento(JLabel Elemento) {
        this.Elemento = Elemento;
    }

    public void insereAtor(String ator, int posx, int posy) {
        this.getContentPane().add(criaAtor(String.valueOf(ator), posx, posy), 0);
        // O zero deixa o ator em cima da grade
    }

    public void insereElemento(String ator, int posx, int posy) {
        this.getContentPane().add(criaElemento(ator, posx, posy), 0);
        // O zero deixa o ator em cima da grade
    }

    private void insereGrade(int tamx, int tamy) {
        int x = 0;
        int y = 0;
        int nome = 0;
        for (int cont2 = 1; cont2 <= tamy; cont2++) {
            for (int cont = 1; cont <= tamx; cont++) {
                this.getContentPane().add(criaGrade(String.valueOf(nome), x, y));
                x = x + 35;
                nome++;
            }
            x = 0;
            y = y + 35;
        }
        this.repaint();
    }

    public int getPosicaoGradeX() {
        return posicaoGradeX;
    }

    public void setPosicaoGradeX(int posicaoGradeX) {
        this.posicaoGradeX = posicaoGradeX;
    }

    public int getPosicaoGradeY() {
        return posicaoGradeY;
    }

    public void setPosicaoGradeY(int posicaoGradeY) {
        this.posicaoGradeY = posicaoGradeY;
    }

    public String getNomeAtor() {
        return nomeAtor;
    }

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    public JLabel getAtor() {
        return ator;
    }

    public void setAtor(JLabel ator) {
        this.ator = ator;
    }

}
