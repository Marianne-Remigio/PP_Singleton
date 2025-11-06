package org.example.usuarioAtivo;

//TODO: Problema - O sistema age como se os dois usuários estivessem logados ao mesmo tempo,
// o que não faz sentido num contexto de usuário único ativo.


public class Usuario {
    private static Usuario instancia;

    private String nome;

    public Usuario(){
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public static Usuario getInstancia(){
        if(instancia == null){
            instancia = new Usuario();
        }

        return instancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("Usuário logado: " + nome);
    }
}
