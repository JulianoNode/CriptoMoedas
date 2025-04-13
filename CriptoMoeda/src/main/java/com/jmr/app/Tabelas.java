package com.jmr.app;

public class Tabelas {
	
	public String runProgeto () {
		
		System.out.println(runFile()+ runCompra() +runVenda() );
		return "" ;
	}	
	public String runFile () {
		System.err.println("\n\tTabela File\n"
				+ "|_String nome;\n"
				+ "|_String sigla;\n"				
				+ "|_String imagem;");
		return "";
	}	
	public String runCompra () {
		System.err.println("\n\tTabela Compra\n"
				+ "|_String valor do Mecado;\n"
				+ "|_String Quantidade;\n"
				+ "|_String valor da compra;\n"
				+ "|_String valor da Venta;\n"
				+ "|_String data da Venta;\n");
		return "" ;
	}		
	public String runVenda () {
	System.err.println("\n\tTabela Venda\n"
			    + "|_String valor da venda;\n"
				+ "|_String valor do Mecado;\n"
				+ "|_String Quantidade;\n"
				+ "|_String Preco;\n"
				+ "|_String Porcentagem;\n"
				+ "|_String dataVenta;\n");
	return "";
	}
}
