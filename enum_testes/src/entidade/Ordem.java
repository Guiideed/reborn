package entidade;

import java.util.Date;

import utilidades.EstatusOrdenado;

public class Ordem {
	private Integer id;
	private Date momento;
	private EstatusOrdenado status;
	public Ordem(Integer id, Date momento, EstatusOrdenado status) {
		
		this.id = id;
		this.momento = momento;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public EstatusOrdenado getStatus() {
		return status;
	}
	public void setStatus(EstatusOrdenado status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ordem [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}
	
	
	
	
}
