package br.com.alura.forum_hub.domain.topico;

import br.com.alura.forum_hub.domain.curso.Curso;
import br.com.alura.forum_hub.domain.curso.DadosCursoTopico;
import br.com.alura.forum_hub.domain.perfil.DadosPerfilTopico;
import br.com.alura.forum_hub.domain.perfil.Perfil;

import java.time.LocalDateTime;

public record DadosListagemTopico(
        long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        Status status,
        DadosPerfilTopico autor,
        DadosCursoTopico curso
) {
    public DadosListagemTopico(Topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus(),
                new DadosPerfilTopico(topico.getAutor()),
                new DadosCursoTopico(topico.getCurso())
        );
    }
}
