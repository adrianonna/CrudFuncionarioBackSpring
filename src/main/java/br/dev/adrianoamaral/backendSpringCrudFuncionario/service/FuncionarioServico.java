package br.dev.adrianoamaral.backendSpringCrudFuncionario.service;

import br.dev.adrianoamaral.backendSpringCrudFuncionario.exception.UserNotFoundException;
import br.dev.adrianoamaral.backendSpringCrudFuncionario.model.Funcionario;
import br.dev.adrianoamaral.backendSpringCrudFuncionario.repository.FuncionarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FuncionarioServico {
    private final FuncionarioRepositorio funcionarioRepositorio;

    @Autowired
    public FuncionarioServico(FuncionarioRepositorio funcionarioRepositorio) {
        this.funcionarioRepositorio = funcionarioRepositorio;
    }

    public Funcionario addFuncionario(Funcionario funcionario){
        funcionario.setLinguagem(UUID.randomUUID().toString());
        return funcionarioRepositorio.save(funcionario);
    }

    public List<Funcionario> findAllFuncionarios(){
        return funcionarioRepositorio.findAll();
    }

    public Funcionario updateFuncionario(Funcionario funcionario){
        return funcionarioRepositorio.save(funcionario);
    }

    public Funcionario findFuncionarioById(Long id){
        return funcionarioRepositorio.findFuncionarioById(id).
                orElseThrow(() -> new UserNotFoundException("Usuário com id "+ id +" não foi encontrado"));
    }

    public void deleteFuncionario(Long id){
//        funcionarioRepositorio.deleteById(id);
        funcionarioRepositorio.deleteFuncionarioById(id);
    }
}
