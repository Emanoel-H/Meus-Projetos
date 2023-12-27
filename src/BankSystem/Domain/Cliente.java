package BankSystem.Domain;

import java.util.Objects;

public class Cliente{
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

    public Cliente (Cliente cliente){
        this(cliente.getNome(), cliente.getCpf(), cliente.getUsername(), cliente.getPassword());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(getPassword(), cliente.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassword());
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
        return "Cliente: " + nome + ". CPF: " + cpf + " Username: " + username;
    }
}
