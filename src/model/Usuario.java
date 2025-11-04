package model;

public class Usuario {
    private String login;
    private String senhaCriptografada;

    public Usuario(String login, String senhaCriptografada) {
        this.login = login;
        this.senhaCriptografada = senhaCriptografada;
    }

    public String getLogin() { return login; }
    public String getSenhaCriptografada() { return senhaCriptografada; }

    @Override
    public String toString() {
        return "Usuário: " + login;
    }
}
