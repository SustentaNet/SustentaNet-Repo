package sustentanet.src;

import classes.Produto;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import javax.swing.JOptionPane;
import utils.TokenSingleton;

public class CadastroItem extends javax.swing.JFrame {

    private String token;

    public CadastroItem() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        marcaInput = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        descricaoInput = new javax.swing.JFormattedTextField();
        nameInput = new javax.swing.JFormattedTextField();
        salvar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        ofertaInput = new javax.swing.JComboBox<>();
        categoriaInput = new javax.swing.JComboBox<>();
        modeloInput = new javax.swing.JFormattedTextField();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

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
        setTitle("Cadastro de Item");
        setMinimumSize(new java.awt.Dimension(810, 650));
        setPreferredSize(new java.awt.Dimension(815, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Categoria:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 200, 110, 16);
        getContentPane().add(marcaInput);
        marcaInput.setBounds(430, 110, 340, 22);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Oferta:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 150, 140, 16);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Modelo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 150, 60, 16);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Marca:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(430, 90, 50, 16);
        getContentPane().add(descricaoInput);
        descricaoInput.setBounds(20, 320, 760, 200);
        getContentPane().add(nameInput);
        nameInput.setBounds(20, 110, 330, 22);

        salvar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(700, 550, 80, 30);

        sair.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(20, 550, 80, 30);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setText("Nome:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 90, 70, 16);

        ofertaInput.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ofertaInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Troca", "Doação", "Compartilhar" }));
        ofertaInput.setName(""); // NOI18N
        getContentPane().add(ofertaInput);
        ofertaInput.setBounds(430, 170, 340, 22);

        categoriaInput.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        categoriaInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eletrônicos", "Eletrodomésticos", "Ferramentas", "Vestuário", "Livros", "Outros" }));
        getContentPane().add(categoriaInput);
        categoriaInput.setBounds(20, 220, 330, 22);
        getContentPane().add(modeloInput);
        modeloInput.setBounds(20, 170, 330, 22);

        texto1.setBackground(new java.awt.Color(255, 255, 255));
        texto1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        texto1.setText("Descrição:");
        getContentPane().add(texto1);
        texto1.setBounds(20, 290, 190, 23);

        texto2.setBackground(new java.awt.Color(255, 255, 255));
        texto2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        texto2.setText("Cadastro de Itens");
        getContentPane().add(texto2);
        texto2.setBounds(300, 40, 190, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 270, 760, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\SustentaNet(versão final)\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\Capa de Fundo SustentaNet.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-30, 0, 910, 1080);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {                                     
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }                                    

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String title = nameInput.getText();
        String description = descricaoInput.getText();
        String model = modeloInput.getText();
        String marca = marcaInput.getText();
        String offer = String.valueOf(ofertaInput.getSelectedItem());
        String category = String.valueOf(categoriaInput.getSelectedItem());

        String token = TokenSingleton.getInstance().getToken();

        Produto produto = new Produto();
        try {
            Jws<Claims> claims = Jwts.parser().setSigningKey("susnet").parseClaimsJws(token);
            String userId = claims.getBody().getSubject();
            System.out.println("user id: " + userId);

            produto.setProduto(
                    title,
                    description,
                    model,
                    marca,
                    offer,
                    category,
                    userId
            );

            this.dispose();
            Menu menu = new Menu();
            menu.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error", "Erro", JOptionPane.ERROR_MESSAGE);
            limparCampos();
        }
    }                                      

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(CadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroItem().setVisible(true);
            }
        });
    }

    private void limparCampos() {
        nameInput.setText("");
        descricaoInput.setText("");
        modeloInput.setText("");
        marcaInput.setText("");
    }


    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> categoriaInput;
    private javax.swing.JFormattedTextField descricaoInput;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JFormattedTextField marcaInput;
    private javax.swing.JFormattedTextField modeloInput;
    private javax.swing.JFormattedTextField nameInput;
    private javax.swing.JComboBox<String> ofertaInput;
    private javax.swing.JButton sair;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    // End of variables declaration                   
}
