package sustentanet.src;

import classes.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import src.connection.mysql;

public class CadastroUsuario extends javax.swing.JFrame {

    private String getEmail() {
        return email.getText();
    }

    private String getTelefone() {
        return telefone.getText();
    }

    private String getCEP() {
        return cep.getText();
    }

    private String getNascimento() {
        return nascimento.getText();
    }

    private String getSenha() {
        return senha.getText();
    }

    private String getNome() {
        return nome.getText();
    }

    private String getEndereco() {
        return endereco.getText();
    }

    private String getEnderecoNumero() {
        return endereco_num.getText();
    }

    private String getCidade() {
        return cidade.getText();
    }

    private String getEstado() {
        return estado.getText();
    }

    public CadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JFormattedTextField();
        telefone = new javax.swing.JFormattedTextField();
        cep = new javax.swing.JFormattedTextField();
        textNascimento = new javax.swing.JLabel();
        textTelefonme = new javax.swing.JLabel();
        nascimento = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        textEmail = new javax.swing.JLabel();
        textCep = new javax.swing.JLabel();
        textSenha = new javax.swing.JLabel();
        senha = new javax.swing.JFormattedTextField();
        nome = new javax.swing.JFormattedTextField();
        textAddress = new javax.swing.JLabel();
        endereco = new javax.swing.JFormattedTextField();
        textNumero = new javax.swing.JLabel();
        endereco_num = new javax.swing.JFormattedTextField();
        textCidade = new javax.swing.JLabel();
        cidade = new javax.swing.JFormattedTextField();
        textEstado = new javax.swing.JLabel();
        estado = new javax.swing.JFormattedTextField();
        salvar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        textnome = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
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
        setTitle("Cadastro de Usuário");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(810, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Confirmar senha");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 380, 150, 16);
        getContentPane().add(email);
        email.setBounds(30, 200, 320, 22);
        getContentPane().add(telefone);
        telefone.setBounds(30, 250, 320, 22);
        getContentPane().add(cep);
        cep.setBounds(450, 360, 320, 22);

        textNascimento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textNascimento.setText("Data de nascimento");
        getContentPane().add(textNascimento);
        textNascimento.setBounds(30, 280, 180, 16);

        textTelefonme.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textTelefonme.setText("Telefone");
        getContentPane().add(textTelefonme);
        textTelefonme.setBounds(30, 230, 100, 16);
        getContentPane().add(nascimento);
        nascimento.setBounds(30, 300, 320, 22);
        getContentPane().add(jFormattedTextField5);
        jFormattedTextField5.setBounds(30, 400, 320, 22);

        textEmail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textEmail.setText("E-mail");
        getContentPane().add(textEmail);
        textEmail.setBounds(30, 180, 90, 16);

        textCep.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textCep.setText("CEP");
        getContentPane().add(textCep);
        textCep.setBounds(450, 340, 110, 16);

        textSenha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textSenha.setText("Senha");
        getContentPane().add(textSenha);
        textSenha.setBounds(30, 330, 110, 16);
        getContentPane().add(senha);
        senha.setBounds(30, 350, 320, 22);
        getContentPane().add(nome);
        nome.setBounds(30, 150, 320, 22);

        textAddress.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textAddress.setText("Endereço");
        getContentPane().add(textAddress);
        textAddress.setBounds(450, 140, 110, 16);
        getContentPane().add(endereco);
        endereco.setBounds(450, 160, 320, 22);

        textNumero.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textNumero.setText("Número");
        getContentPane().add(textNumero);
        textNumero.setBounds(450, 190, 110, 16);
        getContentPane().add(endereco_num);
        endereco_num.setBounds(450, 210, 320, 22);

        textCidade.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textCidade.setText("Cidade");
        getContentPane().add(textCidade);
        textCidade.setBounds(450, 240, 110, 16);
        getContentPane().add(cidade);
        cidade.setBounds(450, 260, 320, 22);

        textEstado.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textEstado.setText("Estado");
        getContentPane().add(textEstado);
        textEstado.setBounds(450, 290, 110, 16);
        getContentPane().add(estado);
        estado.setBounds(450, 310, 320, 22);

        salvar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(680, 540, 80, 30);

        sair.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(30, 540, 70, 30);

        textnome.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textnome.setText("Nome");
        getContentPane().add(textnome);
        textnome.setBounds(30, 130, 110, 16);

        texto2.setBackground(new java.awt.Color(255, 255, 255));
        texto2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        texto2.setText("Cadastro de Usuários");
        getContentPane().add(texto2);
        texto2.setBounds(290, 40, 220, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sustentanet/src/img/Capa de Fundo SustentaNet.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -10, 840, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        try {
            Usuario usuario = new Usuario();
            usuario.setUser(
                    getNome(),
                    getSenha(),
                    getEmail(),
                    getEndereco(),
                    getTelefone(),
                    getNascimento(),
                    getEnderecoNumero(),
                    getCidade(),
                    getEstado(),
                    getCEP());

            this.dispose();
            TelaLogin telaLogin = new TelaLogin();
            telaLogin.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos inteiros para Número da residência e Data de Nascimento.", "Erro", JOptionPane.ERROR_MESSAGE);
            limparCampos();
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed

        this.dispose();
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_sairActionPerformed

    private void limparCampos() {
        email.setText("");
        telefone.setText("");
        cep.setText("");
        nascimento.setText("");
        senha.setText("");
        nome.setText("");
        endereco.setText("");
        endereco_num.setText("");
        cidade.setText("");
        estado.setText("");
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JFormattedTextField cidade;
    private javax.swing.JFormattedTextField email;
    private javax.swing.JFormattedTextField endereco;
    private javax.swing.JFormattedTextField endereco_num;
    private javax.swing.JFormattedTextField estado;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JFormattedTextField nascimento;
    private javax.swing.JFormattedTextField nome;
    private javax.swing.JButton sair;
    private javax.swing.JButton salvar;
    private javax.swing.JFormattedTextField senha;
    private javax.swing.JFormattedTextField telefone;
    private javax.swing.JLabel textAddress;
    private javax.swing.JLabel textCep;
    private javax.swing.JLabel textCidade;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textEstado;
    private javax.swing.JLabel textNascimento;
    private javax.swing.JLabel textNumero;
    private javax.swing.JLabel textSenha;
    private javax.swing.JLabel textTelefonme;
    private javax.swing.JLabel textnome;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}
