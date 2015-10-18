package Personajes;

import Nivel.Celda;
import Nivel.Nivel;

public abstract class Enemigo extends Personaje {

	protected int puntaje;
	
	public Enemigo(int v, boolean d, Nivel n, Celda c, int p){
		super(v, d, n, c);
		puntaje = p;
	}
	
	public int getPuntaje(){
		return puntaje;
	}
	
	
	public abstract void mover();
	
	public abstract void morir();
	
	
	
	
	
}

