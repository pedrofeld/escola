public class Aluno {
    // Atributos da classe (FORA do main)
    private int matricula;
    private String nome;
    private String cpf;
    String curso;
    Avaliacao notas;
    
    // Construtor padrão
    public Aluno() {
    }
    
    // Construtor com parâmetros (opcional)
    /*public Aluno(int matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }*/
    
    
    
    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }
    
    public Aluno(String nome, String cpf, String curso, Avaliacao notas) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.curso = curso;
		this.notas = notas;
	}

	public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    void info() {
    	System.out.println("Nome do aluno: " + nome);
    	System.out.println("Matrícula do aluno: " + matricula);
    	System.out.println("CPF do aluno: " + cpf);
    	System.out.println("Curso do aluno: " + curso);
    	System.out.println("Média A: " + notas.mediaAritmetica());
    	System.out.println("Média P: " + notas.mediaPonderada());
    }
}