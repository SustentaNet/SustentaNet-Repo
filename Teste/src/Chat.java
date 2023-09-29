import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Chat {
    private int id;
    private int usuarioId1;
    private int usuarioId2;

    public Chat(int usuarioId1, int usuarioId2) {
        this.usuarioId1 = usuarioId1;
        this.usuarioId2 = usuarioId2;
    }


    public void salvarNoBanco() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/seubanco", "seuusuario", "suasenha");
            String sql = "INSERT INTO Chats (usuario_id1, usuario_id2) VALUES (?, ?)";
            PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setInt(1, this.usuarioId1);
            pstmt.setInt(2, this.usuarioId2);

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
