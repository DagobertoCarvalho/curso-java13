package br.com.dmc.app.calculo;

import br.com.dmc.app.Calculadora;
import br.com.dmc.app.calculo.interno.OperacoesAritmeticas;
import br.com.dmc.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{

	private String id = "abc";
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}

	public String getId() {
		return id;
	}
	
	
//	public Class<Logger> getLoggerClass(){
//		return Logger.class;
//	}
	
}
