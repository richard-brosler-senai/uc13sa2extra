package br.com.senaibauru.classes;

public class ConversorTemperatura {
	private String tempOrigem;
	private String tempDestino;
	private double temperatura;
	
	public ConversorTemperatura() {
		// TODO Auto-generated constructor stub
		this.tempOrigem="C";
		this.tempDestino="C";
		this.temperatura=30.00;
	}

	public String getTempOrigem() {
		return tempOrigem;
	}

	public void setTempOrigem(String tempOrigem) {
		if (!tempOrigem.equals("C") && 
			!tempOrigem.equals("F") &&
			!tempOrigem.equals("K"))
			throw new 
			IllegalArgumentException("Temperaturas permitidas: " +
									 "C - Celsius, K - Kelvin ou " +
									 "F - Fahrenheit!");
		this.tempOrigem = tempOrigem;
	}

	public String getTempDestino() {
		return tempDestino;
	}

	public void setTempDestino(String tempDestino) {
		if (!tempDestino.equals("C") && 
			!tempDestino.equals("F") &&
			!tempDestino.equals("K"))
			throw new 
			IllegalArgumentException("Temperaturas permitidas: " +
									 "C - Celsius, K - Kelvin ou " +
									 "F - Fahrenheit!");
		this.tempDestino = tempDestino;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public double getTemperaturaDestino() {
		double ret=this.temperatura;
		switch(this.tempOrigem) {
		case "C":
			if (this.tempDestino.equals("F"))
				ret = this.temperatura * 9 / 5 + 32;
			if (this.tempDestino.equals("K"))
				ret = this.temperatura + 273;
		}
		
		return ret;
	}

}
