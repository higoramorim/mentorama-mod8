package entities;

public interface Tributavel {

	static void sacar(Integer quantia, Double saldo) {
		saldo -= quantia;
	}
	
	static void depositar(Integer quantia, Double saldo) {
		saldo += quantia;
	}
}
