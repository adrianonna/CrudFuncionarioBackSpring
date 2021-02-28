package br.dev.adrianoamaral.backendSpringCrudFuncionario;

import br.dev.adrianoamaral.backendSpringCrudFuncionario.model.Funcionario;
import br.dev.adrianoamaral.backendSpringCrudFuncionario.service.FuncionarioServico;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioResource {

    private final FuncionarioServico funcionarioServico;

    public FuncionarioResource(FuncionarioServico funcionarioServico) {
        this.funcionarioServico = funcionarioServico;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Funcionario>> getAllFuncionarios(){
        List<Funcionario> funcionarios = funcionarioServico.findAllFuncionarios();
        return new ResponseEntity<>(funcionarios, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Funcionario> getFuncionarioByID(@PathVariable("id") Long id){
        Funcionario funcionario = funcionarioServico.findFuncionarioById(id);
        return new ResponseEntity<>(funcionario, HttpStatus.OK);
    }

    @Transactional
    @PostMapping("/add")
    public ResponseEntity<Funcionario> addFuncionacio(@RequestBody Funcionario funcionario){
        Funcionario newFuncionario = funcionarioServico.addFuncionario(funcionario);
        return new ResponseEntity<>(newFuncionario, HttpStatus.CREATED);
    }

    @Transactional
    @PutMapping("/update")
    public ResponseEntity<Funcionario> updateFuncionacio(@RequestBody Funcionario funcionario){
        Funcionario updateFuncionario = funcionarioServico.updateFuncionario(funcionario);
        return new ResponseEntity<>(updateFuncionario, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFuncionacio(@PathVariable("id") Long id){
        funcionarioServico.deleteFuncionario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
