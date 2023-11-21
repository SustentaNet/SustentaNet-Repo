package sustentanet.src;

import classes.Usuario;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoNatureGreenIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.UIManager;
import utils.TokenSingleton;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        emailInput = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        sign_in = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        senhaInput = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(247, 230, 176));
        jPanel2.setForeground(new java.awt.Color(247, 230, 176));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 350));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(emailInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 380, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("E-mail");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 170, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Senha");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 170, -1));

        cancel.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 100, 30));

        registrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        registrar.setText("Criar uma nova conta");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel2.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 210, 30));

        sign_in.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        sign_in.setText("Entrar");
        sign_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_inActionPerformed(evt);
            }
        });
        jPanel2.add(sign_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 100, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 380, 10));

        senhaInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaInputKeyPressed(evt);
            }
        });
        jPanel2.add(senhaInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 380, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 380, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sustentanet/src/img/Logo SustentaNet.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -30, 490, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sign_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_inActionPerformed
        String email = emailInput.getText();
        String senha = String.valueOf(senhaInput.getPassword());
        
        Usuario usuario = Usuario.getUserByEmail(email);
        int id = usuario.getId();

        if (usuario != null && usuario.getPassword().equals(senha) && usuario.getEmail().equals(email)) {
            String token = gerarToken(id);
            TokenSingleton.getInstance().setToken(token);
            
            System.out.println("Autenticação bem-sucedida");
            System.out.println("Token gerado: " + token);
            System.out.println(token);
                    
            this.dispose();
            Menu menu = new Menu();
            menu.setVisible(true);

        } else {
            System.out.println("Autenticação falhou");
        }
    }//GEN-LAST:event_sign_inActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

        System.exit(0);

    }//GEN-LAST:event_cancelActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        this.dispose();
        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.setVisible(true);
    }//GEN-LAST:event_registrarActionPerformed

    private void senhaInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaInputKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sign_in.doClick();
        }
    }//GEN-LAST:event_senhaInputKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        try{
            FlatSolarizedLightIJTheme.setup();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    private String gerarToken(int id) {
        String chaveSecreta = "susnet";
        Date dataExpiracao = new Date(System.currentTimeMillis() + 3600000);

        String token = Jwts.builder()
                .setSubject(String.valueOf(id))
                .setExpiration(dataExpiracao)
                .signWith(SignatureAlgorithm.HS512, chaveSecreta)
                .compact();

        return token;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JFormattedTextField emailInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton registrar;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JButton sign_in;
    // End of variables declaration//GEN-END:variables
}
