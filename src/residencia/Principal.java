package residencia;

import portugol.BalancoPatrimonial;

public class Principal {
	
	
    public static void main(String[] args) {
    	
    	BalancoPatrimonial balanco = new BalancoPatrimonial(10,20,30,40,50,60,70);
    	balanco.setGastosAgosto(80);
    	balanco.setGastosSetembro(90);
    	balanco.setGastosOutubro(100);
    	balanco.setGastosNovembro(110);
    	balanco.setGastosDezembro(120);
    	
    	balanco.calcularGastosTrimestrais();
    	balanco.calcularMediaGastosAnual();
    	
    	balanco.imprimirGastos();
    	
     	
    }
    

}

