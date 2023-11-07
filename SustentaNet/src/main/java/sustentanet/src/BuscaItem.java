package sustentanet.src;

import classes.Produto;
import classes.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import utils.TableModelCreator;

public class BuscaItem extends javax.swing.JFrame {

    private List<String> colunasVisivel
            = new ArrayList<>(Arrays.asList("id", "nome", "descricao", "modelo", "offer"));

    private static BuscaItem myInstance;
    private int idSelecionado = 0;

    public static BuscaItem getInstance() {
        if (myInstance == null) {
            myInstance = new BuscaItem();
        }
        return myInstance;
    }

    public BuscaItem() {
        initComponents();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        firstInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        offerInput = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        go = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Item");
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar por nome, marca ou modelo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 110, 240, 16);

        firstInput.setBackground(new java.awt.Color(255, 255, 255));
        firstInput.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        firstInput.setForeground(new java.awt.Color(0, 0, 0));
        firstInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstInputActionPerformed(evt);
            }
        });
        getContentPane().add(firstInput);
        firstInput.setBounds(320, 110, 330, 21);

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
        jScrollPane1.setBounds(70, 252, 660, 240);

        offerInput.setBackground(new java.awt.Color(255, 255, 255));
        offerInput.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        offerInput.setForeground(new java.awt.Color(0, 0, 0));
        offerInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eletrônicos", "Eletrodomésticos", "Ferramentas", "Vestuário", "Livros", "Outros" }));
        getContentPane().add(offerInput);
        offerInput.setBounds(220, 160, 110, 21);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Buscar por categoria");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 160, 150, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(70, 240, 610, 20);

        go.setBackground(new java.awt.Color(255, 255, 255));
        go.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        go.setForeground(new java.awt.Color(0, 0, 0));
        go.setText("Ir");
        go.setEnabled(false);
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        getContentPane().add(go);
        go.setBounds(620, 210, 80, 23);

        Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Buscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(0, 0, 0));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar);
        Buscar.setBounds(520, 210, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\NetBeansProjects\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\gui-2311259_960_720.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(2000, 1500));
        jLabel1.setMinimumSize(new java.awt.Dimension(2000, 1500));
        jLabel1.setPreferredSize(new java.awt.Dimension(2000, 1500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-70, 0, 940, 550);

        pack();
    }// </editor-fold>                        

    private void firstInputActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        atualizarTabela();
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

    private void buscarProdutoId(int codigo) {
        try {
            List<Usuario> lista = new ArrayList<>();
            Usuario usuario = new Usuario().getUser(codigo);
            if (usuario != null) {
                lista.add(usuario);
            }

            TableModel model = TableModelCreator.createTableModel(
                    Usuario.class, lista, colunasVisivel
            );
            jTable1.setModel(model);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    private void buscarProdutoNome() {
        String name = firstInput.getText();
        try {
            List<Produto> lista = (List<Produto>) Produto.getProdutoByName(name);

            TableModel model = TableModelCreator.createTableModel(
                    Produto.class, lista, colunasVisivel
            );
            jTable1.setModel(model);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField firstInput;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> offerInput;
    // End of variables declaration                   
}
