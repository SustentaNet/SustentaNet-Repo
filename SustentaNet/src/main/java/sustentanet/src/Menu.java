package sustentanet.src;

import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import utils.TokenSingleton;

public class Menu extends javax.swing.JFrame {
    
   
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addItem = new javax.swing.JButton();
        searchItem = new javax.swing.JButton();
        searchUser = new javax.swing.JButton();
        perfil = new javax.swing.JButton();
        MyItems = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        addItem.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
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
        addItem.setBounds(140, 220, 150, 100);

        searchItem.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        searchItem.setText("Buscar um item");
        searchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemActionPerformed(evt);
            }
        });
        getContentPane().add(searchItem);
        searchItem.setBounds(230, 360, 150, 100);

        searchUser.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        searchUser.setText("Buscar usuário");
        searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserActionPerformed(evt);
            }
        });
        getContentPane().add(searchUser);
        searchUser.setBounds(330, 220, 150, 100);

        perfil.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        perfil.setText("Configurações");
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        getContentPane().add(perfil);
        perfil.setBounds(440, 360, 150, 100);

        MyItems.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        MyItems.setText("Meus itens");
        MyItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyItemsActionPerformed(evt);
            }
        });
        getContentPane().add(MyItems);
        MyItems.setBounds(520, 220, 150, 100);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Menu SustenaNet");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 80, 240, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\SustentaNet(versão final)\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\Capa de Fundo SustentaNet.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -60, 830, 660);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        this.dispose();
        CadastroItem addItem = new CadastroItem();
        addItem.setVisible(true);
    }//GEN-LAST:event_addItemActionPerformed

    private void searchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemActionPerformed
        this.dispose();
        BuscaItem searchItem = new BuscaItem();
        searchItem.setVisible(true);
    }//GEN-LAST:event_searchItemActionPerformed

    private void searchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserActionPerformed
        this.dispose();
        BuscaUsuario searchUser = new BuscaUsuario();
        searchUser.setVisible(true);
    }//GEN-LAST:event_searchUserActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        String token = TokenSingleton.getInstance().getToken();
        Jws<Claims> claims = Jwts.parser().setSigningKey("susnet").parseClaimsJws(token);
        String userId = claims.getBody().getSubject();

        this.dispose();
        PerfilUsuario user = new PerfilUsuario(Integer.parseInt(userId));
        user.setVisible(true);
    }//GEN-LAST:event_perfilActionPerformed

    private void MyItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyItemsActionPerformed
        String token = TokenSingleton.getInstance().getToken();
        Jws<Claims> claims = Jwts.parser().setSigningKey("susnet").parseClaimsJws(token);
        String userId = claims.getBody().getSubject();

        this.dispose();
        MeusItens myItems = new MeusItens(Integer.parseInt(userId));
        myItems.setVisible(true);
    }//GEN-LAST:event_MyItemsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MyItems;
    private javax.swing.JButton addItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton perfil;
    private javax.swing.JButton searchItem;
    private javax.swing.JButton searchUser;
    // End of variables declaration//GEN-END:variables
}
