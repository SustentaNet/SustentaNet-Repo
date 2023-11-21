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
        emailtxt.setText(usuario.getCep());
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
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        estadotxt = new javax.swing.JLabel();
        cidadetxt = new javax.swing.JLabel();
        emailtxt = new javax.swing.JLabel();
        aniversariotxt = new javax.swing.JLabel();
        aaaaa = new javax.swing.JLabel();
        ceptxt1 = new javax.swing.JLabel();
        nometxt = new javax.swing.JLabel();
        phonetxt = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
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
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(610, 510));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ANIVERSÁRIO");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 30, 170, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CONTATOS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 320, 120, 30);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("NOME DO USUÁRIO");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(40, 20, 240, 40);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CIDADE");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 160, 120, 20);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ESTADO");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(60, 160, 120, 20);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CEP");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(440, 160, 90, 20);

        estadotxt.setForeground(new java.awt.Color(0, 0, 0));
        estadotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadotxt.setText("jLabel1");
        estadotxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(estadotxt);
        estadotxt.setBounds(50, 210, 140, 40);

        cidadetxt.setForeground(new java.awt.Color(0, 0, 0));
        cidadetxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cidadetxt.setText("jLabel1");
        cidadetxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cidadetxt);
        cidadetxt.setBounds(230, 210, 140, 40);

        emailtxt.setForeground(new java.awt.Color(0, 0, 0));
        emailtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailtxt.setText("jLabel1");
        emailtxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(emailtxt);
        emailtxt.setBounds(150, 420, 170, 40);

        aniversariotxt.setForeground(new java.awt.Color(0, 0, 0));
        aniversariotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aniversariotxt.setText("jLabel1");
        aniversariotxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(aniversariotxt);
        aniversariotxt.setBounds(350, 70, 170, 40);

        aaaaa.setForeground(new java.awt.Color(0, 0, 0));
        aaaaa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aaaaa.setText("Ir para itens");
        aaaaa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aaaaa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aaaaaMouseClicked(evt);
            }
        });
        getContentPane().add(aaaaa);
        aaaaa.setBounds(370, 390, 170, 40);

        ceptxt1.setForeground(new java.awt.Color(0, 0, 0));
        ceptxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ceptxt1.setText("jLabel1");
        ceptxt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ceptxt1);
        ceptxt1.setBounds(420, 210, 130, 40);

        nometxt.setForeground(new java.awt.Color(0, 0, 0));
        nometxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nometxt.setText("jLabel2");
        nometxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(nometxt);
        nometxt.setBounds(60, 70, 210, 40);

        phonetxt.setForeground(new java.awt.Color(0, 0, 0));
        phonetxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phonetxt.setText("jLabel1");
        phonetxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(phonetxt);
        phonetxt.setBounds(150, 370, 170, 40);

        sair.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        sair.setText("Voltar");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(20, 430, 80, 30);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DISPONÍVEIS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 330, 150, 23);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ITENS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 300, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sustentanet/src/img/Capa de Fundo SustentaNet.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -20, 690, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_sairActionPerformed

    private void aaaaaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaaaaMouseClicked
        this.dispose();
        viewItem itens = new viewItem(userId);
        itens.setVisible(true);
    }//GEN-LAST:event_aaaaaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aaaaa;
    private javax.swing.JLabel aniversariotxt;
    private javax.swing.JLabel ceptxt1;
    private javax.swing.JLabel cidadetxt;
    private javax.swing.JLabel emailtxt;
    private javax.swing.JLabel estadotxt;
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
    private javax.swing.JLabel phonetxt;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
