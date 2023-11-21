package sustentanet.src;

import classes.Usuario;

public class PerfilUsuario extends javax.swing.JFrame {

    private int userId;

    public PerfilUsuario(int userId) {
        initComponents();
        this.userId = userId;
        carregarDetalhesDoPerfil();
    }

    private void carregarDetalhesDoPerfil() {

        Usuario usuario = Usuario.getUser(userId);
        
        nometxt.setText(usuario.getName());
        ceptxt.setText(usuario.getCep());
        emailtxt.setText(usuario.getEmail());
        phonetxt.setText(usuario.getPhone());
        cidadetxt.setText(usuario.getCity());
        estadotxt.setText(usuario.getState());
        aniversariotxt.setText(usuario.getBirthday());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        itens = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        estadotxt = new javax.swing.JLabel();
        cidadetxt = new javax.swing.JLabel();
        nometxt = new javax.swing.JLabel();
        ceptxt = new javax.swing.JLabel();
        aniversariotxt = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        phonetxt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        setTitle("Perfil do usuário");
        setMinimumSize(new java.awt.Dimension(600, 479));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Aniversário");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 110, 120, 20);

        emailtxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        emailtxt.setText("Email");
        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });
        getContentPane().add(emailtxt);
        emailtxt.setBounds(170, 390, 130, 70);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contatos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 340, 100, 30);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("NOME DO USUÁRIO");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(230, 20, 160, 40);

        itens.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        itens.setText("Ver Itens");
        itens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itensActionPerformed(evt);
            }
        });
        getContentPane().add(itens);
        itens.setBounds(470, 390, 100, 70);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cidade");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 210, 120, 20);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Estado");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 210, 120, 20);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CEP");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(470, 210, 90, 20);

        estadotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadotxt.setText("jLabel1");
        getContentPane().add(estadotxt);
        estadotxt.setBounds(60, 260, 100, 16);

        cidadetxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cidadetxt.setText("jLabel1");
        getContentPane().add(cidadetxt);
        cidadetxt.setBounds(270, 260, 100, 16);

        nometxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nometxt.setText("jLabel1");
        getContentPane().add(nometxt);
        nometxt.setBounds(260, 70, 100, 16);

        ceptxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ceptxt.setText("jLabel1");
        getContentPane().add(ceptxt);
        ceptxt.setBounds(470, 260, 90, 16);

        aniversariotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aniversariotxt.setText("jLabel1");
        getContentPane().add(aniversariotxt);
        aniversariotxt.setBounds(250, 150, 130, 16);

        sair.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(40, 410, 80, 30);

        phonetxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        phonetxt.setText("phone");
        phonetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetxtActionPerformed(evt);
            }
        });
        getContentPane().add(phonetxt);
        phonetxt.setBounds(310, 390, 130, 70);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Disponíveis");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 350, 130, 23);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Itens ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(480, 320, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sustentanet/src/img/Capa de Fundo SustentaNet.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -20, 690, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itensActionPerformed
        this.dispose();
        viewItem itens = new viewItem(userId);
        itens.setVisible(true);
    }//GEN-LAST:event_itensActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void phonetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetxtActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_sairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aniversariotxt;
    private javax.swing.JLabel ceptxt;
    private javax.swing.JLabel cidadetxt;
    private javax.swing.JButton emailtxt;
    private javax.swing.JLabel estadotxt;
    private javax.swing.JButton itens;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nometxt;
    private javax.swing.JButton phonetxt;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
