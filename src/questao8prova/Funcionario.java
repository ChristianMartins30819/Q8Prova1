package questao8prova;

public class Funcionario {
	private int numeroFuncionarios;
	private String[] nome = new String[numeroFuncionarios];
	private double[] salario = new double[numeroFuncionarios];
	private double[] bonus = new double[numeroFuncionarios];
	private double[] salarioLiquido = new double[numeroFuncionarios];
	
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	public String[] getNome() {
		return nome;
	}
	public void setNome(String[] nome) {
		this.nome = nome;
	}
	public double[] getSalario() {
		return salario;
	}
	public void setSalario(double[] salario) {
		this.salario = salario;
	}
	public double[] getBonus() {
		return bonus;
	}
	public void setBonus(double[] bonus) {
		this.bonus = bonus;
	}
	public double[] getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(double[] salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	


	

	
}
