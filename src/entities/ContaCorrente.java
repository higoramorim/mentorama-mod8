package entities;

public class ContaCorrente extends Conta implements Tributavel{

	private Double chequeEspecial;

	public ContaCorrente(Integer id, String nome, Double saldo) {
		super(id, nome, saldo);
		// TODO Auto-generated constructor stub
	}

	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
