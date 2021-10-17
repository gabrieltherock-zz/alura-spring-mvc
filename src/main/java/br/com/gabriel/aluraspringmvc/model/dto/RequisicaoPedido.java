package br.com.gabriel.aluraspringmvc.model.dto;

import br.com.gabriel.aluraspringmvc.model.Pedido;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class RequisicaoPedido {

    @NotBlank
    private String nomeProduto;

    @NotBlank
    private String urlProduto;

    @NotBlank
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
