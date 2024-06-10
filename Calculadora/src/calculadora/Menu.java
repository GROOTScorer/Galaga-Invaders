package calculadora;

import GUI.Ventana_Menu;

public class Menu
{
	public static void main(String[] args)
	{
		menuVentana();
	}
	private static void menuVentana()
	{
		Ventana_Menu MVentana=new Ventana_Menu();//Creo la ventana
		MVentana.setVisible(true);//Ventana visible
	}
}

