module app.calculo {
	requires transitive app.logging;
	exports br.com.dmc.app.calculo;
	
//	exports br.com.dmc.app.calculo.interno
//		to app.financeiro;

	opens br.com.dmc.app.calculo 
		to app.logging, app.financeiro;
	
	requires app.api;
	provides br.com.dmc.app.Calculadora
		with br.com.dmc.app.calculo.CalculadoraImpl;
}