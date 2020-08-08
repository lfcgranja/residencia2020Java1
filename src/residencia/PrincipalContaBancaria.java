package residencia;

import java.text.SimpleDateFormat;
import java.util.Date;

import contaBancaria.Conta;
import contaBancaria.ContaCorrente;

public class PrincipalContaBancaria {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente();
		conta.depositar(2000);
		
		System.out.println("### Extrato da Conta ###");
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
	
		System.out.println("Saldo: "+1000.00);
		System.out.println("Data: "+sdf.format(date));

	}

}
