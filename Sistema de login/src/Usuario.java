public abstract class Usuario implements Gerenciavel {
    protected String login;
    protected String senha;

    public Usuario(String nome, String sen){
        this.login = nome;
        this.senha = sen;
    }

    public void exibirLogin(){
        System.out.println("Login: " + login);
    }
}
