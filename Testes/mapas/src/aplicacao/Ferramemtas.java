/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import javax.swing.JLabel;

/**
 *
 * @author Alexjonas
 */
public class Ferramemtas extends javax.swing.JFrame {

    /**
     * Creates new form Ferramemtas
     */
    public Ferramemtas() {
        initComponents();
        insereGrade(2, 3); //tamx, tamy

    }

    Ferramenta ferra = Ferramenta.getInstance();

    public int posicaoGradeX;
    public int posicaoGradeY;
    public String nomeAtor;
    public JLabel ator;
    public JLabel Elemento;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fselecao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fselecao.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(fselecao)
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(fselecao)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ferramemtas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ferramemtas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ferramemtas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ferramemtas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ferramemtas().setVisible(true);
            }
        });
    }

    public JLabel criaGrade(String nome, int x, int y) {
        JLabel grade = new JLabel();
        grade.setName(nome);
        grade.setBounds(x, y, 35, 35);
        grade.setIcon(new javax.swing.ImageIcon("src\\imagens\\" + nome));

        grade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println(nome);
                ferra.setNome_ferramenta(nome);
                fselecao.setIcon(new javax.swing.ImageIcon("src\\imagens\\" + nome));
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

        int vem[] = new int[2];
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
        // this.getContentPane().add(criaAtor(String.valueOf(ator), posx, posy), 0);
        // O zero deixa o ator em cima da grade
    }

    public void insereElemento(String ator, int posx, int posy) {
        this.getContentPane().add(criaElemento(String.valueOf(ator), posx, posy), 0);
        // O zero deixa o ator em cima da grade
    }

    private void insereGrade(int tamx, int tamy) {
        int x = 0;
        int y = 0;
        int nome = 0;
        String fnome = "";
        for (int cont2 = 1; cont2 <= tamy; cont2++) {
            for (int cont = 1; cont <= tamx; cont++) {

                switch (nome) {
                    case 0:
                        fnome = "agua.png";
                        break;
                    case 1:
                        fnome = "ator1.png";
                        break;
                    case 2:
                        fnome = "grama.png";
                        break;
                    case 3:
                        fnome = "pedra.png";
                        break;
                    case 4:
                        fnome = "terra.png";
                        break;
                    case 5:
                        fnome = "terra.png";
                        break;
                }

                this.getContentPane().add(criaGrade(fnome, x, y));
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fselecao;
    // End of variables declaration//GEN-END:variables
}
