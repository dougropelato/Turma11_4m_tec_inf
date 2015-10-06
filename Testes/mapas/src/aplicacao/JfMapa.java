package aplicacao;

import javax.swing.JLabel;

/**
 *
 * @author Douglas Ropelato
 */
public final class JfMapa extends javax.swing.JFrame {

    Ferramenta ferra = Ferramenta.getInstance();

    public int posicaoGradeX;
    public int posicaoGradeY;
    public String nomeAtor;
    public JLabel ator;
    public JLabel Elemento;

    public JfMapa() {
        initComponents();
        insereGrade(30, 10); //tamx, tamy
        //  insereAtor("Nome", 0, 0); //posx, poxy do jogador
        // insereElemento("Nomeelemetno", 0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(JfMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfMapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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

                // insereElemento("pedra",grade.getBounds().x, grade.getBounds().y);
                // moveElemento(getElemento(), grade.getBounds().x, grade.getBounds().y);
                // insereElemento("pedra", grade.getBounds().x, grade.getBounds().y);
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
