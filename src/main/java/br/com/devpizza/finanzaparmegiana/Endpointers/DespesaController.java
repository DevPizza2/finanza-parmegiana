package br.com.devpizza.finanzaparmegiana.Endpointers;

import br.com.devpizza.finanzaparmegiana.Model.Despesa;
import br.com.devpizza.finanzaparmegiana.Repositories.DespesaRepository;
import br.com.devpizza.finanzaparmegiana.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/despesa")
public class DespesaController {
    @Autowired
    DespesaRepository despesaRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/pegar/{id}")
    public ResponseEntity<?> pegarPorId(@PathVariable("id") int id){
        return new ResponseEntity<>(despesaRepository.findById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/pegar/usuario/{id}")
    public ResponseEntity<?> pegarPorUser(@PathVariable("id") int id){
        return new ResponseEntity<>(despesaRepository.findByusuario_id(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/criar")
    public ResponseEntity<?> criar(@RequestBody Despesa despesa){
        return new ResponseEntity<>(despesaRepository.save(despesa), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/deletar/{id}")
    public void deletar(@PathVariable("id") int id){
        despesaRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/alterar/{id}")
    public ResponseEntity<?> alterar(@PathVariable("id") int id, @RequestBody Despesa despesa){
        Despesa aux = despesaRepository.getOne(id);
        aux.setNome(despesa.getNome());
        aux.setDescricao(despesa.getDescricao());
        aux.setDuracao(despesa.getDuracao());
        aux.setValor(despesa.getValor());
        return new ResponseEntity<>(despesaRepository.save(aux), HttpStatus.OK);
    }
}
