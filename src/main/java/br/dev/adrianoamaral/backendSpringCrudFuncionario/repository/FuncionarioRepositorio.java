package br.dev.adrianoamaral.backendSpringCrudFuncionario.repository;

import br.dev.adrianoamaral.backendSpringCrudFuncionario.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> {

    void deleteFuncionarioById(Long id);

    Optional<Funcionario> findFuncionarioById(Long id);
}
