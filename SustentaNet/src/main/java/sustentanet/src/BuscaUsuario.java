package sustentanet.src;

import classes.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import utils.TableModelCreator;

public class BuscaUsuario extends javax.swing.JFrame {

    private static BuscaUsuario myInstance;
    private int idSelecionado = 0;

    public static BuscaUsuario getInstance() {
        if (myInstance == null) {
            myInstance = new BuscaUsuario();
        }
        return myInstance;
    }

    public BuscaUsuario() {
        initComponents();
    }

    public void atualizarTabela() {
        try {
            List<String> colunas = Arrays.asList("id", "name", "email", "phone", "state");

            List<Usuario> lista = new Usuario().getAllUsers();
            TableModel model = TableModelCreator.createTableModel(Usuario.class, lista, colunas);
            jTable1.setModel(model);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        oraganizarTabela();
    }

    public void oraganizarTabela() {
        jTable1.getTableHeader().getColumnModel().moveColumn(0, 1);
        jTable1.getTableHeader().getColumnModel().moveColumn(1, 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        CodigoInput = new javax.swing.JTextField();
        texto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nomeInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        go = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar usuário");
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        CodigoInput.setBackground(new java.awt.Color(255, 255, 255));
        CodigoInput.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        CodigoInput.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(CodigoInput);
        CodigoInput.setBounds(200, 150, 330, 21);

        texto.setBackground(new java.awt.Color(255, 255, 255));
        texto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        texto.setForeground(new java.awt.Color(0, 0, 0));
        texto.setText("Buscar por nome");
        getContentPane().add(texto);
        texto.setBounds(70, 90, 240, 16);

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
        jScrollPane1.setBounds(62, 262, 670, 230);

        nomeInput.setBackground(new java.awt.Color(255, 255, 255));
        nomeInput.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        nomeInput.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(nomeInput);
        nomeInput.setBounds(200, 90, 330, 21);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Buscar por código");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 150, 240, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(70, 250, 610, 20);

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
        go.setBounds(610, 220, 80, 20);

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
        Buscar.setBounds(490, 220, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\NetBeansProjects\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\gui-2311259_960_720.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(2000, 1500));
        jLabel1.setMinimumSize(new java.awt.Dimension(2000, 1500));
        jLabel1.setPreferredSize(new java.awt.Dimension(2000, 1500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-70, 0, 930, 560);

        pack();
    }// </editor-fold>                        

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            if (!CodigoInput.getText().isEmpty()) {
                int codigo = Integer.parseInt(CodigoInput.getText());
                buscarUsuarioPorCodigo(codigo);
            } else if (!nomeInput.getText().isEmpty()) {
                String nome = nomeInput.getText();
                buscarUsuarioPorNome(nome);
            }
        } catch (NumberFormatException ex) {
            System.err.println("Digite um código válido.");
        }
    }                                      

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        int column = jTable1.convertColumnIndexToView(jTable1.getColumn("Name ").getModelIndex());

        idSelecionado = Integer.parseInt(source.getModel().getValueAt(row, column).toString());
        go.setEnabled(true);
        
        System.out.println("idSelecionado: " + idSelecionado);
    }                                    

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        atualizarTabela();
    }                                    

    private void goActionPerformed(java.awt.event.ActionEvent evt) {                                   
        abrirPaginaPerfil(idSelecionado);
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
            java.util.logging.Logger.getLogger(BuscaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaUsuario().setVisible(true);
            }
        });
    }

    private void abrirPaginaPerfil(int id) {
        PerfilUsuario perfilUsuario = new PerfilUsuario(id);
        perfilUsuario.setVisible(true);
    }

    private void buscarUsuarioPorCodigo(int codigo) {

        try {
            List<Usuario> lista = new ArrayList<>();
            Usuario usuario = new Usuario().getUser(codigo);
            if (usuario != null) {
                lista.add(usuario);
            }

            TableModel model = TableModelCreator.createTableModel(
                    Usuario.class, lista, null
            );
            jTable1.setModel(model);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    private void buscarUsuarioPorNome(String nome) {
        String name = nomeInput.getText();
        try {
            List<Usuario> lista = (List<Usuario>) Usuario.getUserByName(name);

            TableModel model = TableModelCreator.createTableModel(
                    Usuario.class, lista, null
            );
            jTable1.setModel(model);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField CodigoInput;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel texto;
    // End of variables declaration                   
}
