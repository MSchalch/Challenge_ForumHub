package br.com.alura.forum_hub.domain.perfil;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    // Se quiser, pode adicionar métodos específicos aqui
}