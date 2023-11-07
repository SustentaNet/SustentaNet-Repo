package sustentanet.src;

import classes.Produto;
import classes.Usuario;

public class InterfaceItem extends javax.swing.JFrame {

    private int produtoId;

    public InterfaceItem(int produtoId) {
        initComponents();
        this.produtoId = produtoId;
        carregarDetalhesDoPerfil();
    }

    private void carregarDetalhesDoPerfil() {

        Produto produto = new Produto().getProdutoById(produtoId);

    }

    public InterfaceItem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar Item");
        setMinimumSize(new java.awt.Dimension(725, 600));
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Marca, Modelo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 60, 150, 16);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Verificar disponibilidade");
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 460, 250, 50);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Anunciado por");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 250, 130, 16);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("NOME DO ITEM");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(350, 20, 260, 18);

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Breve descrição");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 90, 320, 130);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Disponibilidade");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 430, 130, 16);

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane1.setText("Texto de avaliação");
        jScrollPane5.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(350, 460, 350, 50);

        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane2.setText("Anunciante");
        jScrollPane6.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(40, 280, 250, 50);

        jTextPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane3.setText("Texto de avaliação");
        jScrollPane7.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(350, 370, 350, 50);

        jTextPane4.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(jTextPane4);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(240, 50, 50, 50);

        jTextPane5.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane4.setViewportView(jTextPane5);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(240, 170, 50, 50);

        jTextPane6.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane8.setViewportView(jTextPane6);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(50, 50, 180, 170);

        jTextPane7.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextPane7.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane7.setText("Texto de avaliação");
        jScrollPane9.setViewportView(jTextPane7);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(350, 280, 350, 50);

        jTextPane8.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane10.setViewportView(jTextPane8);

        getContentPane().add(jScrollPane10);
        jScrollPane10.setBounds(240, 110, 50, 50);

        jTextPane9.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane11.setViewportView(jTextPane9);

        getContentPane().add(jScrollPane11);
        jScrollPane11.setBounds(240, 110, 50, 50);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Avaliações");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 250, 130, 16);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Ver contatos");
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 350, 130, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\NetBeansProjects\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\landscape-7283516_960_720.jpg")); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(800, 750));
        jLabel3.setMinimumSize(new java.awt.Dimension(800, 750));
        jLabel3.setPreferredSize(new java.awt.Dimension(800, 750));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 730, 540);

        pack();
    }// </editor-fold>                        

    private void abrirPaginaPerfil(int id) {
        this.dispose();
        PerfilUsuario perfilUsuario = new PerfilUsuario(id);
        perfilUsuario.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(InterfaceItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextPane jTextPane9;
    // End of variables declaration                   
}
