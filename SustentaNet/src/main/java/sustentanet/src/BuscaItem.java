package sustentanet.src;

import classes.Produto;
import classes.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import utils.TableModelCreator;

public final class BuscaItem extends javax.swing.JFrame {

    private List<String> colunasVisivel
            = new ArrayList<>(Arrays.asList("id", "nome", "descricao", "modelo", "offer"));

    private static BuscaItem myInstance;
    private int idSelecionado = 0;
    private String termoBusca;

    public static BuscaItem getInstance() {
        if (myInstance == null) {
            myInstance = new BuscaItem();
        }
        return myInstance;
    }

    public void atualizarTabela() {
        try {
            List<Produto> lista
                    = new Produto().getProdutos();
            TableModel model
                    = TableModelCreator.createTableModel(
                            Produto.class, lista, colunasVisivel);
            jTable1.setModel(model);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        organizarTabela();
    }

    public void organizarTabela() {
        jTable1.getTableHeader().getColumnModel().moveColumn(0, 1);
        jTable1.getTableHeader().getColumnModel().moveColumn(1, 3);
        jTable1.getTableHeader().getColumnModel().moveColumn(3, 1);
        jTable1.getTableHeader().getColumnModel().moveColumn(2, 3);
        jTable1.getTableHeader().getColumnModel().moveColumn(1, 2);
    }

    private void realizarBusca() {
        try {
            if (termoBusca != null && !termoBusca.isEmpty()) {
                List<Produto> lista = new Produto().buscarProdutos(termoBusca);
                TableModel model = TableModelCreator.createTableModel(Produto.class, lista, colunasVisivel);
                jTable1.setModel(model);
            } else {
               
                List<Produto> lista = new Produto().getProdutos();
                TableModel model = TableModelCreator.createTableModel(Produto.class, lista, colunasVisivel);
                jTable1.setModel(model);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        organizarTabela();
    }

    public BuscaItem() {
        initComponents();
        atualizarTabela();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        firstInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        go = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Item");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 660));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        firstInput.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        firstInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstInputActionPerformed(evt);
            }
        });
        getContentPane().add(firstInput);
        firstInput.setBounds(30, 160, 740, 21);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 250, 740, 280);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 190, 740, 20);

        go.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        go.setText("Ir");
        go.setEnabled(false);
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        getContentPane().add(go);
        go.setBounds(690, 560, 80, 23);

        sair.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(30, 560, 80, 23);

        Buscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar);
        Buscar.setBounds(590, 560, 80, 23);

        texto1.setBackground(new java.awt.Color(255, 255, 255));
        texto1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        texto1.setText("Resultados:");
        getContentPane().add(texto1);
        texto1.setBounds(30, 220, 380, 20);

        texto2.setBackground(new java.awt.Color(255, 255, 255));
        texto2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        texto2.setText("Busca por Itens");
        getContentPane().add(texto2);
        texto2.setBounds(300, 60, 190, 20);

        texto3.setBackground(new java.awt.Color(255, 255, 255));
        texto3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        texto3.setText("Descrição (nome, marca, modelo):");
        getContentPane().add(texto3);
        texto3.setBounds(30, 130, 380, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\SustentaNet(versão final)\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\Capa de Fundo SustentaNet.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 840, 1080);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void firstInputActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        termoBusca = firstInput.getText();
        realizarBusca();
    }                                      

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        realizarBusca();
    }                                    

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        int column = jTable1.convertColumnIndexToView(jTable1.getColumn("Nome ").getModelIndex());
        idSelecionado = Integer.parseInt(source.getModel().getValueAt(row, column) + "");

        go.setEnabled(true);
    }                                    

    private void goActionPerformed(java.awt.event.ActionEvent evt) {                                   
        abrirPaginaItem(idSelecionado);
    }                                  

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {                                     
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
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

    private void abrirPaginaItem(int id) {
        this.dispose();
        InterfaceItem interfaceItem = new InterfaceItem(id);
        interfaceItem.setVisible(true);
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField firstInput;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sair;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    // End of variables declaration                   
}
