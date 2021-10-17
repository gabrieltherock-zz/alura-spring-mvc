package br.com.gabriel.aluraspringmvc.controller;

import br.com.gabriel.aluraspringmvc.model.Pedido;
import br.com.gabriel.aluraspringmvc.model.dto.RequisicaoPedido;
import br.com.gabriel.aluraspringmvc.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario() {
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(RequisicaoPedido reqPedido) {
        Pedido pedido = reqPedido.toPedido();
        pedidoRepository.save(pedido);

        return "home";
    }
}
