package utils;

public class TokenSingleton {
    private static TokenSingleton instance;
    private String token;

    private TokenSingleton() {}

    public static TokenSingleton getInstance() {
        if (instance == null) {
            instance = new TokenSingleton();
        }
        return instance;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}