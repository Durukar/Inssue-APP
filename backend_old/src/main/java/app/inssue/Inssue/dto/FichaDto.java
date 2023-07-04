package app.inssue.Inssue.dto;

import app.inssue.Inssue.entities.Ficha;

public class FichaDto {

    private Long id;
    private String cliente;
    private String descricao;

    public FichaDto() {
    }

    public FichaDto(Long id, String cliente, String descricao) {
        this.id = id;
        this.cliente = cliente;
        this.descricao = descricao;
    }
    public FichaDto(Ficha ficha) {
        id = ficha.getId();
        cliente = ficha.getCliente();
        descricao = ficha.getDescricao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}