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
@Table(name="pagamento")
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private Double total_final ;


	@OneToMany
    @JoinColumn(name = "pagamento_id")
	private List<TipoPagamento> tipoPagamentos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotal_final() {
		return total_final;
	}

	public void setTotal_final(Double total_final) {
		this.total_final = total_final;
	}

	public List<TipoPagamento> getTipoPagamentos() {
		return tipoPagamentos;
	}

	public void setTipoPagamentos(List<TipoPagamento> tipoPagamentos) {
		this.tipoPagamentos = tipoPagamentos;
	}
		
	
}
