package syncmeetenvio;

public class Usuario {
    private String usuario;
    private String email;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String nome) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String usuario, String email, String senha) {
        this.usuario = usuario;
        this.email = email;
        this.senha = senha;
    }
}
