package sustentanet.src;

import classes.Produto;
import classes.Usuario;

public class InterfaceItem extends javax.swing.JFrame {

    private int produtoId;
    private int id;

    public InterfaceItem(int produtoId) {
        initComponents();
        this.produtoId = produtoId;
        carregarDetalhesDoPerfil();
    }

    private void carregarDetalhesDoPerfil() {

        Produto produto = Produto.getProdutoById(produtoId);
        id = produto.getUser_id();
        Usuario user = Usuario.getUser(id);

        titletxt.setText(produto.getNome());
        marcatxt.setText(produto.getMarca());
        modelotxt.setText(produto.getModelo());
        descricaotxt.setText(produto.getDescricao());
        vendedortxt.setText(user.getName());
        categoriatxt.setText(produto.getCategory());
    }

    public InterfaceItem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        Marca_Modelo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        Marca_Modelo1 = new javax.swing.JLabel();
        Marca_Modelo3 = new javax.swing.JLabel();
        Marca_Modelo2 = new javax.swing.JLabel();
        descricaotxt = new javax.swing.JLabel();
        marcatxt = new javax.swing.JLabel();
        modelotxt = new javax.swing.JLabel();
        categoriatxt = new javax.swing.JLabel();
        vendedortxt = new javax.swing.JLabel();
        titletxt = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        contato = new javax.swing.JButton();
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
        setTitle("Visualizar Item");
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(730, 555));
        setResizable(false);
        getContentPane().setLayout(null);

        Marca_Modelo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Marca_Modelo.setForeground(new java.awt.Color(0, 0, 0));
        Marca_Modelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Marca_Modelo.setText("DESCRIÇÃO DO ITEM");
        getContentPane().add(Marca_Modelo);
        Marca_Modelo.setBounds(30, 150, 230, 16);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ANUNCIADO POR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 410, 200, 16);

        title.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("TÍTULO DA VENDA");
        getContentPane().add(title);
        title.setBounds(270, 30, 210, 23);

        Marca_Modelo1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Marca_Modelo1.setForeground(new java.awt.Color(0, 0, 0));
        Marca_Modelo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Marca_Modelo1.setText("CATEGORIA");
        getContentPane().add(Marca_Modelo1);
        Marca_Modelo1.setBounds(30, 290, 140, 20);

        Marca_Modelo3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Marca_Modelo3.setForeground(new java.awt.Color(0, 0, 0));
        Marca_Modelo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Marca_Modelo3.setText("MARCA");
        getContentPane().add(Marca_Modelo3);
        Marca_Modelo3.setBounds(440, 150, 90, 16);

        Marca_Modelo2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Marca_Modelo2.setForeground(new java.awt.Color(0, 0, 0));
        Marca_Modelo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Marca_Modelo2.setText("MODELO");
        getContentPane().add(Marca_Modelo2);
        Marca_Modelo2.setBounds(440, 290, 110, 16);

        descricaotxt.setForeground(new java.awt.Color(0, 0, 0));
        descricaotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descricaotxt.setText("jLabel1");
        descricaotxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(descricaotxt);
        descricaotxt.setBounds(40, 190, 300, 70);

        marcatxt.setForeground(new java.awt.Color(0, 0, 0));
        marcatxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marcatxt.setText("jLabel1");
        marcatxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(marcatxt);
        marcatxt.setBounds(450, 200, 230, 40);

        modelotxt.setForeground(new java.awt.Color(0, 0, 0));
        modelotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modelotxt.setText("jLabel1");
        modelotxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(modelotxt);
        modelotxt.setBounds(450, 330, 230, 40);

        categoriatxt.setForeground(new java.awt.Color(0, 0, 0));
        categoriatxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoriatxt.setText("jLabel1");
        categoriatxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(categoriatxt);
        categoriatxt.setBounds(40, 330, 230, 40);

        vendedortxt.setForeground(new java.awt.Color(0, 0, 0));
        vendedortxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vendedortxt.setText("jLabel1");
        vendedortxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(vendedortxt);
        vendedortxt.setBounds(480, 460, 170, 40);

        titletxt.setForeground(new java.awt.Color(0, 0, 0));
        titletxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titletxt.setText("jLabel1");
        titletxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(titletxt);
        titletxt.setBounds(260, 70, 220, 40);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(40, 470, 80, 30);

        contato.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        contato.setText("Ver Perfil");
        contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contatoActionPerformed(evt);
            }
        });
        getContentPane().add(contato);
        contato.setBounds(330, 470, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sustentanet/src/img/Capa de Fundo SustentaNet.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -20, 920, 630);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void contatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contatoActionPerformed
        this.dispose();
        PerfilUsuario perfil = new PerfilUsuario(id);
        perfil.setVisible(true);
    }//GEN-LAST:event_contatoActionPerformed

    private void abrirPaginaPerfil(int id) {
        this.dispose();
        PerfilUsuario perfilUsuario = new PerfilUsuario(id);
        perfilUsuario.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Marca_Modelo;
    private javax.swing.JLabel Marca_Modelo1;
    private javax.swing.JLabel Marca_Modelo2;
    private javax.swing.JLabel Marca_Modelo3;
    private javax.swing.JLabel categoriatxt;
    private javax.swing.JButton contato;
    private javax.swing.JLabel descricaotxt;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel marcatxt;
    private javax.swing.JLabel modelotxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titletxt;
    private javax.swing.JLabel vendedortxt;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
