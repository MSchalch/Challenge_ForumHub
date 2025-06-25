package br.com.alura.forum_hub.domain.perfil;

public record DadosPerfilTopico(String nome) {
    public DadosPerfilTopico(Perfil perfil) {
        this(perfil.getNome());
    }
}