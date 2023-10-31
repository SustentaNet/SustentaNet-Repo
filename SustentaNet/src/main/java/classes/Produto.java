package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import src.connection.mysql;

public class Produto {

    private int id;
    private String title;
    private String model;
    private String description;
    private int user_id;
    private String offer;

    public Produto(int id, String title, String model, String description, int user_id, String offer) {
        this.id = id;
        this.title = title;
        this.model = model;
        this.description = description;
        this.user_id = user_id;
        this.offer = offer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return title;
    }

    public void setNome(String title) {
        this.title = title;
    }

    public String getModelo() {
        return model;
    }

    public void setModelo(String model) {
        this.model = model;
    }

    public String getDescricao() {
        return description;
    }

    public void setDescricao(String description) {
        this.description = description;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public void setProduto() {
        try {
            Connection conexao = mysql.getConnection();
            String sql = "insert into Produtos (title, model, description, user_id, offer) values (?, ?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setString(1, this.title);
            statement.setString(2, this.model);
            statement.setString(3, this.description);
            statement.setInt(4, this.user_id);
            statement.setString(5, this.offer);

            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                this.id = generatedKeys.getInt(1);
            }

            statement.close();
            conexao.close();
        } catch (SQLException e) {
        }
    }

    public List<Produto> getProdutos() {
        List<Produto> produtos = new ArrayList<>();
        try {
            Connection conexao = mysql.getConnection();
            String sql = "select * from produtos";
            PreparedStatement statement = conexao.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Produto produto = new Produto(
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("model"),
                        resultSet.getString("description"),
                        resultSet.getInt("user_id"),
                        resultSet.getString("offer")
                );

                produtos.add(produto);
            }

            statement.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace(); // Trate o erro de alguma forma adequada, como logar ou lançar uma exceção.
        }
        return produtos;
    }

    public Produto getProdutoById(int id) {
        Produto produto = null;
        try {
            Connection conexao = mysql.getConnection();
            String sql = "select * from produtos where id = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                produto = new Produto(
                        resultSet.getInt(id),
                        resultSet.getString(title),
                        resultSet.getString(model),
                        resultSet.getString(description),
                        resultSet.getInt(user_id),
                        resultSet.getString(offer)
                );

                statement.close();
                conexao.close();
            }

        } catch (SQLException e) {
        }
        return produto;
    }

    public Produto getProdutoByName(String nameProd) {
        Produto produto = null;
        try {
            Connection conexao = mysql.getConnection();
            String sql = "select * from produtos where name = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setString(1, nameProd);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                produto = new Produto(
                        resultSet.getInt(id),
                        resultSet.getString(title),
                        resultSet.getString(model),
                        resultSet.getString(description),
                        resultSet.getInt(user_id),
                        resultSet.getString(offer)
                );

                statement.close();
                conexao.close();
            }

        } catch (SQLException e) {
        }
        return produto;
    }

    public void deleteProdutoById(int id) {
        try {
            Connection conexao = mysql.getConnection();
            String sql = "DELETE FROM produtos WHERE id = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setInt(1, id);

            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Produto excluído com sucesso!");
            } else {
                System.out.println("Nenhum produto encontrado com o ID fornecido.");
            }

            statement.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
