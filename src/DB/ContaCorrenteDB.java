package DB;

import java.util.ArrayList;
import java.util.List;

import entities.ContaCorrente;

public class ContaCorrenteDB {

	private List<ContaCorrente> contaCorrenteList = new ArrayList<>();

	public List<ContaCorrente> getContaCorrenteList() {
		return contaCorrenteList;
	}

	public void setContaCorrenteList(List<ContaCorrente> contaCorrenteList) {
		this.contaCorrenteList = contaCorrenteList;
	}
	
	public void addNovaContaCorrente(ContaCorrente contaCorrente) {
		Integer id = contaCorrenteList.size() + 1;
		contaCorrente.setId(id);
		contaCorrenteList.add(contaCorrente);
	}
}
