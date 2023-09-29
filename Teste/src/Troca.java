import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Troca {
    private int id;
    private int usuarioId;
    private int produtoId;
    private String data;

    public Troca(int usuarioId, int produtoId, String data) {
        this.usuarioId = usuarioId;
        this.produtoId = produtoId;
        this.data = data;
    }


    public void salvarNoBanco() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/seubanco", "seuusuario", "suasenha");
            String sql = "INSERT INTO Trocas (usuario_id, produto_id, data) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setInt(1, this.usuarioId);
            pstmt.setInt(2, this.produtoId);
            pstmt.setString(3, this.data);

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
