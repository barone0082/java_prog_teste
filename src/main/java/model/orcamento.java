package model;

import java.util.Date;

public class orcamento {

	int id_orcamento;
	String data_entrega;
	String meio_pagamento;
	String obs;
	
	public orcamento() {
		super();
		this.id_orcamento = id_orcamento;
		this.data_entrega = data_entrega;
		this.meio_pagamento = meio_pagamento;
		this.obs = obs;
	}
	public int getId_orcamento() {
		return id_orcamento;
	}
	public void setId_orcamento(int id_orcamento) {
		this.id_orcamento = id_orcamento;
	}
	public String getData_entrega() {
		return data_entrega;
	}
	public void setData_entrega(String string) {
		this.data_entrega = string;
	}
	public String getMeio_pagamento() {
		return meio_pagamento;
	}
	public void setMeio_pagamento(String meio_pagamento) {
		this.meio_pagamento = meio_pagamento;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	

}
