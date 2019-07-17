package br.com.devpizza.finanzaparmegiana.Repositories;

import br.com.devpizza.finanzaparmegiana.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<Usuario, Integer> {
}
