import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Produto {
    private int id;
    private String nome;
    private String modelo;
    private String descricao;
    private int proprietarioId;

    public Produto(String nome, String modelo, String descricao, int proprietarioId) {
        this.nome = nome;
        this.modelo = modelo;
        this.descricao = descricao;
        this.proprietarioId = proprietarioId;
    }

    public void salvarNoBanco() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/seubanco", "seuusuario", "suasenha");
            String sql = "INSERT INTO Produtos (nome, modelo, descricao, proprietario_id) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, this.nome);
            pstmt.setString(2, this.modelo);
            pstmt.setString(3, this.descricao);
            pstmt.setInt(4, this.proprietarioId);

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
}
