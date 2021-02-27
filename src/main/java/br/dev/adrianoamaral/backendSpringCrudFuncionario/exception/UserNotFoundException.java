package br.dev.adrianoamaral.backendSpringCrudFuncionario.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String mensagem) {
        super(mensagem);
    }
}
