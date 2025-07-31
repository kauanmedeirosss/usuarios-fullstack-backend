package io.github.lorimedeiros.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){
        super("Não foi possível encontrar o usuário com id: " + id);
    }

}
