package org.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 5, max = 255)
	private String nome;

	@NotNull
	private float preco;

	@Size(min = 5, max = 30)
	@NotNull
	private String codigoSerial;

	@NotNull
	private int quantidade;

	private boolean midiaDigital;

	@Size(min = 1, max = 5000)
	@NotNull
	private String descricao;

	@NotNull
	private boolean exclusivo;

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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getCodigoSerial() {
		return codigoSerial;
	}

	public void setCodigoSerial(String codigoSerial) {
		this.codigoSerial = codigoSerial;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isMidiaDigital() {
		return midiaDigital;
	}

	public void setMidiaDigital(boolean midiaDigital) {
		this.midiaDigital = midiaDigital;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isExclusivo() {
		return exclusivo;
	}

	public void setExclusivo(boolean exclusivo) {
		this.exclusivo = exclusivo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
