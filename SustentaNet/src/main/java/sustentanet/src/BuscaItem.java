/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sustentanet.src;

/**
 *
 * @author bonil
 */
public class BuscaItem extends javax.swing.JFrame {

    /**
     * Creates new form BuscaItem
     */
    public BuscaItem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Item");
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Produtos encontrados");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 260, 150, 16);

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 130, 330, 21);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar por nome, marca ou modelo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 90, 240, 16);

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(320, 90, 330, 21);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Buscar por código");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 130, 240, 16);

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eletrônicos", "Eletrodomésticos", "Ferramentas", "Vestuário", "Livros", "Outros" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(220, 170, 110, 21);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Buscar por categoria");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 170, 150, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(70, 240, 610, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Buscar");
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 210, 80, 23);

        jTextPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane3.setText("Item encontrado 3");
        jScrollPane7.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(70, 430, 610, 50);

        jTextPane4.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextPane4.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane4.setText("Item encontrado 1");
        jScrollPane8.setViewportView(jTextPane4);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(70, 290, 610, 50);

        jTextPane5.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextPane5.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane5.setText("Item encontrado 2");
        jScrollPane9.setViewportView(jTextPane5);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(70, 360, 610, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\NetBeansProjects\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\gui-2311259_960_720.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(2000, 1500));
        jLabel1.setMinimumSize(new java.awt.Dimension(2000, 1500));
        jLabel1.setPreferredSize(new java.awt.Dimension(2000, 1500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-70, 0, 940, 550);

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
            java.util.logging.Logger.getLogger(BuscaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    // End of variables declaration//GEN-END:variables
}
