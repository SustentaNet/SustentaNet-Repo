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
        jLabel10 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        textnome = new javax.swing.JLabel();
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
        setTitle("Cadastro de Usuário");
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Confirmar senha");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 330, 110, 16);

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(email);
        email.setBounds(90, 150, 280, 22);

        telefone.setBackground(new java.awt.Color(255, 255, 255));
        telefone.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(telefone);
        telefone.setBounds(90, 200, 280, 22);

        cep.setBackground(new java.awt.Color(255, 255, 255));
        cep.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(cep);
        cep.setBounds(520, 300, 280, 22);

        textNascimento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textNascimento.setForeground(new java.awt.Color(0, 0, 0));
        textNascimento.setText("Data de nascimento");
        getContentPane().add(textNascimento);
        textNascimento.setBounds(90, 230, 140, 16);

        textTelefonme.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textTelefonme.setForeground(new java.awt.Color(0, 0, 0));
        textTelefonme.setText("Telefone");
        getContentPane().add(textTelefonme);
        textTelefonme.setBounds(90, 180, 60, 16);

        nascimento.setBackground(new java.awt.Color(255, 255, 255));
        nascimento.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(nascimento);
        nascimento.setBounds(90, 250, 280, 22);

        jFormattedTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jFormattedTextField5);
        jFormattedTextField5.setBounds(90, 350, 280, 22);

        textEmail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textEmail.setForeground(new java.awt.Color(0, 0, 0));
        textEmail.setText("E-mail");
        getContentPane().add(textEmail);
        textEmail.setBounds(90, 130, 50, 16);

        textCep.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textCep.setForeground(new java.awt.Color(0, 0, 0));
        textCep.setText("CEP");
        getContentPane().add(textCep);
        textCep.setBounds(520, 280, 70, 16);

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 250, 45, 16);

        textSenha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textSenha.setForeground(new java.awt.Color(0, 0, 0));
        textSenha.setText("Senha");
        getContentPane().add(textSenha);
        textSenha.setBounds(90, 280, 70, 16);

        senha.setBackground(new java.awt.Color(255, 255, 255));
        senha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(senha);
        senha.setBounds(90, 300, 280, 22);

        nome.setBackground(new java.awt.Color(255, 255, 255));
        nome.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(nome);
        nome.setBounds(90, 100, 280, 22);

        textAddress.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textAddress.setForeground(new java.awt.Color(0, 0, 0));
        textAddress.setText("Endereço");
        getContentPane().add(textAddress);
        textAddress.setBounds(520, 80, 70, 16);

        endereco.setBackground(new java.awt.Color(255, 255, 255));
        endereco.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(endereco);
        endereco.setBounds(520, 100, 280, 22);

        textNumero.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textNumero.setForeground(new java.awt.Color(0, 0, 0));
        textNumero.setText("Número");
        getContentPane().add(textNumero);
        textNumero.setBounds(520, 130, 70, 16);

        endereco_num.setBackground(new java.awt.Color(255, 255, 255));
        endereco_num.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(endereco_num);
        endereco_num.setBounds(520, 150, 280, 22);

        textCidade.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textCidade.setForeground(new java.awt.Color(0, 0, 0));
        textCidade.setText("Cidade");
        getContentPane().add(textCidade);
        textCidade.setBounds(520, 180, 70, 16);

        cidade.setBackground(new java.awt.Color(255, 255, 255));
        cidade.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(cidade);
        cidade.setBounds(520, 200, 280, 22);

        textEstado.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textEstado.setForeground(new java.awt.Color(0, 0, 0));
        textEstado.setText("Estado");
        getContentPane().add(textEstado);
        textEstado.setBounds(520, 230, 70, 16);

        estado.setBackground(new java.awt.Color(255, 255, 255));
        estado.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(estado);
        estado.setBounds(520, 250, 280, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Buscar...");
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 350, 90, 23);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Adicionar foto");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 330, 100, 16);

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
        salvar.setBounds(720, 450, 80, 40);

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

        textnome.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        textnome.setForeground(new java.awt.Color(0, 0, 0));
        textnome.setText("Nome");
        getContentPane().add(textnome);
        textnome.setBounds(90, 80, 70, 16);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\duduh\\OneDrive\\Documentos\\NetBeansProjects\\SustentaNet\\src\\main\\java\\sustentanet\\src\\img\\gui-2906790_960_720.png")); // NOI18N
        jLabel3.setText("E-mail");
        jLabel3.setMaximumSize(new java.awt.Dimension(900, 750));
        jLabel3.setMinimumSize(new java.awt.Dimension(900, 750));
        jLabel3.setPreferredSize(new java.awt.Dimension(900, 750));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-40, 0, 960, 540);

        pack();
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
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    // End of variables declaration//GEN-END:variables
}
