import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
    private int id;
    private String nome;
    private String senha;
    private String email;

    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public void salvarNoBanco() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/seubanco", "seuusuario", "suasenha");
            String sql = "INSERT INTO Usuarios (nome, senha, email) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, this.nome);
            pstmt.setString(2, this.senha);
            pstmt.setString(3, this.email);

            pstmt.executeUpdate();

            ResultSet generatedKeys = pstmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                this.id = generatedKeys.getInt(1);
            }

            pstmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getNome() {
        return null;
    }

    public String getSenha() {
        return null;
    }

    public String getEmail() {
        return null;
    }

    //Daqui pra baixo inserir os outros métodos, como atualizar o usuário, e excluir do banco por exemplo.
}
