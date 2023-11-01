package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import src.connection.mysql;

public class Produto {

    private int id;
    private String title;
    private String model;
    private String description;
    private int user_id;
    private String offer;
    private String marca;
    private String category;

    public Produto() {
        super();
    }

    public Produto(int id, String title, String model, String description, int user_id, String offer, String marca, String category) {
        this.id = id;
        this.title = title;
        this.model = model;
        this.description = description;
        this.user_id = user_id;
        this.offer = offer;
        this.marca = marca;
        this.category = category;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProduto(String title1, String description1, String model1, String marca1, String offer1, String category1, String userId) {
        try {
            Connection conexao = mysql.getConnection();
            String sql = "insert into Produtos (title, model, description, user_id, offer, marca, category) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setString(1, title1);
            statement.setString(2, model1);
            statement.setString(3, description1);
            statement.setInt(4, Integer.parseInt(userId)); // Converta o userId para um inteiro, se necessário.
            statement.setString(5, offer1);
            statement.setString(6, marca1);
            statement.setString(7, category1);

            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                this.id = generatedKeys.getInt(1);
            }

            statement.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
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
                        resultSet.getString("offer"),
                        resultSet.getString("marca"),
                        resultSet.getString("category")
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

    public static Produto getProdutoById(int id) {
        Produto produto = null;
        try {
            Connection conexao = mysql.getConnection();
            String sql = "select * from produtos where id = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                produto = new Produto(
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("model"),
                        resultSet.getString("description"),
                        resultSet.getInt("user_id"),
                        resultSet.getString("offer"),
                        resultSet.getString("marca"),
                        resultSet.getString("category")
                );
            }

            statement.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Trate o erro de alguma forma adequada, como logá-lo.
        }
        return produto;
    }

    public static Produto getProdutoByName(String nameProd) {
        Produto produto = null;
        try {
            Connection conexao = mysql.getConnection();
            String sql = "select * from produtos where name = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, nameProd);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                produto = new Produto(
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("model"),
                        resultSet.getString("description"),
                        resultSet.getInt("user_id"),
                        resultSet.getString("offer"),
                        resultSet.getString("marca"),
                        resultSet.getString("category")
                );
            }

            statement.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Trate o erro de alguma forma adequada, como logá-lo.
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
