package exercicios;
public class EmpregadoTeste {

	public static void main(String[] args) {

	Empregado empregado = new Empregado();
	empregado.setNome("Joao");
	empregado.setSobrenome("Souza");
	empregado.setSalario(1325);
	System.out.println("Nome: "+empregado.getNome());
	System.out.println("Sobrenome: "+empregado.getSobrenome());
	System.out.println("Salario: "+empregado.getSalario());
	System.out.println("Salario com Acrescimo: "+CalculaAcrecimo(empregado.getSalario(), 10));
	
	System.out.println();
	
	Empregado empregado2 = new Empregado();
	empregado2.setNome("Marcos");
	empregado2.setSobrenome("Silva");
	empregado2.setSalario(3187);
	System.out.println("Nome: "+empregado2.getNome());
	System.out.println("Sobrenome: "+empregado2.getSobrenome());
	System.out.println("Salario: "+empregado2.getSalario());
	System.out.println("Salario com Acrescimo: "+CalculaAcrecimo(empregado2.getSalario(), 10));
		
	}
	
	public static double CalculaAcrecimo(double salario, double percentual) {
		double salarioCalculado = salario + ((salario * percentual) / 100);
		return salarioCalculado;
	}
}