package entities;

public class Funcionarios {

	private int id;
	private String name;
	private Double salario;
	
	public Funcionarios(int id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

		
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void upSalario(double porcentagem) {
		salario += salario * porcentagem  / 100;
	}
		
	
}
