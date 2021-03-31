package com.pipocaiptv.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="plano")
public class Plano {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Double preco;
	
	@Column(nullable = false)
	private Integer qtd_telas;
	
	@Column(nullable = false)
	private Integer duracao_meses;
	
	@Column(nullable = false)
	private Boolean adulto;
	
	@Column(nullable = false)
	private Date data_cadastro;
	
	@Column(nullable = false)
	private Boolean planoTeste;
	
	@Column(nullable = false)
	private Boolean planoAtivo;
	
	@OneToMany
    @JoinColumn(name = "plano_id")
	private List<ItemVenda> itemVendas;

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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQtd_telas() {
		return qtd_telas;
	}

	public void setQtd_telas(Integer qtd_telas) {
		this.qtd_telas = qtd_telas;
	}

	public Integer getDuracao_meses() {
		return duracao_meses;
	}

	public void setDuracao_meses(Integer duracao_meses) {
		this.duracao_meses = duracao_meses;
	}

	public Boolean getAdulto() {
		return adulto;
	}

	public void setAdulto(Boolean adulto) {
		this.adulto = adulto;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public Boolean getPlanoTeste() {
		return planoTeste;
	}

	public void setPlanoTeste(Boolean planoTeste) {
		this.planoTeste = planoTeste;
	}

	public Boolean getPlanoAtivo() {
		return planoAtivo;
	}

	public void setPlanoAtivo(Boolean planoAtivo) {
		this.planoAtivo = planoAtivo;
	}

	public List<ItemVenda> getItemVendas() {
		return itemVendas;
	}

	public void setItemVendas(List<ItemVenda> itemVendas) {
		this.itemVendas = itemVendas;
	}
	
}
