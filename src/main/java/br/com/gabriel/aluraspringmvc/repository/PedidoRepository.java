package br.com.gabriel.aluraspringmvc.repository;

import br.com.gabriel.aluraspringmvc.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
