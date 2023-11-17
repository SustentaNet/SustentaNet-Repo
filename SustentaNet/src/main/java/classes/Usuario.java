package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import src.connection.mysql;

public class Usuario {

    private int id;
    private String name;
    private String password;
    private String email;
    private String address;
    private String phone;
    private String birthday;
    private String address_num;
    private String city;
    private String state;
    private String cep;

    public Usuario() {
        super();
    }

    public Usuario(int id, String name, String password, String email, String address, String phone, String birthday, String address_num, String city, String state, String cep) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.birthday = birthday;
        this.address_num = address_num;
        this.city = city;
        this.state = state;
        this.cep = cep;
    }

    /* Get e Set */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress_num() {
        return address_num;
    }

    public void setAddress_num(String address_num) {
        this.address_num = address_num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    /* setUsuario*/
    public void setUser(String name, String password, String email, String address, String phone, String birthday, String address_num, String city, String state, String cep) {
        try {
            Connection conexao = mysql.getConnection();
            String sql = "INSERT INTO users (name, password, email, phone, birthday, address, address_num, city, state, cep) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setString(1, name);
            statement.setString(2, password);
            statement.setString(3, email);
            statement.setString(4, phone);
            statement.setString(5, birthday);
            statement.setString(6, address);
            statement.setString(7, address_num);
            statement.setString(8, city);
            statement.setString(9, state);
            statement.setString(10, cep);

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

    /* getUsuario*/
    public static Usuario getUser(int id) {
        Usuario usuario = null;
        try {
            Connection conexao = mysql.getConnection();
            String sql = "select * from users where id = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                usuario = new Usuario(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("password"),
                        resultSet.getString("email"),
                        resultSet.getString("address"),
                        resultSet.getString("phone"),
                        resultSet.getString("birthday"),
                        resultSet.getString("address_num"),
                        resultSet.getString("city"),
                        resultSet.getString("state"),
                        resultSet.getString("cep")
                );
            }

            statement.close();
            conexao.close();

        } catch (SQLException e) {
        }

        return usuario;
    }

    public static Usuario getUserByEmail(String email) {
        Usuario usuario = null;
        try {
            Connection conexao = mysql.getConnection();
            String sql = "SELECT * FROM users WHERE email = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, email);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                usuario = new Usuario(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("password"),
                        resultSet.getString("email"),
                        resultSet.getString("address"),
                        resultSet.getString("phone"),
                        resultSet.getString("birthday"),
                        resultSet.getString("address_num"),
                        resultSet.getString("city"),
                        resultSet.getString("state"),
                        resultSet.getString("cep")
                );
            }

            statement.close();
            conexao.close();
        } catch (SQLException e) {
            // Aqui você pode tratar o erro de alguma maneira, por exemplo, logá-lo.

        }

        return usuario; // Retorna o objeto Usuario ou null se não encontrado.
    }

    public static Usuario getUserByName(String name) {
        Usuario usuario = null;
        try {
            Connection conexao = mysql.getConnection();
            String sql = "SELECT * FROM users WHERE name = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, name);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                usuario = new Usuario(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("password"),
                        resultSet.getString("email"),
                        resultSet.getString("address"),
                        resultSet.getString("phone"),
                        resultSet.getString("birthday"),
                        resultSet.getString("address_num"),
                        resultSet.getString("city"),
                        resultSet.getString("state"),
                        resultSet.getString("cep")
                );
            }

            statement.close();
            conexao.close();
        } catch (SQLException e) {
            // Aqui você pode tratar o erro de alguma maneira, por exemplo, logá-lo.

        }

        return usuario; // Retorna o objeto Usuario ou null se não encontrado.
    }

    public List<Usuario> getAllUsers() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            Connection conexao = mysql.getConnection();
            String sql = "SELECT * FROM users";
            PreparedStatement statement = conexao.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Usuario usuario = new Usuario(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("password"),
                        resultSet.getString("email"),
                        resultSet.getString("address"),
                        resultSet.getString("phone"),
                        resultSet.getString("birthday"),
                        resultSet.getString("address_num"),
                        resultSet.getString("city"),
                        resultSet.getString("state"),
                        resultSet.getString("cep")
                );

                usuarios.add(usuario);
            }

            statement.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace(); // Trate o erro de alguma forma adequada, como logá-lo ou lançar uma exceção.
        }
        return usuarios;
    }

    public List<Usuario> buscarUsuario(String termoBusca) {
        List<Usuario> usuario = new ArrayList<>();

        try {
            Connection conexao = mysql.getConnection();
            String sql = "SELECT * FROM users WHERE name LIKE ?";
            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setString(1, "%" + termoBusca + "%");

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Usuario user = new Usuario(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("password"),
                        resultSet.getString("email"),
                        resultSet.getString("address"),
                        resultSet.getString("phone"),
                        resultSet.getString("birthday"),
                        resultSet.getString("address_num"),
                        resultSet.getString("city"),
                        resultSet.getString("state"),
                        resultSet.getString("cep")
                );
                usuario.add(user);
            }

            statement.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }

}
