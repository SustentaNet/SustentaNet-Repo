
package sustentanet.src;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import static io.jsonwebtoken.Jwts.claims;
import utils.TokenSingleton;


public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        addItem = new javax.swing.JButton();
        searchItem = new javax.swing.JButton();
        searchUser = new javax.swing.JButton();
        perfil = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(970, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        addItem.setBackground(new java.awt.Color(255, 255, 255));
        addItem.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        addItem.setForeground(new java.awt.Color(0, 0, 0));
        addItem.setText("Adicionar item");
        addItem.setMaximumSize(new java.awt.Dimension(136, 26));
        addItem.setMinimumSize(new java.awt.Dimension(136, 26));
        addItem.setPreferredSize(new java.awt.Dimension(136, 26));
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });
        getContentPane().add(addItem);
        addItem.setBounds(170, 180, 150, 100);

        searchItem.setBackground(new java.awt.Color(255, 255, 255));
        searchItem.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        searchItem.setForeground(new java.awt.Color(0, 0, 0));
        searchItem.setText("Buscar um item");
        searchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemActionPerformed(evt);
            }
        });
        getContentPane().add(searchItem);
        searchItem.setBounds(420, 180, 150, 100);

        searchUser.setBackground(new java.awt.Color(255, 255, 255));
        searchUser.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        searchUser.setForeground(new java.awt.Color(0, 0, 0));
        searchUser.setText("Buscar usuário");
        searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserActionPerformed(evt);
            }
        });
        getContentPane().add(searchUser);
        searchUser.setBounds(650, 180, 150, 100);

        perfil.setBackground(new java.awt.Color(255, 255, 255));
        perfil.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        perfil.setForeground(new java.awt.Color(0, 0, 0));
        perfil.setText("Configurações");
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        getContentPane().add(perfil);
        perfil.setBounds(540, 360, 150, 100);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Meus itens");
        getContentPane().add(jButton6);
        jButton6.setBounds(300, 360, 150, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\NetBeansProjects\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\leaf-1691620_960_720.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1800, 1300));
        jLabel1.setMinimumSize(new java.awt.Dimension(1800, 1300));
        jLabel1.setPreferredSize(new java.awt.Dimension(1800, 1300));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -50, 960, 740);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(560, 580, 112, 112);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.dispose();
        CadastroItem addItem = new CadastroItem();
        addItem.setVisible(true);
    }                                       

    private void searchItemActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.dispose();
        BuscaItem searchItem = new BuscaItem();
        searchItem.setVisible(true);
    }                                          

    private void searchUserActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.dispose();
        BuscaUsuario searchUser = new BuscaUsuario();
        searchUser.setVisible(true);
    }                                          

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String token = TokenSingleton.getInstance().getToken();
        Jws<Claims> claims = Jwts.parser().setSigningKey("susnet").parseClaimsJws(token);
        String userId = claims.getBody().getSubject();
        
        this.dispose();
        PerfilUsuario user = new PerfilUsuario(Integer.parseInt(userId));
        user.setVisible(true);
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addItem;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton perfil;
    private javax.swing.JButton searchItem;
    private javax.swing.JButton searchUser;
    // End of variables declaration                   
}
