package br.com.devpizza.finanzaparmegiana.Endpointers;

import br.com.devpizza.finanzaparmegiana.Model.Entrada;
import br.com.devpizza.finanzaparmegiana.Repositories.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/entrada")
public class EntradaContoller {
    @Autowired
    EntradaRepository entradaRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/pegar/{id}")
    public ResponseEntity<?> pegarPorId(@PathVariable("id") int id){
        return new ResponseEntity<>(entradaRepository.findById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/pegar/usuario/{id}")
    public ResponseEntity<?> pegarPorUser(@PathVariable("id") int id){
        return new ResponseEntity<>(entradaRepository.findByusuario_id(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/criar")
    public ResponseEntity<?> criar(@RequestBody Entrada entrada){
        return new ResponseEntity<>(entradaRepository.save(entrada), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/deletar/{id}")
    public void deletar(@PathVariable("id") int id){
        entradaRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/alterar/{id}")
    public ResponseEntity<?> alterar(@PathVariable("id") int id, @RequestBody Entrada entrada){
        Entrada aux = entradaRepository.getOne(id);
        aux.setNome(entrada.getNome());
        aux.setDescricao(entrada.getDescricao());
        aux.setDuracao(entrada.getDuracao());
        aux.setValor(entrada.getValor());
        return new ResponseEntity<>(entradaRepository.save(aux), HttpStatus.OK);
    }
}
