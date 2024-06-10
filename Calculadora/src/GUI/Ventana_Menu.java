package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana_Menu extends JFrame
{
	private static final long serialVersionUID = -5500587932027014632L;
	
	public JPanel panel;
	
	public JTextField cajaNum=new JTextField();
	
	public JButton botonDivi=new JButton();
	public JButton botonMulti=new JButton();
	public JButton botonResta=new JButton();
	public JButton botonSuma=new JButton();
	public JButton botonIgual=new JButton();
	public JButton botonExpo=new JButton();
	public JButton botonRaiz=new JButton();
	public JButton botonPunto=new JButton();
	public JButton botonDelete=new JButton();
	
	public JButton boton1=new JButton();
	public JButton boton2=new JButton();
	public JButton boton3=new JButton();
	public JButton boton4=new JButton();
	public JButton boton5=new JButton();
	public JButton boton6=new JButton();
	public JButton boton7=new JButton();
	public JButton boton8=new JButton();
	public JButton boton9=new JButton();
	public JButton boton0=new JButton();
	
	
	double num1=0;
    double num2=0;
    double resultado;
    int contPunto=0;
    String operacion;
	
	public Ventana_Menu()
    {		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Se termina el programa al cerrar la ventana
        setSize(294,475);//Establezco el tamaño
        setLocationRelativeTo(null);//Establezco la ventana en el centro
        setTitle("Calculadora v1.0");//Le doy un titulo a la ventana
        setResizable(false);//La ventana no puede cambiar de tamaño
        this.getContentPane().setBackground(Color.BLACK);//Color de la ventana
         
        etiqueta_estandar();
        Option();
        Operations();
        Numeros();
        CajaNum();
                
    }
	public void desactivar_Operaciones()
	{
		botonDivi.setEnabled(false);
		botonMulti.setEnabled(false);
		botonSuma.setEnabled(false);
		botonResta.setEnabled(false);
		botonExpo.setEnabled(false);
		botonRaiz.setEnabled(false);
		botonPunto.setEnabled(false);
		botonIgual.setEnabled(false);
		botonDelete.setEnabled(false);
	}
	public void activar_Operaciones()
	{
		botonDivi.setEnabled(true);
		botonMulti.setEnabled(true);
		botonSuma.setEnabled(true);
		botonResta.setEnabled(true);
		botonExpo.setEnabled(true);
		botonRaiz.setEnabled(true);
		botonPunto.setEnabled(true);
		botonIgual.setEnabled(true);
		botonDelete.setEnabled(true);
	}
	public void desactivar_Numeros()
	{
		boton1.setEnabled(false);
		boton2.setEnabled(false);
		boton3.setEnabled(false);
		boton4.setEnabled(false);
		boton5.setEnabled(false);
		boton6.setEnabled(false);
		boton7.setEnabled(false);
		boton8.setEnabled(false);
		boton9.setEnabled(false);
		boton0.setEnabled(false);
	}
	public void activar_Numeros()
	{
		boton1.setEnabled(true);
		boton2.setEnabled(true);
		boton3.setEnabled(true);
		boton4.setEnabled(true);
		boton5.setEnabled(true);
		boton6.setEnabled(true);
		boton7.setEnabled(true);
		boton8.setEnabled(true);
		boton9.setEnabled(true);
		boton0.setEnabled(true);
	}
	public void contadorPunto()
	{
		if(contPunto>0)
		{
			botonPunto.setEnabled(false);
		}
	}
	public void activar_Menos()
	{
		if(cajaNum.getText().isEmpty())
		{
			botonResta.setEnabled(true);
		}
	}
    private void etiqueta_estandar()
    {
    	panel=new JPanel();
    	this.getContentPane().add(panel);//Se agraga el panel a la ventana
    	panel.setBackground(Color.getHSBColor(194, 190, 108));
    	panel.setLayout(null);//desactivo el diseño por default
    	
    	JLabel estandar=new JLabel("Estandar",SwingConstants.CENTER);
    	estandar.setOpaque(true);
    	estandar.setBackground(Color.getHSBColor(194, 190, 108));
    	estandar.setBounds(80,0,199,55);//Establezco la ubicaion y el tamaño
    	estandar.setForeground(Color.BLACK);//Color de la letra
    	estandar.setFont(new Font("Microsoft YaHei",Font.BOLD,15));
    	
    	panel.add(estandar);
    }
    private void Option()
    {
    	String[] opciones={"Estandar","Vectores","Matrices","Ecuaciones"};
    	
    	JComboBox opcionDesplegable=new JComboBox(opciones);
    	opcionDesplegable.setBounds(0,0,80,55);
    	panel.add(opcionDesplegable);
    }
    private void Operations()
    {
    	//SUMA
    	botonSuma.setBounds(210,330,70,55);
    	botonSuma.setOpaque(true);
    	botonSuma.setText("+");
    	botonSuma.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonSuma.setBackground(Color.decode("#5C5C5C"));
    	botonSuma.setForeground(Color.WHITE);
    	botonSuma.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	botonSuma.setEnabled(false);
    	
    	botonSuma.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			operacion="+";
    			num1=Double.parseDouble(cajaNum.getText());
    			cajaNum.setText("");
    			
    			desactivar_Operaciones();
    			
    			activar_Menos();
    			
    			contPunto--;
    		}
    	});
    	
    	panel.add(botonSuma);
    	
    	//RESTA
    	botonResta.setBounds(210,275,70,55);
    	botonResta.setOpaque(true);
    	botonResta.setText("-");
    	botonResta.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonResta.setBackground(Color.decode("#5C5C5C"));
    	botonResta.setForeground(Color.WHITE);
    	botonResta.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	botonResta.setEnabled(true);
    	
    	botonResta.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(cajaNum.getText().isEmpty())
    			{
    				cajaNum.setText("-");
    				botonResta.setEnabled(false);
    				botonDelete.setEnabled(true);
    			}
    			else
    			{
    				num1=Double.parseDouble(cajaNum.getText());
    				cajaNum.setText("");
    				operacion="-";
    				
    				desactivar_Operaciones();
    				
    				botonResta.setEnabled(true);
    				
    				contPunto--;
    			}
    		}
    	});
    	
    	panel.add(botonResta);
    	
    	
    	//MULTIPLICACION
    	botonMulti.setBounds(210,220,70,55);
    	botonMulti.setOpaque(true);
    	botonMulti.setText("x");
    	botonMulti.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonMulti.setBackground(Color.decode("#5C5C5C"));
    	botonMulti.setForeground(Color.WHITE);
    	botonMulti.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	botonMulti.setEnabled(false);
    	
    	botonMulti.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			num1=Double.parseDouble(cajaNum.getText());
    			cajaNum.setText("");
    			operacion="x";
    			
    			desactivar_Operaciones();
    			
    			activar_Menos();
    			
    			contPunto--;
    		}
    	});
    	
    	panel.add(botonMulti);
    	
    	
    	//DIVISION
    	botonDivi.setBounds(210,165,70,55);
    	botonDivi.setOpaque(true);
    	botonDivi.setText("/");
    	botonDivi.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonDivi.setBackground(Color.decode("#5C5C5C"));
    	botonDivi.setForeground(Color.WHITE);
    	botonDivi.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	botonDivi.setEnabled(false);
    	
    	botonDivi.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			num1=Double.parseDouble(cajaNum.getText());
    			cajaNum.setText("");
    			operacion="/";
    			
    			desactivar_Operaciones();
    			
    			activar_Menos();
    			
    			contPunto--;
    		}
    	});
    	
    	panel.add(botonDivi);
    	
    	
    	//EXPONENTE
    	botonExpo.setBounds(70,165,70,55);
    	botonExpo.setOpaque(true);
    	botonExpo.setText("^");
    	botonExpo.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonExpo.setBackground(Color.decode("#5C5C5C"));
    	botonExpo.setForeground(Color.WHITE);
    	botonExpo.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	botonExpo.setEnabled(false);
    	
    	botonExpo.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			num1=Double.parseDouble(cajaNum.getText());
    			cajaNum.setText("");
    			operacion="^";
    			
    			desactivar_Operaciones();
    			
    			activar_Menos();
    			
    			contPunto--;
    		}
    	});
    	
    	panel.add(botonExpo);
    	
    	
    	//RAIZ
    	botonRaiz.setBounds(140,165,70,55);
    	botonRaiz.setOpaque(true);
    	botonRaiz.setText("√");
    	botonRaiz.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonRaiz.setBackground(Color.decode("#5C5C5C"));
    	botonRaiz.setForeground(Color.WHITE);
    	botonRaiz.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	botonRaiz.setEnabled(false);
    	
    	botonRaiz.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			num1=Double.parseDouble(cajaNum.getText());
    			cajaNum.setText("");
    			operacion="√";
    			
    			desactivar_Operaciones();
    			
    			activar_Menos();
    			
    			contPunto--;
    		}
    	});
    	
    	panel.add(botonRaiz);
    	
    	
    	//PUNTO
    	botonPunto.setBounds(140,385,70,55);
    	botonPunto.setOpaque(true);
    	botonPunto.setText(".");
    	botonPunto.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonPunto.setBackground(Color.decode("#16417C"));
    	botonPunto.setForeground(Color.WHITE);
    	botonPunto.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	botonPunto.setEnabled(false);
    	
    	botonPunto.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+botonPunto.getText();
    			cajaNum.setText(IngreseNumero);
    			contPunto++;
    			
    			botonPunto.setEnabled(false);
    		}
    	});
    	
    	panel.add(botonPunto);
    	
    	
    	//IGUAL
    	botonIgual.setBounds(210,385,70,55);
    	botonIgual.setOpaque(true);
    	botonIgual.setText("=");
    	botonIgual.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonIgual.setBackground(Color.decode("#5C5C5C"));
    	botonIgual.setForeground(Color.WHITE);
    	botonIgual.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	botonIgual.setEnabled(false);
    	
    	botonIgual.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String seleccionar;
    			num2=Double.parseDouble(cajaNum.getText());
    			
    			if(operacion=="+")
    			{
    				resultado=num1+num2;
    				seleccionar=String.valueOf(resultado);
    				cajaNum.setText(seleccionar);
    			}
    			else if(operacion=="-")
    			{
    				resultado=num1-num2;
    				seleccionar=String.format("%.2f",resultado);
    				cajaNum.setText(seleccionar);
    			}
    			else if(operacion=="/")
    			{
    				if(num2==0)
    				{
    					cajaNum.setText("ERROR");
    				}
    				else
    				{
    					resultado=num1/num2;
    					seleccionar=String.format("%.2f",resultado);
    					cajaNum.setText(seleccionar);
    				}
    			}
    			else if(operacion=="x")
    			{
    				resultado=num1*num2;
    				seleccionar=String.format("%.2f",resultado);
    				cajaNum.setText(seleccionar);
    			}
    			else if(operacion=="^")
    			{
    				
    				double resultado=Math.pow(num1, num2);

    				seleccionar=String.format("%.2f",resultado);
    				cajaNum.setText(seleccionar);
    			}
    			else if(operacion=="√")
    			{
    				if(num1==0)
    				{
    					cajaNum.setText("ERROR");
    				}
    				else
    				{	
    					double resultado=Math.pow(num2,1/num1);
    				
    					seleccionar=String.format("%.2f",resultado);
    					cajaNum.setText(seleccionar);
    				}
    			}
    			
    			desactivar_Operaciones();
    			
    			desactivar_Numeros();
    		}
    	});
    	
    	panel.add(botonIgual);
    	
    	
    	//C
    	JButton botonC=new JButton();
    	botonC.setBounds(0,165,70,55);
    	botonC.setOpaque(true);
    	botonC.setText("C");
    	botonC.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonC.setBackground(Color.decode("#FFA200"));
    	botonC.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	
    	botonC.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			cajaNum.setText("");
    			num1=0;
    			num2=0;
    			operacion="";
    			
    			activar_Numeros();
    			desactivar_Operaciones();
    			
    			botonResta.setEnabled(true);
    			
    			contPunto--;
    		}
    	});
    	panel.add(botonC);
    	
    	
    	//DELETE
    	botonDelete.setBounds(0,385,70,55);
    	botonDelete.setOpaque(true);
    	botonDelete.setBackground(Color.decode("#16417C"));
    	botonDelete.setText("DEL");
    	botonDelete.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonDelete.setForeground(Color.WHITE);
    	botonDelete.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	botonDelete.setEnabled(false);
    	panel.add(botonDelete);
    	
    	botonDelete.addActionListener(new ActionListener()
    	{
    			public void actionPerformed(ActionEvent e)
    			{
    				if(cajaNum.getText().length()<2)
    				{
    					desactivar_Operaciones();
    			
    					botonResta.setEnabled(true);	
    				}
    				if(cajaNum.getText().length()>0)
    				{
    					cajaNum.setText(cajaNum.getText().substring(0,cajaNum.getText().length()-1));
    				}
    				if(cajaNum.getText().isEmpty() && contPunto>0)
    				{
    					contPunto--;
    				}
    			}
    	});
    }
    private void Numeros()
    {
    	//BOTON 1
    	boton1.setBounds(0,330,70,55);
    	boton1.setOpaque(true);
    	boton1.setText("1");
    	boton1.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton1.setBackground(Color.decode("#16417C"));
    	boton1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	boton1.setForeground(Color.WHITE);
    	
    	boton1.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+boton1.getText();
    			cajaNum.setText(IngreseNumero);
    			
    			if(num1==0)
    			{
    				activar_Operaciones();
    			}
    			else if(num1!=0)
    			{
    				desactivar_Operaciones();
    				botonPunto.setEnabled(true);
    				botonIgual.setEnabled(true);
    				botonDelete.setEnabled(true);
    			}
    			contadorPunto();
    		}
    	});
    	
    	panel.add(boton1);
    	
    	//BOTON 2
    	boton2.setBounds(70,330,70,55);
    	boton2.setOpaque(true);
    	boton2.setText("2");
    	boton2.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton2.setBackground(Color.decode("#16417C"));
    	boton2.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	boton2.setForeground(Color.WHITE);
    	
    	boton2.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+boton2.getText();
    			cajaNum.setText(IngreseNumero);
    			
    			if(num1==0)
    			{
    				activar_Operaciones();
    			}
    			else if(num1!=0)
    			{
    				desactivar_Operaciones();
    				botonPunto.setEnabled(true);
    				botonIgual.setEnabled(true);
    				botonDelete.setEnabled(true);
    			}
    			contadorPunto();
    		}
    	});
    	
    	panel.add(boton2);
    	
    	//BOTON 3
    	boton3.setBounds(140,330,70,55);
    	boton3.setOpaque(true);
    	boton3.setText("3");
    	boton3.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton3.setBackground(Color.decode("#16417C"));
    	boton3.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	boton3.setForeground(Color.WHITE);
    	
    	boton3.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+boton3.getText();
    			cajaNum.setText(IngreseNumero);
    			
    			if(num1==0)
    			{
    				activar_Operaciones();
    			}
    			else if(num1!=0)
    			{
    				desactivar_Operaciones();
    				botonPunto.setEnabled(true);
    				botonIgual.setEnabled(true);
    				botonDelete.setEnabled(true);
    			}
    			contadorPunto();
    		}
    	});
    	
    	panel.add(boton3);
    	
    	//BOTON 4
    	boton4.setBounds(0,275,70,55);
    	boton4.setOpaque(true);
    	boton4.setText("4");
    	boton4.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton4.setBackground(Color.decode("#16417C"));
    	boton4.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	boton4.setForeground(Color.WHITE);
    	
    	boton4.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+boton4.getText();
    			cajaNum.setText(IngreseNumero);
    			
    			if(num1==0)
    			{
    				activar_Operaciones();
    			}
    			else if(num1!=0)
    			{
    				desactivar_Operaciones();
    				botonPunto.setEnabled(true);
    				botonIgual.setEnabled(true);
    				botonDelete.setEnabled(true);
    			}
    			contadorPunto();
    		}
    	});
    	
    	panel.add(boton4);
    	
    	
    	//BOTON 5
    	boton5.setBounds(70,275,70,55);
    	boton5.setOpaque(true);
    	boton5.setText("5");
    	boton5.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton5.setBackground(Color.decode("#16417C"));
    	boton5.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	boton5.setForeground(Color.WHITE);
    	
    	boton5.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+boton5.getText();
    			cajaNum.setText(IngreseNumero);
    			
    			if(num1==0)
    			{
    				activar_Operaciones();
    			}
    			else if(num1!=0)
    			{
    				desactivar_Operaciones();
    				botonPunto.setEnabled(true);
    				botonIgual.setEnabled(true);
    				botonDelete.setEnabled(true);
    			}
    			contadorPunto();
    		}
    	});
    	
    	panel.add(boton5);
    	
    	//BOTON 6
    	boton6.setBounds(140,275,70,55);
    	boton6.setOpaque(true);
    	boton6.setText("6");
    	boton6.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton6.setBackground(Color.decode("#16417C"));
    	boton6.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	boton6.setForeground(Color.WHITE);
    	
    	boton6.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+boton6.getText();
    			cajaNum.setText(IngreseNumero);
    			
    			if(num1==0)
    			{
    				activar_Operaciones();
    			}
    			else if(num1!=0)
    			{
    				desactivar_Operaciones();
    				botonPunto.setEnabled(true);
    				botonIgual.setEnabled(true);
    				botonDelete.setEnabled(true);
    			}
    			contadorPunto();
    		}
    	});
    	
    	panel.add(boton6);
    	
    	//BOTON 7
    	boton7.setBounds(0,220,70,55);
    	boton7.setOpaque(true);
    	boton7.setText("7");
    	boton7.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton7.setBackground(Color.decode("#16417C"));
    	boton7.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	boton7.setForeground(Color.WHITE);
    	
    	boton7.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+boton7.getText();
    			cajaNum.setText(IngreseNumero);
    			
    			if(num1==0)
    			{
    				activar_Operaciones();
    			}
    			else if(num1!=0)
    			{
    				desactivar_Operaciones();
    				botonPunto.setEnabled(true);
    				botonIgual.setEnabled(true);
    				botonDelete.setEnabled(true);
    			}
    			contadorPunto();
    		}
    	});
    	
    	panel.add(boton7);
    	
    	//BOTON 8
    	boton8.setBounds(70,220,70,55);
    	boton8.setOpaque(true);
    	boton8.setText("8");
    	boton8.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton8.setBackground(Color.decode("#16417C"));
    	boton8.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	boton8.setForeground(Color.WHITE);
    	
    	boton8.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+boton8.getText();
    			cajaNum.setText(IngreseNumero);
    			
    			if(num1==0)
    			{
    				activar_Operaciones();
    			}
    			else if(num1!=0)
    			{
    				desactivar_Operaciones();
    				botonPunto.setEnabled(true);
    				botonIgual.setEnabled(true);
    				botonDelete.setEnabled(true);
    			}
    			contadorPunto();
    		}
    	});
    	
    	panel.add(boton8);
    	
    	//BOTON 9
    	boton9.setBounds(140,220,70,55);
    	boton9.setOpaque(true);
    	boton9.setText("9");
    	boton9.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton9.setBackground(Color.decode("#16417C"));
    	boton9.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	boton9.setForeground(Color.WHITE);
    	
    	boton9.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+boton9.getText();
    			cajaNum.setText(IngreseNumero);
    			
    			if(num1==0)
    			{
    				activar_Operaciones();
    			}
    			else if(num1!=0)
    			{
    				desactivar_Operaciones();
    				botonPunto.setEnabled(true);
    				botonIgual.setEnabled(true);
    				botonDelete.setEnabled(true);
    			}
    			contadorPunto();
    		}
    	});
    	
    	panel.add(boton9);
    	
    	//BOTON 0
    	boton0.setBounds(70,385,70,55);
    	boton0.setOpaque(true);
    	boton0.setText("0");
    	boton0.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton0.setBackground(Color.decode("#16417C"));
    	boton0.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	boton0.setForeground(Color.WHITE);
    	
    	boton0.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+boton0.getText();
    			cajaNum.setText(IngreseNumero);
    			
    			if(num1==0)
    			{
    				activar_Operaciones();
    			}
    			else if(num1!=0)
    			{
    				desactivar_Operaciones();
    				botonPunto.setEnabled(true);
    				botonIgual.setEnabled(true);
    				botonDelete.setEnabled(true);
    			}
    			contadorPunto();
    		}
    	});
    	
    	panel.add(boton0);
    }
    private void CajaNum()
    {	
    	cajaNum.setBounds(0,55,280,110);
    	cajaNum.setEditable(false);
    	cajaNum.setHorizontalAlignment(SwingConstants.RIGHT);
    	cajaNum.setFont(new Font("Microsoft YaHei",Font.BOLD,45));
    	cajaNum.setBackground(Color.decode("#16417C"));
    	cajaNum.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    	cajaNum.setForeground(Color.WHITE);
    	panel.add(cajaNum);
    }
}