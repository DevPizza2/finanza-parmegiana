package br.com.devpizza.finanzaparmegiana.Endpointers;

import br.com.devpizza.finanzaparmegiana.Model.Usuario;
import br.com.devpizza.finanzaparmegiana.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {//controlador de das funcoes de usuario

    @Autowired
    UserRepository userRepository;//cria e inicializa o acesso ao repositorio de usuarios
    @RequestMapping(method = RequestMethod.POST, path = "/criar")
    public ResponseEntity<?> criar(@RequestBody Usuario user){//metodo POST para criação de usuarios no bd.
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/deletar/{id}")
    public void deletar(@PathVariable("id") int id){//metodo DELETE que deleta usuarios no bd
        userRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/alterar/{id}")
    public ResponseEntity<?> alterar(@PathVariable("id") int id, @RequestBody Usuario user){//metodo PUT que altera informaçoes de usuario da memoria
        Usuario aux = userRepository.getOne(id);
        aux.setNome(user.getNome());
        aux.setIdade(user.getIdade());
        aux.setEmail(user.getEmail());
        return new ResponseEntity<>(userRepository.save(aux), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/pegar/{id}")
    public ResponseEntity<?> pegar(@PathVariable("id") int id){//metodo GET que retorna um usuario especifico
        return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/pegar")
    public ResponseEntity<?> listarTodos(){//metodo GET que lista todos os usuarios
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }
}
