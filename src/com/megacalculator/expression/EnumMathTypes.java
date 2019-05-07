package com.megacalculator.expression;

public enum EnumMathTypes {
	// Values
	ADDITION("+"),
	SOUTRACTION("-"),
	MULTIPLICATION("*"),
	DIVISION("/"),
	SIN("sin"),
	COS("cos"),
	TAN("tan"),
	LN("ln"),
	LOG("log"),
	INV("1/"),
	CARRE("^2"),
	RACINE("√"),
	PI("π"),
	E("e"),
	ELEVE("^"),
	EXP("exp"),
	FAC("!"),
	MAT("mat");
	
  // Fields
	private final String symbol;
	// Constructor
	private EnumMathTypes(String symbol) {
		this.symbol = symbol;
	}
	// Getter
	public String getSymbol() {
		return this.symbol;
	}
}
