package entities;

public abstract class Conta {

	private Integer id;
	private String nome;
	protected Double saldo;

	public Conta(Integer id, String nome, Double saldo) {
		this.id = id;
		this.nome = nome;
		this.saldo = saldo;
	}

}
