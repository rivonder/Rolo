package Graficos;

import javax.swing.ImageIcon;

public class BombermanGrafico extends EntidadGrafica {

	public BombermanGrafico(int x, int y, int v) {
		super(x, y, v);
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/BombermanImagenes/arriba.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/BombermanImagenes/abajo.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/BombermanImagenes/izquierda.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/BombermanImagenes/derecha.png"));
		this.movimiento[0] = new ImageIcon(this.getClass().getResource("/BombermanImagenes/GifArriba.gif"));
		this.movimiento[1] = new ImageIcon(this.getClass().getResource("/BombermanImagenes/GifAbajo.gif"));
		this.movimiento[2] = new ImageIcon(this.getClass().getResource("/BombermanImagenes/GifIzquierda.gif"));
		this.movimiento[3] = new ImageIcon(this.getClass().getResource("/BombermanImagenes/GifDerecha.gif"));
		morir = new ImageIcon(this.getClass().getResource("/BombermanImagenes/GifMorir.gif"));

	}

}
