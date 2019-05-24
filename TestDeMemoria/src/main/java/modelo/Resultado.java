package modelo;

import controlador.AlmacenamientoDato;

public class Resultado {
	private int respuestaCorrecta = 0;
	private int respuestasIncorrectas = 0;
	private double puntaje;
	private Respuesta respueta;
	private Pregunta pregunta;
	private AlmacenamientoDato guardarDatos;

	public int calcularRespuestasCorrectas() {
		throw new UnsupportedOperationException();
	}

	public int calcularRespuestasIncorrectas() {
		throw new UnsupportedOperationException();
	}

	public void calcularPuntaje() {
		throw new UnsupportedOperationException();
	}

	public void guardarDatos(Resultado resultado) {
		throw new UnsupportedOperationException();
	}
}