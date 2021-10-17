package br.com.gabriel.aluraspringmvc.model.dto;

import br.com.gabriel.aluraspringmvc.model.Pedido;
import lombok.Data;

@Data
public class RequisicaoPedido {

    private String nomeProduto;
    private String urlProduto;
    private String urlImagem;
    private String descricao;

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setDescricao(descricao);
        pedido.setUrlProduto(urlProduto);
        pedido.setUrlImagem(urlImagem);
        pedido.setNomeProduto(nomeProduto);

        return pedido;
    }
}
