package br.com.alura.forum_hub.domain.curso;

import br.com.alura.forum_hub.domain.topico.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroCurso(
                                 @NotBlank String nome,
                                 @NotBlank
                                 @Enumerated(EnumType.STRING)
                                 Categoria categoria) {
}
