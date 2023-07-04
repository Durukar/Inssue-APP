package app.inssue.Inssue.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_ficha")
public class Ficha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private String descricao;

    public Ficha () {
    }

    public Ficha(Long id, String cliente, String descricao) {
        super();
        this.id = id;
        this.cliente = cliente;
        this.descricao = descricao;
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
