package DB;

import java.util.ArrayList;
import java.util.List;

import entities.ContaSalario;

public class ContaSalarioDB {

	private List<ContaSalario> contaSalarioList = new ArrayList<>();

	public List<ContaSalario> getContaSalarioList() {
		return contaSalarioList;
	}

	public void setContaSalarioList(List<ContaSalario> contaSalarioList) {
		this.contaSalarioList = contaSalarioList;
	}
	
	public void addNovaContaSalario(ContaSalario contaSalario) {
		Integer id = contaSalarioList.size() + 1;
		contaSalario.setId(id);
		contaSalarioList.add(contaSalario);
	}
}
