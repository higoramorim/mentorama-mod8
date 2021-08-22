package entities;

public class ContaSalario extends Conta implements Tributavel{

	private Double salario;

	public ContaSalario(Integer id, String nome, Double saldo) {
		super(id, nome, saldo);
		// TODO Auto-generated constructor stub
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
