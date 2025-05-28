public class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel {

    public Administrador(String nome, String sen) {
        super(nome, sen);
    }

    @Override
    public void alterarSenha(String nova){
        senha = nova;
        System.out.println("Senha Alterada com sucesso!");
    }

    @Override
    public void bloquearUsuario(){
        System.out.println("Usuário bloqueado com sucesso!");
    }

    @Override
    public void registrarLog(String operacao){
        System.out.println("Operação de " + operacao + "realizada.");
    }
}
