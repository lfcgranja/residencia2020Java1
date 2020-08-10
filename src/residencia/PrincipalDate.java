package residencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PrincipalDate {

	public static void main(String[] args) throws ParseException {

		//Objeto utilizado para formatar data
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");//Podemos usr outros formatos

		
		
//		//Date
//		Date date = new Date();
//		System.out.println("Date antes de formatar: " + date);
//		System.out.println("Date depois de formatar: " + simpleDateFormat.format(date));
//
//		String stx ="07/11/1978";
//		Date dataUsuario = simpleDateFormat.parse(stx);
//		System.out.println("Date digitado e formatado: " + dataUsuario);
//	
//		
//		System.out.println();
//		
//		
//		//GregorianCalendar
		GregorianCalendar gCalendar = new GregorianCalendar();
//		System.out.println("Qual o dia da semana: " + gCalendar.get(Calendar.DAY_OF_WEEK)); //Mostra qual o dia da semana 1 = domingo, 2=segunda, etc
//		System.out.println("Data do sistema: " + gCalendar.getTime()); 
//		gCalendar.add(Calendar.MONTH, 2); //Adiciona 2 meses à data atual
//		System.out.println("Data do sistema mais 2 meses: " + gCalendar.getTime()); 
//		System.out.println("Será que 2009 é bissexto? " + gCalendar.isLeapYear(2009)); //Imprime falso. 2009 não é bissexto.
//		Date d1 = gCalendar.getTime(); //Atribui a data do GregorianCalendar à uma variável Date
//		gCalendar.setTime(d1); //Armazena a data de d1 para o GregorianCalendar gc.
//
//		
//		System.out.println();
//		
//		
//		//LocalDate
//        LocalDate hoje = LocalDate.now();
//        System.out.println("LocalDate antes de formatar: " + hoje);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String hojeFormatado = hoje.format(formatter);
//        System.out.println("LocalDate depois de formatar: " + hojeFormatado);
//
//        
//		System.out.println();
//        
//
//        //LocalDateTime
//        LocalDateTime agora = LocalDateTime.now();
//        System.out.println("LocalDateTime antes de formatar: " + agora);
//
//        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//        String agoraFormatado = agora.format(formatter);
//        System.out.println("LocalDateTime depois de formatar: " + agoraFormatado);
        
        

		
		Date startDate = simpleDateFormat.parse("07/11/1978");
		Date endDate = simpleDateFormat.parse("10/08/2020");
		
		LocalDate start = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate end = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		int cont = 0;
		for (LocalDate localDate = start; localDate.isBefore(end); localDate = localDate.plusDays(1)) {
		    cont = cont+1;
		}

		gCalendar.setTime(startDate);
		gCalendar.add(Calendar.DAY_OF_MONTH, cont);
		System.out.println("Dias contados: " + cont);
		System.out.println(gCalendar.getTime());
	}
	
}
