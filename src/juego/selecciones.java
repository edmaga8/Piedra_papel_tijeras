package juego;

import java.util.Random;

public class selecciones {

	public static int pc_sel()
	{
		
		int a;
		Random rand= new Random();
		a= rand.nextInt(3);
		return a;
	}
}
