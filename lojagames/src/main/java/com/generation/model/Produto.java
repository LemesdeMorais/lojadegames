package com.generation.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100)
	@NotBlank(message = "O nome do produto é obrigatório!")
	@Size(min = 2, max = 100, message = "O nome do produto deve ter entre 2 e 100 caracteres.")
	private String nome;
	
	@Column(length = 500)
	@NotBlank(message = "A descrição do produto é obrigatória!")
	//VERIFICAR A REDUNDANCIA DE SIZE SE TEM COLIUMN LENGTH
	@Size(min = 2, max = 500, message = "O nome do produto deve ter entre 2 e 100 caracteres.")
	private String descricao;
	
	@NotNull(message = "O preço do produto é obrigatório!")
	@DecimalMin(value = "0.0", inclusive = false, message = "O preço do produto deve ser maior que zero.")
	@Digits(integer = 10, fraction = 2, message = "O preço do produto deve ter no máximo 10 dígitos inteiros e 2 dígitos decimais.")
	@Column(precision = 12, scale = 2)
	private BigDecimal preco;
	
	
	
	@NotNull(message = "A categoria do produto é obrigatória!")
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;
	
	
	@NotNull(message = "O estoque do produto é obrigatório!")
	@Min(value = 0, message = "O estoque do produto não pode ser negativo.")
	private Integer estoque;
	
	@Column(length = 500)
	private String foto;


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public BigDecimal getPreco() {
		return preco;
	}


	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Integer getEstoque() {
		return estoque;
	}


	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	
	

	
	
}
