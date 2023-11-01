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
        jLabel8 = new javax.swing.JLabel();
        modeloInput = new javax.swing.JFormattedTextField();
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
        setTitle("Cadastro de Item");
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Categoria");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 190, 110, 16);

        marcaInput.setBackground(new java.awt.Color(255, 255, 255));
        marcaInput.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(marcaInput);
        marcaInput.setBounds(500, 100, 280, 22);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Oferta");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(500, 140, 140, 16);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Modelo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 140, 60, 16);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Marca");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(500, 80, 50, 16);

        descricaoInput.setBackground(new java.awt.Color(255, 255, 255));
        descricaoInput.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(descricaoInput);
        descricaoInput.setBounds(90, 280, 700, 90);

        nameInput.setBackground(new java.awt.Color(255, 255, 255));
        nameInput.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(nameInput);
        nameInput.setBounds(90, 100, 280, 22);

        salvar.setBackground(new java.awt.Color(255, 255, 255));
        salvar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        salvar.setForeground(new java.awt.Color(0, 0, 0));
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(710, 450, 80, 40);

        sair.setBackground(new java.awt.Color(255, 255, 255));
        sair.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        sair.setForeground(new java.awt.Color(0, 0, 0));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(520, 450, 80, 40);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nome");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(90, 80, 70, 16);

        ofertaInput.setBackground(new java.awt.Color(255, 255, 255));
        ofertaInput.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ofertaInput.setForeground(new java.awt.Color(0, 0, 0));
        ofertaInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Troca", "Doação", "Compartilhar" }));
        ofertaInput.setName(""); // NOI18N
        getContentPane().add(ofertaInput);
        ofertaInput.setBounds(500, 160, 280, 22);

        categoriaInput.setBackground(new java.awt.Color(255, 255, 255));
        categoriaInput.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        categoriaInput.setForeground(new java.awt.Color(0, 0, 0));
        categoriaInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eletrônicos", "Eletrodomésticos", "Ferramentas", "Vestuário", "Livros", "Outros" }));
        getContentPane().add(categoriaInput);
        categoriaInput.setBounds(90, 210, 280, 22);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Descrição");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 260, 70, 16);

        modeloInput.setBackground(new java.awt.Color(255, 255, 255));
        modeloInput.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(modeloInput);
        modeloInput.setBounds(90, 160, 280, 22);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\NetBeansProjects\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\gui-2906790_960_720.png")); // NOI18N
        jLabel3.setText("E-mail");
        jLabel3.setMaximumSize(new java.awt.Dimension(900, 750));
        jLabel3.setMinimumSize(new java.awt.Dimension(900, 750));
        jLabel3.setPreferredSize(new java.awt.Dimension(900, 750));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-40, 0, 960, 540);

        pack();
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JFormattedTextField marcaInput;
    private javax.swing.JFormattedTextField modeloInput;
    private javax.swing.JFormattedTextField nameInput;
    private javax.swing.JComboBox<String> ofertaInput;
    private javax.swing.JButton sair;
    private javax.swing.JButton salvar;
    // End of variables declaration                   
}
