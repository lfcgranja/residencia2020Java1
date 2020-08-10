package residencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enums.PessoasEnum;
import pessoal.Diretor;
import pessoal.Funcionario;
import pessoal.Gerente;

public class PrincipalArquivos {


	public static void main(String[] args) throws IOException {
		
		List<Funcionario> listaPessoas = null;
		listaPessoas = leitor("./temp/marcelo.txt");
		
	}

	public static List<Funcionario> leitor(String path) throws IOException {
		
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		List<Funcionario> lista = new ArrayList<>();
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			
			Funcionario funcionario = null;
			if (linha != null) {
				String [] split = linha.split(";");
				
				if(split[2].equalsIgnoreCase(PessoasEnum.GERENTE.name()))
				{
					funcionario = new Gerente(split[0], split[1], split[2], split[3], Double.parseDouble(split[4]), Integer.parseInt(split[5]));
					lista.add(funcionario);
					System.out.println(funcionario);
				}
				
				else if(split[2].equalsIgnoreCase(PessoasEnum.DIRETOR.name()))
				{
					funcionario = new Diretor(split[0], split[1], split[2], split[3], Double.parseDouble(split[4]), Integer.parseInt(split[5]));
					lista.add(funcionario);
					System.out.println(funcionario);
				}
			} 
			else
				break;
		}
		buffRead.close();
		return lista;
	}	
	
	public static void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha = in.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

}
