public class Funcionarios {

        protected String nome;
        protected int matricula;

        public Funcionarios(String nome, int matricula) {
            this.nome = nome;
            this.matricula = matricula;
        }

        public void apresentar() {
            System.out.println("Funcionario: " + nome);
            System.out.println("Matricula: " + matricula);
        }
        public String getNome() {
        return nome;
        }
}

