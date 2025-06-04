package com.simplestore.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 100)
    private String nome;

    private String descricao;

    @PositiveOrZero(message = "O preço deve ser maior ou igual a zero")
    private Double preco;

    @PositiveOrZero(message = "O estoque deve ser maior ou igual a zero")
    private Integer estoque;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    // Getters e Setters
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    
    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
    public Integer getEstoque() { return estoque; }
    public void setEstoque(Integer estoque) { this.estoque = estoque; }
}
