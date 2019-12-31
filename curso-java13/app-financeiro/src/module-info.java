module app.financeiro {
	requires java.base; // por padrão
//	requires app.calculo;
//	requires app.logging;
	requires app.api;
	uses br.com.dmc.app.Calculadora;
}