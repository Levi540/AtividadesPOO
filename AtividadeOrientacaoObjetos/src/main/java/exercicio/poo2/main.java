package exercicio.poo2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Connection conn = new ConnectionFactory().getConnection();
		boolean aposentado;
		String nome, categoria, aposentadoResposta, estado, novoBeneficiario;
		int idade, quantidadeFuncionarios, mesesDesempregado, usuariosLidos = 0, posicaoUsuarioMaiorValor = 0,
				maiorTempoBeneficio = 0, posicaoUsuaroMaiorTempoBeneficio = 0;
		double valorTotal = 0, maiorValor = 0;
		List<Pessoa> cadastro = new ArrayList<Pessoa>();
		Pessoa p;
		Scanner scan = new Scanner(System.in);

		String comando = "CREATE TABLE IF NOT EXISTS PESSOA (" 
				+ "id serial not null," 
				+ "nome varchar(40) not null,"
				+ "idade int not null," 
				+ "estado varchar(10) not null," 
				+ "valorAuxilio float not null);";

		try {
			Statement statement = conn.createStatement();
			statement.execute(comando);
			
			while (true) {
				System.out.println("Informe nome completo: ");
				nome = scan.next();

				System.out.println("Informe idade: ");
				idade = scan.nextInt();

				System.out.println("Você é de qual Estado? Digite apenas as siglas");
				estado = scan.next();

				System.out.println("Qual categoria você se enquadra (Empregado, Empregador ou Desempregado)");
				categoria = scan.next();

				if (categoria.equalsIgnoreCase("Empregado")) {
					System.out.println("Você é aposentado? S/N");
					aposentadoResposta = scan.next();

					if (aposentadoResposta.equalsIgnoreCase("s")) {
						aposentado = true;
					} else {
						aposentado = false;
					}

					p = new Empregado(nome, idade, Estado.valueOf(estado.toUpperCase()), aposentado);

				} else if (categoria.equalsIgnoreCase("Empregador")) {
					System.out.println("Quantos funcionários: ");
					quantidadeFuncionarios = scan.nextInt();

					p = new Empregador(nome, idade, Estado.valueOf(estado.toUpperCase()), quantidadeFuncionarios);

				} else if (categoria.equalsIgnoreCase("Desempregado")) {
					System.out.println("Há quantos meses está desempregado: ");
					mesesDesempregado = scan.nextInt();

					p = new Desempregado(nome, idade, Estado.valueOf(estado.toUpperCase()), mesesDesempregado);
				} else {
					System.out.println("Categoria informada errado.");
					continue;
				}

				usuariosLidos++;
				System.out.println(p.toString());
				if (idade >= 18) {
					cadastro.add(p);
				}
				System.out.println("Deseja informar um novo beneficiário? S/N");
				novoBeneficiario = scan.next();

				if (novoBeneficiario.equalsIgnoreCase("n")) {
					for (int i = 0; i < cadastro.size(); i++) {
						valorTotal += cadastro.get(i).getValorAuxilio() * cadastro.get(i).getMesesBeneficio();
						if (maiorValor < cadastro.get(i).getValorAuxilio()) {
							maiorValor = cadastro.get(i).getValorAuxilio();
							posicaoUsuarioMaiorValor = i;
						}

						if (maiorTempoBeneficio < cadastro.get(i).getMesesBeneficio()) {
							maiorTempoBeneficio = cadastro.get(i).getMesesBeneficio();
							posicaoUsuaroMaiorTempoBeneficio = i;
						}
					}
					System.out.println("Total de usuários lidos: " + usuariosLidos);
					System.out.println("Total de beneficiarios: " + cadastro.size());
					System.out.println("Total de valor que será concedido: " + valorTotal);
					System.out.println("O nome do beneficiário que irá receber o maior valor de todos: "
							+ cadastro.get(posicaoUsuarioMaiorValor).getNomeCompleto());
					System.out.println("O nome do beneficiário que irá receber o benefício por mais tempo: "
							+ cadastro.get(posicaoUsuaroMaiorTempoBeneficio).getNomeCompleto());
					break;
				}

			}
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
