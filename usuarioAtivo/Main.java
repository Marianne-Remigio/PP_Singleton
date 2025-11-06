package org.example.usuarioAtivo;


public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = Usuario.getInstancia();
        usuario1.setNome("Thallyta");
        Usuario usuario2 = Usuario.getInstancia();
        usuario2.setNome("Maria");

        usuario1.exibirInformacoes();
        usuario2.exibirInformacoes();

        System.out.println("Instância única? " + (usuario1 == usuario2));
    }
}
