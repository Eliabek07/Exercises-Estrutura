import java.util.Scanner;
class Main {
public static void main(String[] args) {
//ENTRADAS
float nota1, nota2, nota3, media;
//O Scanner serve para ler valores digitados pelo usuário
Scanner ent = new Scanner(System.in);
System.out.println("Cálculo da média de 3 notas de um aluno...");
System.out.println("Digite a 1ª nota do(a) aluno(a): ");
//A linha abaixo faz a leitura da 1ª nota
nota1 = ent.nextFloat();
System.out.println("Digite a 2ª nota do(a) aluno(a): ");
//A linha abaixo faz a leitura da 2ª nota
nota2 = ent.nextFloat();
System.out.println("Digite a 3ª nota do(a) aluno(a): ");
//A linha abaixo faz a leitura da 3ª nota
nota3 = ent.nextFloat();
//PROCESSAMENTO
media = (nota1 + nota2 + nota3)/3;
//Saída
System.out.println("A média das três notas, vale: " + media);
System.out.printf("A média das três notas, vale: %.5f", media);
}
}