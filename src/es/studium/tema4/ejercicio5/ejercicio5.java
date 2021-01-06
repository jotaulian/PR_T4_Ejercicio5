package es.studium.tema4.ejercicio5;

import java.awt.*;

public class ejercicio5 extends Frame
{
	private static final long serialVersionUID = 1L;
	Choice lista = new Choice();
	
	public ejercicio5() {
		setLayout(new FlowLayout());
		setTitle("Provincias Españolas");
		
		//Guardamos las provincias en un Array
		String[] provincias = {"Elegir una", "Álava", "Albacete", "Alicante", "Zaragoza"};
		//Añadimos las provincias del array a la lista
		for (String provincia : provincias)
		{
			lista.add(provincia);
		}		
		add(lista);
		
		setSize(200,150);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new ejercicio5();
	}

}
