package BankSystem.Domain;

public class Cliente {
    private String nome;
    private String cpf;
    private String username;
    private String password;

    public Cliente() {

    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf, String username, String password) {
        this.nome = nome;
        this.cpf = cpf;
        this.username = username;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ". CPF: " + cpf;
    }
}
