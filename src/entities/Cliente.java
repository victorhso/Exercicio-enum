package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private String nome;
	private String email;
	Date bithDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cliente() {
	}

	public Cliente(String nome, String email, Date bithDate) {
		this.nome = nome;
		this.email = email;
		this.bithDate = bithDate;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBithDate() {
		return bithDate;
	}

	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}
	
	@Override
	public String toString() {
		return nome + ", " + sdf.format(bithDate) + ", " + email;
	}
}
