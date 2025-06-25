package br.com.alura.forum_hub.domain.topico;

import br.com.alura.forum_hub.domain.curso.DadosCursoTopico;
import br.com.alura.forum_hub.domain.perfil.DadosPerfilTopico;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, LocalDateTime dataCriacao, Status status) {
    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus());

    }
}