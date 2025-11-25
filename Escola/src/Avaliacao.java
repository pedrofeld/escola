public class Avaliacao {
	double nota1;
	double nota2;
	double nota3;
	// int = números inteiros, sem casas decimais
	// float = números decimais com precisão simples (6 dígitos decimais)
	// double = números decimais com precisão dupla (15 dígitos decimais)
	
	Avaliacao(double nota1, double nota2, double nota3){
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double mediaAritmetica(){
		return (nota1+nota2+nota3)/3;
	}
	
	public double mediaPonderada() {
		return (nota1*2+nota2*3+nota3*4)/9;
	}
}
