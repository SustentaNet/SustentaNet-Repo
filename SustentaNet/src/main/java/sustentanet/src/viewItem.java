package sustentanet.src;

import classes.Produto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import utils.TableModelCreator;

public class viewItem extends javax.swing.JFrame {

    private List<String> colunasVisivel
            = new ArrayList<>(Arrays.asList("id", "nome", "modelo", "offer"));

    private static BuscaItem myInstance;
    private int idSelecionado = 0;
    private int userId;

    public static BuscaItem getInstance() {
        if (myInstance == null) {
            myInstance = new BuscaItem();
        }
        return myInstance;
    }

    public viewItem(int id) {
        initComponents();
        this.userId = id;
    }

    public void atualizarTabela() {
        try {
            List<Produto> lista = Produto.getProdutoByUserId(userId);
            TableModel model = TableModelCreator.createTableModel(Produto.class, lista, colunasVisivel);
            jTable1.setModel(model);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        organizarTabela();
    }

    public void organizarTabela() {
        jTable1.getTableHeader().getColumnModel().moveColumn(0, 1);
        jTable1.getTableHeader().getColumnModel().moveColumn(1, 2);
        jTable1.getTableHeader().getColumnModel().moveColumn(2, 1);
        jTable1.getTableHeader().getColumnModel().moveColumn(0, 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        go = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sair.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 555, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 82, 521, 434));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel16.setText("Itens do Usuáiro:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 41, 186, -1));

        go.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        go.setText("Ir");
        go.setEnabled(false);
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        getContentPane().add(go, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 555, 65, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sustentanet/src/img/Capa de Fundo SustentaNet.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-43, -21, 680, 1120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed

        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_sairActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        int column = jTable1.convertColumnIndexToView(jTable1.getColumn("Id ").getModelIndex());
        idSelecionado = Integer.parseInt(source.getModel().getValueAt(row, column) + "");

        go.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        abrirPaginaItem(idSelecionado);
    }//GEN-LAST:event_goActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizarTabela();
    }//GEN-LAST:event_formWindowActivated

    private void abrirPaginaItem(int id) {
        this.dispose();
        InterfaceItem interfaceItem = new InterfaceItem(id);
        interfaceItem.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
