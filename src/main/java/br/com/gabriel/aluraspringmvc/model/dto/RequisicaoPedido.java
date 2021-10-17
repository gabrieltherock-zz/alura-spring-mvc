package br.com.gabriel.aluraspringmvc.model.dto;

import br.com.gabriel.aluraspringmvc.model.Pedido;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class RequisicaoPedido {

    @NotBlank(message = "O campo nome do produto é obrigatório!")
    private String nomeProduto;

    @NotBlank(message = "O campo URL do produto é obrigatório!")
    private String urlProduto;

    @NotBlank(message = "O campo URL da imagem é obrigatório!")
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
