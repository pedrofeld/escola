public class Principal {

    public static void main(String[] args) {
        // Criando objeto Aluno
        Aluno a = new Aluno();
        
        // Usando setters para definir valores
        a.setMatricula(1000);
        a.setNome("Pedro Feld");
        a.setCpf("00011122233");
                
        // Usando getters para acessar valores
        System.out.println("Matrícula: " + a.getMatricula());
        System.out.println("Nome: " + a.getNome());
        System.out.println("CPF: " + a.getCpf());

        // Alterando o nome
        a.setNome("Pedro Gael Feld");
                
        System.out.println("Nome atualizado: " + a.getNome());
    }
}