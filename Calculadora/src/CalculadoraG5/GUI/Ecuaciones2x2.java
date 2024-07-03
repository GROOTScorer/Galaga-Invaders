package CalculadoraG5.GUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import CalculadoraG5.resources.RoundedPanel;
import CalculadoraG5.resources.RoundedTextfield;

public class Ecuaciones2x2 extends JInternalFrame{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Declaracion de variables
	private JTextField casilla_x_1;
	private JTextField casilla_y_1;
	private JTextField casilla_x_2;
	private JTextField casilla_y_2;
	
	private JTextField casilla_x_sal;
	private JTextField casilla_y_sal;
	private JDesktopPane desktopPane;


	// Se crea el frame
	public Ecuaciones2x2(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
		setTitle("Ecuaciones 2x2");
		Color miColorPrin = new Color(26, 27, 40);
		Color miColorSec = new Color(87, 116, 250);
		Color letrasColor = new Color(255,255,255);
		Color gris = new Color(30,36,53);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		contentPane = new JPanel();
		contentPane.setBackground(miColorPrin);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel principal = new JPanel();
		principal.setBackground(miColorPrin);
		principal.setBounds(23, 215, 834, 373);
		contentPane.add(principal);
		principal.setLayout(null);
		
		JPanel determinante = new RoundedPanel(15,miColorSec);
		determinante.setBackground(miColorSec);
		determinante.setBounds(280, 300, 274, 47);
		determinante.setOpaque(false);
		principal.add(determinante);
		determinante.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel calc_ecuacion = new JLabel("Calcular ecuación");
		calc_ecuacion.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		calc_ecuacion.setForeground(letrasColor);
		calc_ecuacion.setHorizontalAlignment(SwingConstants.CENTER);
		calc_ecuacion.setAlignmentX(0.5f);
		calc_ecuacion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		determinante.add(calc_ecuacion);
		
		JPanel matrices = new JPanel();
		matrices.setBackground(new Color(0, 64, 128));
		matrices.setBounds(10, 11, 814, 264);
		matrices.setOpaque(false);
		principal.add(matrices);
		matrices.setLayout(null);
		
		JPanel entrada = new JPanel();
		entrada.setBackground(new Color(128, 128, 192));
		entrada.setOpaque(false);
		entrada.setBounds(0, 52, 410, 212);
		matrices.add(entrada);
		entrada.setLayout(null);
		
		casilla_x_1 = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_x_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_x_1.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		casilla_x_1.setBackground(new Color(30, 36, 53));
		casilla_x_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_x_1.setForeground(new Color(254, 254, 254));
		casilla_x_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_x_1.setBounds(126, 11, 70, 70);
		entrada.add(casilla_x_1);
		casilla_x_1.setColumns(10);
		casilla_x_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_x_1.setCaretColor(Color.WHITE);

		
		
		
		casilla_y_1 = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_y_1.setBackground(new Color(30, 36, 53));
		casilla_y_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_y_1.setForeground(new Color(254, 254, 254));
		casilla_y_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_y_1.setColumns(10);
		casilla_y_1.setBounds(281, 11, 70, 70);
		casilla_y_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_y_1.setCaretColor(Color.WHITE);

		casilla_y_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_y_1.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_y_1);
		
		casilla_x_2 = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_x_2.setBackground(new Color(30, 36, 53));
		casilla_x_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_x_2.setForeground(new Color(254, 254, 254));
		casilla_x_2.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_x_2.setColumns(10);
		casilla_x_2.setBounds(126, 98, 70, 70);
		casilla_x_2.setBorder(BorderFactory.createEmptyBorder());
		casilla_x_2.setCaretColor(Color.WHITE);

		casilla_x_2.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_x_2.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_x_2);
		
		casilla_y_2 = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_y_2.setBackground(new Color(30, 36, 53));
		casilla_y_2.setForeground(new Color(254, 254, 254));
		casilla_y_2.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_y_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_y_2.setColumns(10);
		casilla_y_2.setBounds(281, 98, 70, 70);
		casilla_y_2.setBorder(BorderFactory.createEmptyBorder());
		casilla_y_2.setCaretColor(Color.WHITE);

		casilla_y_2.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_y_2.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_y_2);
		
		JLabel igual_1_1 = new JLabel("x");
		igual_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1.setForeground(Color.WHITE);
		igual_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_1.setBounds(174, 11, 80, 70);
		entrada.add(igual_1_1);
		
		JLabel igual_1_2 = new JLabel("x");
		igual_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_2.setForeground(Color.WHITE);
		igual_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_2.setBounds(174, 100, 80, 70);
		entrada.add(igual_1_2);
		
		JLabel igual_1_1_2 = new JLabel("y");
		igual_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_2.setForeground(Color.WHITE);
		igual_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_1_2.setBounds(330, 11, 80, 70);
		entrada.add(igual_1_1_2);
		
		JLabel igual_1_2_1 = new JLabel("y");
		igual_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_2_1.setForeground(Color.WHITE);
		igual_1_2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_2_1.setBounds(330, 100, 80, 70);
		entrada.add(igual_1_2_1);
		
		JLabel igual_1_1_2_1 = new JLabel("+");
		igual_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_2_1.setForeground(Color.WHITE);
		igual_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual_1_1_2_1.setBounds(224, 11, 80, 70);
		entrada.add(igual_1_1_2_1);
		
		JLabel igual_1_2_1_1 = new JLabel("+");
		igual_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_2_1_1.setForeground(Color.WHITE);
		igual_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual_1_2_1_1.setBounds(224, 100, 80, 70);
		entrada.add(igual_1_2_1_1);
		
		JPanel salida = new JPanel();
		salida.setBorder(null);
		salida.setBackground(new Color(128, 128, 192));
		salida.setBounds(393, 52, 421, 212);
		salida.setOpaque(false);
		matrices.add(salida);
		salida.setLayout(null);
		
		casilla_x_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_x_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_x_sal.setForeground(new Color(30, 36, 53));
		casilla_x_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_x_sal.setColumns(10);
		casilla_x_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_x_sal.setBounds(181, 11, 70, 70);
		casilla_x_sal.setEditable(false); 
		casilla_x_sal.setFocusable(false);
		salida.add(casilla_x_sal);
		
		casilla_y_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_y_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_y_sal.setForeground(new Color(30, 36, 53));
		casilla_y_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_y_sal.setColumns(10);
		casilla_y_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_y_sal.setBounds(181, 98, 70, 70);
		casilla_y_sal.setEditable(false); 
		casilla_y_sal.setFocusable(false);
		salida.add(casilla_y_sal);
		
		RoundedTextfield casilla_result_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_result_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_result_1.setForeground(new Color(254, 254, 254));
		casilla_result_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_result_1.setColumns(10);
		casilla_result_1.setCaretColor(Color.WHITE);
		casilla_result_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_result_1.setBackground(new Color(30, 36, 53));
		casilla_result_1.setBounds(32, 11, 70, 70);
		
		casilla_result_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_result_1.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		salida.add(casilla_result_1);
		
		RoundedTextfield casilla_result_2 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_result_2.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_result_2.setForeground(new Color(254, 254, 254));
		casilla_result_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_result_2.setColumns(10);
		casilla_result_2.setCaretColor(Color.WHITE);
		casilla_result_2.setBorder(BorderFactory.createEmptyBorder());
		casilla_result_2.setBackground(new Color(30, 36, 53));
		casilla_result_2.setBounds(32, 98, 70, 70);
		
		casilla_result_2.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_result_2.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		
		salida.add(casilla_result_2);
		
		JLabel igual_1 = new JLabel("=");
		igual_1.setBounds(-27, 99, 80, 70);
		salida.add(igual_1);
		igual_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1.setForeground(Color.WHITE);
		igual_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		JLabel igual = new JLabel("=");
		igual.setBounds(-27, 11, 80, 70);
		salida.add(igual);
		igual.setForeground(new Color(255, 255, 255));
		igual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel igual_1_1_2_2_1 = new JLabel("x");
		igual_1_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_2_2_1.setForeground(Color.WHITE);
		igual_1_1_2_2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_1_2_2_1.setBounds(122, 10, 80, 70);
		salida.add(igual_1_1_2_2_1);
		
		JLabel igual_1_2_1_2_1 = new JLabel("y");
		igual_1_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_2_1_2_1.setForeground(Color.WHITE);
		igual_1_2_1_2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_2_1_2_1.setBounds(122, 99, 80, 70);
		salida.add(igual_1_2_1_2_1);
		
		/*
		JSpinner spiValor = new JSpinner(new SpinnerNumberModel(3, 3, 5, 1));
		spiValor.setForeground(new Color(255, 255, 255)); 
		spiValor.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		spiValor.setBounds(380, 54, 54, 38);
		spiValor.setOpaque(false);
		spiValor.setBorder(null); 

		JComponent editor = spiValor.getEditor();
		editor.setOpaque(false);
		editor.setBorder(null); 

		JFormattedTextField textField = ((JSpinner.DefaultEditor) editor).getTextField();
		textField.setOpaque(false);
		textField.setForeground(new Color(255, 255, 255)); 
		textField.setBorder(null);


		textField.setCaret(new DefaultCaret() {
		    private static final long serialVersionUID = 1L;

		    @Override
		    public void setSelectionVisible(boolean visible) {
		    }

		    @Override
		    public void setVisible(boolean visible) {
		        super.setVisible(false);
		    }

		    @Override
		    public void setDot(int dot) {
		        super.setDot(textField.getText().length());
		        setVisible(false);  
		    }

		    @Override
		    public void moveDot(int dot) {
		        super.moveDot(textField.getText().length());
		        setVisible(false); 
		    }
		});
		
		spiValor.addChangeListener(e -> {
		    int valor = (int) spiValor.getValue();
		    if (valor == 3) {
		    	
		    	// posicion y tamaño
		    	
				casilla_x_1.setBounds(34, 11, 70, 70);
				casilla_y_1.setBounds(150, 11, 70, 70);
				casilla_3_ent.setBounds(266, 11, 70, 70);
				casilla_x_2.setBounds(34, 98, 70, 70);
				casilla_y_2.setBounds(150, 98, 70, 70);
				casilla_6_ent.setBounds(266, 98, 70, 70);
				casilla_7_ent.setBounds(34, 186, 70, 70);
				casilla_8_ent.setBounds(150, 186, 70, 70);
				casilla_9_ent.setBounds(266, 186, 70, 70);
				
				
				// visibilidad
		        casilla_x_1.setVisible(true);
		        casilla_y_1.setVisible(true);
		        casilla_3_ent.setVisible(true);
		        casilla_x_2.setVisible(true);
		        casilla_y_2.setVisible(true);
		        casilla_6_ent.setVisible(true);
		        casilla_7_ent.setVisible(true);
		        casilla_8_ent.setVisible(true);
		        casilla_9_ent.setVisible(true);
		        
		        // Mostrar las casillas de salida
		        casilla_x_sal.setVisible(true);
		        casilla_2_sal.setVisible(true);
		        casilla_3_sal.setVisible(true);
		        casilla_y_sal.setVisible(true);
		        casilla_5_sal.setVisible(true);
		        casilla_6_sal.setVisible(true);
		        casilla_7_sal.setVisible(true);
		        casilla_8_sal.setVisible(true);
		        casilla_9_sal.setVisible(true);
		    } 
		    
		    else if(valor == 4){
		        casilla_x_1.setVisible(false);
		        casilla_y_1.setVisible(false);
		        casilla_3_ent.setVisible(false);
		        casilla_x_2.setVisible(false);
		        casilla_y_2.setVisible(false);
		        casilla_6_ent.setVisible(false);
		        casilla_7_ent.setVisible(false);
		        casilla_8_ent.setVisible(false);
		        casilla_9_ent.setVisible(false);
		        
		        casilla_x_sal.setVisible(false);
		        casilla_2_sal.setVisible(false);
		        casilla_3_sal.setVisible(false);
		        casilla_y_sal.setVisible(false);
		        casilla_5_sal.setVisible(false);
		        casilla_6_sal.setVisible(false);
		        casilla_7_sal.setVisible(false);
		        casilla_8_sal.setVisible(false);
		        casilla_9_sal.setVisible(false);
		    }
		    
		    else {
		    
		    }
		    
		});

		matrices.add(spiValor);
*/


		
		JPanel menu_matrices = new JPanel();
		menu_matrices.setBackground(miColorPrin);
		menu_matrices.setBounds(23, 125, 834, 89);
		contentPane.add(menu_matrices);
		menu_matrices.setLayout(null);
		
		JPanel ingresar_una_matriz = new RoundedPanel(15,miColorSec);
		ingresar_una_matriz.setBackground(miColorSec);
		ingresar_una_matriz.setBounds(10, 11, 390, 67);
		ingresar_una_matriz.setOpaque(false);
		menu_matrices.add(ingresar_una_matriz);
		ingresar_una_matriz.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel ingreso_una = new JLabel("Sistema 2x2");
		ingreso_una.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		ingreso_una.setForeground(letrasColor);
		ingreso_una.setHorizontalAlignment(SwingConstants.CENTER);
		ingreso_una.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ingresar_una_matriz.add(ingreso_una);
		
		JPanel ingresar_dos_matrices = new RoundedPanel(15, new Color(30, 36, 53));

		
		ingresar_dos_matrices.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ingresar_dos_matrices.setBackground(new Color(48, 58, 85));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ingresar_dos_matrices.setBackground(new Color(30, 36, 53));
			}
	
			@Override
			public void mouseClicked(MouseEvent e) {
				abrirVentana3x3();
			}

		});
		ingresar_dos_matrices.setOpaque(false);
		ingresar_dos_matrices.setBackground(new Color(30, 36, 53));
		ingresar_dos_matrices.setBounds(434, 11, 390, 67);
		menu_matrices.add(ingresar_dos_matrices);
		ingresar_dos_matrices.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel ingreso_dos = new JLabel("Sistema 3x3");
		ingreso_dos.setHorizontalAlignment(SwingConstants.CENTER);
		ingreso_dos.setForeground(Color.WHITE);
		ingreso_dos.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		ingreso_dos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ingresar_dos_matrices.add(ingreso_dos);
		
		JPanel menu_general = new JPanel();
		menu_general.setLayout(null);
		menu_general.setBackground(new Color(26, 27, 40));
		menu_general.setBounds(22, 34, 834, 80);
		contentPane.add(menu_general);
		
		RoundedPanel aritmeticas = new RoundedPanel(15, Color.WHITE);
		aritmeticas.setOpaque(false);
		aritmeticas.setForeground(new Color(86, 116, 253));
		aritmeticas.setBackground(Color.WHITE);
		aritmeticas.setBounds(10, 11, 185, 58);
		menu_general.add(aritmeticas);
		aritmeticas.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel texto_aritmeticas = new JLabel("ESTANDAR");
		texto_aritmeticas.setHorizontalAlignment(SwingConstants.CENTER);
		texto_aritmeticas.setForeground(new Color(30, 36, 53));
		texto_aritmeticas.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		texto_aritmeticas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		aritmeticas.add(texto_aritmeticas);
		
		aritmeticas.setForeground(new Color(86, 116, 253));
		
		aritmeticas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aritmeticas.setBackground(new Color(155, 172, 254));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				aritmeticas.setBackground(new Color(255, 255, 255));
			}
			
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaEstandar();
            }
		});
		
		RoundedPanel vectores = new RoundedPanel(15, Color.WHITE);
		vectores.setOpaque(false);
		vectores.setBackground(Color.WHITE);
		vectores.setBounds(221, 11, 185, 58);
		menu_general.add(vectores);
		vectores.setLayout(new GridLayout(1, 0, 0, 0));
		
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
		
		JLabel texto_vectores = new JLabel("VECTORES");
		texto_vectores.setHorizontalAlignment(SwingConstants.CENTER);
		texto_vectores.setForeground(new Color(30, 36, 53));
		texto_vectores.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		texto_vectores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		vectores.add(texto_vectores);
		
		RoundedPanel matrices_operaciones = new RoundedPanel(15, Color.WHITE);
		matrices_operaciones.setOpaque(false);
		matrices_operaciones.setBackground(new Color(30, 36, 53));
		matrices_operaciones.setBounds(432, 11, 185, 58);
		menu_general.add(matrices_operaciones);
		matrices_operaciones.setLayout(new GridLayout(1, 0, 0, 0));
		
		matrices_operaciones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaMatricesUno();
            }
		});
		
		JLabel texto_matrices_1 = new JLabel("MATRICES");
		texto_matrices_1.setHorizontalAlignment(SwingConstants.CENTER);
		texto_matrices_1.setForeground(new Color(30, 36, 53));
		texto_matrices_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		texto_matrices_1.setBackground(new Color(87, 116, 250));
		texto_matrices_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		matrices_operaciones.add(texto_matrices_1);
		
		RoundedPanel ecuaciones = new RoundedPanel(15, new Color(87, 116, 250));
		ecuaciones.setOpaque(false);
		ecuaciones.setBackground(Color.WHITE);
		ecuaciones.setBounds(639, 11, 185, 58);
		menu_general.add(ecuaciones);
		ecuaciones.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel texto_ecuaciones = new JLabel("ECUACIONES");
		texto_ecuaciones.setHorizontalAlignment(SwingConstants.CENTER);
		texto_ecuaciones.setForeground(Color.WHITE);
		texto_ecuaciones.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		texto_ecuaciones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ecuaciones.add(texto_ecuaciones);

				calc_ecuacion.addMouseListener(new java.awt.event.MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						calc_ecuacion.setForeground(new Color(205, 205, 205));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						calc_ecuacion.setForeground(letrasColor);	
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						if (areAllFieldsFilled()) {
				        	String valor1 = casilla_x_1.getText();
				        	String valor2 = casilla_y_1.getText();
				        	String valor3 = casilla_result_1.getText();
				        	String valor4 = casilla_x_2.getText();
				        	String valor5 = casilla_y_2.getText();
				        	String valor6 = casilla_result_2.getText();

				        	int ent_x_1 = Integer.parseInt(valor1);
				        	int ent_y_1 = Integer.parseInt(valor2);
				        	int ent_result_1 = Integer.parseInt(valor3);
				        	int ent_x_2 = Integer.parseInt(valor4);
				        	int ent_y_2 = Integer.parseInt(valor5);
				        	int ent_result_2 = Integer.parseInt(valor6);

				        	resolverSistema2x2(ent_x_1, ent_y_1, ent_result_1, ent_x_2, ent_y_2, ent_result_2);
				            
				        }else {
				            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
				        }
					}
					
				    private boolean areAllFieldsFilled() {
				        return !casilla_x_1.getText().isEmpty() && 
				               !casilla_y_1.getText().isEmpty() && 
				               !casilla_result_1.getText().isEmpty() &&
				               !casilla_x_2.getText().isEmpty() && 
				               !casilla_y_2.getText().isEmpty() &&
				               !casilla_result_2.getText().isEmpty();
				    }
				});
	}

	public void resolverSistema2x2(int a1, int b1, int c1, int a2, int b2, int c2) {
	    double determinante = a1 * b2 - a2 * b1;
	
	    if (determinante == 0) {
	        JOptionPane.showMessageDialog(null, "No una sola solución.");
	    } else {
	        double x = (c1 * b2 - c2 * b1) / determinante;
	        double y = (a1 * c2 - a2 * c1) / determinante;
	
	        casilla_x_sal.setText(String.format("%.2f", x));
	        casilla_y_sal.setText(String.format("%.2f", y));
	    }
	    
	    
	}

    private void abrirVentana3x3() {
	    this.dispose();
    	Ecuaciones3x3 Ventana3x3 = new Ecuaciones3x3(desktopPane);
        desktopPane.add(Ventana3x3);
        Ventana3x3.setVisible(true);
        this.setVisible(false);
    }
    
    private void abrirVentanaEstandar() {
	    this.dispose();
        Estandar Estandar= new Estandar(desktopPane);
        desktopPane.add(Estandar);
        Estandar.setVisible(true);
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
