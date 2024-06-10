package main.java.com.calculadora.gui;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import main.java.com.calculadora.logic.MatricesOperacion;

public class VentanaMatricesMasDeUno extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Declaracion de variables
	private JTextField casilla_1_ent;
	private JTextField casilla_2_ent;
	private JTextField casilla_3_ent;
	private JTextField casilla_4_ent;
	private JTextField casilla_5_ent;
	private JTextField casilla_6_ent;
	private JTextField casilla_7_ent;
	private JTextField casilla_8_ent;
	private JTextField casilla_9_ent;
	private JTextField casilla_1_sal;
	private JTextField casilla_2_sal;
	private JTextField casilla_3_sal;
	private JTextField casilla_4_sal;
	private JTextField casilla_5_sal;
	private JTextField casilla_6_sal;
	private JTextField casilla_7_sal;
	private JTextField casilla_8_sal;
	private JTextField casilla_9_sal;
	private int operacion = -1; 
	private int validarResultado = 0;
	private int[][] matrizInicialA = new int[3][3];
	private int[][] matrizInicialB = new int[3][3];	
	// Se crea el frame
	public VentanaMatricesMasDeUno() {
		Color miColorPrin = new Color(26, 27, 40);
		Color miColorSec = new Color(87, 116, 250);
		Color letrasColor = new Color(255,255,255);
		Color gris = new Color(30,36,53);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 650);
		setResizable(false);
		setTitle("Matrices 2 | Ozores Matías y Amodeo Luca");
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
		
		JPanel suma = new RoundedPanel(15,miColorSec);
		suma.setBounds(10, 300, 185, 47);
		principal.add(suma);
		suma.setOpaque(false);
		suma.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel calc_suma = new JLabel("+");
		calc_suma.setForeground(letrasColor);
		calc_suma.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		calc_suma.setAlignmentX(Component.CENTER_ALIGNMENT);
		calc_suma.setHorizontalAlignment(SwingConstants.CENTER);
		calc_suma.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		suma.add(calc_suma);
		
		JPanel resta = new RoundedPanel(15,miColorSec);
		resta.setBackground(new Color(87, 116, 250));
		resta.setBounds(221, 300, 185, 47);
		resta.setOpaque(false);
		principal.add(resta);
		resta.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel calc_resta = new JLabel("-");
		calc_resta.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		calc_resta.setForeground(letrasColor);
		calc_resta.setHorizontalAlignment(SwingConstants.CENTER);
		calc_resta.setAlignmentX(0.5f);
		calc_resta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		resta.add(calc_resta);
		
		JPanel multiplicacion = new RoundedPanel(15,miColorSec);
		multiplicacion.setBackground(miColorSec);
		multiplicacion.setBounds(429, 300, 185, 47);
		multiplicacion.setOpaque(false);
		principal.add(multiplicacion);
		multiplicacion.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel calc_multiplicacion = new JLabel("x");
		calc_multiplicacion.setForeground(letrasColor);
		calc_multiplicacion.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		calc_multiplicacion.setHorizontalAlignment(SwingConstants.CENTER);
		calc_multiplicacion.setAlignmentX(0.5f);
		calc_multiplicacion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		multiplicacion.add(calc_multiplicacion);
		
		RoundedPanel division = new RoundedPanel(15, new Color(87, 116, 250));
		division.setOpaque(false);
		division.setBackground(new Color(87, 116, 250));
		division.setBounds(639, 300, 185, 47);
		principal.add(division);
		division.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel calc_division = new JLabel("/");
		calc_division.setHorizontalAlignment(SwingConstants.CENTER);
		calc_division.setForeground(Color.WHITE);
		calc_division.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		calc_division.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		calc_division.setAlignmentX(0.5f);
		division.add(calc_division);		
		
		
		JPanel matrices = new JPanel();
		matrices.setBackground(new Color(0, 64, 128));
		matrices.setBounds(10, 11, 814, 264);
		matrices.setOpaque(false);
		principal.add(matrices);
		matrices.setLayout(null);
		
		JPanel entrada = new JPanel();
		entrada.setBackground(new Color(128, 128, 192));
		entrada.setOpaque(false);
		entrada.setBounds(0, 0, 370, 264);
		matrices.add(entrada);
		entrada.setLayout(null);
		
		casilla_1_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_1_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_1_ent.getText();

		        if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		casilla_1_ent.setBackground(new Color(255, 255, 255));
		casilla_1_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_1_ent.setForeground(new Color(255, 255, 255));
		casilla_1_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_1_ent.setBounds(34, 11, 70, 70);
		entrada.add(casilla_1_ent);
		casilla_1_ent.setColumns(10);
		casilla_1_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_1_ent.setCaretColor(Color.WHITE);


		
		
		
		casilla_2_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_2_ent.setBackground(new Color(30, 36, 53));
		casilla_2_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_2_ent.setForeground(new Color(30, 36, 53));
		casilla_2_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_2_ent.setColumns(10);
		casilla_2_ent.setBounds(150, 11, 70, 70);
		casilla_2_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_2_ent.setCaretColor(Color.WHITE);

		casilla_2_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_2_ent.getText();

		        if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_2_ent);
		
		casilla_3_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_3_ent.setBackground(new Color(30, 36, 53));
		casilla_3_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_3_ent.setForeground(new Color(30, 36, 53));
		casilla_3_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_3_ent.setColumns(10);
		casilla_3_ent.setBounds(266, 11, 70, 70);
		casilla_3_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_3_ent.setCaretColor(Color.WHITE);

		casilla_3_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_3_ent.getText();

		        if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_3_ent);
		
		casilla_4_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_4_ent.setBackground(new Color(30, 36, 53));
		casilla_4_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_4_ent.setForeground(new Color(30, 36, 53));
		casilla_4_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_4_ent.setColumns(10);
		casilla_4_ent.setBounds(34, 98, 70, 70);
		casilla_4_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_4_ent.setCaretColor(Color.WHITE);

		casilla_4_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_4_ent.getText();

		        if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_4_ent);
		
		casilla_5_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_5_ent.setBackground(new Color(30, 36, 53));
		casilla_5_ent.setForeground(new Color(30, 36, 53));
		casilla_5_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_5_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_5_ent.setColumns(10);
		casilla_5_ent.setBounds(150, 98, 70, 70);
		casilla_5_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_5_ent.setCaretColor(Color.WHITE);

		casilla_5_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_5_ent.getText();

		        if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_5_ent);
		
		casilla_6_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_6_ent.setBackground(new Color(30, 36, 53));
		casilla_6_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_6_ent.setForeground(new Color(30, 36, 53));
		casilla_6_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_6_ent.setColumns(10);
		casilla_6_ent.setBounds(266, 98, 70, 70);
		casilla_6_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_6_ent.setCaretColor(Color.WHITE);
		casilla_6_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_6_ent.getText();

		        if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_6_ent);
		
		casilla_7_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_7_ent.setBackground(new Color(30, 36, 53));
		casilla_7_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_7_ent.setForeground(new Color(30, 36, 53));
		casilla_7_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_7_ent.setColumns(10);
		casilla_7_ent.setBounds(34, 186, 70, 70);
		casilla_7_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_7_ent.setCaretColor(Color.WHITE);
		casilla_7_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_7_ent.getText();

		        if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_7_ent);
		
		casilla_8_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_8_ent.setBackground(new Color(30, 36, 53));
		casilla_8_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_8_ent.setForeground(new Color(30, 36, 53));
		casilla_8_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_8_ent.setColumns(10);
		casilla_8_ent.setBounds(150, 186, 70, 70);
		casilla_8_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_8_ent.setCaretColor(Color.WHITE);
		casilla_8_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_8_ent.getText();

		        if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_8_ent);
		
		casilla_9_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_9_ent.setBackground(new Color(30, 36, 53));
		casilla_9_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_9_ent.setForeground(new Color(30, 36, 53));
		casilla_9_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_9_ent.setColumns(10);
		casilla_9_ent.setBounds(266, 186, 70, 70);
		casilla_9_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_9_ent.setCaretColor(Color.WHITE);
		casilla_9_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_9_ent.getText();

		        if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_9_ent);
		
		JLabel corchete_izq = new JLabel("");
		corchete_izq.setVerticalAlignment(SwingConstants.TOP);
		corchete_izq.setHorizontalAlignment(SwingConstants.LEFT);
		corchete_izq.setIcon(new ImageIcon(VentanaMatricesMasDeUno.class.getResource("/main/imagenes/CorcheteIzq.png")));
		corchete_izq.setBounds(0, 0, 29, 264);
		entrada.add(corchete_izq);


		
		JLabel corchete_der = new JLabel("");
		corchete_der.setVerticalAlignment(SwingConstants.TOP);
		corchete_der.setHorizontalAlignment(SwingConstants.RIGHT);
		corchete_der.setIcon(new ImageIcon(VentanaMatricesMasDeUno.class.getResource("/main/imagenes/CorcheteDer.png")));
		corchete_der.setBounds(341, 0, 29, 264);
		entrada.add(corchete_der);
		
		JPanel salida = new JPanel();
		salida.setBorder(null);
		salida.setBackground(new Color(128, 128, 192));
		salida.setBounds(444, 0, 370, 264);
		salida.setOpaque(false);
		matrices.add(salida);
		salida.setLayout(null);
		
		JLabel corchete_izq_1 = new JLabel("");
		corchete_izq_1.setVerticalAlignment(SwingConstants.TOP);
		corchete_izq_1.setHorizontalAlignment(SwingConstants.LEFT);
		corchete_izq_1.setIcon(new ImageIcon(VentanaMatricesMasDeUno.class.getResource("/main/imagenes/CorcheteIzq.png")));
		corchete_izq_1.setBounds(0, 0, 29, 264);
		salida.add(corchete_izq_1);
		
		JLabel corchete_der_1 = new JLabel("");
		corchete_der_1.setVerticalAlignment(SwingConstants.TOP);
		corchete_der_1.setHorizontalAlignment(SwingConstants.RIGHT);
		corchete_der_1.setIcon(new ImageIcon(VentanaMatricesMasDeUno.class.getResource("/main/imagenes/CorcheteDer.png")));
		corchete_der_1.setBounds(341, 0, 29, 264);
		salida.add(corchete_der_1);
		
		casilla_1_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_1_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_1_sal.setForeground(new Color(30, 36, 53));
		casilla_1_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_1_sal.setColumns(10);
		casilla_1_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_1_sal.setBounds(34, 11, 70, 70);
		casilla_1_sal.setEditable(false); 
		casilla_1_sal.setFocusable(false);
		salida.add(casilla_1_sal);
		
		casilla_2_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_2_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_2_sal.setForeground(new Color(30, 36, 53));
		casilla_2_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_2_sal.setColumns(10);
		casilla_2_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_2_sal.setBounds(150, 11, 70, 70);
		casilla_2_sal.setEditable(false); 
		casilla_2_sal.setFocusable(false);
		salida.add(casilla_2_sal);
		
		casilla_3_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_3_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_3_sal.setForeground(new Color(30, 36, 53));
		casilla_3_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_3_sal.setColumns(10);
		casilla_3_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_3_sal.setBounds(266, 11, 70, 70);
		casilla_3_sal.setEditable(false); 
		casilla_3_sal.setFocusable(false);
		salida.add(casilla_3_sal);
		
		casilla_4_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_4_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_4_sal.setForeground(new Color(30, 36, 53));
		casilla_4_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_4_sal.setColumns(10);
		casilla_4_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_4_sal.setBounds(34, 98, 70, 70);
		casilla_4_sal.setEditable(false); 
		casilla_4_sal.setFocusable(false);
		salida.add(casilla_4_sal);
		
		casilla_5_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_5_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_5_sal.setForeground(new Color(30, 36, 53));
		casilla_5_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_5_sal.setColumns(10);
		casilla_5_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_5_sal.setBounds(150, 98, 70, 70);
		casilla_5_sal.setEditable(false); 
		casilla_5_sal.setFocusable(false);
		salida.add(casilla_5_sal);
		
		casilla_6_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_6_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_6_sal.setForeground(new Color(30, 36, 53));
		casilla_6_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_6_sal.setColumns(10);
		casilla_6_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_6_sal.setBounds(266, 98, 70, 70);
		casilla_6_sal.setEditable(false); 
		casilla_6_sal.setFocusable(false);
		salida.add(casilla_6_sal);
		
		casilla_7_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_7_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_7_sal.setForeground(new Color(30, 36, 53));
		casilla_7_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_7_sal.setColumns(10);
		casilla_7_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_7_sal.setBounds(34, 186, 70, 70);
		casilla_7_sal.setEditable(false); 
		casilla_7_sal.setFocusable(false);
		salida.add(casilla_7_sal);
		
		casilla_8_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_8_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_8_sal.setForeground(new Color(30, 36, 53));
		casilla_8_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_8_sal.setColumns(10);
		casilla_8_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_8_sal.setBounds(150, 186, 70, 70);
		casilla_8_sal.setEditable(false); 
		casilla_8_sal.setFocusable(false);
		salida.add(casilla_8_sal);
		
		casilla_9_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_9_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_9_sal.setForeground(new Color(30, 36, 53));
		casilla_9_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_9_sal.setColumns(10);
		casilla_9_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_9_sal.setBounds(266, 186, 70, 70);
		casilla_9_sal.setEditable(false); 
		casilla_9_sal.setFocusable(false);
		salida.add(casilla_9_sal);
		
		RoundedPanel resultado = new RoundedPanel(15, new Color(87, 116, 250));
		resultado.setOpaque(false);
		resultado.setBackground(new Color(87, 116, 250));
		resultado.setBounds(380, 112, 54, 47);
		matrices.add(resultado);
		resultado.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel calc_resultado = new JLabel("=");
		calc_resultado.setHorizontalAlignment(SwingConstants.CENTER);
		calc_resultado.setForeground(new Color(255, 255, 255));
		calc_resultado.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		calc_resultado.setAlignmentX(0.5f);
		resultado.add(calc_resultado);
				
		JPanel menu_matrices = new JPanel();
		menu_matrices.setBackground(miColorPrin);
		menu_matrices.setBounds(23, 125, 834, 89);
		contentPane.add(menu_matrices);
		menu_matrices.setLayout(null);
		
		JPanel ingresar_una_matriz = new RoundedPanel(15,new Color(30,36,53));
		ingresar_una_matriz.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        VentanaMatricesUno v1 = new VentanaMatricesUno();
		        v1.setVisible(true);
		        setMyVisible(false); 
		    }

		    private void setMyVisible(boolean b) {
		        setVisible(b);
		    }
		});

		ingresar_una_matriz.setBackground(new Color(30, 36, 53));
		ingresar_una_matriz.setBounds(10, 11, 390, 67);
		ingresar_una_matriz.setOpaque(false);
		menu_matrices.add(ingresar_una_matriz);
		ingresar_una_matriz.setLayout(new GridLayout(1, 0, 0, 0));

		
		JLabel ingreso_una = new JLabel("Ingresar una matriz");
		ingreso_una.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		ingreso_una.setForeground(letrasColor);
		ingreso_una.setHorizontalAlignment(SwingConstants.CENTER);
		ingreso_una.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ingresar_una_matriz.add(ingreso_una);
		
		JPanel ingresar_dos_matrices = new RoundedPanel(15, new Color(87, 116, 250));
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
			}
		});
		ingresar_dos_matrices.setOpaque(false);
		ingresar_dos_matrices.setBackground(new Color(87, 116, 250));
		ingresar_dos_matrices.setBounds(434, 11, 390, 67);
		menu_matrices.add(ingresar_dos_matrices);
		ingresar_dos_matrices.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel ingreso_dos = new JLabel("Ingresar dos matrices");
		ingreso_dos.setHorizontalAlignment(SwingConstants.CENTER);
		ingreso_dos.setForeground(Color.WHITE);
		ingreso_dos.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		ingreso_dos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ingresar_dos_matrices.add(ingreso_dos);
		
		JPanel menu_general = new JPanel();
		menu_general.setBackground(miColorPrin);
		menu_general.setBounds(23, 34, 834, 80);
		contentPane.add(menu_general);
		menu_general.setLayout(null);
		
		JPanel aritmeticas = new JPanel();
		
		aritmeticas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aritmeticas.setBackground(new Color(155, 172, 254));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				aritmeticas.setBackground(new Color(255, 255, 255));
			}
		});
		aritmeticas.setBackground(new Color(255, 255, 255));
		aritmeticas.setBounds(10, 11, 185, 58);
		menu_general.add(aritmeticas);
		aritmeticas.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel texto_aritmeticas = new JLabel("ESTANDAR");
		texto_aritmeticas.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		texto_aritmeticas.setForeground(new Color(30, 36, 53));
		texto_aritmeticas.setHorizontalAlignment(SwingConstants.CENTER);
		texto_aritmeticas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		aritmeticas.add(texto_aritmeticas);
		
		
		JPanel vectores = new JPanel();
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
		});
		
		JLabel texto_vectores = new JLabel("VECTORES");
		texto_vectores.setHorizontalAlignment(SwingConstants.CENTER);
		texto_vectores.setForeground(new Color(30, 36, 53));
		texto_vectores.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		texto_vectores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		vectores.add(texto_vectores);
		
		JPanel matrices_operaciones = new JPanel();
		matrices_operaciones.setBackground(miColorSec);
		matrices_operaciones.setBounds(432, 11, 185, 58);
		menu_general.add(matrices_operaciones);
		matrices_operaciones.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel texto_matrices = new JLabel("MATRICES");
		texto_matrices.setBackground(miColorSec);
		texto_matrices.setHorizontalAlignment(SwingConstants.CENTER);
		texto_matrices.setForeground(letrasColor);
		texto_matrices.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		texto_matrices.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		matrices_operaciones.add(texto_matrices);
		
		JPanel ecuaciones = new JPanel();
		ecuaciones.setBackground(Color.WHITE);
		ecuaciones.setBounds(639, 11, 185, 58);
		menu_general.add(ecuaciones);
		ecuaciones.setLayout(new GridLayout(1, 0, 0, 0));
		
		ecuaciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ecuaciones.setBackground(new Color(155, 172, 254));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ecuaciones.setBackground(new Color(255, 255, 255));
			}
		});
		
		JLabel texto_ecuaciones = new JLabel("ECUACIONES");
		texto_ecuaciones.setHorizontalAlignment(SwingConstants.CENTER);
		texto_ecuaciones.setForeground(new Color(30, 36, 53));
		texto_ecuaciones.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		texto_ecuaciones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ecuaciones.add(texto_ecuaciones);
		
		JLabel igual_1 = new JLabel("+/-");
		igual_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1.setForeground(Color.WHITE);
		igual_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual_1.setBounds(368, 17, 80, 70);
		matrices.add(igual_1);
		
		// Parte logica simplificada
		
		// Eventos
		
        suma.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                procesarOperacion(1);
            }
        });

        resta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                procesarOperacion(2);
            }
        });

        multiplicacion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                procesarOperacion(3);
            }
        });

        division.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                procesarOperacion(4);
            }
        });

        resultado.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (areAllFieldsFilled()) {
                    if (validarResultado % 2 != 0) {
                        String valor1 = casilla_1_ent.getText();
                        String valor2 = casilla_2_ent.getText();
                        String valor3 = casilla_3_ent.getText();
                        String valor4 = casilla_4_ent.getText();
                        String valor5 = casilla_5_ent.getText();
                        String valor6 = casilla_6_ent.getText();
                        String valor7 = casilla_7_ent.getText();
                        String valor8 = casilla_8_ent.getText();
                        String valor9 = casilla_9_ent.getText();
                        
                        matrizInicialB[0][0] = Integer.parseInt(valor1);
                        matrizInicialB[0][1] = Integer.parseInt(valor2);
                        matrizInicialB[0][2] = Integer.parseInt(valor3);
                        matrizInicialB[1][0] = Integer.parseInt(valor4);
                        matrizInicialB[1][1] = Integer.parseInt(valor5);
                        matrizInicialB[1][2] = Integer.parseInt(valor6);
                        matrizInicialB[2][0] = Integer.parseInt(valor7);
                        matrizInicialB[2][1] = Integer.parseInt(valor8);
                        matrizInicialB[2][2] = Integer.parseInt(valor9);

                        int[][] resultado = new int[3][3];
                        
                        if (operacion == 1) {
                            resultado = MatricesOperacion.suma(matrizInicialB);
                        } else if (operacion == 2) {
                            resultado = MatricesOperacion.resta(matrizInicialB);
                        } else if (operacion == 3) {
                            resultado = MatricesOperacion.multiplicacion(matrizInicialB);
                        } else if (operacion == 4) {
                            resultado = MatricesOperacion.division(matrizInicialB);
                        }

                        mostrarResultado(resultado);
                        
                        validarResultado++;
                        limpiarCasillas();
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe realizar una operación antes de obtener el resultado.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
                }
            }
        });
    }

    private void procesarOperacion(int op) {
        if (areAllFieldsFilled()) {
            operacion = op;
            validarResultado++;
            String valor1 = casilla_1_ent.getText();
            String valor2 = casilla_2_ent.getText();
            String valor3 = casilla_3_ent.getText();
            String valor4 = casilla_4_ent.getText();
            String valor5 = casilla_5_ent.getText();
            String valor6 = casilla_6_ent.getText();
            String valor7 = casilla_7_ent.getText();
            String valor8 = casilla_8_ent.getText();
            String valor9 = casilla_9_ent.getText();
            
            matrizInicialA[0][0] = Integer.parseInt(valor1);
            matrizInicialA[0][1] = Integer.parseInt(valor2);
            matrizInicialA[0][2] = Integer.parseInt(valor3);
            matrizInicialA[1][0] = Integer.parseInt(valor4);
            matrizInicialA[1][1] = Integer.parseInt(valor5);
            matrizInicialA[1][2] = Integer.parseInt(valor6);
            matrizInicialA[2][0] = Integer.parseInt(valor7);
            matrizInicialA[2][1] = Integer.parseInt(valor8);
            matrizInicialA[2][2] = Integer.parseInt(valor9);

            MatricesOperacion.igualar(matrizInicialA);
            limpiarCasillas();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
        }
    }

    private void limpiarCasillas() {
        casilla_1_ent.setText("");
        casilla_2_ent.setText("");
        casilla_3_ent.setText("");
        casilla_4_ent.setText("");
        casilla_5_ent.setText("");
        casilla_6_ent.setText("");
        casilla_7_ent.setText("");
        casilla_8_ent.setText("");
        casilla_9_ent.setText("");
    }

    private void mostrarResultado(int[][] resultado) {
        casilla_1_sal.setText(String.valueOf(resultado[0][0]));
        casilla_2_sal.setText(String.valueOf(resultado[0][1]));
        casilla_3_sal.setText(String.valueOf(resultado[0][2]));
        casilla_4_sal.setText(String.valueOf(resultado[1][0]));
        casilla_5_sal.setText(String.valueOf(resultado[1][1]));
        casilla_6_sal.setText(String.valueOf(resultado[1][2]));
        casilla_7_sal.setText(String.valueOf(resultado[2][0]));
        casilla_8_sal.setText(String.valueOf(resultado[2][1]));
        casilla_9_sal.setText(String.valueOf(resultado[2][2]));
    }

    private boolean areAllFieldsFilled() {
        return !casilla_1_ent.getText().isEmpty() && 
               !casilla_2_ent.getText().isEmpty() && 
               !casilla_3_ent.getText().isEmpty() && 
               !casilla_4_ent.getText().isEmpty() && 
               !casilla_5_ent.getText().isEmpty() && 
               !casilla_6_ent.getText().isEmpty() && 
               !casilla_7_ent.getText().isEmpty() && 
               !casilla_8_ent.getText().isEmpty() && 
               !casilla_9_ent.getText().isEmpty();
	}
}
