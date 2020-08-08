package departamentoPessoal;

import java.util.InputMismatchException;

import myException.ContasException;
import myException.DPException;

public class DPPrincipal {

	public static void main(String[] args) throws Exception{
		DPRelatorio dpr = new DPRelatorio();
		try {

			dpr.preparaFolha();
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException: "+ e.getCause());
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException: "+ e.getCause());
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException: "+ e.getCause());
			e.printStackTrace();
		}
		catch (ContasException e) {
			//System.out.println("ContasException: "+ e.getCause());
			//e.printStackTrace();
		}
		catch (DPException e) {
			//System.out.println("DPException: "+ e.getCause());
			//e.printStackTrace();
		}
	}
}
