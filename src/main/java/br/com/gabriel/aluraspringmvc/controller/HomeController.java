package br.com.gabriel.aluraspringmvc.controller;

import br.com.gabriel.aluraspringmvc.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Moto E7 Plus 64GB");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/51pke8P8IjL._AC_SL1000_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Moto-Plus-Azul-C%C3%A2mera/dp/B08NFJWM8Y/ref=sr_1_3?dchild=1&keywords=moto+e7+plus&qid=1628972242&sr=8-3&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
        pedido.setDescricao("Smartphone Motorola");

        List<Pedido> pedidos = Collections.singletonList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
