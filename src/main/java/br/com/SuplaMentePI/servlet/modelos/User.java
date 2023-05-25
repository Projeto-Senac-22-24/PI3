package br.com.SuplaMentePI.servlet.modelos;

public class User {
  // use: eu
    // senha:12345678
 // CREATE TABLE USR (ID INT PRIMARY KEY AUTO_INCREMENT, USERNAME VARCHAR(255), PASSWORD VARCHAR(255));
  //INSERT INTO USR (USERNAME, PASSWORD) VALUES ('your-user', 'your-password')
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}