package sustentanet.src;

import classes.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.awt.event.KeyEvent;
import java.util.Date;
import utils.TokenSingleton;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        emailInput = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sign_in = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        senhaInput = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(650, 350));
        jPanel2.setMinimumSize(new java.awt.Dimension(650, 350));
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 350));
        jPanel2.setLayout(null);

        emailInput.setBackground(new java.awt.Color(255, 255, 255));
        emailInput.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(emailInput);
        emailInput.setBounds(360, 110, 250, 22);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("E-mail");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(360, 90, 41, 16);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Senha");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(360, 160, 41, 16);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\NetBeansProjects\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\eco-5465473_960_720.png")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(300, 200));
        jLabel4.setMinimumSize(new java.awt.Dimension(300, 200));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(-190, -120, 530, 600);

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cancel.setForeground(new java.awt.Color(0, 0, 0));
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel);
        cancel.setBounds(360, 220, 90, 21);

        registrar.setBackground(new java.awt.Color(153, 255, 153));
        registrar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        registrar.setForeground(new java.awt.Color(0, 0, 0));
        registrar.setText("Criar uma nova conta");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel2.add(registrar);
        registrar.setBounds(360, 290, 250, 50);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Bem-vindo ao ECOSHARE!");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(380, 30, 210, 18);

        sign_in.setBackground(new java.awt.Color(255, 255, 255));
        sign_in.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        sign_in.setForeground(new java.awt.Color(0, 0, 0));
        sign_in.setText("Entrar");
        sign_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_inActionPerformed(evt);
            }
        });
        jPanel2.add(sign_in);
        sign_in.setBounds(520, 220, 90, 21);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(360, 270, 250, 3);

        senhaInput.setBackground(new java.awt.Color(255, 255, 255));
        senhaInput.setForeground(new java.awt.Color(0, 0, 0));
        senhaInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaInputKeyPressed(evt);
            }
        });
        jPanel2.add(senhaInput);
        senhaInput.setBounds(360, 180, 250, 22);

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
    }// </editor-fold>                        

    private void sign_inActionPerformed(java.awt.event.ActionEvent evt) {                                        
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
    }                                       

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {                                       

        System.exit(0);

    }                                      

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.dispose();
        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.setVisible(true);
    }                                         

    private void senhaInputKeyPressed(java.awt.event.KeyEvent evt) {                                      
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sign_in.doClick();
        }
    }                                     

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

    // Variables declaration - do not modify                     
    private javax.swing.JButton cancel;
    private javax.swing.JFormattedTextField emailInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton registrar;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JButton sign_in;
    // End of variables declaration                   
}
