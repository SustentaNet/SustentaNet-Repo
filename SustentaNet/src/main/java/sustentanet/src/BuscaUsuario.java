package sustentanet.src;

import classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import src.connection.mysql;
import utils.TableModelCreator;

public class BuscaUsuario extends javax.swing.JFrame {

    private static BuscaUsuario myInstance;
    private int idSelecionado = 0;
    private String termoBusca;
    private List<String> colunas = Arrays.asList("id", "name", "email", "phone", "state");

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

    private void realizarBusca() {
        try {
            List<Usuario> lista;
            if (termoBusca != null && !termoBusca.isEmpty()) {
                lista = new Usuario().buscarUsuario(termoBusca);
            } else {
              
                lista = new Usuario().getAllUsers();
            }

            TableModel model = TableModelCreator.createTableModel(Usuario.class, lista, colunas);
            jTable1.setModel(model);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        oraganizarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        texto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nomeInput = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        go = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Buscar1 = new javax.swing.JButton();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar usuário");
        setMinimumSize(new java.awt.Dimension(610, 650));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        texto.setBackground(new java.awt.Color(255, 255, 255));
        texto.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        texto.setText("Resultados:");
        getContentPane().add(texto);
        texto.setBounds(20, 190, 190, 20);

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
        jScrollPane1.setBounds(20, 220, 560, 300);

        nomeInput.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        getContentPane().add(nomeInput);
        nomeInput.setBounds(20, 120, 560, 21);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 530, 560, 20);

        go.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        go.setText("Ir");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        getContentPane().add(go);
        go.setBounds(500, 560, 80, 23);

        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 560, 70, 23);

        Buscar1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Buscar1.setText("Buscar");
        Buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar1);
        Buscar1.setBounds(410, 560, 80, 23);

        texto1.setBackground(new java.awt.Color(255, 255, 255));
        texto1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        texto1.setText("Busca por Usuário");
        getContentPane().add(texto1);
        texto1.setBounds(190, 50, 190, 20);

        texto2.setBackground(new java.awt.Color(255, 255, 255));
        texto2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        texto2.setText("Nome:");
        getContentPane().add(texto2);
        texto2.setBounds(20, 90, 190, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 160, 560, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\SustentaNet(versão final)\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\Capa de Fundo SustentaNet.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-150, -50, 1480, 830);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void goActionPerformed(java.awt.event.ActionEvent evt) {                                   
        this.dispose();
        PerfilUsuario user = new PerfilUsuario(idSelecionado);
        user.setVisible(true);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }                                        

    private void Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        termoBusca = nomeInput.getText();
        realizarBusca();

    }                                       

    private void abrirPaginaPerfil(int id) {
        PerfilUsuario perfilUsuario = new PerfilUsuario(id);
        perfilUsuario.setVisible(true);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Buscar1;
    private javax.swing.JButton go;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    // End of variables declaration                   
}
