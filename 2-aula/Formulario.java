import java.util.Scanner;

class Formulario{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é nome do aluno?");
        String nomeAluno = scanner.next();

        System.out.println("Qual é a idade do aluno?");
        int idade = scanner.nextInt();

        Chamada chamada = new Chamada();
        chamada.adicionarAluno(nomeAluno, idade);

        System.out.println("O aluno " + nomeAluno + " esta presente?");
        System.out.println("sim ou nao");
        String presente = scanner.next();
        
        if(presente.equals("sim")){
            chamada.marcarPresenca();
        }
        chamada.imprimirInformacoes();
        scanner.close();
    }
}