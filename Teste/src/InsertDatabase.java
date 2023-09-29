import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDatabase {
    private Connection conexao;

    public InsertDatabase() {
        try {
            // Comando para inicializar o banco de dados
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/seubanco", "seuusuario", "suasenha");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inserirUsuario(Usuario usuario) {
        try {
            // Inicio da declaração de SQL pra inserir os dados no banco
            String sql = "INSERT INTO Usuarios (nome, senha, email) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            
            // Defini os paramêtros
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getSenha());
            pstmt.setString(3, usuario.getEmail());

            // Executar a inserção
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Outros métodos 
}
