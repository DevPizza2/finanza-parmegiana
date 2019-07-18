package br.com.devpizza.finanzaparmegiana.Repositories;

import br.com.devpizza.finanzaparmegiana.Model.Despesa;
import br.com.devpizza.finanzaparmegiana.Model.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntradaRepository extends JpaRepository<Entrada, Integer> {
    public List<Despesa> findByusuario_id(int id);
}
