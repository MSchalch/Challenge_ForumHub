package br.com.alura.forum_hub.domain.infra.exception;

public class ValidacaoException extends RuntimeException {
  public ValidacaoException(String mensagem) {
    super(mensagem);
  }
}
