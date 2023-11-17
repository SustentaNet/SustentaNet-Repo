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

        modelotxt.setText(produto.getNome());
        categoriatxt.setText(produto.getMarca());
        modelotxt.setText(produto.getModelo());
        descricaotxt.setText(produto.getDescricao());
        vendedortxt.setText(user.getName());
        categoriatxt.setText(produto.getCategory());
        titletxt.setText(produto.getNome());
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
        vendedortxt = new javax.swing.JLabel();
        modelotxt = new javax.swing.JLabel();
        descricaotxt = new javax.swing.JLabel();
        Marca_Modelo1 = new javax.swing.JLabel();
        categoriatxt = new javax.swing.JLabel();
        Marca_Modelo3 = new javax.swing.JLabel();
        Marca_Modelo2 = new javax.swing.JLabel();
        titletxt = new javax.swing.JLabel();
        marcatxt1 = new javax.swing.JLabel();
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
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(719, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        Marca_Modelo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Marca_Modelo.setForeground(new java.awt.Color(0, 0, 0));
        Marca_Modelo.setText("Descrição do Item");
        getContentPane().add(Marca_Modelo);
        Marca_Modelo.setBounds(90, 150, 200, 16);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Anunciado por");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 410, 170, 16);

        title.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Título da Venda");
        getContentPane().add(title);
        title.setBounds(280, 30, 180, 23);

        vendedortxt.setBackground(new java.awt.Color(0, 0, 0));
        vendedortxt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        vendedortxt.setForeground(new java.awt.Color(60, 63, 65));
        vendedortxt.setText("User");
        getContentPane().add(vendedortxt);
        vendedortxt.setBounds(90, 440, 130, 50);

        modelotxt.setBackground(new java.awt.Color(0, 0, 0));
        modelotxt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        modelotxt.setForeground(new java.awt.Color(0, 0, 0));
        modelotxt.setText("Modelo");
        getContentPane().add(modelotxt);
        modelotxt.setBounds(470, 300, 170, 60);

        descricaotxt.setBackground(new java.awt.Color(0, 0, 0));
        descricaotxt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        descricaotxt.setForeground(new java.awt.Color(0, 0, 0));
        descricaotxt.setText("Descrição");
        getContentPane().add(descricaotxt);
        descricaotxt.setBounds(90, 170, 350, 80);

        Marca_Modelo1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Marca_Modelo1.setForeground(new java.awt.Color(0, 0, 0));
        Marca_Modelo1.setText("Categoria");
        getContentPane().add(Marca_Modelo1);
        Marca_Modelo1.setBounds(90, 270, 110, 20);

        categoriatxt.setBackground(new java.awt.Color(0, 0, 0));
        categoriatxt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        categoriatxt.setForeground(new java.awt.Color(0, 0, 0));
        categoriatxt.setText("Categoria");
        getContentPane().add(categoriatxt);
        categoriatxt.setBounds(90, 310, 170, 50);

        Marca_Modelo3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Marca_Modelo3.setForeground(new java.awt.Color(0, 0, 0));
        Marca_Modelo3.setText("Marca");
        getContentPane().add(Marca_Modelo3);
        Marca_Modelo3.setBounds(470, 150, 80, 16);

        Marca_Modelo2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Marca_Modelo2.setForeground(new java.awt.Color(0, 0, 0));
        Marca_Modelo2.setText("Modelo");
        getContentPane().add(Marca_Modelo2);
        Marca_Modelo2.setBounds(470, 270, 80, 16);

        titletxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titletxt.setForeground(new java.awt.Color(0, 0, 0));
        titletxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titletxt.setText("Título");
        getContentPane().add(titletxt);
        titletxt.setBounds(300, 70, 120, 20);

        marcatxt1.setBackground(new java.awt.Color(0, 0, 0));
        marcatxt1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        marcatxt1.setForeground(new java.awt.Color(0, 0, 0));
        marcatxt1.setText("Marca");
        getContentPane().add(marcatxt1);
        marcatxt1.setBounds(470, 180, 160, 50);

        voltar.setText("Sair");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(610, 470, 80, 30);

        contato.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        contato.setText("Ver contatos");
        contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contatoActionPerformed(evt);
            }
        });
        getContentPane().add(contato);
        contato.setBounds(480, 470, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\SustentaNet(versão final)\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\Capa de Fundo SustentaNet.png")); // NOI18N
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
    private javax.swing.JLabel marcatxt1;
    private javax.swing.JLabel modelotxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titletxt;
    private javax.swing.JLabel vendedortxt;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
