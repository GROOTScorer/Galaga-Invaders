package CalculadoraG5.GUI;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.GridLayout;
import javax.swing.JLabel;
import CalculadoraG5.resources.RoundedPanel;


public class Estandar extends JInternalFrame
{
	
	private static final long serialVersionUID = -5500587932027014632L;
    private JDesktopPane desktopPane;
	public JPanel panel;
	
	public JTextField cajaNum=new JTextField();
	public JTextArea cajaAns=new JTextArea();
	
	public JButton botonDivi=new JButton();
	public JButton botonMulti=new JButton();
	public JButton botonResta=new JButton();
	public JButton botonSuma=new JButton();
	public JButton botonIgual=new JButton();
	public JButton botonExpo=new JButton();
	public JButton botonExpoC=new JButton();
	public JButton botonRaiz=new JButton();
	public JButton botonRaizC=new JButton();
	public JButton botonPunto=new JButton();
	public JButton botonAns=new JButton();
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
    int contCero=1;
    int contIgual=0;
    int contOperacion=0;
    int contAns=0;
    String operacion;
    String historial;
    String guardado;
    private final JPanel menu_general = new JPanel();
    private final RoundedPanel aritmeticas = new RoundedPanel(15, new Color(87, 116, 250));
    private final JLabel texto_aritmeticas = new JLabel("ESTANDAR");
    private final RoundedPanel vectores = new RoundedPanel(15, Color.WHITE);
    private final JLabel texto_vectores = new JLabel("VECTORES");
    private final RoundedPanel matrices_operaciones = new RoundedPanel(15, Color.WHITE);
    private final JLabel texto_matrices = new JLabel("MATRICES");
    private final RoundedPanel ecuaciones = new RoundedPanel(15, Color.WHITE);
    private final JLabel texto_ecuaciones = new JLabel("ECUACIONES");
    
	
	public Estandar(JDesktopPane desktopPane)
    {		
	    this.desktopPane = desktopPane;
        this.setBorder(null);
        this.setResizable(false);
        this.setClosable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setFrameIcon(null);
        this.setLocation(0, 0);
        this.setSize(900, 650);
        this.setVisible(true);

        // Eliminar la barra de título
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);

        // Evitar que la ventana se mueva
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                setLocation(0, 0);
            }
        });
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setResizable(false);//La ventana no puede cambiar de tamaño
        this.getContentPane().setBackground(Color.BLACK);//Color de la ventana
         
        etiqueta_estandar();
        Operations();
        Opciones();
        Numeros();
        CajaNum();
        CajaAns();
    }
	public void desactivar_Operaciones()
	{
		botonDivi.setEnabled(false);
		botonMulti.setEnabled(false);
		botonSuma.setEnabled(false);
		botonResta.setEnabled(false);
		botonExpo.setEnabled(false);
		botonExpoC.setEnabled(false);
		botonRaiz.setEnabled(false);
		botonRaizC.setEnabled(false);
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
		botonExpoC.setEnabled(true);
		botonRaiz.setEnabled(true);
		botonRaizC.setEnabled(true);
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
	public void activar_Menos()
	{
		if(cajaNum.getText().isEmpty())
		{
			botonResta.setEnabled(true);
		}
	}
	public void contCero()
	{
		if(contCero==1)
		{
			cajaNum.setText("");
			
			contCero=0;
		}
	}
	public void comprobarIgual()
	{
		if(contOperacion==1 && contIgual==1)
		{
			cajaNum.setText("0");
			num1=0;
			num2=0;
			operacion=null;
			contCero=1;
			
			activar_Numeros();
			activar_Operaciones();
		}
		else if(contOperacion==1 && contIgual==0)
		{
			cajaAns.setText(guardado);
			
			cajaNum.setText("0");
			num1=0;
			num2=0;
			operacion=null;
			contCero=1;
			
			activar_Numeros();
			activar_Operaciones();
		}
		else if(contOperacion==0 && contIgual==0)
		{
			cajaAns.setText(guardado);
			
			cajaNum.setText("0");
			num1=0;
			num2=0;
			operacion=null;
			contCero=1;
			
			activar_Numeros();
			activar_Operaciones();
		}
		else if(contOperacion==0 && contIgual==1)
		{
			cajaNum.setText("0");
			num1=0;
			num2=0;
			operacion=null;
			contCero=1;
			
			activar_Numeros();
			activar_Operaciones();
		}
	}
	public void comprobarPunto()
	{
		if(cajaNum.getText().contains("."))
		{
			botonPunto.setEnabled(false);
		}
		else
		{
			botonPunto.setEnabled(true);
		}
	}
	public void comprobarOperacion()
	{
		if(operacion==null)
		{
			activar_Operaciones();
		}
		else
		{
			desactivar_Operaciones();
			botonPunto.setEnabled(true);
			botonIgual.setEnabled(true);
			botonDelete.setEnabled(true);
		}
	}
    private void etiqueta_estandar()
    {
    	panel=new JPanel();
    	this.getContentPane().add(panel);//Se agraga el panel a la ventana
    	panel.setBackground(new Color(26, 27, 40));
    	panel.setLayout(null);//desactivo el diseño por default
    }
    private void Opciones()
    {
    }
    private void Operations()
    {
    	//SUMA
    	botonSuma.setBounds(349,369,70,55);
    	botonSuma.setOpaque(true);
    	botonSuma.setText("+");
    	botonSuma.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonSuma.setBackground(Color.decode("#2196f3"));
    	botonSuma.setForeground(Color.WHITE);
    	botonSuma.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonSuma.setFocusPainted(false);
    	botonSuma.setEnabled(true);
    	
    	botonSuma.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{

    			historial=cajaAns.getText()+cajaNum.getText()+" + ";
        		cajaAns.setText(historial);
        			
        		num1=Double.parseDouble(cajaNum.getText());
        		cajaNum.setText("0");
        		operacion="+";
        		
        		contCero=1;
        			
        		desactivar_Operaciones();
        		comprobarOperacion();
        			
        		contOperacion=1;
    		}
    	});
    	
    	panel.add(botonSuma);
    	
    	//RESTA
    	botonResta.setBounds(349,304,70,55);
    	botonResta.setOpaque(true);
    	botonResta.setText("-");
    	botonResta.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonResta.setBackground(Color.decode("#2196f3"));
    	botonResta.setForeground(Color.WHITE);
    	botonResta.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonResta.setFocusPainted(false);
    	botonResta.setEnabled(true);
    	
    	botonResta.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			historial=cajaAns.getText()+cajaNum.getText()+" - ";
    			cajaAns.setText(historial);
    			
    			num1=Double.parseDouble(cajaNum.getText());
    			cajaNum.setText("0");
    			operacion="-";
    			
    			contCero=1;
    			
    			desactivar_Operaciones();
    			comprobarOperacion();
    			
    			botonPunto.setEnabled(true);
    			botonDelete.setEnabled(true);
    			
    			contOperacion=1;
    		}
    	});
    	
    	panel.add(botonResta);
    	
    	
    	//MULTIPLICACION
    	botonMulti.setBounds(349,239,70,55);
    	botonMulti.setOpaque(true);
    	botonMulti.setText("x");
    	botonMulti.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonMulti.setBackground(Color.decode("#2196f3"));
    	botonMulti.setForeground(Color.WHITE);
    	botonMulti.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonMulti.setFocusPainted(false);
    	botonMulti.setEnabled(true);
    	
    	botonMulti.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			historial=cajaAns.getText()+cajaNum.getText()+" x ";
        		cajaAns.setText(historial);
        		
       			num1=Double.parseDouble(cajaNum.getText());
       			cajaNum.setText("0");
       			operacion="x";
       			
       			contCero=1;
       			
       			desactivar_Operaciones();
        		comprobarOperacion();
       			contOperacion=1;
   			}
    	});
    	
    	panel.add(botonMulti);
    	
    	
    	//DIVISION
    	botonDivi.setBounds(349,174,70,55);
    	botonDivi.setOpaque(true);
    	botonDivi.setText("/");
    	botonDivi.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonDivi.setBackground(Color.decode("#2196f3"));
    	botonDivi.setForeground(Color.WHITE);
    	botonDivi.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonDivi.setFocusPainted(false);
    	botonDivi.setEnabled(true);
    	
    	botonDivi.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			historial=cajaAns.getText()+cajaNum.getText()+" / ";
        		cajaAns.setText(historial);
        		
       			num1=Double.parseDouble(cajaNum.getText());
       			cajaNum.setText("0");
       			operacion="/";
        			
       			contCero=1;
        			
       			desactivar_Operaciones();
       			comprobarOperacion();

       			contOperacion=1;
   			}
    	});
    	
    	panel.add(botonDivi);
    	
    	
    	//EXPONENTE
    	botonExpo.setBounds(138,239,70,55);
    	botonExpo.setOpaque(true);
    	botonExpo.setText("x^y");
    	botonExpo.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonExpo.setBackground(Color.decode("#2196f3"));
    	botonExpo.setForeground(Color.WHITE);
    	botonExpo.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonExpo.setFocusPainted(false);
    	botonExpo.setEnabled(true);
    	
    	botonExpo.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			historial=cajaAns.getText()+cajaNum.getText()+" ^ ";
        		cajaAns.setText(historial);
        		
       			num1=Double.parseDouble(cajaNum.getText());
       			cajaNum.setText("0");
       			operacion="x^y";
       			
       			contCero=1;
        			
       			desactivar_Operaciones();
       			comprobarOperacion();

       			contOperacion=1;
    		}
    	});
    	
    	panel.add(botonExpo);
    	
    	
    	//EXPONENTECUADRADO
    	botonExpoC.setBounds(244,239,70,55);
    	botonExpoC.setOpaque(true);
    	botonExpoC.setText("x^2");
    	botonExpoC.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonExpoC.setBackground(Color.decode("#2196f3"));
    	botonExpoC.setForeground(Color.WHITE);
    	botonExpoC.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonExpoC.setFocusPainted(false);
    	botonExpoC.setEnabled(true);
    	
    	botonExpoC.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(contCero==1)
    			{
    				historial=cajaAns.getText()+"0^2=0\n";
        			cajaAns.setText(historial);
        			cajaNum.setText("0");
        			
        			contCero=1;
        			
        			guardado=cajaAns.getText();
					
    				desactivar_Operaciones();
    				desactivar_Numeros();
    			}
    			else if(contCero==0)
    			{
    				String seleccionar;
        			num1=Double.parseDouble(cajaNum.getText());
        			
        			double resultado=num1*num1;
        			
        			seleccionar=String.format("%.2f",resultado);
					cajaNum.setText(seleccionar);
    				
    				historial=cajaAns.getText()+num1+"^2="+resultado+"\n";
        			cajaAns.setText(historial);
        			
        			contCero=1;
        			
        			guardado=cajaAns.getText();
					
    				desactivar_Operaciones();
    				desactivar_Numeros();
    			}
    		}
    	});
    	
    	panel.add(botonExpoC);
    	
    	
    	
    	//RAIZ
    	botonRaiz.setBounds(138,174,70,55);
    	botonRaiz.setOpaque(true);
    	botonRaiz.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonRaiz.setBackground(Color.decode("#2196f3"));
    	botonRaiz.setText("y√x");
    	botonRaiz.setForeground(Color.WHITE);
    	botonRaiz.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonRaiz.setFocusPainted(false);
    	botonRaiz.setEnabled(true);
    	
    	botonRaiz.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			historial=cajaAns.getText()+cajaNum.getText()+" √ ";
    			cajaAns.setText(historial);
    			
    			num1=Double.parseDouble(cajaNum.getText());
    			cajaNum.setText("0");
    			operacion="y√x";
    			
    			contCero=1;
    			
    			desactivar_Operaciones();
    			comprobarOperacion();

    			contOperacion=1;
    		}
    	});
    	
    	panel.add(botonRaiz);
    	
    	
    	//RAIZCUADRADA
    	botonRaizC.setBounds(244,174,70,55);
    	botonRaizC.setOpaque(true);
    	botonRaizC.setText("2√");
    	botonRaizC.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonRaizC.setBackground(Color.decode("#2196f3"));
    	botonRaizC.setForeground(Color.WHITE);
    	botonRaizC.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonRaizC.setFocusPainted(false);
    	botonRaizC.setEnabled(true);
    	
    	botonRaizC.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(contCero==1)
    			{
    				historial=cajaAns.getText()+"2√ ";
        			cajaAns.setText(historial);
        			cajaNum.setText("0");
        			
        			operacion="2√";
        			
        			contCero=1;
        			
        			desactivar_Operaciones();
        			comprobarOperacion();

        			contOperacion=1;
    			}
    			else if(contCero==0)
    			{	
    				String seleccionar;
        			num1=Double.parseDouble(cajaNum.getText());
        			
        			double resultado=Math.sqrt(num1);
        			
        			seleccionar=String.format("%.2f",resultado);
					cajaNum.setText(seleccionar);
					
					historial=cajaAns.getText()+"2√"+num1+"= "+resultado+"\n";
					cajaAns.setText(historial);
        			
					guardado=cajaAns.getText();
					
    				desactivar_Operaciones();
    				desactivar_Numeros();
    			}
    		}
    	});
    	
    	panel.add(botonRaizC);

    	
    	//PUNTO
    	botonPunto.setBounds(244,499,70,55);
    	botonPunto.setOpaque(true);
    	botonPunto.setText(".");
    	botonPunto.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonPunto.setBackground(Color.decode("#2196f3"));
    	botonPunto.setForeground(Color.WHITE);
    	botonPunto.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonPunto.setFocusPainted(false);
    	botonPunto.setEnabled(false);
    	
    	botonPunto.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			String IngreseNumero=cajaNum.getText()+botonPunto.getText();
    			cajaNum.setText(IngreseNumero);
    			
    			botonPunto.setEnabled(false);
    			
    			contCero=0;
    		}
    	});
    	
    	panel.add(botonPunto);
    	
    	
    	//IGUAL
    	botonIgual.setBounds(349,434,70,120);
    	botonIgual.setOpaque(true);
    	botonIgual.setText("=");
    	botonIgual.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonIgual.setBackground(Color.decode("#2196f3"));
    	botonIgual.setForeground(Color.WHITE);
    	botonIgual.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonIgual.setFocusPainted(false);
    	botonIgual.setEnabled(true);
    	
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
    				
    				historial=cajaAns.getText()+num2+"= "+resultado+"\n";
    				cajaAns.setText(historial);
    			}
    			else if(operacion=="-")
    			{
    				resultado=num1-num2;
    				seleccionar=String.format("%.2f",resultado);
    				cajaNum.setText(seleccionar);
    				
    				historial=cajaAns.getText()+num2+"= "+resultado+"\n";
    				cajaAns.setText(historial);
    			}
    			else if(operacion=="/")
    			{
    				if(num2==0)
    				{
    					cajaNum.setText("ERROR");
    					
    					historial=cajaAns.getText()+num2+"= ERROR\n";
    					cajaAns.setText(historial);
    				}
    				else
    				{
    					resultado=num1/num2;
    					seleccionar=String.format("%.2f",resultado);
    					cajaNum.setText(seleccionar);
    					
    					historial=cajaAns.getText()+num2+"= "+resultado+"\n";
    					cajaAns.setText(historial);
    				}
    			}
    			else if(operacion=="x")
    			{
    				resultado=num1*num2;
    				seleccionar=String.format("%.2f",resultado);
    				cajaNum.setText(seleccionar);
    				
    				historial=cajaAns.getText()+num2+"= "+resultado+"\n";
    				cajaAns.setText(historial);
    			}
    			else if(operacion=="x^y")
    			{
    				
    				double resultado=Math.pow(num1, num2);

    				seleccionar=String.format("%.2f",resultado);
    				cajaNum.setText(seleccionar);
    				
    				historial=cajaAns.getText()+num2+"= "+resultado+"\n";
    				cajaAns.setText(historial);
    			}
    			else if(operacion=="y√x")
    			{
    				if(num1==0)
    				{
    					cajaNum.setText("ERROR");
    					
    					historial=cajaAns.getText()+num2+"= ERROR\n";
    					cajaAns.setText(historial);
    				}
    				else
    				{	
    					double resultado=Math.pow(num2,1/num1);
    				
    					seleccionar=String.format("%.2f",resultado);
    					cajaNum.setText(seleccionar);
    					
    					historial=cajaAns.getText()+num2+"= "+resultado+"\n";
    					cajaAns.setText(historial);
    				}
    			}
    			else if(operacion=="2√")
    			{
    				double resultado=Math.sqrt(num2);
    				
    				seleccionar=String.format("%.2f",resultado);
					cajaNum.setText(seleccionar);
					
					historial=cajaAns.getText()+num2+"= "+resultado+"\n";
					cajaAns.setText(historial);
    			}
    			else if(operacion==null)
    			{	
    				historial=cajaAns.getText()+cajaNum.getText()+"="+cajaNum.getText()+"\n";
    				cajaAns.setText(historial);
    			}
    			
    			guardado=cajaAns.getText();
    			
    			contIgual=1;
    			
    			desactivar_Operaciones();
    			
    			desactivar_Numeros();
    		}
    	});
    	
    	panel.add(botonIgual);
    	
    	
    	//AC
    	JButton botonC=new JButton();
    	botonC.setBounds(33,174,70,55);
    	botonC.setOpaque(true);
    	botonC.setText("AC");
    	botonC.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonC.setBackground(Color.decode("#2196f3"));
    	botonC.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonC.setFocusPainted(false);
    	botonC.setForeground(Color.WHITE);
    	
    	botonC.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			comprobarIgual();
    			contOperacion=0;
    			contIgual=0;
    		}
    	});
    	panel.add(botonC);
    	
    	
    	//DELETE
    	botonDelete.setBounds(33,239,70,55);
    	botonDelete.setOpaque(true);
    	botonDelete.setBackground(Color.decode("#2196f3"));
    	botonDelete.setText("DEL");
    	botonDelete.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	botonDelete.setForeground(Color.WHITE);
    	botonDelete.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	botonDelete.setFocusPainted(false);
    	botonDelete.setEnabled(true);
    	panel.add(botonDelete);
    	
    	botonDelete.addActionListener(new ActionListener()
    	{
    			public void actionPerformed(ActionEvent e)
    			{
    				if(cajaNum.getText().length()<2)
    				{	
    					cajaNum.setText("0 ");
    					
    					activar_Operaciones();
    					
    					contCero=1;
    				}
    				if(cajaNum.getText().length()>0)
    				{
    					cajaNum.setText(cajaNum.getText().substring(0,cajaNum.getText().length()-1));
    				}
    				comprobarOperacion();
      				comprobarPunto();
    			}
    	});
    }    
    private void Numeros()
    {
    	//BOTON 1
    	boton1.setBounds(33,434,70,55);
    	boton1.setOpaque(true);
    	boton1.setText("1");
    	boton1.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton1.setBackground(Color.decode("#5774fa"));
    	boton1.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	boton1.setFocusPainted(false);
    	boton1.setForeground(Color.WHITE);
    	
    	boton1.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(cajaNum.getText().contains("."))
    			{
    				String IngreseNumero=cajaNum.getText()+boton1.getText();
        			cajaNum.setText(IngreseNumero);
    			}
    			else
    			{	
    				contCero();
    				String IngreseNumero=cajaNum.getText()+boton1.getText();
    				cajaNum.setText(IngreseNumero);
    			
    				comprobarOperacion();
    				comprobarPunto();
    			}
    		}
    	});
    	
    	panel.add(boton1);
    	
    	//BOTON 2
    	boton2.setBounds(138,434,70,55);
    	boton2.setOpaque(true);
    	boton2.setText("2");
    	boton2.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton2.setBackground(Color.decode("#5774fa"));
    	boton2.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	boton2.setFocusPainted(false);
    	boton2.setForeground(Color.WHITE);
    	
    	boton2.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(cajaNum.getText().contains("."))
    			{
    				String IngreseNumero=cajaNum.getText()+boton2.getText();
        			cajaNum.setText(IngreseNumero);
    			}
    			else
    			{	
    				contCero();
    				String IngreseNumero=cajaNum.getText()+boton2.getText();
    				cajaNum.setText(IngreseNumero);
    			
    				comprobarOperacion();
    				comprobarPunto();
    			}
    		}
    	});
    	
    	panel.add(boton2);
    	
    	//BOTON 3
    	boton3.setBounds(244,434,70,55);
    	boton3.setOpaque(true);
    	boton3.setText("3");
    	boton3.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton3.setBackground(Color.decode("#5774fa"));
    	boton3.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	boton3.setFocusPainted(false);
    	boton3.setForeground(Color.WHITE);
    	
    	boton3.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(cajaNum.getText().contains("."))
    			{
    				String IngreseNumero=cajaNum.getText()+boton3.getText();
        			cajaNum.setText(IngreseNumero);
    			}
    			else
    			{	
    				contCero();
    				String IngreseNumero=cajaNum.getText()+boton3.getText();
    				cajaNum.setText(IngreseNumero);
    			
    				comprobarOperacion();
    				comprobarPunto();
    			}
    		}
    	});
    	
    	panel.add(boton3);
    	
    	//BOTON 4
    	boton4.setBounds(33,369,70,55);
    	boton4.setOpaque(true);
    	boton4.setText("4");
    	boton4.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton4.setBackground(Color.decode("#5774fa"));
    	boton4.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	boton4.setFocusPainted(false);
    	boton4.setForeground(Color.WHITE);
    	
    	boton4.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(cajaNum.getText().contains("."))
    			{
    				String IngreseNumero=cajaNum.getText()+boton4.getText();
        			cajaNum.setText(IngreseNumero);
    			}
    			else
    			{	
    				contCero();
    				String IngreseNumero=cajaNum.getText()+boton4.getText();
    				cajaNum.setText(IngreseNumero);
    			
    				comprobarOperacion();
    				comprobarPunto();
    			}
    		}
    	});
    	
    	panel.add(boton4);
    	
    	
    	//BOTON 5
    	boton5.setBounds(138,369,70,55);
    	boton5.setOpaque(true);
    	boton5.setText("5");
    	boton5.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton5.setBackground(Color.decode("#5774fa"));
    	boton5.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	boton5.setFocusPainted(false);
    	boton5.setForeground(Color.WHITE);
    	
    	boton5.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(cajaNum.getText().contains("."))
    			{
    				String IngreseNumero=cajaNum.getText()+boton5.getText();
        			cajaNum.setText(IngreseNumero);
    			}
    			else
    			{	
    				contCero();
    				String IngreseNumero=cajaNum.getText()+boton5.getText();
    				cajaNum.setText(IngreseNumero);
    			
    				comprobarOperacion();
    				comprobarPunto();
    			}
    		}
    	});
    	
    	panel.add(boton5);
    	
    	//BOTON 6
    	boton6.setBounds(244,369,70,55);
    	boton6.setOpaque(true);
    	boton6.setText("6");
    	boton6.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton6.setBackground(Color.decode("#5774fa"));
    	boton6.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	boton6.setFocusPainted(false);
    	boton6.setForeground(Color.WHITE);
    	
    	boton6.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(cajaNum.getText().contains("."))
    			{
    				String IngreseNumero=cajaNum.getText()+boton6.getText();
        			cajaNum.setText(IngreseNumero);
    			}
    			else
    			{	
    				contCero();
    				String IngreseNumero=cajaNum.getText()+boton6.getText();
    				cajaNum.setText(IngreseNumero);
    			
    				comprobarOperacion();
    				comprobarPunto();
    			}
    		}
    	});
    	
    	panel.add(boton6);
    	
    	//BOTON 7
    	boton7.setBounds(33,304,70,55);
    	boton7.setOpaque(true);
    	boton7.setText("7");
    	boton7.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton7.setBackground(Color.decode("#5774fa"));
    	boton7.setBorder(new LineBorder(new Color(30, 36, 53), 4));
    	boton7.setFocusPainted(false);
    	boton7.setForeground(Color.WHITE);
    	
    	boton7.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(cajaNum.getText().contains("."))
    			{
    				String IngreseNumero=cajaNum.getText()+boton7.getText();
        			cajaNum.setText(IngreseNumero);
    			}
    			else
    			{	
    				contCero();
    				String IngreseNumero=cajaNum.getText()+boton7.getText();
    				cajaNum.setText(IngreseNumero);
    			
    				comprobarOperacion();
    				comprobarPunto();
    			}
    		}
    	});
    	
    	panel.add(boton7);
    	
    	//BOTON 8
    	boton8.setBounds(138,304,70,55);
    	boton8.setOpaque(true);
    	boton8.setText("8");
    	boton8.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton8.setBackground(Color.decode("#5774fa"));
    	boton8.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	boton8.setFocusPainted(false);
    	boton8.setForeground(Color.WHITE);
    	
    	boton8.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(cajaNum.getText().contains("."))
    			{
    				String IngreseNumero=cajaNum.getText()+boton8.getText();
        			cajaNum.setText(IngreseNumero);
    			}
    			else
    			{	
    				contCero();
    				String IngreseNumero=cajaNum.getText()+boton8.getText();
    				cajaNum.setText(IngreseNumero);
    			
    				comprobarOperacion();
    				comprobarPunto();
    			}
    		}
    	});
    	
    	panel.add(boton8);
    	
    	//BOTON 9
    	boton9.setBounds(244,304,70,55);
    	boton9.setOpaque(true);
    	boton9.setText("9");
    	boton9.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton9.setBackground(Color.decode("#5774fa"));
    	boton9.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	boton9.setFocusPainted(false);
    	boton9.setForeground(Color.WHITE);
    	
    	boton9.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(cajaNum.getText().contains("."))
    			{
    				String IngreseNumero=cajaNum.getText()+boton9.getText();
        			cajaNum.setText(IngreseNumero);
    			}
    			else
    			{	
    				contCero();
    				String IngreseNumero=cajaNum.getText()+boton9.getText();
    				cajaNum.setText(IngreseNumero);
    			
    				comprobarOperacion();
    				comprobarPunto();
    			}
    		}
    	});
    	
    	panel.add(boton9);
    	
    	//BOTON 0
    	boton0.setBounds(33,499,175,55);
    	boton0.setOpaque(true);
    	boton0.setText("0");
    	boton0.setFont(new Font("Microsoft YaHei",Font.BOLD,21));
    	boton0.setBackground(Color.decode("#5774fa"));
    	boton0.setBorder(new LineBorder(new Color(30, 36, 53), 5));
    	boton0.setFocusPainted(false);
    	boton0.setForeground(Color.WHITE);
    	
    	boton0.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			if(cajaNum.getText().contains("."))
    			{
    				String IngreseNumero=cajaNum.getText()+boton0.getText();
    				cajaNum.setText(IngreseNumero);
    			}
    			else
    			{
    				if(contCero==0)
        			{
        				contCero();
        				String IngreseNumero=cajaNum.getText()+boton0.getText();
        				cajaNum.setText(IngreseNumero);
        			}
        			else if(contCero==1)
        			{
        				cajaNum.setText("0");
        			}
    			}			
    			comprobarOperacion();
    			comprobarPunto();
    		}
    	});
    	
    	panel.add(boton0);
    }
    private void CajaNum() {
        cajaNum.setBounds(455, 444, 392, 110);
        cajaNum.setEditable(false);
        cajaNum.setFocusable(false); 
        cajaNum.setHorizontalAlignment(SwingConstants.RIGHT);
        cajaNum.setFont(new Font("Microsoft YaHei", Font.BOLD, 45));
        cajaNum.setBackground(Color.decode("#5774fa"));
        cajaNum.setBorder(new LineBorder(new Color(87, 116, 250), 15));
        cajaNum.setForeground(Color.WHITE);
        cajaNum.setText("0");
        comprobarPunto();
        panel.add(cajaNum);
    }

    private void CajaAns()
    {
    	cajaAns.setBounds(455,174,392,268);
    	cajaAns.setEditable(false);
    	cajaAns.setFont(new Font("Microsoft YaHei",Font.BOLD,20));
    	cajaAns.setBackground(Color.decode("#5774fa"));
    	cajaAns.setBorder(new LineBorder(new Color(87, 116, 250), 15));
    	cajaAns.setForeground(Color.WHITE);
    	
    	panel.add(cajaAns);
    	menu_general.setLayout(null);
    	menu_general.setBackground(new Color(26, 27, 40));
    	menu_general.setBounds(22, 34, 834, 80);
    	
    	panel.add(menu_general);
    	aritmeticas.setForeground(new Color(30, 36, 53));
    	aritmeticas.setBackground(new Color(87, 116, 250));
    	aritmeticas.setBounds(10, 11, 185, 58);
    	
    	
    	menu_general.add(aritmeticas);
    	aritmeticas.setLayout(new GridLayout(0, 1, 0, 0));
    	texto_aritmeticas.setHorizontalAlignment(SwingConstants.CENTER);
    	texto_aritmeticas.setForeground(Color.WHITE);
		texto_aritmeticas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	texto_aritmeticas.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
    	
    	aritmeticas.add(texto_aritmeticas);
    	vectores.setOpaque(false);
    	vectores.setBackground(Color.WHITE);
    	vectores.setBounds(221, 11, 185, 58);
    	
		vectores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				vectores.setBackground(new Color(155, 172, 254));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				vectores.setBackground(new Color(255, 255, 255));
			}
			
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaVectores();
            }
		});
    	
    	menu_general.add(vectores);
    	vectores.setLayout(new GridLayout(1, 0, 0, 0));
    	texto_vectores.setHorizontalAlignment(SwingConstants.CENTER);
    	texto_vectores.setForeground(new Color(30, 36, 53));
		texto_vectores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	texto_vectores.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
    	
    	vectores.add(texto_vectores);
    	matrices_operaciones.setOpaque(false);
    	matrices_operaciones.setBackground(Color.white);
    	matrices_operaciones.setBounds(432, 11, 185, 58);
    	
		matrices_operaciones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaMatricesUno();
            }
		});
    	
    	menu_general.add(matrices_operaciones);
    	matrices_operaciones.setLayout(new GridLayout(1, 0, 0, 0));
    	texto_matrices.setHorizontalAlignment(SwingConstants.CENTER);
    	texto_matrices.setForeground(new Color(30, 36, 53));
		texto_matrices.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	texto_matrices.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
    	texto_matrices.setBackground(new Color(87, 116, 250));
    	
    	matrices_operaciones.add(texto_matrices);
    	ecuaciones.setOpaque(false);
    	ecuaciones.setBackground(Color.WHITE);
    	ecuaciones.setBounds(639, 11, 185, 58);
    	
		ecuaciones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaEcuaciones();
            }
		}); 	
    	
    	menu_general.add(ecuaciones);
    	ecuaciones.setLayout(new GridLayout(1, 0, 0, 0));
    	texto_ecuaciones.setHorizontalAlignment(SwingConstants.CENTER);
    	texto_ecuaciones.setForeground(new Color(30, 36, 53));
		texto_ecuaciones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	texto_ecuaciones.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
    	
    	ecuaciones.add(texto_ecuaciones);
    }
    
	private void abrirVentanaEcuaciones() {
	    // Cerrar la ventana actual
	    this.dispose();

	    // Abrir Ventana2x2 en el mismo JDesktopPane
	    Ecuaciones2x2 ventana2x2 = new Ecuaciones2x2(desktopPane);
	    desktopPane.add(ventana2x2);
	    ventana2x2.setVisible(true);
	}
    

    
    private void abrirVentanaMatricesUno() {
	    this.dispose();
    	MatricesUno ventanaMatricesUno = new MatricesUno(desktopPane);
        desktopPane.add(ventanaMatricesUno);
        ventanaMatricesUno.setVisible(true);
        this.setVisible(false);
    }
    
    private void abrirVentanaVectores() {
	    this.dispose();
        VentanaVectores VentanaVectores= new VentanaVectores(desktopPane);
        desktopPane.add(VentanaVectores);
        VentanaVectores.setVisible(true);
    }
    
    
}