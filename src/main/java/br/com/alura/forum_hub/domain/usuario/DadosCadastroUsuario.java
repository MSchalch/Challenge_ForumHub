package br.com.alura.forum_hub.domain.usuario;

import br.com.alura.forum_hub.domain.topico.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroUsuario(
        @NotBlank String nome,
        @NotBlank String email,
        @NotBlank String senha
        ) {
}