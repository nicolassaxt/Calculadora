package com.github.nicolassaxt.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	public void valorAlterado(String novoValor);
}
