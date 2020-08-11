package residencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import contaBancaria.Conta;
import contaBancaria.ContaCorrente;
import contaBancaria.ContaPoupanca;
import enums.ContasEnum;
import enums.PessoasEnum;
import pessoal.Cliente;
import pessoal.Diretor;
import pessoal.Funcionario;
import pessoal.Gerente;
import pessoal.Pessoa;
import pessoal.Presidente;

public class PrincipalArquivos {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	
	public static void main(String[] args) throws IOException {
		
		Funcionario f = new Gerente();
		f.setNome("marcelo");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_");
		Date data = new Date();
		
		String path = PATH_BASICO + simpleDateFormat.format(data) + f.getNome() + EXTENSAO;
		List<Pessoa> listaF = new ArrayList<>();
		List<Conta> listaC = new ArrayList<>();
		
		leitor(path, listaF, listaC);
		
	}

	public static void leitor(String path, List<Pessoa> listaF, List<Conta> listaC) throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		
		String linha = "";

		while (true) {
			
			linha = buffRead.readLine();
			
			if (linha != null) {
				String split[] = linha.split(",");
				
				if(split[2].equalsIgnoreCase(PessoasEnum.DIRETOR.name())) {
					Diretor d = new Diretor(split[0], split[1], split[2], split[3], Double.parseDouble(split[4]), Integer.parseInt(split[5]));
					listaF.add(d);
					System.out.println(d);
				}
				else if(split[2].equalsIgnoreCase(PessoasEnum.GERENTE.name())) {
					Gerente g = new Gerente(split[0], split[1], split[2], split[3], Double.parseDouble(split[4]), Integer.parseInt(split[5]));
					listaF.add(g);
					System.out.println(g);
				}
				else if(split[2].equalsIgnoreCase(PessoasEnum.PRESIDENTE.name())) {
					Presidente p = new Presidente(split[0], split[1], split[2], split[3], Double.parseDouble(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]));
					listaF.add(p);
					System.out.println(p);
				}
				else if(split[2].equalsIgnoreCase(PessoasEnum.CLIENTE.name())) {
					Cliente c = new Cliente(split[0], split[1], split[2], split[3], Integer.parseInt(split[4]));
					listaF.add(c);
					System.out.println(c);
				}
				else if(split[2].equalsIgnoreCase(ContasEnum.CORRENTE.name())) {
					Conta c = new ContaCorrente(Integer.parseInt(split[0]), split[1], split[2], Double.parseDouble(split[3]), Double.parseDouble(split[4]), Double.parseDouble(split[5]));
					listaC.add(c);
					System.out.println(c);
				}
				else if(split[2].equalsIgnoreCase(ContasEnum.POUPANCA.name())) {
					Conta c = new ContaPoupanca(Integer.parseInt(split[0]), split[1], split[2], Double.parseDouble(split[3]), Double.parseDouble(split[4]));
					listaC.add(c);
					System.out.println(c);
				}
				
			} 
			else {
				break;
			}
		}
		buffRead.close();
	}

	
	public static void escritor(String path, Pessoa p, Conta c) throws IOException {
		
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "**********Saldo**********";
		buffWrite.append(linha + "\n");
		
		if(p.getTipo().equals(PessoasEnum.CLIENTE.name())){
			linha = ""+((Cliente)p).getAgencia();
			buffWrite.append(linha + "\n");
		}
		if(p.getTipo().equals(PessoasEnum.GERENTE.name())){
			((Cliente)p).getAgencia();
		}
		
		linha = "**********Fim do Saldo**********";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}

}
