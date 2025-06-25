package br.com.alura.forum_hub.domain.curso;

public record DadosCursoTopico(String nome,
                               Categoria categoria
) {
    public DadosCursoTopico(Curso curso) {
        this(curso.getNome(), curso.getCategoria());
    }
}