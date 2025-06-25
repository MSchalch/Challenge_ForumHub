package br.com.alura.forum_hub.domain.perfil;


import br.com.alura.forum_hub.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroPerfil(@NotBlank
                                  String nome,
                                  @NotBlank
                                  Usuario usuario) {
}
