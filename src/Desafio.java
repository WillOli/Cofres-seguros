import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = Integer.parseInt(scanner.nextLine());
            int confirmacaoSenha = Integer.parseInt(scanner.nextLine());

            CofreDigital cofreDigital = new CofreDigital(senha);

            //Verifica se a senha está correta
            if (cofreDigital.validarSenha(confirmacaoSenha)) {
                System.out.println("Tipo: Cofre Digital");
                System.out.println("Metodo de abertura: Senha");
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Tipo: Cofre Digital");
                System.out.println("Metodo de abertura: Senha");
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
        scanner.close();
    }
}