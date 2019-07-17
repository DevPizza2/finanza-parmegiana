package br.com.devpizza.finanzaparmegiana.Repositories;

import br.com.devpizza.finanzaparmegiana.Model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DespesaRepository extends JpaRepository<Despesa, Integer> {
    public List<Despesa> findByusuario_id(int id);
}
