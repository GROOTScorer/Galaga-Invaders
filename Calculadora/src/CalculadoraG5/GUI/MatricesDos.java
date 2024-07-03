package CalculadoraG5.GUI;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import CalculadoraG5.resources.RoundedPanel;
import CalculadoraG5.resources.RoundedTextfield;

public class MatricesDos extends JInternalFrame{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JDesktopPane desktopPane;
	
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
	private JTextField casilla_10_ent;
	private JTextField casilla_11_ent;
	private JTextField casilla_12_ent;
	private JTextField casilla_13_ent;
	private JTextField casilla_14_ent;
	private JTextField casilla_15_ent;
	private JTextField casilla_16_ent;
	private JTextField casilla_17_ent;
	private JTextField casilla_18_ent;
	private JTextField casilla_19_ent;
	private JTextField casilla_20_ent;
	private JTextField casilla_21_ent;
	private JTextField casilla_22_ent;
	private JTextField casilla_23_ent;
	private JTextField casilla_24_ent;
	private JTextField casilla_25_ent;
	private int spinnerValor = 3;
	private int[][] answer3x3 = new int[3][3];
	private int[][] answer4x4 = new int[4][4];
	private int[][] answer5x5 = new int[5][5];
	
	private JTextField casilla_1_sal;
	private JTextField casilla_2_sal;
	private JTextField casilla_3_sal;
	private JTextField casilla_4_sal;
	private JTextField casilla_5_sal;
	private JTextField casilla_6_sal;
	private JTextField casilla_7_sal;
	private JTextField casilla_8_sal;
	private JTextField casilla_9_sal;
	private JTextField casilla_10_sal;
	private JTextField casilla_11_sal;
	private JTextField casilla_12_sal;
	private JTextField casilla_13_sal;
	private JTextField casilla_14_sal;
	private JTextField casilla_15_sal;
	private JTextField casilla_16_sal;
	private JTextField casilla_17_sal;
	private JTextField casilla_18_sal;
	private JTextField casilla_19_sal;
	private JTextField casilla_20_sal;
	private JTextField casilla_21_sal;
	private JTextField casilla_22_sal;
	private JTextField casilla_23_sal;
	private JTextField casilla_24_sal;
	private JTextField casilla_25_sal;

	// Se crea el frame
	   public MatricesDos(JDesktopPane desktopPane) {
	    this.desktopPane = desktopPane;
		setTitle("MatricesMasDeUno");
        Color miColorPrin = new Color(26, 27, 40);
        Color miColorSec = new Color(87, 116, 250);
        Color letrasColor = new Color(255,255,255);
        Color gris = new Color(30,36,53);
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
		
		JLabel calc_suma = new JLabel("A + B");
		calc_suma.setForeground(letrasColor);
		calc_suma.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
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
		
		JLabel calc_resta = new JLabel("A - B");
		calc_resta.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
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
		
		JLabel calc_multiplicacion = new JLabel("A X B");
		calc_multiplicacion.setForeground(letrasColor);
		calc_multiplicacion.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
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
		
		JLabel calc_division = new JLabel("A / B");
		calc_division.setHorizontalAlignment(SwingConstants.CENTER);
		calc_division.setForeground(Color.WHITE);
		calc_division.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		calc_division.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		calc_division.setAlignmentX(0.5f);
		division.add(calc_division);		
		
		
		JPanel matrices = new JPanel();
		matrices.setBackground(new Color(0, 64, 128));
		matrices.setBounds(10, 11, 814, 264);
		matrices.setOpaque(false);
		principal.add(matrices);
		matrices.setLayout(null);
		
		JLabel corchete_der_e1 = new JLabel();
		corchete_der_e1.setVerticalAlignment(SwingConstants.TOP);
		corchete_der_e1.setHorizontalAlignment(SwingConstants.LEFT);
		corchete_der_e1.setBounds(210, 30, 29, 264);
		matrices.add(corchete_der_e1);
			
		JLabel corchete_der_e2 = new JLabel();
		corchete_der_e2.setVerticalAlignment(SwingConstants.TOP);
		corchete_der_e2.setHorizontalAlignment(SwingConstants.LEFT);
		corchete_der_e2.setBounds(536, 30, 29, 264);
		matrices.add(corchete_der_e2);
		
		
		JPanel entrada = new JPanel();
		entrada.setBackground(new Color(128, 128, 192));
		entrada.setOpaque(false);
		entrada.setBounds(10, 35, 198, 198);
		matrices.add(entrada);
		entrada.setLayout(null);
		
		casilla_1_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_1_ent.setBackground(new Color(255, 255, 255));
		casilla_1_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_1_ent.setForeground(new Color(255, 255, 255));
		casilla_1_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_1_ent.setBounds(10, 11, 52, 52);
		casilla_1_ent.setColumns(10);
		casilla_1_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_1_ent.setCaretColor(Color.WHITE);

		casilla_1_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_1_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		entrada.add(casilla_1_ent);

		
		
		
		casilla_2_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_2_ent.setBackground(new Color(30, 36, 53));
		casilla_2_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_2_ent.setForeground(new Color(30, 36, 53));
		casilla_2_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_2_ent.setColumns(10);
		casilla_2_ent.setBounds(74, 11, 52, 52);
		casilla_2_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_2_ent.setCaretColor(Color.WHITE);

		casilla_2_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_2_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
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
		casilla_3_ent.setBounds(138, 11, 52, 52);
		casilla_3_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_3_ent.setCaretColor(Color.WHITE);

		casilla_3_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_3_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
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
		casilla_4_ent.setBounds(10, 75, 52, 52);
		casilla_4_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_4_ent.setCaretColor(Color.WHITE);

		casilla_4_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_4_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
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
		casilla_5_ent.setBounds(74, 75, 52, 52);
		casilla_5_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_5_ent.setCaretColor(Color.WHITE);

		casilla_5_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_5_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
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
		casilla_6_ent.setBounds(138, 75, 52, 52);
		casilla_6_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_6_ent.setCaretColor(Color.WHITE);
		casilla_6_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_6_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
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
		casilla_7_ent.setBounds(10, 138, 52, 52);
		casilla_7_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_7_ent.setCaretColor(Color.WHITE);
		casilla_7_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_7_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
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
		casilla_8_ent.setBounds(74, 138, 52, 52);
		casilla_8_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_8_ent.setCaretColor(Color.WHITE);
		casilla_8_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_8_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
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
		casilla_9_ent.setBounds(138, 138, 52, 52);
		casilla_9_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_9_ent.setCaretColor(Color.WHITE);
		casilla_9_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_9_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_9_ent);

		casilla_10_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_10_ent.setBackground(new Color(30, 36, 53));
		casilla_10_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_10_ent.setForeground(new Color(254, 254, 254));
		casilla_10_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_10_ent.setColumns(10);
		casilla_10_ent.setBounds(232, 186, 70, 70);
		casilla_10_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_10_ent.setCaretColor(Color.WHITE);
		casilla_10_ent.setVisible(false);
		casilla_10_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_10_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_10_ent);

		casilla_11_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_11_ent.setBackground(new Color(30, 36, 53));
		casilla_11_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_11_ent.setForeground(new Color(254, 254, 254));
		casilla_11_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_11_ent.setColumns(10);
		casilla_11_ent.setBounds(210, 186, 70, 70);
		casilla_11_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_11_ent.setCaretColor(Color.WHITE);
		casilla_11_ent.setVisible(false);
		casilla_11_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_11_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_11_ent);

		casilla_12_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_12_ent.setBackground(new Color(30, 36, 53));
		casilla_12_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_12_ent.setForeground(new Color(254, 254, 254));
		casilla_12_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_12_ent.setColumns(10);
		casilla_12_ent.setBounds(210, 186, 70, 70);
		casilla_12_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_12_ent.setCaretColor(Color.WHITE);
		casilla_12_ent.setVisible(false);
		casilla_12_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_12_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_12_ent);

		casilla_13_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_13_ent.setBackground(new Color(30, 36, 53));
		casilla_13_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_13_ent.setForeground(new Color(254, 254, 254));
		casilla_13_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_13_ent.setColumns(10);
		casilla_13_ent.setBounds(210, 186, 70, 70);
		casilla_13_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_13_ent.setCaretColor(Color.WHITE);
		casilla_13_ent.setVisible(false);
		casilla_13_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_13_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_13_ent);

		casilla_14_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_14_ent.setBackground(new Color(30, 36, 53));
		casilla_14_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_14_ent.setForeground(new Color(254, 254, 254));
		casilla_14_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_14_ent.setColumns(10);
		casilla_14_ent.setBounds(210, 186, 70, 70);
		casilla_14_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_14_ent.setCaretColor(Color.WHITE);
		casilla_14_ent.setVisible(false);
		casilla_14_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_14_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_14_ent);

		casilla_15_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_15_ent.setBackground(new Color(30, 36, 53));
		casilla_15_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_15_ent.setForeground(new Color(254, 254, 254));
		casilla_15_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_15_ent.setColumns(10);
		casilla_15_ent.setBounds(210, 186, 70, 70);
		casilla_15_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_15_ent.setCaretColor(Color.WHITE);
		casilla_15_ent.setVisible(false);
		casilla_15_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_15_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_15_ent);
		
		casilla_16_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_16_ent.setBackground(new Color(30, 36, 53));
		casilla_16_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_16_ent.setForeground(new Color(254, 254, 254));
		casilla_16_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_16_ent.setColumns(10);
		casilla_16_ent.setBounds(210, 186, 70, 70);
		casilla_16_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_16_ent.setCaretColor(Color.WHITE);
		casilla_16_ent.setVisible(false);
		casilla_16_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_16_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_16_ent);
	
		casilla_17_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_17_ent.setBackground(new Color(30, 36, 53));
		casilla_17_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_17_ent.setForeground(new Color(254, 254, 254));
		casilla_17_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_17_ent.setColumns(10);
		casilla_17_ent.setBounds(210, 186, 70, 70);
		casilla_17_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_17_ent.setCaretColor(Color.WHITE);
		casilla_17_ent.setVisible(false);
		casilla_17_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_17_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_17_ent);

		casilla_18_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_18_ent.setBackground(new Color(30, 36, 53));
		casilla_18_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_18_ent.setForeground(new Color(254, 254, 254));
		casilla_18_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_18_ent.setColumns(10);
		casilla_18_ent.setBounds(210, 186, 70, 70);
		casilla_18_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_18_ent.setCaretColor(Color.WHITE);
		casilla_18_ent.setVisible(false);
		casilla_18_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_18_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_18_ent);

		casilla_19_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_19_ent.setBackground(new Color(30, 36, 53));
		casilla_19_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_19_ent.setForeground(new Color(254, 254, 254));
		casilla_19_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_19_ent.setColumns(10);
		casilla_19_ent.setBounds(210, 186, 70, 70);
		casilla_19_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_19_ent.setCaretColor(Color.WHITE);
		casilla_19_ent.setVisible(false);
		casilla_19_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_19_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_19_ent);

		casilla_20_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_20_ent.setBackground(new Color(30, 36, 53));
		casilla_20_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_20_ent.setForeground(new Color(254, 254, 254));
		casilla_20_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_20_ent.setColumns(10);
		casilla_20_ent.setBounds(210, 186, 70, 70);
		casilla_20_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_20_ent.setCaretColor(Color.WHITE);
		casilla_20_ent.setVisible(false);
		casilla_20_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_20_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_20_ent);

		casilla_21_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_21_ent.setBackground(new Color(30, 36, 53));
		casilla_21_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_21_ent.setForeground(new Color(254, 254, 254));
		casilla_21_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_21_ent.setColumns(10);
		casilla_21_ent.setBounds(210, 186, 70, 70);
		casilla_21_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_21_ent.setCaretColor(Color.WHITE);
		casilla_21_ent.setVisible(false);
		casilla_21_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_21_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_21_ent);

		casilla_22_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_22_ent.setBackground(new Color(30, 36, 53));
		casilla_22_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_22_ent.setForeground(new Color(254, 254, 254));
		casilla_22_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_22_ent.setColumns(10);
		casilla_22_ent.setBounds(210, 186, 70, 70);
		casilla_22_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_22_ent.setCaretColor(Color.WHITE);
		casilla_22_ent.setVisible(false);
		casilla_22_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_22_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_22_ent);

		casilla_23_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_23_ent.setBackground(new Color(30, 36, 53));
		casilla_23_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_23_ent.setForeground(new Color(254, 254, 254));
		casilla_23_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_23_ent.setColumns(10);
		casilla_23_ent.setBounds(210, 186, 70, 70);
		casilla_23_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_23_ent.setCaretColor(Color.WHITE);
		casilla_23_ent.setVisible(false);
		casilla_23_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_23_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_23_ent);

		casilla_24_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_24_ent.setBackground(new Color(30, 36, 53));
		casilla_24_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_24_ent.setForeground(new Color(254, 254, 254));
		casilla_24_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_24_ent.setColumns(10);
		casilla_24_ent.setBounds(210, 186, 70, 70);
		casilla_24_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_24_ent.setCaretColor(Color.WHITE);
		casilla_24_ent.setVisible(false);
		casilla_24_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_24_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_24_ent);

		casilla_25_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_25_ent.setBackground(new Color(30, 36, 53));
		casilla_25_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_25_ent.setForeground(new Color(254, 254, 254));
		casilla_25_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_25_ent.setColumns(10);
		casilla_25_ent.setBounds(210, 186, 70, 70);
		casilla_25_ent.setBorder(BorderFactory.createEmptyBorder());
		casilla_25_ent.setCaretColor(Color.WHITE);
		casilla_25_ent.setVisible(false);
		casilla_25_ent.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_25_ent.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_25_ent);
		
		
		JLabel corchete_der = new JLabel("");
		corchete_der.setVerticalAlignment(SwingConstants.TOP);
		corchete_der.setHorizontalAlignment(SwingConstants.RIGHT);
		corchete_der.setBounds(341, 0, 29, 264);
		entrada.add(corchete_der);
		
		JPanel salida = new JPanel();
		salida.setBorder(null);
		salida.setBackground(new Color(128, 128, 192));
		salida.setBounds(603, 35, 198, 198);
		salida.setOpaque(false);
		matrices.add(salida);
		salida.setLayout(null);
		
		casilla_1_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_1_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_1_sal.setForeground(new Color(30, 36, 53));
		casilla_1_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_1_sal.setColumns(10);
		casilla_1_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_1_sal.setBounds(10, 11, 52, 52);
		casilla_1_sal.setEditable(false); 
		casilla_1_sal.setFocusable(false);
		salida.add(casilla_1_sal);
		
		casilla_2_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_2_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_2_sal.setForeground(new Color(30, 36, 53));
		casilla_2_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_2_sal.setColumns(10);
		casilla_2_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_2_sal.setBounds(74, 11, 52, 52);
		casilla_2_sal.setEditable(false); 
		casilla_2_sal.setFocusable(false);
		salida.add(casilla_2_sal);
		
		casilla_3_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_3_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_3_sal.setForeground(new Color(30, 36, 53));
		casilla_3_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_3_sal.setColumns(10);
		casilla_3_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_3_sal.setBounds(138, 11, 52, 52);
		casilla_3_sal.setEditable(false); 
		casilla_3_sal.setFocusable(false);
		salida.add(casilla_3_sal);
		
		casilla_4_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_4_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_4_sal.setForeground(new Color(30, 36, 53));
		casilla_4_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_4_sal.setColumns(10);
		casilla_4_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_4_sal.setBounds(10, 75, 52, 52);
		casilla_4_sal.setEditable(false); 
		casilla_4_sal.setFocusable(false);
		salida.add(casilla_4_sal);
		
		casilla_5_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_5_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_5_sal.setForeground(new Color(30, 36, 53));
		casilla_5_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_5_sal.setColumns(10);
		casilla_5_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_5_sal.setBounds(74, 75, 52, 52);
		casilla_5_sal.setEditable(false); 
		casilla_5_sal.setFocusable(false);
		salida.add(casilla_5_sal);
		
		casilla_6_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_6_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_6_sal.setForeground(new Color(30, 36, 53));
		casilla_6_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_6_sal.setColumns(10);
		casilla_6_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_6_sal.setBounds(138, 75, 52, 52);
		casilla_6_sal.setEditable(false); 
		casilla_6_sal.setFocusable(false);
		salida.add(casilla_6_sal);
		
		casilla_7_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_7_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_7_sal.setForeground(new Color(30, 36, 53));
		casilla_7_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_7_sal.setColumns(10);
		casilla_7_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_7_sal.setBounds(10, 138, 52, 52);
		casilla_7_sal.setEditable(false); 
		casilla_7_sal.setFocusable(false);
		salida.add(casilla_7_sal);
		
		casilla_8_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_8_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_8_sal.setForeground(new Color(30, 36, 53));
		casilla_8_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_8_sal.setColumns(10);
		casilla_8_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_8_sal.setBounds(74, 138, 52, 52);
		casilla_8_sal.setEditable(false); 
		casilla_8_sal.setFocusable(false);
		salida.add(casilla_8_sal);
		
		casilla_9_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_9_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_9_sal.setForeground(new Color(30, 36, 53));
		casilla_9_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_9_sal.setColumns(10);
		casilla_9_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_9_sal.setBounds(138, 138, 52, 52);
		casilla_9_sal.setEditable(false); 
		casilla_9_sal.setFocusable(false);
		salida.add(casilla_9_sal);

		casilla_10_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_10_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_10_sal.setForeground(new Color(100, 36, 53));
		casilla_10_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_10_sal.setColumns(10);
		casilla_10_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_10_sal.setBounds(256, 11, 70, 70);
		casilla_10_sal.setEditable(false); 
		casilla_10_sal.setFocusable(false);
		casilla_10_sal.setVisible(false);
		salida.add(casilla_10_sal);

		casilla_11_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_11_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_11_sal.setForeground(new Color(30, 36, 53));
		casilla_11_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_11_sal.setColumns(10);
		casilla_11_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_11_sal.setBounds(266, 11, 70, 70);
		casilla_11_sal.setEditable(false); 
		casilla_11_sal.setFocusable(false);
		casilla_11_sal.setVisible(false);
		salida.add(casilla_11_sal);

		casilla_12_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_12_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_12_sal.setForeground(new Color(30, 36, 53));
		casilla_12_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_12_sal.setColumns(10);
		casilla_12_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_12_sal.setBounds(266, 11, 70, 70);
		casilla_12_sal.setEditable(false); 
		casilla_12_sal.setFocusable(false);
		casilla_12_sal.setVisible(false);
		salida.add(casilla_12_sal);

		casilla_13_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_13_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_13_sal.setForeground(new Color(30, 36, 53));
		casilla_13_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_13_sal.setColumns(10);
		casilla_13_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_13_sal.setBounds(266, 11, 70, 70);
		casilla_13_sal.setEditable(false); 
		casilla_13_sal.setFocusable(false);
		casilla_13_sal.setVisible(false);
		salida.add(casilla_13_sal);

		casilla_14_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_14_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_14_sal.setForeground(new Color(30, 36, 53));
		casilla_14_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_14_sal.setColumns(10);
		casilla_14_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_14_sal.setBounds(266, 11, 70, 70);
		casilla_14_sal.setEditable(false); 
		casilla_14_sal.setFocusable(false);
		casilla_14_sal.setVisible(false);
		salida.add(casilla_14_sal);

		casilla_15_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_15_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_15_sal.setForeground(new Color(30, 36, 53));
		casilla_15_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_15_sal.setColumns(10);
		casilla_15_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_15_sal.setBounds(266, 11, 70, 70);
		casilla_15_sal.setEditable(false); 
		casilla_15_sal.setFocusable(false);
		casilla_15_sal.setVisible(false);
		salida.add(casilla_15_sal);

		casilla_16_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_16_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_16_sal.setForeground(new Color(30, 36, 53));
		casilla_16_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_16_sal.setColumns(10);
		casilla_16_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_16_sal.setBounds(266, 11, 70, 70);
		casilla_16_sal.setEditable(false); 
		casilla_16_sal.setFocusable(false);
		casilla_16_sal.setVisible(false);
		salida.add(casilla_16_sal);

		casilla_17_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_17_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_17_sal.setForeground(new Color(30, 36, 53));
		casilla_17_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_17_sal.setColumns(10);
		casilla_17_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_17_sal.setBounds(266, 11, 70, 70);
		casilla_17_sal.setEditable(false); 
		casilla_17_sal.setFocusable(false);
		casilla_17_sal.setVisible(false);
		salida.add(casilla_17_sal);

		casilla_18_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_18_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_18_sal.setForeground(new Color(30, 36, 53));
		casilla_18_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_18_sal.setColumns(10);
		casilla_18_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_18_sal.setBounds(266, 11, 70, 70);
		casilla_18_sal.setEditable(false); 
		casilla_18_sal.setFocusable(false);
		casilla_18_sal.setVisible(false);
		salida.add(casilla_18_sal);

		casilla_19_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_19_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_19_sal.setForeground(new Color(30, 36, 53));
		casilla_19_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_19_sal.setColumns(10);
		casilla_19_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_19_sal.setBounds(266, 11, 70, 70);
		casilla_19_sal.setEditable(false); 
		casilla_19_sal.setFocusable(false);
		casilla_19_sal.setVisible(false);
		salida.add(casilla_19_sal);

		casilla_20_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_20_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_20_sal.setForeground(new Color(30, 36, 53));
		casilla_20_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_20_sal.setColumns(10);
		casilla_20_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_20_sal.setBounds(266, 11, 70, 70);
		casilla_20_sal.setEditable(false); 
		casilla_20_sal.setFocusable(false);
		casilla_20_sal.setVisible(false);
		salida.add(casilla_20_sal);

		casilla_21_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_21_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_21_sal.setForeground(new Color(30, 36, 53));
		casilla_21_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_21_sal.setColumns(10);
		casilla_21_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_21_sal.setBounds(266, 11, 70, 70);
		casilla_21_sal.setEditable(false); 
		casilla_21_sal.setFocusable(false);
		casilla_21_sal.setVisible(false);
		salida.add(casilla_21_sal);

		casilla_22_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_22_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_22_sal.setForeground(new Color(30, 36, 53));
		casilla_22_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_22_sal.setColumns(10);
		casilla_22_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_22_sal.setBounds(266, 11, 70, 70);
		casilla_22_sal.setEditable(false); 
		casilla_22_sal.setFocusable(false);
		casilla_22_sal.setVisible(false);
		salida.add(casilla_22_sal);

		casilla_23_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_23_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_23_sal.setForeground(new Color(30, 36, 53));
		casilla_23_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_23_sal.setColumns(10);
		casilla_23_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_23_sal.setBounds(266, 11, 70, 70);
		casilla_23_sal.setEditable(false); 
		casilla_23_sal.setFocusable(false);
		casilla_23_sal.setVisible(false);
		salida.add(casilla_23_sal);


		casilla_24_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_24_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_24_sal.setForeground(new Color(30, 36, 53));
		casilla_24_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_24_sal.setColumns(10);
		casilla_24_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_24_sal.setBounds(266, 11, 70, 70);
		casilla_24_sal.setEditable(false); 
		casilla_24_sal.setFocusable(false);
		casilla_24_sal.setVisible(false);
		salida.add(casilla_24_sal);

		casilla_25_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_25_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_25_sal.setForeground(new Color(30, 36, 53));
		casilla_25_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_25_sal.setColumns(10);
		casilla_25_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_25_sal.setBounds(266, 11, 70, 70);
		casilla_25_sal.setEditable(false); 
		casilla_25_sal.setFocusable(false);
		casilla_25_sal.setVisible(false);
		salida.add(casilla_25_sal);		
		
		JPanel entrada_1 = new JPanel();
		entrada_1.setLayout(null);
		entrada_1.setOpaque(false);
		entrada_1.setBackground(new Color(128, 128, 192));
		entrada_1.setBounds(337, 35, 198, 198);
		matrices.add(entrada_1);
		
		RoundedTextfield casilla_1_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_1_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_1_ent_1.setForeground(Color.WHITE);
		casilla_1_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_1_ent_1.setColumns(10);
		casilla_1_ent_1.setCaretColor(Color.WHITE);
		casilla_1_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_1_ent_1.setBackground(Color.WHITE);
		casilla_1_ent_1.setBounds(10, 11, 52, 52);
		
		casilla_1_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_1_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada_1.add(casilla_1_ent_1);
		
		RoundedTextfield casilla_2_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_2_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_2_ent_1.setForeground(new Color(30, 36, 53));
		casilla_2_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_2_ent_1.setColumns(10);
		casilla_2_ent_1.setCaretColor(Color.WHITE);
		casilla_2_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_2_ent_1.setBackground(new Color(30, 36, 53));
		casilla_2_ent_1.setBounds(74, 11, 52, 52);
		entrada_1.add(casilla_2_ent_1);
		
		RoundedTextfield casilla_3_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_3_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_3_ent_1.setForeground(new Color(30, 36, 53));
		casilla_3_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_3_ent_1.setColumns(10);
		casilla_3_ent_1.setCaretColor(Color.WHITE);
		casilla_3_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_3_ent_1.setBackground(new Color(30, 36, 53));
		casilla_3_ent_1.setBounds(138, 11, 52, 52);
		entrada_1.add(casilla_3_ent_1);
		
		RoundedTextfield casilla_4_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_4_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_4_ent_1.setForeground(new Color(30, 36, 53));
		casilla_4_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_4_ent_1.setColumns(10);
		casilla_4_ent_1.setCaretColor(Color.WHITE);
		casilla_4_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_4_ent_1.setBackground(new Color(30, 36, 53));
		casilla_4_ent_1.setBounds(10, 75, 52, 52);
		entrada_1.add(casilla_4_ent_1);
		
		RoundedTextfield casilla_5_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_5_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_5_ent_1.setForeground(new Color(30, 36, 53));
		casilla_5_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_5_ent_1.setColumns(10);
		casilla_5_ent_1.setCaretColor(Color.WHITE);
		casilla_5_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_5_ent_1.setBackground(new Color(30, 36, 53));
		casilla_5_ent_1.setBounds(74, 75, 52, 52);
		entrada_1.add(casilla_5_ent_1);
		
		RoundedTextfield casilla_6_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_6_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_6_ent_1.setForeground(new Color(30, 36, 53));
		casilla_6_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_6_ent_1.setColumns(10);
		casilla_6_ent_1.setCaretColor(Color.WHITE);
		casilla_6_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_6_ent_1.setBackground(new Color(30, 36, 53));
		casilla_6_ent_1.setBounds(138, 75, 52, 52);
		entrada_1.add(casilla_6_ent_1);
		
		RoundedTextfield casilla_7_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_7_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_7_ent_1.setForeground(new Color(30, 36, 53));
		casilla_7_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_7_ent_1.setColumns(10);
		casilla_7_ent_1.setCaretColor(Color.WHITE);
		casilla_7_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_7_ent_1.setBackground(new Color(30, 36, 53));
		casilla_7_ent_1.setBounds(10, 138, 52, 52);
		entrada_1.add(casilla_7_ent_1);
		
		RoundedTextfield casilla_8_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_8_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_8_ent_1.setForeground(new Color(30, 36, 53));
		casilla_8_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_8_ent_1.setColumns(10);
		casilla_8_ent_1.setCaretColor(Color.WHITE);
		casilla_8_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_8_ent_1.setBackground(new Color(30, 36, 53));
		casilla_8_ent_1.setBounds(74, 138, 52, 52);
		entrada_1.add(casilla_8_ent_1);
		
		RoundedTextfield casilla_9_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_9_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_9_ent_1.setForeground(new Color(30, 36, 53));
		casilla_9_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_9_ent_1.setColumns(10);
		casilla_9_ent_1.setCaretColor(Color.WHITE);
		casilla_9_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_9_ent_1.setBackground(new Color(30, 36, 53));
		casilla_9_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_9_ent_1);
		
		RoundedTextfield casilla_10_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_10_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_10_ent_1.setForeground(new Color(30, 36, 53));
		casilla_10_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_10_ent_1.setColumns(10);
		casilla_10_ent_1.setCaretColor(Color.WHITE);
		casilla_10_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_10_ent_1.setBackground(new Color(30, 36, 53));
		casilla_10_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_10_ent_1);

		RoundedTextfield casilla_11_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_11_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_11_ent_1.setForeground(new Color(30, 36, 53));
		casilla_11_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_11_ent_1.setColumns(10);
		casilla_11_ent_1.setCaretColor(Color.WHITE);
		casilla_11_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_11_ent_1.setBackground(new Color(30, 36, 53));
		casilla_11_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_11_ent_1);

		RoundedTextfield casilla_12_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_12_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_12_ent_1.setForeground(new Color(30, 36, 53));
		casilla_12_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_12_ent_1.setColumns(10);
		casilla_12_ent_1.setCaretColor(Color.WHITE);
		casilla_12_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_12_ent_1.setBackground(new Color(30, 36, 53));
		casilla_12_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_12_ent_1);

		RoundedTextfield casilla_13_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_13_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_13_ent_1.setForeground(new Color(30, 36, 53));
		casilla_13_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_13_ent_1.setColumns(10);
		casilla_13_ent_1.setCaretColor(Color.WHITE);
		casilla_13_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_13_ent_1.setBackground(new Color(30, 36, 53));
		casilla_13_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_13_ent_1);

		RoundedTextfield casilla_14_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_14_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_14_ent_1.setForeground(new Color(30, 36, 53));
		casilla_14_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_14_ent_1.setColumns(10);
		casilla_14_ent_1.setCaretColor(Color.WHITE);
		casilla_14_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_14_ent_1.setBackground(new Color(30, 36, 53));
		casilla_14_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_14_ent_1);

		RoundedTextfield casilla_15_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_15_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_15_ent_1.setForeground(new Color(30, 36, 53));
		casilla_15_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_15_ent_1.setColumns(10);
		casilla_15_ent_1.setCaretColor(Color.WHITE);
		casilla_15_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_15_ent_1.setBackground(new Color(30, 36, 53));
		casilla_15_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_15_ent_1);

		RoundedTextfield casilla_16_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_16_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_16_ent_1.setForeground(new Color(30, 36, 53));
		casilla_16_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_16_ent_1.setColumns(10);
		casilla_16_ent_1.setCaretColor(Color.WHITE);
		casilla_16_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_16_ent_1.setBackground(new Color(30, 36, 53));
		casilla_16_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_16_ent_1);

		RoundedTextfield casilla_17_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_17_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_17_ent_1.setForeground(new Color(30, 36, 53));
		casilla_17_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_17_ent_1.setColumns(10);
		casilla_17_ent_1.setCaretColor(Color.WHITE);
		casilla_17_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_17_ent_1.setBackground(new Color(30, 36, 53));
		casilla_17_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_17_ent_1);

		RoundedTextfield casilla_18_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_18_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_18_ent_1.setForeground(new Color(30, 36, 53));
		casilla_18_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_18_ent_1.setColumns(10);
		casilla_18_ent_1.setCaretColor(Color.WHITE);
		casilla_18_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_18_ent_1.setBackground(new Color(30, 36, 53));
		casilla_18_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_18_ent_1);

		RoundedTextfield casilla_19_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_19_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_19_ent_1.setForeground(new Color(30, 36, 53));
		casilla_19_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_19_ent_1.setColumns(10);
		casilla_19_ent_1.setCaretColor(Color.WHITE);
		casilla_19_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_19_ent_1.setBackground(new Color(30, 36, 53));
		casilla_19_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_19_ent_1);

		RoundedTextfield casilla_20_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_20_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_20_ent_1.setForeground(new Color(30, 36, 53));
		casilla_20_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_20_ent_1.setColumns(10);
		casilla_20_ent_1.setCaretColor(Color.WHITE);
		casilla_20_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_20_ent_1.setBackground(new Color(30, 36, 53));
		casilla_20_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_20_ent_1);

		RoundedTextfield casilla_21_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_21_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_21_ent_1.setForeground(new Color(30, 36, 53));
		casilla_21_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_21_ent_1.setColumns(10);
		casilla_21_ent_1.setCaretColor(Color.WHITE);
		casilla_21_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_21_ent_1.setBackground(new Color(30, 36, 53));
		casilla_21_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_21_ent_1);

		RoundedTextfield casilla_22_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_22_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_22_ent_1.setForeground(new Color(30, 36, 53));
		casilla_22_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_22_ent_1.setColumns(10);
		casilla_22_ent_1.setCaretColor(Color.WHITE);
		casilla_22_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_22_ent_1.setBackground(new Color(30, 36, 53));
		casilla_22_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_22_ent_1);

		RoundedTextfield casilla_23_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_23_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_23_ent_1.setForeground(new Color(30, 36, 53));
		casilla_23_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_23_ent_1.setColumns(10);
		casilla_23_ent_1.setCaretColor(Color.WHITE);
		casilla_23_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_23_ent_1.setBackground(new Color(30, 36, 53));
		casilla_23_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_23_ent_1);

		RoundedTextfield casilla_24_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_24_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_24_ent_1.setForeground(new Color(30, 36, 53));
		casilla_24_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_24_ent_1.setColumns(10);
		casilla_24_ent_1.setCaretColor(Color.WHITE);
		casilla_24_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_24_ent_1.setBackground(new Color(30, 36, 53));
		casilla_24_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_24_ent_1);

		RoundedTextfield casilla_25_ent_1 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_25_ent_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_25_ent_1.setForeground(new Color(30, 36, 53));
		casilla_25_ent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_25_ent_1.setColumns(10);
		casilla_25_ent_1.setCaretColor(Color.WHITE);
		casilla_25_ent_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_25_ent_1.setBackground(new Color(30, 36, 53));
		casilla_25_ent_1.setBounds(138, 138, 52, 52);
		entrada_1.add(casilla_25_ent_1);		
		
		casilla_2_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_2_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_3_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_3_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_4_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_4_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_5_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_5_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_6_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_6_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_7_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_7_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_8_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_8_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_9_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_9_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_10_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_10_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_11_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_11_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_12_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_12_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_13_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_13_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_14_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_14_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_15_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_15_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_16_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_16_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_17_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_17_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_18_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_18_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_19_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_19_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_20_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_20_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_21_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_21_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_22_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_22_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_23_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_23_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_24_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_24_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});

		casilla_25_ent_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_25_ent_1.getText();

		        if (text.length() >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		
		
		JLabel corchete_der_2 = new JLabel("");
		corchete_der_2.setVerticalAlignment(SwingConstants.TOP);
		corchete_der_2.setHorizontalAlignment(SwingConstants.RIGHT);
		corchete_der_2.setBounds(341, 0, 29, 264);
		entrada_1.add(corchete_der_2);
		
		JLabel corchete_izq_e1 = new JLabel();
		corchete_izq_e1.setBounds(0, 30, 29, 216);
		matrices.add(corchete_izq_e1);
		corchete_izq_e1.setVerticalAlignment(SwingConstants.TOP);
		corchete_izq_e1.setHorizontalAlignment(SwingConstants.LEFT);

		corchete_izq_e1.setVerticalAlignment(SwingConstants.TOP);
		corchete_izq_e1.setHorizontalAlignment(SwingConstants.LEFT);

			
		JLabel corchete_izq_e2 = new JLabel();
		corchete_izq_e2.setBounds(326, 30, 29, 264);
		matrices.add(corchete_izq_e2);
		corchete_izq_e2.setVerticalAlignment(SwingConstants.TOP);
		corchete_izq_e2.setHorizontalAlignment(SwingConstants.LEFT);

		corchete_izq_e2.setVerticalAlignment(SwingConstants.TOP);
		corchete_izq_e2.setHorizontalAlignment(SwingConstants.LEFT);
	
		
		JLabel id_matriz_a = new JLabel("Matriz A");
		id_matriz_a.setHorizontalAlignment(SwingConstants.CENTER);
		id_matriz_a.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		id_matriz_a.setForeground(new Color(255, 255, 255));
		id_matriz_a.setBounds(10, 11, 198, 14);
		matrices.add(id_matriz_a);
		
		JLabel id_matriz_a_1 = new JLabel("Matriz B");
		id_matriz_a_1.setHorizontalAlignment(SwingConstants.CENTER);
		id_matriz_a_1.setForeground(Color.WHITE);
		id_matriz_a_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		id_matriz_a_1.setBounds(327, 11, 219, 14);
		matrices.add(id_matriz_a_1);
		
		JLabel corchete_izq_s = new JLabel();
		corchete_izq_s.setBounds(594, 30, 29, 216);
		matrices.add(corchete_izq_s);
		corchete_izq_s.setVerticalAlignment(SwingConstants.TOP);
		corchete_izq_s.setHorizontalAlignment(SwingConstants.LEFT);

		corchete_izq_s.setVerticalAlignment(SwingConstants.TOP);
		corchete_izq_s.setHorizontalAlignment(SwingConstants.LEFT);


		JLabel corchete_der_s = new JLabel();
		corchete_der_s.setBounds(801, 30, 29, 216);
		matrices.add(corchete_der_s);
		corchete_der_s.setVerticalAlignment(SwingConstants.TOP);
		corchete_der_s.setHorizontalAlignment(SwingConstants.LEFT);

		corchete_der_s.setVerticalAlignment(SwingConstants.TOP);
		corchete_der_s.setHorizontalAlignment(SwingConstants.LEFT);

		
		RoundedPanel ans = new RoundedPanel(10, new Color(87, 116, 250));
		ans.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(spinnerValor == 4) {
					if(areAllFieldsFilledANS4x4()) {
						String valor1 = casilla_1_sal.getText();
			        	String valor2 = casilla_2_sal.getText();
			        	String valor3 = casilla_3_sal.getText();
			        	String valor4 = casilla_4_sal.getText();
			        	String valor5 = casilla_5_sal.getText();
			        	String valor6 = casilla_6_sal.getText();
			        	String valor7 = casilla_7_sal.getText();
			        	String valor8 = casilla_8_sal.getText();
			        	String valor9 = casilla_9_sal.getText();
			        	String valor10 = casilla_10_sal.getText();
			        	String valor11 = casilla_11_sal.getText();
			        	String valor12 = casilla_12_sal.getText();
			        	String valor13 = casilla_13_sal.getText();
			        	String valor14 = casilla_14_sal.getText();
			        	String valor15 = casilla_15_sal.getText();
			        	String valor16 = casilla_16_sal.getText();
					 
					 
			        	answer4x4[0][0] = Integer.parseInt(valor1);
			        	answer4x4[0][1] = Integer.parseInt(valor2);
			        	answer4x4[0][2] = Integer.parseInt(valor3);
			        	answer4x4[0][3] = Integer.parseInt(valor4);
			        	answer4x4[1][0] = Integer.parseInt(valor5);
			        	answer4x4[1][1] = Integer.parseInt(valor6);
			        	answer4x4[1][2] = Integer.parseInt(valor7);
			        	answer4x4[1][3] = Integer.parseInt(valor8);
			        	answer4x4[2][0] = Integer.parseInt(valor9);
			        	answer4x4[2][1] = Integer.parseInt(valor10);
			        	answer4x4[2][2] = Integer.parseInt(valor11);
			        	answer4x4[2][3] = Integer.parseInt(valor12);
			        	answer4x4[3][0] = Integer.parseInt(valor13);
			        	answer4x4[3][1] = Integer.parseInt(valor14);
			        	answer4x4[3][2] = Integer.parseInt(valor15);
			        	answer4x4[3][3] = Integer.parseInt(valor16);
			        	
			        	casilla_1_ent.setText(String.valueOf(answer4x4[0][0]));
			        	casilla_2_ent.setText(String.valueOf(answer4x4[0][1]));
			        	casilla_3_ent.setText(String.valueOf(answer4x4[0][2]));
			        	casilla_4_ent.setText(String.valueOf(answer4x4[0][3]));
			        	casilla_5_ent.setText(String.valueOf(answer4x4[1][0]));
			        	casilla_6_ent.setText(String.valueOf(answer4x4[1][1]));
			        	casilla_7_ent.setText(String.valueOf(answer4x4[1][2]));
			        	casilla_8_ent.setText(String.valueOf(answer4x4[1][3]));
			        	casilla_9_ent.setText(String.valueOf(answer4x4[2][0]));
			        	casilla_10_ent.setText(String.valueOf(answer4x4[2][1]));
			        	casilla_11_ent.setText(String.valueOf(answer4x4[2][2]));
			        	casilla_12_ent.setText(String.valueOf(answer4x4[2][3]));
			        	casilla_13_ent.setText(String.valueOf(answer4x4[3][0]));
			        	casilla_14_ent.setText(String.valueOf(answer4x4[3][1]));
			        	casilla_15_ent.setText(String.valueOf(answer4x4[3][2]));
			        	casilla_16_ent.setText(String.valueOf(answer4x4[3][3]));
			        	
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Por favor, haga alguna operación para usar el ANS.");
					}
				}
				
				else if(spinnerValor == 3) {
					 if(areAllFieldsFilledANS3x3()) {
							String valor1 = casilla_1_sal.getText();
				        	String valor2 = casilla_2_sal.getText();
				        	String valor3 = casilla_3_sal.getText();
				        	String valor4 = casilla_4_sal.getText();
				        	String valor5 = casilla_5_sal.getText();
				        	String valor6 = casilla_6_sal.getText();
				        	String valor7 = casilla_7_sal.getText();
				        	String valor8 = casilla_8_sal.getText();
				        	String valor9 = casilla_9_sal.getText();
						 
						 
				        	answer3x3[0][0] = Integer.parseInt(valor1);
				        	answer3x3[0][1] = Integer.parseInt(valor2);
				        	answer3x3[0][2] = Integer.parseInt(valor3);
				        	answer3x3[1][0] = Integer.parseInt(valor4);
				        	answer3x3[1][1] = Integer.parseInt(valor5);
				        	answer3x3[1][2] = Integer.parseInt(valor6);
				        	answer3x3[2][0] = Integer.parseInt(valor7);
				        	answer3x3[2][1] = Integer.parseInt(valor8);
				        	answer3x3[2][2] = Integer.parseInt(valor9);
				        	
				        	casilla_1_ent.setText(String.valueOf(answer3x3[0][0]));
				        	casilla_2_ent.setText(String.valueOf(answer3x3[0][1]));
				        	casilla_3_ent.setText(String.valueOf(answer3x3[0][2]));
				        	casilla_4_ent.setText(String.valueOf(answer3x3[1][0]));
				        	casilla_5_ent.setText(String.valueOf(answer3x3[1][1]));
				        	casilla_6_ent.setText(String.valueOf(answer3x3[1][2]));
				        	casilla_7_ent.setText(String.valueOf(answer3x3[2][0]));
				        	casilla_8_ent.setText(String.valueOf(answer3x3[2][1]));
				        	casilla_9_ent.setText(String.valueOf(answer3x3[2][2]));
					 }
					 
					 else {
						 JOptionPane.showMessageDialog(null, "Por favor, haga alguna operación para usar el ANS.");
					 }					
				}
				
				else {
					if(areAllFieldsFilledANS5x5()) {
						String valor1 = casilla_1_sal.getText();
			        	String valor2 = casilla_2_sal.getText();
			        	String valor3 = casilla_3_sal.getText();
			        	String valor4 = casilla_4_sal.getText();
			        	String valor5 = casilla_5_sal.getText();
			        	String valor6 = casilla_6_sal.getText();
			        	String valor7 = casilla_7_sal.getText();
			        	String valor8 = casilla_8_sal.getText();
			        	String valor9 = casilla_9_sal.getText();
			        	String valor10 = casilla_10_sal.getText();
			        	String valor11 = casilla_11_sal.getText();
			        	String valor12 = casilla_12_sal.getText();
			        	String valor13 = casilla_13_sal.getText();
			        	String valor14 = casilla_14_sal.getText();
			        	String valor15 = casilla_15_sal.getText();
			        	String valor16 = casilla_16_sal.getText();
			        	String valor17 = casilla_17_sal.getText();
			        	String valor18 = casilla_18_sal.getText();
			        	String valor19 = casilla_19_sal.getText();
			        	String valor20 = casilla_20_sal.getText();
			        	String valor21 = casilla_21_sal.getText();
			        	String valor22 = casilla_22_sal.getText();
			        	String valor23 = casilla_23_sal.getText();
			        	String valor24 = casilla_24_sal.getText();
			        	String valor25 = casilla_25_sal.getText();
					 
					 
			        	answer5x5[0][0] = Integer.parseInt(valor1);
			        	answer5x5[0][1] = Integer.parseInt(valor2);
			        	answer5x5[0][2] = Integer.parseInt(valor3);
			        	answer5x5[0][3] = Integer.parseInt(valor4);
			        	answer5x5[0][4] = Integer.parseInt(valor5);
			        	answer5x5[1][0] = Integer.parseInt(valor6);
			        	answer5x5[1][1] = Integer.parseInt(valor7);
			        	answer5x5[1][2] = Integer.parseInt(valor8);
			        	answer5x5[1][3] = Integer.parseInt(valor9);
			        	answer5x5[1][4] = Integer.parseInt(valor10);
			        	answer5x5[2][0] = Integer.parseInt(valor11);
			        	answer5x5[2][1] = Integer.parseInt(valor12);
			        	answer5x5[2][2] = Integer.parseInt(valor13);
			        	answer5x5[2][3] = Integer.parseInt(valor14);
			        	answer5x5[2][4] = Integer.parseInt(valor15);
			        	answer5x5[3][0] = Integer.parseInt(valor16);
			        	answer5x5[3][1] = Integer.parseInt(valor17);
			        	answer5x5[3][2] = Integer.parseInt(valor18);
			        	answer5x5[3][3] = Integer.parseInt(valor19);
			        	answer5x5[3][4] = Integer.parseInt(valor20);
			        	answer5x5[4][0] = Integer.parseInt(valor21);
			        	answer5x5[4][1] = Integer.parseInt(valor22);
			        	answer5x5[4][2] = Integer.parseInt(valor23);
			        	answer5x5[4][3] = Integer.parseInt(valor24);
			        	answer5x5[4][4] = Integer.parseInt(valor25);

			        	
			        	casilla_1_ent.setText(String.valueOf(answer5x5[0][0]));
			        	casilla_2_ent.setText(String.valueOf(answer5x5[0][1]));
			        	casilla_3_ent.setText(String.valueOf(answer5x5[0][2]));
			        	casilla_4_ent.setText(String.valueOf(answer5x5[0][3]));
			        	casilla_5_ent.setText(String.valueOf(answer5x5[0][4]));
			        	casilla_6_ent.setText(String.valueOf(answer5x5[1][0]));
			        	casilla_7_ent.setText(String.valueOf(answer5x5[1][1]));
			        	casilla_8_ent.setText(String.valueOf(answer5x5[1][2]));
			        	casilla_9_ent.setText(String.valueOf(answer5x5[1][3]));
			        	casilla_10_ent.setText(String.valueOf(answer5x5[1][4]));
			        	casilla_11_ent.setText(String.valueOf(answer5x5[2][0]));
			        	casilla_12_ent.setText(String.valueOf(answer5x5[2][1]));
			        	casilla_13_ent.setText(String.valueOf(answer5x5[2][2]));
			        	casilla_14_ent.setText(String.valueOf(answer5x5[2][3]));
			        	casilla_15_ent.setText(String.valueOf(answer5x5[2][4]));
			        	casilla_16_ent.setText(String.valueOf(answer5x5[3][0]));
			        	casilla_17_ent.setText(String.valueOf(answer5x5[3][1]));
			        	casilla_18_ent.setText(String.valueOf(answer5x5[3][2]));
			        	casilla_19_ent.setText(String.valueOf(answer5x5[3][3]));
			        	casilla_20_ent.setText(String.valueOf(answer5x5[3][4]));
			        	casilla_21_ent.setText(String.valueOf(answer5x5[4][0]));
			        	casilla_22_ent.setText(String.valueOf(answer5x5[4][1]));
			        	casilla_23_ent.setText(String.valueOf(answer5x5[4][2]));
			        	casilla_24_ent.setText(String.valueOf(answer5x5[4][3]));
			        	casilla_25_ent.setText(String.valueOf(answer5x5[4][4]));
					}
					
					else {
						 JOptionPane.showMessageDialog(null, "Por favor, haga alguna operación para usar el ANS.");	
					}
		        	
				}
			}
			
		    private boolean areAllFieldsFilledANS3x3() {
		        return !casilla_1_sal.getText().isEmpty() && 
		               !casilla_2_sal.getText().isEmpty() && 
		               !casilla_3_sal.getText().isEmpty() && 
		               !casilla_4_sal.getText().isEmpty() && 
		               !casilla_5_sal.getText().isEmpty() && 
		               !casilla_6_sal.getText().isEmpty() && 
		               !casilla_7_sal.getText().isEmpty() && 
		               !casilla_8_sal.getText().isEmpty() && 
		               !casilla_9_sal.getText().isEmpty();
		               	
		    }
		    
		    private boolean areAllFieldsFilledANS4x4() {
		        return !casilla_1_sal.getText().isEmpty() && 
		               !casilla_2_sal.getText().isEmpty() && 
		               !casilla_3_sal.getText().isEmpty() && 
		               !casilla_4_sal.getText().isEmpty() && 
		               !casilla_5_sal.getText().isEmpty() && 
		               !casilla_6_sal.getText().isEmpty() && 
		               !casilla_7_sal.getText().isEmpty() && 
		               !casilla_8_sal.getText().isEmpty() && 
		               !casilla_9_sal.getText().isEmpty() &&
		               !casilla_10_sal.getText().isEmpty() &&
		               !casilla_11_sal.getText().isEmpty() &&
		               !casilla_12_sal.getText().isEmpty() &&
		               !casilla_13_sal.getText().isEmpty() &&
		               !casilla_14_sal.getText().isEmpty() &&
		               !casilla_15_sal.getText().isEmpty() &&
		               !casilla_16_sal.getText().isEmpty();
		    }
		    
		    private boolean areAllFieldsFilledANS5x5() {
		        return !casilla_1_sal.getText().isEmpty() && 
		               !casilla_2_sal.getText().isEmpty() && 
		               !casilla_3_sal.getText().isEmpty() && 
		               !casilla_4_sal.getText().isEmpty() && 
		               !casilla_5_sal.getText().isEmpty() && 
		               !casilla_6_sal.getText().isEmpty() && 
		               !casilla_7_sal.getText().isEmpty() && 
		               !casilla_8_sal.getText().isEmpty() && 
		               !casilla_9_sal.getText().isEmpty() &&
		               !casilla_10_sal.getText().isEmpty() &&
		               !casilla_11_sal.getText().isEmpty() &&
		               !casilla_12_sal.getText().isEmpty() &&
		               !casilla_13_sal.getText().isEmpty() &&
		               !casilla_14_sal.getText().isEmpty() &&
		               !casilla_15_sal.getText().isEmpty() &&
		               !casilla_16_sal.getText().isEmpty() &&
		               !casilla_17_sal.getText().isEmpty() &&
		               !casilla_18_sal.getText().isEmpty() &&
		               !casilla_19_sal.getText().isEmpty() &&
		               !casilla_20_sal.getText().isEmpty() &&
		               !casilla_21_sal.getText().isEmpty() &&
		               !casilla_22_sal.getText().isEmpty() &&
		               !casilla_23_sal.getText().isEmpty() &&
		               !casilla_24_sal.getText().isEmpty() &&
		               !casilla_25_sal.getText().isEmpty();
		    }
		    
		});
		ans.setOpaque(false);
		ans.setBounds(248, 90, 52, 29);
		ans.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		matrices.add(ans);
		ans.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel ans_a = new JLabel("ANS: A");
		ans_a.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		ans_a.setForeground(new Color(255, 255, 255));
		ans_a.setHorizontalAlignment(SwingConstants.CENTER);
		ans.add(ans_a);
		
		RoundedPanel ans_1 = new RoundedPanel(10, new Color(87, 116, 250));
		ans_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(spinnerValor == 4) {
					if(areAllFieldsFilledANS4x4()) {
						String valor1 = casilla_1_sal.getText();
			        	String valor2 = casilla_2_sal.getText();
			        	String valor3 = casilla_3_sal.getText();
			        	String valor4 = casilla_4_sal.getText();
			        	String valor5 = casilla_5_sal.getText();
			        	String valor6 = casilla_6_sal.getText();
			        	String valor7 = casilla_7_sal.getText();
			        	String valor8 = casilla_8_sal.getText();
			        	String valor9 = casilla_9_sal.getText();
			        	String valor10 = casilla_10_sal.getText();
			        	String valor11 = casilla_11_sal.getText();
			        	String valor12 = casilla_12_sal.getText();
			        	String valor13 = casilla_13_sal.getText();
			        	String valor14 = casilla_14_sal.getText();
			        	String valor15 = casilla_15_sal.getText();
			        	String valor16 = casilla_16_sal.getText();
					 
					 
			        	answer4x4[0][0] = Integer.parseInt(valor1);
			        	answer4x4[0][1] = Integer.parseInt(valor2);
			        	answer4x4[0][2] = Integer.parseInt(valor3);
			        	answer4x4[0][3] = Integer.parseInt(valor4);
			        	answer4x4[1][0] = Integer.parseInt(valor5);
			        	answer4x4[1][1] = Integer.parseInt(valor6);
			        	answer4x4[1][2] = Integer.parseInt(valor7);
			        	answer4x4[1][3] = Integer.parseInt(valor8);
			        	answer4x4[2][0] = Integer.parseInt(valor9);
			        	answer4x4[2][1] = Integer.parseInt(valor10);
			        	answer4x4[2][2] = Integer.parseInt(valor11);
			        	answer4x4[2][3] = Integer.parseInt(valor12);
			        	answer4x4[3][0] = Integer.parseInt(valor13);
			        	answer4x4[3][1] = Integer.parseInt(valor14);
			        	answer4x4[3][2] = Integer.parseInt(valor15);
			        	answer4x4[3][3] = Integer.parseInt(valor16);
			        	
			        	casilla_1_ent_1.setText(String.valueOf(answer4x4[0][0]));
			        	casilla_2_ent_1.setText(String.valueOf(answer4x4[0][1]));
			        	casilla_3_ent_1.setText(String.valueOf(answer4x4[0][2]));
			        	casilla_4_ent_1.setText(String.valueOf(answer4x4[0][3]));
			        	casilla_5_ent_1.setText(String.valueOf(answer4x4[1][0]));
			        	casilla_6_ent_1.setText(String.valueOf(answer4x4[1][1]));
			        	casilla_7_ent_1.setText(String.valueOf(answer4x4[1][2]));
			        	casilla_8_ent_1.setText(String.valueOf(answer4x4[1][3]));
			        	casilla_9_ent_1.setText(String.valueOf(answer4x4[2][0]));
			        	casilla_10_ent_1.setText(String.valueOf(answer4x4[2][1]));
			        	casilla_11_ent_1.setText(String.valueOf(answer4x4[2][2]));
			        	casilla_12_ent_1.setText(String.valueOf(answer4x4[2][3]));
			        	casilla_13_ent_1.setText(String.valueOf(answer4x4[3][0]));
			        	casilla_14_ent_1.setText(String.valueOf(answer4x4[3][1]));
			        	casilla_15_ent_1.setText(String.valueOf(answer4x4[3][2]));
			        	casilla_16_ent_1.setText(String.valueOf(answer4x4[3][3]));
			        	
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Por favor, haga alguna operación para usar el ANS.");
					}
				}
				
				else if(spinnerValor == 3) {
					 if(areAllFieldsFilledANS3x3()) {
							String valor1 = casilla_1_sal.getText();
				        	String valor2 = casilla_2_sal.getText();
				        	String valor3 = casilla_3_sal.getText();
				        	String valor4 = casilla_4_sal.getText();
				        	String valor5 = casilla_5_sal.getText();
				        	String valor6 = casilla_6_sal.getText();
				        	String valor7 = casilla_7_sal.getText();
				        	String valor8 = casilla_8_sal.getText();
				        	String valor9 = casilla_9_sal.getText();
						 
						 
				        	answer3x3[0][0] = Integer.parseInt(valor1);
				        	answer3x3[0][1] = Integer.parseInt(valor2);
				        	answer3x3[0][2] = Integer.parseInt(valor3);
				        	answer3x3[1][0] = Integer.parseInt(valor4);
				        	answer3x3[1][1] = Integer.parseInt(valor5);
				        	answer3x3[1][2] = Integer.parseInt(valor6);
				        	answer3x3[2][0] = Integer.parseInt(valor7);
				        	answer3x3[2][1] = Integer.parseInt(valor8);
				        	answer3x3[2][2] = Integer.parseInt(valor9);
				        	
				        	casilla_1_ent_1.setText(String.valueOf(answer3x3[0][0]));
				        	casilla_2_ent_1.setText(String.valueOf(answer3x3[0][1]));
				        	casilla_3_ent_1.setText(String.valueOf(answer3x3[0][2]));
				        	casilla_4_ent_1.setText(String.valueOf(answer3x3[1][0]));
				        	casilla_5_ent_1.setText(String.valueOf(answer3x3[1][1]));
				        	casilla_6_ent_1.setText(String.valueOf(answer3x3[1][2]));
				        	casilla_7_ent_1.setText(String.valueOf(answer3x3[2][0]));
				        	casilla_8_ent_1.setText(String.valueOf(answer3x3[2][1]));
				        	casilla_9_ent_1.setText(String.valueOf(answer3x3[2][2]));
					 }
					 
					 else {
						 JOptionPane.showMessageDialog(null, "Por favor, haga alguna operación para usar el ANS.");
					 }					
				}
				
				else {
					if(areAllFieldsFilledANS5x5()) {
						String valor1 = casilla_1_sal.getText();
			        	String valor2 = casilla_2_sal.getText();
			        	String valor3 = casilla_3_sal.getText();
			        	String valor4 = casilla_4_sal.getText();
			        	String valor5 = casilla_5_sal.getText();
			        	String valor6 = casilla_6_sal.getText();
			        	String valor7 = casilla_7_sal.getText();
			        	String valor8 = casilla_8_sal.getText();
			        	String valor9 = casilla_9_sal.getText();
			        	String valor10 = casilla_10_sal.getText();
			        	String valor11 = casilla_11_sal.getText();
			        	String valor12 = casilla_12_sal.getText();
			        	String valor13 = casilla_13_sal.getText();
			        	String valor14 = casilla_14_sal.getText();
			        	String valor15 = casilla_15_sal.getText();
			        	String valor16 = casilla_16_sal.getText();
			        	String valor17 = casilla_17_sal.getText();
			        	String valor18 = casilla_18_sal.getText();
			        	String valor19 = casilla_19_sal.getText();
			        	String valor20 = casilla_20_sal.getText();
			        	String valor21 = casilla_21_sal.getText();
			        	String valor22 = casilla_22_sal.getText();
			        	String valor23 = casilla_23_sal.getText();
			        	String valor24 = casilla_24_sal.getText();
			        	String valor25 = casilla_25_sal.getText();
					 
					 
			        	answer5x5[0][0] = Integer.parseInt(valor1);
			        	answer5x5[0][1] = Integer.parseInt(valor2);
			        	answer5x5[0][2] = Integer.parseInt(valor3);
			        	answer5x5[0][3] = Integer.parseInt(valor4);
			        	answer5x5[0][4] = Integer.parseInt(valor5);
			        	answer5x5[1][0] = Integer.parseInt(valor6);
			        	answer5x5[1][1] = Integer.parseInt(valor7);
			        	answer5x5[1][2] = Integer.parseInt(valor8);
			        	answer5x5[1][3] = Integer.parseInt(valor9);
			        	answer5x5[1][4] = Integer.parseInt(valor10);
			        	answer5x5[2][0] = Integer.parseInt(valor11);
			        	answer5x5[2][1] = Integer.parseInt(valor12);
			        	answer5x5[2][2] = Integer.parseInt(valor13);
			        	answer5x5[2][3] = Integer.parseInt(valor14);
			        	answer5x5[2][4] = Integer.parseInt(valor15);
			        	answer5x5[3][0] = Integer.parseInt(valor16);
			        	answer5x5[3][1] = Integer.parseInt(valor17);
			        	answer5x5[3][2] = Integer.parseInt(valor18);
			        	answer5x5[3][3] = Integer.parseInt(valor19);
			        	answer5x5[3][4] = Integer.parseInt(valor20);
			        	answer5x5[4][0] = Integer.parseInt(valor21);
			        	answer5x5[4][1] = Integer.parseInt(valor22);
			        	answer5x5[4][2] = Integer.parseInt(valor23);
			        	answer5x5[4][3] = Integer.parseInt(valor24);
			        	answer5x5[4][4] = Integer.parseInt(valor25);

			        	
			        	casilla_1_ent_1.setText(String.valueOf(answer5x5[0][0]));
			        	casilla_2_ent_1.setText(String.valueOf(answer5x5[0][1]));
			        	casilla_3_ent_1.setText(String.valueOf(answer5x5[0][2]));
			        	casilla_4_ent_1.setText(String.valueOf(answer5x5[0][3]));
			        	casilla_5_ent_1.setText(String.valueOf(answer5x5[0][4]));
			        	casilla_6_ent_1.setText(String.valueOf(answer5x5[1][0]));
			        	casilla_7_ent_1.setText(String.valueOf(answer5x5[1][1]));
			        	casilla_8_ent_1.setText(String.valueOf(answer5x5[1][2]));
			        	casilla_9_ent_1.setText(String.valueOf(answer5x5[1][3]));
			        	casilla_10_ent_1.setText(String.valueOf(answer5x5[1][4]));
			        	casilla_11_ent_1.setText(String.valueOf(answer5x5[2][0]));
			        	casilla_12_ent_1.setText(String.valueOf(answer5x5[2][1]));
			        	casilla_13_ent_1.setText(String.valueOf(answer5x5[2][2]));
			        	casilla_14_ent_1.setText(String.valueOf(answer5x5[2][3]));
			        	casilla_15_ent_1.setText(String.valueOf(answer5x5[2][4]));
			        	casilla_16_ent_1.setText(String.valueOf(answer5x5[3][0]));
			        	casilla_17_ent_1.setText(String.valueOf(answer5x5[3][1]));
			        	casilla_18_ent_1.setText(String.valueOf(answer5x5[3][2]));
			        	casilla_19_ent_1.setText(String.valueOf(answer5x5[3][3]));
			        	casilla_20_ent_1.setText(String.valueOf(answer5x5[3][4]));
			        	casilla_21_ent_1.setText(String.valueOf(answer5x5[4][0]));
			        	casilla_22_ent_1.setText(String.valueOf(answer5x5[4][1]));
			        	casilla_23_ent_1.setText(String.valueOf(answer5x5[4][2]));
			        	casilla_24_ent_1.setText(String.valueOf(answer5x5[4][3]));
			        	casilla_25_ent_1.setText(String.valueOf(answer5x5[4][4]));
					}
					
					else {
						 JOptionPane.showMessageDialog(null, "Por favor, haga alguna operación para usar el ANS.");	
					}
		        	
				}
			}
			
		    private boolean areAllFieldsFilledANS3x3() {
		        return !casilla_1_sal.getText().isEmpty() && 
		               !casilla_2_sal.getText().isEmpty() && 
		               !casilla_3_sal.getText().isEmpty() && 
		               !casilla_4_sal.getText().isEmpty() && 
		               !casilla_5_sal.getText().isEmpty() && 
		               !casilla_6_sal.getText().isEmpty() && 
		               !casilla_7_sal.getText().isEmpty() && 
		               !casilla_8_sal.getText().isEmpty() && 
		               !casilla_9_sal.getText().isEmpty();
		               	
		    }
		    
		    private boolean areAllFieldsFilledANS4x4() {
		        return !casilla_1_sal.getText().isEmpty() && 
		               !casilla_2_sal.getText().isEmpty() && 
		               !casilla_3_sal.getText().isEmpty() && 
		               !casilla_4_sal.getText().isEmpty() && 
		               !casilla_5_sal.getText().isEmpty() && 
		               !casilla_6_sal.getText().isEmpty() && 
		               !casilla_7_sal.getText().isEmpty() && 
		               !casilla_8_sal.getText().isEmpty() && 
		               !casilla_9_sal.getText().isEmpty() &&
		               !casilla_10_sal.getText().isEmpty() &&
		               !casilla_11_sal.getText().isEmpty() &&
		               !casilla_12_sal.getText().isEmpty() &&
		               !casilla_13_sal.getText().isEmpty() &&
		               !casilla_14_sal.getText().isEmpty() &&
		               !casilla_15_sal.getText().isEmpty() &&
		               !casilla_16_sal.getText().isEmpty();
		    }
		    
		    private boolean areAllFieldsFilledANS5x5() {
		        return !casilla_1_sal.getText().isEmpty() && 
		               !casilla_2_sal.getText().isEmpty() && 
		               !casilla_3_sal.getText().isEmpty() && 
		               !casilla_4_sal.getText().isEmpty() && 
		               !casilla_5_sal.getText().isEmpty() && 
		               !casilla_6_sal.getText().isEmpty() && 
		               !casilla_7_sal.getText().isEmpty() && 
		               !casilla_8_sal.getText().isEmpty() && 
		               !casilla_9_sal.getText().isEmpty() &&
		               !casilla_10_sal.getText().isEmpty() &&
		               !casilla_11_sal.getText().isEmpty() &&
		               !casilla_12_sal.getText().isEmpty() &&
		               !casilla_13_sal.getText().isEmpty() &&
		               !casilla_14_sal.getText().isEmpty() &&
		               !casilla_15_sal.getText().isEmpty() &&
		               !casilla_16_sal.getText().isEmpty() &&
		               !casilla_17_sal.getText().isEmpty() &&
		               !casilla_18_sal.getText().isEmpty() &&
		               !casilla_19_sal.getText().isEmpty() &&
		               !casilla_20_sal.getText().isEmpty() &&
		               !casilla_21_sal.getText().isEmpty() &&
		               !casilla_22_sal.getText().isEmpty() &&
		               !casilla_23_sal.getText().isEmpty() &&
		               !casilla_24_sal.getText().isEmpty() &&
		               !casilla_25_sal.getText().isEmpty();
		    }
		    
		});
		ans_1.setOpaque(false);
		ans_1.setBounds(248, 145, 52, 29);
		ans_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		matrices.add(ans_1);
		ans_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel ans_b = new JLabel("ANS: B");
		ans_b.setHorizontalAlignment(SwingConstants.CENTER);
		ans_b.setForeground(Color.WHITE);
		ans_b.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		ans_1.add(ans_b);
		
		RoundedPanel clear = new RoundedPanel(10, new Color(255, 255, 255));
		clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(spinnerValor == 3) {
					casilla_1_ent.setText("");
					casilla_2_ent.setText("");
					casilla_3_ent.setText("");
					casilla_4_ent.setText("");
					casilla_5_ent.setText("");
					casilla_6_ent.setText("");
					casilla_7_ent.setText("");
					casilla_8_ent.setText("");
					casilla_9_ent.setText("");
					
					casilla_1_ent_1.setText("");
					casilla_2_ent_1.setText("");
					casilla_3_ent_1.setText("");
					casilla_4_ent_1.setText("");
					casilla_5_ent_1.setText("");
					casilla_6_ent_1.setText("");
					casilla_7_ent_1.setText("");
					casilla_8_ent_1.setText("");
					casilla_9_ent_1.setText("");
					
					casilla_1_sal.setText("");
					casilla_2_sal.setText("");
					casilla_3_sal.setText("");
					casilla_4_sal.setText("");
					casilla_5_sal.setText("");
					casilla_6_sal.setText("");
					casilla_7_sal.setText("");
					casilla_8_sal.setText("");
					casilla_9_sal.setText("");				
				}
				
				else if(spinnerValor == 4) {
					casilla_1_ent.setText("");
					casilla_2_ent.setText("");
					casilla_3_ent.setText("");
					casilla_4_ent.setText("");
					casilla_5_ent.setText("");
					casilla_6_ent.setText("");
					casilla_7_ent.setText("");
					casilla_8_ent.setText("");
					casilla_9_ent.setText("");
					casilla_10_ent.setText("");
					casilla_11_ent.setText("");
					casilla_12_ent.setText("");
					casilla_13_ent.setText("");
					casilla_14_ent.setText("");
					casilla_15_ent.setText("");
					casilla_16_ent.setText("");
					
					casilla_1_ent_1.setText("");
					casilla_2_ent_1.setText("");
					casilla_3_ent_1.setText("");
					casilla_4_ent_1.setText("");
					casilla_5_ent_1.setText("");
					casilla_6_ent_1.setText("");
					casilla_7_ent_1.setText("");
					casilla_8_ent_1.setText("");
					casilla_9_ent_1.setText("");
					casilla_10_ent_1.setText("");
					casilla_11_ent_1.setText("");
					casilla_12_ent_1.setText("");
					casilla_13_ent_1.setText("");
					casilla_14_ent_1.setText("");
					casilla_15_ent_1.setText("");
					casilla_16_ent_1.setText("");
					
					casilla_1_sal.setText("");
					casilla_2_sal.setText("");
					casilla_3_sal.setText("");
					casilla_4_sal.setText("");
					casilla_5_sal.setText("");
					casilla_6_sal.setText("");
					casilla_7_sal.setText("");
					casilla_8_sal.setText("");
					casilla_9_sal.setText("");
					casilla_10_sal.setText("");
					casilla_11_sal.setText("");
					casilla_12_sal.setText("");
					casilla_13_sal.setText("");
					casilla_14_sal.setText("");
					casilla_15_sal.setText("");
					casilla_16_sal.setText("");
				}
				
				else {
					casilla_1_ent.setText("");
					casilla_2_ent.setText("");
					casilla_3_ent.setText("");
					casilla_4_ent.setText("");
					casilla_5_ent.setText("");
					casilla_6_ent.setText("");
					casilla_7_ent.setText("");
					casilla_8_ent.setText("");
					casilla_9_ent.setText("");
					casilla_10_ent.setText("");
					casilla_11_ent.setText("");
					casilla_12_ent.setText("");
					casilla_13_ent.setText("");
					casilla_14_ent.setText("");
					casilla_15_ent.setText("");
					casilla_16_ent.setText("");
					casilla_16_ent.setText("");
					casilla_17_ent.setText("");
					casilla_18_ent.setText("");
					casilla_19_ent.setText("");
					casilla_20_ent.setText("");
					casilla_21_ent.setText("");
					casilla_22_ent.setText("");
					casilla_23_ent.setText("");
					casilla_24_ent.setText("");
					casilla_25_ent.setText("");
					
					casilla_1_ent_1.setText("");
					casilla_2_ent_1.setText("");
					casilla_3_ent_1.setText("");
					casilla_4_ent_1.setText("");
					casilla_5_ent_1.setText("");
					casilla_6_ent_1.setText("");
					casilla_7_ent_1.setText("");
					casilla_8_ent_1.setText("");
					casilla_9_ent_1.setText("");
					casilla_10_ent_1.setText("");
					casilla_11_ent_1.setText("");
					casilla_12_ent_1.setText("");
					casilla_13_ent_1.setText("");
					casilla_14_ent_1.setText("");
					casilla_15_ent_1.setText("");
					casilla_16_ent_1.setText("");
					casilla_17_ent_1.setText("");
					casilla_18_ent_1.setText("");
					casilla_19_ent_1.setText("");
					casilla_20_ent_1.setText("");
					casilla_21_ent_1.setText("");
					casilla_22_ent_1.setText("");
					casilla_23_ent_1.setText("");
					casilla_24_ent_1.setText("");
					casilla_25_ent_1.setText("");
					
					casilla_1_sal.setText("");
					casilla_2_sal.setText("");
					casilla_3_sal.setText("");
					casilla_4_sal.setText("");
					casilla_5_sal.setText("");
					casilla_6_sal.setText("");
					casilla_7_sal.setText("");
					casilla_8_sal.setText("");
					casilla_9_sal.setText("");
					casilla_10_sal.setText("");
					casilla_11_sal.setText("");
					casilla_12_sal.setText("");
					casilla_13_sal.setText("");
					casilla_14_sal.setText("");
					casilla_15_sal.setText("");
					casilla_16_sal.setText("");		
					casilla_17_sal.setText("");		
					casilla_18_sal.setText("");		
					casilla_19_sal.setText("");		
					casilla_20_sal.setText("");		
					casilla_21_sal.setText("");		
					casilla_22_sal.setText("");		
					casilla_23_sal.setText("");		
					casilla_24_sal.setText("");		
					casilla_25_sal.setText("");		
				}
			}
		});
		clear.setOpaque(false);
		clear.setBounds(248, 200, 52, 29);
		clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		matrices.add(clear);
		clear.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel clear_uno = new JLabel("BORRAR");
		clear_uno.setHorizontalAlignment(SwingConstants.CENTER);
		clear_uno.setForeground(new Color(86, 116, 250));
		clear_uno.setFont(new Font("Microsoft YaHei", Font.BOLD, 10));
		
		clear.add(clear_uno);
		
		JLabel resultado = new JLabel("=");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setForeground(Color.WHITE);
		resultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		resultado.setBounds(548, 129, 44, 14);
		matrices.add(resultado);
		
		JLabel id_ans = new JLabel("ANS");
		id_ans.setHorizontalAlignment(SwingConstants.CENTER);
		id_ans.setForeground(Color.WHITE);
		id_ans.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		id_ans.setBounds(603, 10, 198, 14);
		matrices.add(id_ans);
		
		JSpinner spinner = new JSpinner(new SpinnerNumberModel(3, 3, 5, 1));
		spinner.setBounds(248, 47, 54, 20);
		spinner.setBorder(BorderFactory.createLineBorder(gris));

		// Configurar el fondo del editor
		spinner.getEditor().getComponent(0).setBackground(gris);

		// Configurar el borde del editor
		((JComponent) spinner.getEditor()).setBorder(BorderFactory.createLineBorder(gris));

		// Obtener el editor del spinner
		JComponent editor = (JComponent) spinner.getEditor();
		if (editor instanceof JSpinner.DefaultEditor) {
		    JTextField textField = ((JSpinner.DefaultEditor) editor).getTextField();
		    textField.setForeground(letrasColor);
		    textField.setHorizontalAlignment(JTextField.CENTER);
		    textField.setEditable(false); // Evitar que el texto sea editable
		    textField.setFocusable(false); // Evitar que el texto sea seleccionable
		}

		matrices.add(spinner);

		
		JLabel lblLongitud = new JLabel("Longitud");
		lblLongitud.setHorizontalAlignment(SwingConstants.CENTER);
		lblLongitud.setForeground(Color.WHITE);
		lblLongitud.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblLongitud.setBounds(218, 25, 109, 20);
		matrices.add(lblLongitud);
		
		JPanel menu_matrices = new JPanel();
		menu_matrices.setBackground(miColorPrin);
		menu_matrices.setBounds(23, 125, 834, 89);
		contentPane.add(menu_matrices);
		menu_matrices.setLayout(null);
		
		JPanel ingresar_una_matriz = new RoundedPanel(15,new Color(30,36,53));
        ingresar_una_matriz.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaMatricesUno();
            }
        });

		ingresar_una_matriz.setBackground(new Color(30, 36, 53));
		ingresar_una_matriz.setBounds(10, 11, 390, 67);
		ingresar_una_matriz.setOpaque(false);
		menu_matrices.add(ingresar_una_matriz);
		ingresar_una_matriz.setLayout(new GridLayout(1, 0, 0, 0));

		
		JLabel ingreso_una = new JLabel("Ingresar una matriz");
		ingreso_una.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
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
		ingreso_dos.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		ingreso_dos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ingresar_dos_matrices.add(ingreso_dos);
		
		JPanel menu_general = new JPanel();
		menu_general.setBackground(miColorPrin);
		menu_general.setBounds(22, 34, 834, 80);
		contentPane.add(menu_general);
		menu_general.setLayout(null);
		
		JPanel aritmeticas = new RoundedPanel(15, Color.WHITE);
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
		aritmeticas.setBackground(new Color(255, 255, 255));
		aritmeticas.setBounds(10, 11, 185, 58);
		aritmeticas.setOpaque(false);
		menu_general.add(aritmeticas);
		aritmeticas.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel texto_aritmeticas = new JLabel("ESTANDAR");
		texto_aritmeticas.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		texto_aritmeticas.setForeground(new Color(30, 36, 53));
		texto_aritmeticas.setHorizontalAlignment(SwingConstants.CENTER);
		texto_aritmeticas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		aritmeticas.add(texto_aritmeticas);
		
		
		JPanel vectores = new RoundedPanel(15,Color.WHITE);
		vectores.setBackground(Color.WHITE);
		vectores.setBounds(221, 11, 185, 58);
		vectores.setOpaque(false);
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
		
		JPanel matrices_operaciones = new RoundedPanel(15, miColorSec);
		matrices_operaciones.setBackground(miColorSec);
		matrices_operaciones.setBounds(432, 11, 185, 58);
		matrices_operaciones.setOpaque(false);
		menu_general.add(matrices_operaciones);
		matrices_operaciones.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel texto_matrices = new JLabel("MATRICES");
		texto_matrices.setBackground(miColorSec);
		texto_matrices.setHorizontalAlignment(SwingConstants.CENTER);
		texto_matrices.setForeground(letrasColor);
		texto_matrices.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		texto_matrices.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		matrices_operaciones.add(texto_matrices);
		
		JPanel ecuaciones = new RoundedPanel(15,Color.WHITE);
		ecuaciones.setBackground(Color.WHITE);
		ecuaciones.setBounds(639, 11, 185, 58);
		ecuaciones.setOpaque(false);
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
			
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaEcuaciones();
            }
		});
		
		JLabel texto_ecuaciones = new JLabel("ECUACIONES");
		texto_ecuaciones.setHorizontalAlignment(SwingConstants.CENTER);
		texto_ecuaciones.setForeground(new Color(30, 36, 53));
		texto_ecuaciones.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		texto_ecuaciones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ecuaciones.add(texto_ecuaciones);

		spinner.addChangeListener(new ChangeListener() {
		    @Override
		    public void stateChanged(ChangeEvent e) {
		        SpinnerNumberModel model = (SpinnerNumberModel) spinner.getModel();
		        int valorSpinner = model.getNumber().intValue();

		        // Limpiar todas las casillas de entrada y salida
		        JTextField[] casillasEntrada = {casilla_1_ent, casilla_2_ent, casilla_3_ent, casilla_4_ent, casilla_5_ent, casilla_6_ent, casilla_7_ent, casilla_8_ent, casilla_9_ent, casilla_10_ent, casilla_11_ent, casilla_12_ent, casilla_13_ent, casilla_14_ent, casilla_15_ent, casilla_16_ent, casilla_17_ent, casilla_18_ent, casilla_19_ent, casilla_20_ent, casilla_21_ent, casilla_22_ent, casilla_23_ent, casilla_24_ent, casilla_25_ent, casilla_1_ent_1, casilla_2_ent_1, casilla_3_ent_1, casilla_4_ent_1, casilla_5_ent_1, casilla_6_ent_1, casilla_7_ent_1, casilla_8_ent_1, casilla_9_ent_1, casilla_10_ent_1, casilla_11_ent_1, casilla_12_ent_1, casilla_13_ent_1, casilla_14_ent_1, casilla_15_ent_1, casilla_16_ent_1, casilla_17_ent_1, casilla_18_ent_1, casilla_19_ent_1, casilla_20_ent_1, casilla_21_ent_1, casilla_22_ent_1, casilla_23_ent_1, casilla_24_ent_1, casilla_25_ent_1};
		        JTextField[] casillasSalida = {casilla_1_sal, casilla_2_sal, casilla_3_sal, casilla_4_sal, casilla_5_sal, casilla_6_sal, casilla_7_sal, casilla_8_sal, casilla_9_sal, casilla_10_sal, casilla_11_sal, casilla_12_sal, casilla_13_sal, casilla_14_sal, casilla_15_sal, casilla_16_sal, casilla_17_sal, casilla_18_sal, casilla_19_sal, casilla_20_sal, casilla_21_sal, casilla_22_sal, casilla_23_sal, casilla_24_sal, casilla_25_sal};

		        for (JTextField casilla : casillasEntrada) {
		            casilla.setText("");
		        }

		        for (JTextField casilla : casillasSalida) {
		            casilla.setText("");
		        }

		        // Verificar si el valor del spinner es 4
		        if (valorSpinner == 4) {
		            spinnerValor = 4;
		            
		    		casilla_1_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_2_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_3_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_4_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_5_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_6_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_7_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_8_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_9_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_10_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_11_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_12_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_13_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_14_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_15_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_16_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_17_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_18_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_19_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_20_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_21_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_22_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_23_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_24_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_25_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		
		    		casilla_1_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_2_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_3_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_4_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_5_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_6_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_7_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_8_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_9_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_10_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_11_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_12_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_13_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_14_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_15_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_16_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_17_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_18_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_19_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_20_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_21_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_22_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_23_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_24_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_25_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		
		    		casilla_1_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_2_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_3_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_4_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_5_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_6_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_7_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_8_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_9_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_10_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_11_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_12_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_13_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_14_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_15_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_16_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_17_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_18_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_19_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_20_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_21_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_22_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_23_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_24_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		    		casilla_25_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 15));



		            
		            casilla_1_ent.setVisible(true);
		            casilla_2_ent.setVisible(true);
		            casilla_3_ent.setVisible(true);
		            casilla_4_ent.setVisible(true);
		            casilla_5_ent.setVisible(true);
		            casilla_6_ent.setVisible(true);
		            casilla_7_ent.setVisible(true);
		            casilla_8_ent.setVisible(true);
		            casilla_9_ent.setVisible(true);
		            casilla_10_ent.setVisible(true);
		            casilla_11_ent.setVisible(true);
		            casilla_12_ent.setVisible(true);
		            casilla_13_ent.setVisible(true);
		            casilla_14_ent.setVisible(true);
		            casilla_15_ent.setVisible(true);
		            casilla_16_ent.setVisible(true);

		            casilla_17_ent.setVisible(false);
		            casilla_18_ent.setVisible(false);
		            casilla_19_ent.setVisible(false);
		            casilla_20_ent.setVisible(false);
		            casilla_21_ent.setVisible(false);
		            casilla_22_ent.setVisible(false);
		            casilla_23_ent.setVisible(false);
		            casilla_24_ent.setVisible(false);
		            casilla_25_ent.setVisible(false);		            
		            
		            casilla_1_ent.setBounds(14, 14, 40, 40);
		            casilla_2_ent.setBounds(59, 14, 40, 40);
		            casilla_3_ent.setBounds(104, 14, 40, 40);
		            casilla_4_ent.setBounds(149, 14, 40, 40);

		            casilla_5_ent.setBounds(14, 59, 40, 40);
		            casilla_6_ent.setBounds(59, 59, 40, 40);
		            casilla_7_ent.setBounds(104, 59, 40, 40);
		            casilla_8_ent.setBounds(149, 59, 40, 40);

		            casilla_9_ent.setBounds(14, 104, 40, 40);
		            casilla_10_ent.setBounds(59, 104, 40, 40);
		            casilla_11_ent.setBounds(104, 104, 40, 40);
		            casilla_12_ent.setBounds(149, 104, 40, 40);

		            casilla_13_ent.setBounds(14, 149, 40, 40);
		            casilla_14_ent.setBounds(59, 149, 40, 40);
		            casilla_15_ent.setBounds(104, 149, 40, 40);
		            casilla_16_ent.setBounds(149, 149, 40, 40);


		            // matriz b
		            
		            casilla_1_ent_1.setVisible(true);
		            casilla_2_ent_1.setVisible(true);
		            casilla_3_ent_1.setVisible(true);
		            casilla_4_ent_1.setVisible(true);
		            casilla_5_ent_1.setVisible(true);
		            casilla_6_ent_1.setVisible(true);
		            casilla_7_ent_1.setVisible(true);
		            casilla_8_ent_1.setVisible(true);
		            casilla_9_ent_1.setVisible(true);
		            casilla_10_ent_1.setVisible(true);
		            casilla_11_ent_1.setVisible(true);
		            casilla_12_ent_1.setVisible(true);
		            casilla_13_ent_1.setVisible(true);
		            casilla_14_ent_1.setVisible(true);
		            casilla_15_ent_1.setVisible(true);
		            casilla_16_ent_1.setVisible(true);

		            casilla_17_ent_1.setVisible(false);
		            casilla_18_ent_1.setVisible(false);
		            casilla_19_ent_1.setVisible(false);
		            casilla_20_ent_1.setVisible(false);
		            casilla_21_ent_1.setVisible(false);
		            casilla_22_ent_1.setVisible(false);
		            casilla_23_ent_1.setVisible(false);
		            casilla_24_ent_1.setVisible(false);
		            casilla_25_ent_1.setVisible(false);		            
		            
		            casilla_1_ent_1.setBounds(14, 14, 40, 40);
		            casilla_2_ent_1.setBounds(59, 14, 40, 40);
		            casilla_3_ent_1.setBounds(104, 14, 40, 40);
		            casilla_4_ent_1.setBounds(149, 14, 40, 40);

		            casilla_5_ent_1.setBounds(14, 59, 40, 40);
		            casilla_6_ent_1.setBounds(59, 59, 40, 40);
		            casilla_7_ent_1.setBounds(104, 59, 40, 40);
		            casilla_8_ent_1.setBounds(149, 59, 40, 40);

		            casilla_9_ent_1.setBounds(14, 104, 40, 40);
		            casilla_10_ent_1.setBounds(59, 104, 40, 40);
		            casilla_11_ent_1.setBounds(104, 104, 40, 40);
		            casilla_12_ent_1.setBounds(149, 104, 40, 40);

		            casilla_13_ent_1.setBounds(14, 149, 40, 40);
		            casilla_14_ent_1.setBounds(59, 149, 40, 40);
		            casilla_15_ent_1.setBounds(104, 149, 40, 40);
		            casilla_16_ent_1.setBounds(149, 149, 40, 40);		            
		            
		            casilla_1_sal.setVisible(true);
		            casilla_2_sal.setVisible(true);
		            casilla_3_sal.setVisible(true);
		            casilla_4_sal.setVisible(true);
		            casilla_5_sal.setVisible(true);
		            casilla_6_sal.setVisible(true);
		            casilla_7_sal.setVisible(true);
		            casilla_8_sal.setVisible(true);
		            casilla_9_sal.setVisible(true);
		            casilla_10_sal.setVisible(true);
		            casilla_11_sal.setVisible(true);
		            casilla_12_sal.setVisible(true);
		            casilla_13_sal.setVisible(true);
		            casilla_14_sal.setVisible(true);
		            casilla_15_sal.setVisible(true);
		            casilla_16_sal.setVisible(true);

		            casilla_17_sal.setVisible(false);
		            casilla_18_sal.setVisible(false);
		            casilla_19_sal.setVisible(false);
		            casilla_20_sal.setVisible(false);
		            casilla_21_sal.setVisible(false);
		            casilla_22_sal.setVisible(false);
		            casilla_23_sal.setVisible(false);
		            casilla_24_sal.setVisible(false);
		            casilla_25_sal.setVisible(false);		            
		            
		            casilla_1_sal.setBounds(14, 14, 40, 40);
		            casilla_2_sal.setBounds(59, 14, 40, 40);
		            casilla_3_sal.setBounds(104, 14, 40, 40);
		            casilla_4_sal.setBounds(149, 14, 40, 40);

		            casilla_5_sal.setBounds(14, 59, 40, 40);
		            casilla_6_sal.setBounds(59, 59, 40, 40);
		            casilla_7_sal.setBounds(104, 59, 40, 40);
		            casilla_8_sal.setBounds(149, 59, 40, 40);

		            casilla_9_sal.setBounds(14, 104, 40, 40);
		            casilla_10_sal.setBounds(59, 104, 40, 40);
		            casilla_11_sal.setBounds(104, 104, 40, 40);
		            casilla_12_sal.setBounds(149, 104, 40, 40);

		            casilla_13_sal.setBounds(14, 149, 40, 40);
		            casilla_14_sal.setBounds(59, 149, 40, 40);
		            casilla_15_sal.setBounds(104, 149, 40, 40);
		            casilla_16_sal.setBounds(149, 149, 40, 40);		      
		        } else if (valorSpinner == 3) {
		            spinnerValor = 3;
		            casilla_10_ent.setVisible(false);
		            casilla_11_ent.setVisible(false);
		            casilla_12_ent.setVisible(false);
		            casilla_13_ent.setVisible(false);
		            casilla_14_ent.setVisible(false);
		            casilla_15_ent.setVisible(false);
		            casilla_16_ent.setVisible(false);
		            casilla_1_ent.setBounds(10, 11, 52, 52);
		            casilla_2_ent.setBounds(74, 11, 52, 52);	
		            casilla_3_ent.setBounds(138, 11, 52, 52);
		            casilla_4_ent.setBounds(10, 75, 52, 52);
		            casilla_5_ent.setBounds(74, 75, 52, 52);
		            casilla_6_ent.setBounds(138, 75, 52, 52);
		            casilla_7_ent.setBounds(10, 139, 52, 52);
		            casilla_8_ent.setBounds(74, 139, 52, 52);
		            casilla_9_ent.setBounds(138, 139, 52, 52);
		            
		            casilla_10_ent_1.setVisible(false);
		            casilla_11_ent_1.setVisible(false);
		            casilla_12_ent_1.setVisible(false);
		            casilla_13_ent_1.setVisible(false);
		            casilla_14_ent_1.setVisible(false);
		            casilla_15_ent_1.setVisible(false);
		            casilla_16_ent_1.setVisible(false);
		            casilla_1_ent_1.setBounds(10, 11, 52, 52);
		            casilla_2_ent_1.setBounds(74, 11, 52, 52);
		            casilla_3_ent_1.setBounds(138, 11, 52, 52);
		            casilla_4_ent_1.setBounds(10, 75, 52, 52);
		            casilla_5_ent_1.setBounds(74, 75, 52, 52);
		            casilla_6_ent_1.setBounds(138, 75, 52, 52);
		            casilla_7_ent_1.setBounds(10, 139, 52, 52);
		            casilla_8_ent_1.setBounds(74, 139, 52, 52);
		            casilla_9_ent_1.setBounds(138, 139, 52, 52);

		            casilla_10_sal.setVisible(false);
		            casilla_11_sal.setVisible(false);
		            casilla_12_sal.setVisible(false);
		            casilla_13_sal.setVisible(false);
		            casilla_14_sal.setVisible(false);
		            casilla_15_sal.setVisible(false);
		            casilla_16_sal.setVisible(false);
		            casilla_1_sal.setBounds(10, 11, 52, 52);
		            casilla_2_sal.setBounds(74, 11, 52, 52);
		            casilla_3_sal.setBounds(138, 11, 52, 52);
		            casilla_4_sal.setBounds(10, 75, 52, 52);
		            casilla_5_sal.setBounds(74, 75, 52, 52);
		            casilla_6_sal.setBounds(138, 75, 52, 52);
		            casilla_7_sal.setBounds(10, 139, 52, 52);
		            casilla_8_sal.setBounds(74, 139, 52, 52);
		            casilla_9_sal.setBounds(138, 139, 52, 52);
		        }
		        
		        else {
		            spinnerValor = 5;
		            
		    		casilla_1_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_2_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_3_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_4_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_5_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_6_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_7_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_8_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_9_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_10_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_11_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_12_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_13_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_14_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_15_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_16_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_17_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_18_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_19_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_20_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_21_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_22_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_23_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_24_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_25_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		
		    		casilla_1_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_2_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_3_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_4_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_5_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_6_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_7_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_8_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_9_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_10_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_11_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_12_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_13_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_14_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_15_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_16_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_17_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_18_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_19_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_20_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_21_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_22_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_23_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_24_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_25_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		
		    		casilla_1_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_2_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_3_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_4_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_5_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_6_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_7_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_8_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_9_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_10_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_11_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_12_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_13_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_14_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_15_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_16_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_17_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_18_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_19_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_20_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_21_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_22_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_23_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_24_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		    		casilla_25_ent_1.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		            
		            casilla_1_ent.setVisible(true);
		            casilla_2_ent.setVisible(true);
		            casilla_3_ent.setVisible(true);
		            casilla_4_ent.setVisible(true);
		            casilla_5_ent.setVisible(true);
		            casilla_6_ent.setVisible(true);
		            casilla_7_ent.setVisible(true);
		            casilla_8_ent.setVisible(true);
		            casilla_9_ent.setVisible(true);
		            casilla_10_ent.setVisible(true);
		            casilla_11_ent.setVisible(true);
		            casilla_12_ent.setVisible(true);
		            casilla_13_ent.setVisible(true);
		            casilla_14_ent.setVisible(true);
		            casilla_15_ent.setVisible(true);
		            casilla_16_ent.setVisible(true);
		            casilla_17_ent.setVisible(true);
		            casilla_18_ent.setVisible(true);
		            casilla_19_ent.setVisible(true);
		            casilla_20_ent.setVisible(true);
		            casilla_21_ent.setVisible(true);
		            casilla_22_ent.setVisible(true);
		            casilla_23_ent.setVisible(true);
		            casilla_24_ent.setVisible(true);
		            casilla_25_ent.setVisible(true);
		            
		            
		            casilla_1_ent.setBounds(14, 14, 33, 33);
		            casilla_2_ent.setBounds(49, 14, 33, 33);
		            casilla_3_ent.setBounds(84, 14, 33, 33);
		            casilla_4_ent.setBounds(119, 14, 33, 33);
		            casilla_5_ent.setBounds(154, 14, 33, 33);
		            
		            casilla_6_ent.setBounds(14, 49, 33, 33);
		            casilla_7_ent.setBounds(49, 49, 33, 33);
		            casilla_8_ent.setBounds(84, 49, 33, 33);
		            casilla_9_ent.setBounds(119, 49, 33, 33);
		            casilla_10_ent.setBounds(154, 49, 33, 33);
		            
		            casilla_11_ent.setBounds(14, 84, 33, 33);
		            casilla_12_ent.setBounds(49, 84, 33, 33);
		            casilla_13_ent.setBounds(84, 84, 33, 33);
		            casilla_14_ent.setBounds(119, 84, 33, 33);
		            casilla_15_ent.setBounds(154, 84, 33, 33);
		            
		            casilla_16_ent.setBounds(14, 119, 33, 33);
		            casilla_17_ent.setBounds(49, 119, 33, 33);
		            casilla_18_ent.setBounds(84, 119, 33, 33);
		            casilla_19_ent.setBounds(119, 119, 33, 33);
		            casilla_20_ent.setBounds(154, 119, 33, 33);
		            
		            casilla_21_ent.setBounds(14, 154, 33, 33);
		            casilla_22_ent.setBounds(49, 154, 33, 33);
		            casilla_23_ent.setBounds(84, 154, 33, 33);
		            casilla_24_ent.setBounds(119, 154, 33, 33);
		            casilla_25_ent.setBounds(154, 154, 33, 33);
		            
		            // matriz b
		            
		            casilla_1_ent_1.setVisible(true);
		            casilla_2_ent_1.setVisible(true);
		            casilla_3_ent_1.setVisible(true);
		            casilla_4_ent_1.setVisible(true);
		            casilla_5_ent_1.setVisible(true);
		            casilla_6_ent_1.setVisible(true);
		            casilla_7_ent_1.setVisible(true);
		            casilla_8_ent_1.setVisible(true);
		            casilla_9_ent_1.setVisible(true);
		            casilla_10_ent_1.setVisible(true);
		            casilla_11_ent_1.setVisible(true);
		            casilla_12_ent_1.setVisible(true);
		            casilla_13_ent_1.setVisible(true);
		            casilla_14_ent_1.setVisible(true);
		            casilla_15_ent_1.setVisible(true);
		            casilla_16_ent_1.setVisible(true);
		            casilla_17_ent_1.setVisible(true);
		            casilla_18_ent_1.setVisible(true);
		            casilla_19_ent_1.setVisible(true);
		            casilla_20_ent_1.setVisible(true);
		            casilla_21_ent_1.setVisible(true);
		            casilla_22_ent_1.setVisible(true);
		            casilla_23_ent_1.setVisible(true);
		            casilla_24_ent_1.setVisible(true);
		            casilla_25_ent_1.setVisible(true);
		            
		            
		            casilla_1_ent_1.setBounds(14, 14, 33, 33);
		            casilla_2_ent_1.setBounds(49, 14, 33, 33);
		            casilla_3_ent_1.setBounds(84, 14, 33, 33);
		            casilla_4_ent_1.setBounds(119, 14, 33, 33);
		            casilla_5_ent_1.setBounds(154, 14, 33, 33);
		            
		            casilla_6_ent_1.setBounds(14, 49, 33, 33);
		            casilla_7_ent_1.setBounds(49, 49, 33, 33);
		            casilla_8_ent_1.setBounds(84, 49, 33, 33);
		            casilla_9_ent_1.setBounds(119, 49, 33, 33);
		            casilla_10_ent_1.setBounds(154, 49, 33, 33);
		            
		            casilla_11_ent_1.setBounds(14, 84, 33, 33);
		            casilla_12_ent_1.setBounds(49, 84, 33, 33);
		            casilla_13_ent_1.setBounds(84, 84, 33, 33);
		            casilla_14_ent_1.setBounds(119, 84, 33, 33);
		            casilla_15_ent_1.setBounds(154, 84, 33, 33);
		            
		            casilla_16_ent_1.setBounds(14, 119, 33, 33);
		            casilla_17_ent_1.setBounds(49, 119, 33, 33);
		            casilla_18_ent_1.setBounds(84, 119, 33, 33);
		            casilla_19_ent_1.setBounds(119, 119, 33, 33);
		            casilla_20_ent_1.setBounds(154, 119, 33, 33);
		            
		            casilla_21_ent_1.setBounds(14, 154, 33, 33);
		            casilla_22_ent_1.setBounds(49, 154, 33, 33);
		            casilla_23_ent_1.setBounds(84, 154, 33, 33);
		            casilla_24_ent_1.setBounds(119, 154, 33, 33);
		            casilla_25_ent_1.setBounds(154, 154, 33, 33);
		            		            
		            
		            casilla_1_sal.setVisible(true);
		            casilla_2_sal.setVisible(true);
		            casilla_3_sal.setVisible(true);
		            casilla_4_sal.setVisible(true);
		            casilla_5_sal.setVisible(true);
		            casilla_6_sal.setVisible(true);
		            casilla_7_sal.setVisible(true);
		            casilla_8_sal.setVisible(true);
		            casilla_9_sal.setVisible(true);
		            casilla_10_sal.setVisible(true);
		            casilla_11_sal.setVisible(true);
		            casilla_12_sal.setVisible(true);
		            casilla_13_sal.setVisible(true);
		            casilla_14_sal.setVisible(true);
		            casilla_15_sal.setVisible(true);
		            casilla_16_sal.setVisible(true);
		            casilla_17_sal.setVisible(true);
		            casilla_18_sal.setVisible(true);
		            casilla_19_sal.setVisible(true);
		            casilla_20_sal.setVisible(true);
		            casilla_21_sal.setVisible(true);
		            casilla_22_sal.setVisible(true);
		            casilla_23_sal.setVisible(true);
		            casilla_24_sal.setVisible(true);
		            casilla_25_sal.setVisible(true);
		            
		            
		            casilla_1_sal.setBounds(14, 14, 33, 33);
		            casilla_2_sal.setBounds(49, 14, 33, 33);
		            casilla_3_sal.setBounds(84, 14, 33, 33);
		            casilla_4_sal.setBounds(119, 14, 33, 33);
		            casilla_5_sal.setBounds(154, 14, 33, 33);
		            
		            casilla_6_sal.setBounds(14, 49, 33, 33);
		            casilla_7_sal.setBounds(49, 49, 33, 33);
		            casilla_8_sal.setBounds(84, 49, 33, 33);
		            casilla_9_sal.setBounds(119, 49, 33, 33);
		            casilla_10_sal.setBounds(154, 49, 33, 33);
		            
		            casilla_11_sal.setBounds(14, 84, 33, 33);
		            casilla_12_sal.setBounds(49, 84, 33, 33);
		            casilla_13_sal.setBounds(84, 84, 33, 33);
		            casilla_14_sal.setBounds(119, 84, 33, 33);
		            casilla_15_sal.setBounds(154, 84, 33, 33);
		            
		            casilla_16_sal.setBounds(14, 119, 33, 33);
		            casilla_17_sal.setBounds(49, 119, 33, 33);
		            casilla_18_sal.setBounds(84, 119, 33, 33);
		            casilla_19_sal.setBounds(119, 119, 33, 33);
		            casilla_20_sal.setBounds(154, 119, 33, 33);
		            
		            casilla_21_sal.setBounds(14, 154, 33, 33);
		            casilla_22_sal.setBounds(49, 154, 33, 33);
		            casilla_23_sal.setBounds(84, 154, 33, 33);
		            casilla_24_sal.setBounds(119, 154, 33, 33);
		            casilla_25_sal.setBounds(154, 154, 33, 33);
		            
		        }
		    }
		});	
		
		corchete_der_e1.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/corchete_chico_der.png")));
		corchete_der_e2.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/corchete_chico_der.png")));
		corchete_der.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/CorcheteDer.png")));
		corchete_izq_e1.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/corchete_chico_izq.png")));
		corchete_izq_e1.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/corchete_chico_izq.png")));
		corchete_izq_e2.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/corchete_chico_izq.png")));
		corchete_izq_e2.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/corchete_chico_izq.png")));		
		corchete_izq_s.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/corchete_chico_izq.png")));
		corchete_izq_s.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/corchete_chico_izq.png")));
		corchete_der_s.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/corchete_chico_der.png")));
		corchete_der_s.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/corchete_chico_der.png")));	
		// Parte logica simplificada

		calc_suma.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		    	
		    	if(spinnerValor == 3) {
		    		if (areAllFieldsFilled3x3()) {
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[3][3];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[1][0] = Integer.parseInt(valor4);
			        	matrizInicialA[1][1] = Integer.parseInt(valor5);
			        	matrizInicialA[1][2] = Integer.parseInt(valor6);
			        	matrizInicialA[2][0] = Integer.parseInt(valor7);
			        	matrizInicialA[2][1] = Integer.parseInt(valor8);
			        	matrizInicialA[2][2] = Integer.parseInt(valor9);
			        	
			        	int[][] matrizInicialB = new int[3][3];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor4_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor5_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor6_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor7_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor8_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor9_2);
			        			        			        	
			        	int[][] resultadoSuma = MatricesOperacion.calcularSuma(matrizInicialA, matrizInicialB);
			        	
			        	for(int y = 0; y < 3; y++) {
				        	for(int x = 0; x < 3; x++) {
				        		System.out.print(resultadoSuma[y][x]);
				        		System.out.println(" ");
				        	}
				        	System.out.println("");
			        	}

			        	
			            casilla_1_sal.setText(String.valueOf(resultadoSuma[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoSuma[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoSuma[0][2]));
			            
			            casilla_4_sal.setText(String.valueOf(resultadoSuma[1][0]));
			            casilla_5_sal.setText(String.valueOf(resultadoSuma[1][1]));
			            casilla_6_sal.setText(String.valueOf(resultadoSuma[1][2]));
			            
			            casilla_7_sal.setText(String.valueOf(resultadoSuma[2][0]));
			            casilla_8_sal.setText(String.valueOf(resultadoSuma[2][1]));
			            casilla_9_sal.setText(String.valueOf(resultadoSuma[2][2]));
	
			        } else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
			        }		    		
		    	}
		    	
		    	else if(spinnerValor == 4) {
		    		if (areAllFieldsFilled4x4()) {
		    			
		    			System.out.println("Entra a suma");
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	String valor10 = casilla_10_ent.getText();
			        	String valor11 = casilla_11_ent.getText();
			        	String valor12 = casilla_12_ent.getText();
			        	String valor13 = casilla_13_ent.getText();
			        	String valor14 = casilla_14_ent.getText();
			        	String valor15 = casilla_15_ent.getText();
			        	String valor16 = casilla_16_ent.getText();

			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	String valor10_2 = casilla_10_ent_1.getText();
			        	String valor11_2 = casilla_11_ent_1.getText();
			        	String valor12_2 = casilla_12_ent_1.getText();
			        	String valor13_2 = casilla_13_ent_1.getText();
			        	String valor14_2 = casilla_14_ent_1.getText();
			        	String valor15_2 = casilla_15_ent_1.getText();
			        	String valor16_2 = casilla_16_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[4][4];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[0][3] = Integer.parseInt(valor4);
			        	
			        	matrizInicialA[1][0] = Integer.parseInt(valor5);
			        	matrizInicialA[1][1] = Integer.parseInt(valor6);
			        	matrizInicialA[1][2] = Integer.parseInt(valor7);
			        	matrizInicialA[1][3] = Integer.parseInt(valor8);
			        	
			        	matrizInicialA[2][0] = Integer.parseInt(valor9);
			        	matrizInicialA[2][1] = Integer.parseInt(valor10);
			        	matrizInicialA[2][2] = Integer.parseInt(valor11);
			        	matrizInicialA[2][3] = Integer.parseInt(valor12);
			        	
			        	matrizInicialA[3][0] = Integer.parseInt(valor13);
			        	matrizInicialA[3][1] = Integer.parseInt(valor14);
			        	matrizInicialA[3][2] = Integer.parseInt(valor15);
			        	matrizInicialA[3][3] = Integer.parseInt(valor16);
	
			        	
			        	int[][] matrizInicialB = new int[4][4];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	matrizInicialB[0][3] = Integer.parseInt(valor4_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor5_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor6_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor7_2);
			        	matrizInicialB[1][3] = Integer.parseInt(valor8_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor9_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor10_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor11_2);
			        	matrizInicialB[2][3] = Integer.parseInt(valor12_2);
			        	
			        	matrizInicialB[3][0] = Integer.parseInt(valor13_2);
			        	matrizInicialB[3][1] = Integer.parseInt(valor14_2);
			        	matrizInicialB[3][2] = Integer.parseInt(valor15_2);
			        	matrizInicialB[3][3] = Integer.parseInt(valor16_2);

			        			        			        	
			        	int[][] resultadoSuma = MatricesOperacion.calcularSuma(matrizInicialA, matrizInicialB);
			        	
			            casilla_1_sal.setText(String.valueOf(resultadoSuma[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoSuma[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoSuma[0][2]));
			            casilla_4_sal.setText(String.valueOf(resultadoSuma[0][3]));
			            
			            casilla_5_sal.setText(String.valueOf(resultadoSuma[1][0]));
			            casilla_6_sal.setText(String.valueOf(resultadoSuma[1][1]));
			            casilla_7_sal.setText(String.valueOf(resultadoSuma[1][2]));
			            casilla_8_sal.setText(String.valueOf(resultadoSuma[1][3]));
			            
			            casilla_9_sal.setText(String.valueOf(resultadoSuma[2][0]));
			            casilla_10_sal.setText(String.valueOf(resultadoSuma[2][1]));
			            casilla_11_sal.setText(String.valueOf(resultadoSuma[2][2]));
			            casilla_12_sal.setText(String.valueOf(resultadoSuma[2][3]));
			            
			            casilla_13_sal.setText(String.valueOf(resultadoSuma[3][0]));
			            casilla_14_sal.setText(String.valueOf(resultadoSuma[3][1]));
			            casilla_15_sal.setText(String.valueOf(resultadoSuma[3][2]));
			            casilla_16_sal.setText(String.valueOf(resultadoSuma[3][3]));

	
			        } else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
			        }			    		
		    	}
		    	
		    	else {
		    		if (areAllFieldsFilled5x5()) {
		    			System.out.println("Entra a suma");
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	String valor10 = casilla_10_ent.getText();
			        	String valor11 = casilla_11_ent.getText();
			        	String valor12 = casilla_12_ent.getText();
			        	String valor13 = casilla_13_ent.getText();
			        	String valor14 = casilla_14_ent.getText();
			        	String valor15 = casilla_15_ent.getText();
			        	String valor16 = casilla_16_ent.getText();
			        	String valor17 = casilla_17_ent.getText();
			        	String valor18 = casilla_18_ent.getText();
			        	String valor19 = casilla_19_ent.getText();
			        	String valor20 = casilla_20_ent.getText();
			        	String valor21 = casilla_21_ent.getText();
			        	String valor22 = casilla_22_ent.getText();
			        	String valor23 = casilla_23_ent.getText();
			        	String valor24 = casilla_24_ent.getText();
			        	String valor25 = casilla_25_ent.getText();

			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	String valor10_2 = casilla_10_ent_1.getText();
			        	String valor11_2 = casilla_11_ent_1.getText();
			        	String valor12_2 = casilla_12_ent_1.getText();
			        	String valor13_2 = casilla_13_ent_1.getText();
			        	String valor14_2 = casilla_14_ent_1.getText();
			        	String valor15_2 = casilla_15_ent_1.getText();
			        	String valor16_2 = casilla_16_ent_1.getText();
			        	String valor17_2 = casilla_17_ent_1.getText();
			        	String valor18_2 = casilla_18_ent_1.getText();
			        	String valor19_2 = casilla_19_ent_1.getText();
			        	String valor20_2 = casilla_20_ent_1.getText();
			        	String valor21_2 = casilla_21_ent_1.getText();
			        	String valor22_2 = casilla_22_ent_1.getText();
			        	String valor23_2 = casilla_23_ent_1.getText();
			        	String valor24_2 = casilla_24_ent_1.getText();
			        	String valor25_2 = casilla_25_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[5][5];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[0][3] = Integer.parseInt(valor4);
			        	matrizInicialA[0][4] = Integer.parseInt(valor5);
			        	
			        	matrizInicialA[1][0] = Integer.parseInt(valor6);
			        	matrizInicialA[1][1] = Integer.parseInt(valor7);
			        	matrizInicialA[1][2] = Integer.parseInt(valor8);
			        	matrizInicialA[1][3] = Integer.parseInt(valor9);
			        	matrizInicialA[1][4] = Integer.parseInt(valor10);
			        	
			        	matrizInicialA[2][0] = Integer.parseInt(valor11);
			        	matrizInicialA[2][1] = Integer.parseInt(valor12);
			        	matrizInicialA[2][2] = Integer.parseInt(valor13);
			        	matrizInicialA[2][3] = Integer.parseInt(valor14);
			        	matrizInicialA[2][4] = Integer.parseInt(valor15);
			        	
			        	matrizInicialA[3][0] = Integer.parseInt(valor16);
			        	matrizInicialA[3][1] = Integer.parseInt(valor17);
			        	matrizInicialA[3][2] = Integer.parseInt(valor18);
			        	matrizInicialA[3][3] = Integer.parseInt(valor19);
			        	matrizInicialA[3][4] = Integer.parseInt(valor20);
			        	
			        	matrizInicialA[4][0] = Integer.parseInt(valor21);
			        	matrizInicialA[4][1] = Integer.parseInt(valor22);
			        	matrizInicialA[4][2] = Integer.parseInt(valor23);
			        	matrizInicialA[4][3] = Integer.parseInt(valor24);
			        	matrizInicialA[4][4] = Integer.parseInt(valor25);
			        	
			        	
			        		
			        	
			        	int[][] matrizInicialB = new int[5][5];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	matrizInicialB[0][3] = Integer.parseInt(valor4_2);
			        	matrizInicialB[0][4] = Integer.parseInt(valor5_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor6_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor7_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor8_2);
			        	matrizInicialB[1][3] = Integer.parseInt(valor9_2);
			        	matrizInicialB[1][4] = Integer.parseInt(valor10_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor11_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor12_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor13_2);
			        	matrizInicialB[2][3] = Integer.parseInt(valor14_2);
			        	matrizInicialB[2][4] = Integer.parseInt(valor15_2);
			        	
			        	matrizInicialB[3][0] = Integer.parseInt(valor16_2);
			        	matrizInicialB[3][1] = Integer.parseInt(valor17_2);
			        	matrizInicialB[3][2] = Integer.parseInt(valor18_2);
			        	matrizInicialB[3][3] = Integer.parseInt(valor19_2);
			        	matrizInicialB[3][4] = Integer.parseInt(valor20_2);
			        	
			        	matrizInicialB[4][0] = Integer.parseInt(valor21_2);
			        	matrizInicialB[4][1] = Integer.parseInt(valor22_2);
			        	matrizInicialB[4][2] = Integer.parseInt(valor23_2);
			        	matrizInicialB[4][3] = Integer.parseInt(valor24_2);
			        	matrizInicialB[4][4] = Integer.parseInt(valor25_2);
			        	
			        			        			        	
			        	int[][] resultadoSuma = MatricesOperacion.calcularSuma(matrizInicialA, matrizInicialB);
			        	
			            casilla_1_sal.setText(String.valueOf(resultadoSuma[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoSuma[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoSuma[0][2]));
			            casilla_4_sal.setText(String.valueOf(resultadoSuma[0][3]));
			            casilla_5_sal.setText(String.valueOf(resultadoSuma[0][4]));
			            
			            casilla_6_sal.setText(String.valueOf(resultadoSuma[1][0]));
			            casilla_7_sal.setText(String.valueOf(resultadoSuma[1][1]));
			            casilla_8_sal.setText(String.valueOf(resultadoSuma[1][2]));
			            casilla_9_sal.setText(String.valueOf(resultadoSuma[1][3]));
			            casilla_10_sal.setText(String.valueOf(resultadoSuma[1][4]));
			            
			            casilla_11_sal.setText(String.valueOf(resultadoSuma[2][0]));
			            casilla_12_sal.setText(String.valueOf(resultadoSuma[2][1]));
			            casilla_13_sal.setText(String.valueOf(resultadoSuma[2][2]));
			            casilla_14_sal.setText(String.valueOf(resultadoSuma[2][3]));
			            casilla_15_sal.setText(String.valueOf(resultadoSuma[2][4]));
			            
			            casilla_16_sal.setText(String.valueOf(resultadoSuma[3][0]));
			            casilla_17_sal.setText(String.valueOf(resultadoSuma[3][1]));
			            casilla_18_sal.setText(String.valueOf(resultadoSuma[3][2]));
			            casilla_19_sal.setText(String.valueOf(resultadoSuma[3][3]));
			            casilla_20_sal.setText(String.valueOf(resultadoSuma[3][4]));
			            
			            casilla_21_sal.setText(String.valueOf(resultadoSuma[4][0]));
			            casilla_22_sal.setText(String.valueOf(resultadoSuma[4][1]));
			            casilla_23_sal.setText(String.valueOf(resultadoSuma[4][2]));
			            casilla_24_sal.setText(String.valueOf(resultadoSuma[4][3]));
			            casilla_25_sal.setText(String.valueOf(resultadoSuma[4][4]));
			    			
		    		}
		    		
		    		else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");		    			
		    		}
		    	}
			        
		    }

		    private boolean areAllFieldsFilled3x3() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty();
		               	
		    }
		    
		    private boolean areAllFieldsFilled4x4() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_10_ent.getText().isEmpty() && 
		               !casilla_11_ent.getText().isEmpty() && 
		               !casilla_12_ent.getText().isEmpty() && 
		               !casilla_13_ent.getText().isEmpty() && 
		               !casilla_14_ent.getText().isEmpty() && 
		               !casilla_15_ent.getText().isEmpty() && 
		               !casilla_16_ent.getText().isEmpty() && 
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty() &&
		               !casilla_10_ent_1.getText().isEmpty() && 
		               !casilla_11_ent_1.getText().isEmpty() && 
		               !casilla_12_ent_1.getText().isEmpty() && 
		               !casilla_13_ent_1.getText().isEmpty() && 
		               !casilla_14_ent_1.getText().isEmpty() && 
		               !casilla_15_ent_1.getText().isEmpty() && 
		               !casilla_16_ent_1.getText().isEmpty();
		               	
		    }
		    
		    private boolean areAllFieldsFilled5x5() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_10_ent.getText().isEmpty() && 
		               !casilla_11_ent.getText().isEmpty() && 
		               !casilla_12_ent.getText().isEmpty() && 
		               !casilla_13_ent.getText().isEmpty() && 
		               !casilla_14_ent.getText().isEmpty() && 
		               !casilla_15_ent.getText().isEmpty() && 
		               !casilla_16_ent.getText().isEmpty() && 
		               !casilla_17_ent.getText().isEmpty() && 
		               !casilla_18_ent.getText().isEmpty() && 
		               !casilla_19_ent.getText().isEmpty() && 
		               !casilla_20_ent.getText().isEmpty() && 
		               !casilla_21_ent.getText().isEmpty() && 
		               !casilla_22_ent.getText().isEmpty() && 
		               !casilla_23_ent.getText().isEmpty() && 
		               !casilla_24_ent.getText().isEmpty() && 
		               !casilla_25_ent.getText().isEmpty() &&
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty() &&
		               !casilla_10_ent_1.getText().isEmpty() && 
		               !casilla_11_ent_1.getText().isEmpty() && 
		               !casilla_12_ent_1.getText().isEmpty() && 
		               !casilla_13_ent_1.getText().isEmpty() && 
		               !casilla_14_ent_1.getText().isEmpty() && 
		               !casilla_15_ent_1.getText().isEmpty() && 
		               !casilla_16_ent_1.getText().isEmpty() &&
		               !casilla_17_ent_1.getText().isEmpty() && 
		               !casilla_18_ent_1.getText().isEmpty() && 
		               !casilla_19_ent_1.getText().isEmpty() && 
		               !casilla_20_ent_1.getText().isEmpty() && 
		               !casilla_21_ent_1.getText().isEmpty() && 
		               !casilla_22_ent_1.getText().isEmpty() && 
		               !casilla_23_ent_1.getText().isEmpty() && 
		               !casilla_24_ent_1.getText().isEmpty() && 
		               !casilla_25_ent_1.getText().isEmpty();
		               	
		    }
		});
		
		calc_resta.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		    	if(spinnerValor == 3) {
		    		if (areAllFieldsFilled3x3()) {
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[3][3];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[1][0] = Integer.parseInt(valor4);
			        	matrizInicialA[1][1] = Integer.parseInt(valor5);
			        	matrizInicialA[1][2] = Integer.parseInt(valor6);
			        	matrizInicialA[2][0] = Integer.parseInt(valor7);
			        	matrizInicialA[2][1] = Integer.parseInt(valor8);
			        	matrizInicialA[2][2] = Integer.parseInt(valor9);
			        	
			        	int[][] matrizInicialB = new int[3][3];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor4_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor5_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor6_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor7_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor8_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor9_2);
			        			        			        	
			        	int[][] resultadoResta = MatricesOperacion.calcularResta(matrizInicialA, matrizInicialB);
			        	     	
			            casilla_1_sal.setText(String.valueOf(resultadoResta[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoResta[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoResta[0][2]));
			            
			            casilla_4_sal.setText(String.valueOf(resultadoResta[1][0]));
			            casilla_5_sal.setText(String.valueOf(resultadoResta[1][1]));
			            casilla_6_sal.setText(String.valueOf(resultadoResta[1][2]));
			            
			            casilla_7_sal.setText(String.valueOf(resultadoResta[2][0]));
			            casilla_8_sal.setText(String.valueOf(resultadoResta[2][1]));
			            casilla_9_sal.setText(String.valueOf(resultadoResta[2][2]));
	
			        } else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
			        }		    			
		    	}
		    	
		    	else if(spinnerValor == 4) {
		    		if (areAllFieldsFilled4x4()) {
		    			
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	String valor10 = casilla_10_ent.getText();
			        	String valor11 = casilla_11_ent.getText();
			        	String valor12 = casilla_12_ent.getText();
			        	String valor13 = casilla_13_ent.getText();
			        	String valor14 = casilla_14_ent.getText();
			        	String valor15 = casilla_15_ent.getText();
			        	String valor16 = casilla_16_ent.getText();

			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	String valor10_2 = casilla_10_ent_1.getText();
			        	String valor11_2 = casilla_11_ent_1.getText();
			        	String valor12_2 = casilla_12_ent_1.getText();
			        	String valor13_2 = casilla_13_ent_1.getText();
			        	String valor14_2 = casilla_14_ent_1.getText();
			        	String valor15_2 = casilla_15_ent_1.getText();
			        	String valor16_2 = casilla_16_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[4][4];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[0][3] = Integer.parseInt(valor4);
			        	
			        	matrizInicialA[1][0] = Integer.parseInt(valor5);
			        	matrizInicialA[1][1] = Integer.parseInt(valor6);
			        	matrizInicialA[1][2] = Integer.parseInt(valor7);
			        	matrizInicialA[1][3] = Integer.parseInt(valor8);
			        	
			        	matrizInicialA[2][0] = Integer.parseInt(valor9);
			        	matrizInicialA[2][1] = Integer.parseInt(valor10);
			        	matrizInicialA[2][2] = Integer.parseInt(valor11);
			        	matrizInicialA[2][3] = Integer.parseInt(valor12);
			        	
			        	matrizInicialA[3][0] = Integer.parseInt(valor13);
			        	matrizInicialA[3][1] = Integer.parseInt(valor14);
			        	matrizInicialA[3][2] = Integer.parseInt(valor15);
			        	matrizInicialA[3][3] = Integer.parseInt(valor16);
	
			        	
			        	int[][] matrizInicialB = new int[4][4];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	matrizInicialB[0][3] = Integer.parseInt(valor4_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor5_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor6_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor7_2);
			        	matrizInicialB[1][3] = Integer.parseInt(valor8_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor9_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor10_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor11_2);
			        	matrizInicialB[2][3] = Integer.parseInt(valor12_2);
			        	
			        	matrizInicialB[3][0] = Integer.parseInt(valor13_2);
			        	matrizInicialB[3][1] = Integer.parseInt(valor14_2);
			        	matrizInicialB[3][2] = Integer.parseInt(valor15_2);
			        	matrizInicialB[3][3] = Integer.parseInt(valor16_2);

			        			        			        	
			        	int[][] resultadoResta = MatricesOperacion.calcularResta(matrizInicialA, matrizInicialB);
			        	
			            casilla_1_sal.setText(String.valueOf(resultadoResta[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoResta[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoResta[0][2]));
			            casilla_4_sal.setText(String.valueOf(resultadoResta[0][3]));
			            
			            casilla_5_sal.setText(String.valueOf(resultadoResta[1][0]));
			            casilla_6_sal.setText(String.valueOf(resultadoResta[1][1]));
			            casilla_7_sal.setText(String.valueOf(resultadoResta[1][2]));
			            casilla_8_sal.setText(String.valueOf(resultadoResta[1][3]));
			            
			            casilla_9_sal.setText(String.valueOf(resultadoResta[2][0]));
			            casilla_10_sal.setText(String.valueOf(resultadoResta[2][1]));
			            casilla_11_sal.setText(String.valueOf(resultadoResta[2][2]));
			            casilla_12_sal.setText(String.valueOf(resultadoResta[2][3]));
			            
			            casilla_13_sal.setText(String.valueOf(resultadoResta[3][0]));
			            casilla_14_sal.setText(String.valueOf(resultadoResta[3][1]));
			            casilla_15_sal.setText(String.valueOf(resultadoResta[3][2]));
			            casilla_16_sal.setText(String.valueOf(resultadoResta[3][3]));

	
			        } else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
			        }			
		    	}
		    	
		    	else {
		    		if (areAllFieldsFilled5x5()) {
		    			System.out.println("Entra a suma");
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	String valor10 = casilla_10_ent.getText();
			        	String valor11 = casilla_11_ent.getText();
			        	String valor12 = casilla_12_ent.getText();
			        	String valor13 = casilla_13_ent.getText();
			        	String valor14 = casilla_14_ent.getText();
			        	String valor15 = casilla_15_ent.getText();
			        	String valor16 = casilla_16_ent.getText();
			        	String valor17 = casilla_17_ent.getText();
			        	String valor18 = casilla_18_ent.getText();
			        	String valor19 = casilla_19_ent.getText();
			        	String valor20 = casilla_20_ent.getText();
			        	String valor21 = casilla_21_ent.getText();
			        	String valor22 = casilla_22_ent.getText();
			        	String valor23 = casilla_23_ent.getText();
			        	String valor24 = casilla_24_ent.getText();
			        	String valor25 = casilla_25_ent.getText();

			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	String valor10_2 = casilla_10_ent_1.getText();
			        	String valor11_2 = casilla_11_ent_1.getText();
			        	String valor12_2 = casilla_12_ent_1.getText();
			        	String valor13_2 = casilla_13_ent_1.getText();
			        	String valor14_2 = casilla_14_ent_1.getText();
			        	String valor15_2 = casilla_15_ent_1.getText();
			        	String valor16_2 = casilla_16_ent_1.getText();
			        	String valor17_2 = casilla_17_ent_1.getText();
			        	String valor18_2 = casilla_18_ent_1.getText();
			        	String valor19_2 = casilla_19_ent_1.getText();
			        	String valor20_2 = casilla_20_ent_1.getText();
			        	String valor21_2 = casilla_21_ent_1.getText();
			        	String valor22_2 = casilla_22_ent_1.getText();
			        	String valor23_2 = casilla_23_ent_1.getText();
			        	String valor24_2 = casilla_24_ent_1.getText();
			        	String valor25_2 = casilla_25_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[5][5];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[0][3] = Integer.parseInt(valor4);
			        	matrizInicialA[0][4] = Integer.parseInt(valor5);
			        	
			        	matrizInicialA[1][0] = Integer.parseInt(valor6);
			        	matrizInicialA[1][1] = Integer.parseInt(valor7);
			        	matrizInicialA[1][2] = Integer.parseInt(valor8);
			        	matrizInicialA[1][3] = Integer.parseInt(valor9);
			        	matrizInicialA[1][4] = Integer.parseInt(valor10);
			        	
			        	matrizInicialA[2][0] = Integer.parseInt(valor11);
			        	matrizInicialA[2][1] = Integer.parseInt(valor12);
			        	matrizInicialA[2][2] = Integer.parseInt(valor13);
			        	matrizInicialA[2][3] = Integer.parseInt(valor14);
			        	matrizInicialA[2][4] = Integer.parseInt(valor15);
			        	
			        	matrizInicialA[3][0] = Integer.parseInt(valor16);
			        	matrizInicialA[3][1] = Integer.parseInt(valor17);
			        	matrizInicialA[3][2] = Integer.parseInt(valor18);
			        	matrizInicialA[3][3] = Integer.parseInt(valor19);
			        	matrizInicialA[3][4] = Integer.parseInt(valor20);
			        	
			        	matrizInicialA[4][0] = Integer.parseInt(valor21);
			        	matrizInicialA[4][1] = Integer.parseInt(valor22);
			        	matrizInicialA[4][2] = Integer.parseInt(valor23);
			        	matrizInicialA[4][3] = Integer.parseInt(valor24);
			        	matrizInicialA[4][4] = Integer.parseInt(valor25);
			        	
			        	
			        		
			        	
			        	int[][] matrizInicialB = new int[5][5];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	matrizInicialB[0][3] = Integer.parseInt(valor4_2);
			        	matrizInicialB[0][4] = Integer.parseInt(valor5_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor6_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor7_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor8_2);
			        	matrizInicialB[1][3] = Integer.parseInt(valor9_2);
			        	matrizInicialB[1][4] = Integer.parseInt(valor10_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor11_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor12_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor13_2);
			        	matrizInicialB[2][3] = Integer.parseInt(valor14_2);
			        	matrizInicialB[2][4] = Integer.parseInt(valor15_2);
			        	
			        	matrizInicialB[3][0] = Integer.parseInt(valor16_2);
			        	matrizInicialB[3][1] = Integer.parseInt(valor17_2);
			        	matrizInicialB[3][2] = Integer.parseInt(valor18_2);
			        	matrizInicialB[3][3] = Integer.parseInt(valor19_2);
			        	matrizInicialB[3][4] = Integer.parseInt(valor20_2);
			        	
			        	matrizInicialB[4][0] = Integer.parseInt(valor21_2);
			        	matrizInicialB[4][1] = Integer.parseInt(valor22_2);
			        	matrizInicialB[4][2] = Integer.parseInt(valor23_2);
			        	matrizInicialB[4][3] = Integer.parseInt(valor24_2);
			        	matrizInicialB[4][4] = Integer.parseInt(valor25_2);
			        	
			        			        			        	
			        	int[][] resultadoResta = MatricesOperacion.calcularResta(matrizInicialA, matrizInicialB);
			        	
			            casilla_1_sal.setText(String.valueOf(resultadoResta[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoResta[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoResta[0][2]));
			            casilla_4_sal.setText(String.valueOf(resultadoResta[0][3]));
			            casilla_5_sal.setText(String.valueOf(resultadoResta[0][4]));
			            
			            casilla_6_sal.setText(String.valueOf(resultadoResta[1][0]));
			            casilla_7_sal.setText(String.valueOf(resultadoResta[1][1]));
			            casilla_8_sal.setText(String.valueOf(resultadoResta[1][2]));
			            casilla_9_sal.setText(String.valueOf(resultadoResta[1][3]));
			            casilla_10_sal.setText(String.valueOf(resultadoResta[1][4]));
			            
			            casilla_11_sal.setText(String.valueOf(resultadoResta[2][0]));
			            casilla_12_sal.setText(String.valueOf(resultadoResta[2][1]));
			            casilla_13_sal.setText(String.valueOf(resultadoResta[2][2]));
			            casilla_14_sal.setText(String.valueOf(resultadoResta[2][3]));
			            casilla_15_sal.setText(String.valueOf(resultadoResta[2][4]));
			            
			            casilla_16_sal.setText(String.valueOf(resultadoResta[3][0]));
			            casilla_17_sal.setText(String.valueOf(resultadoResta[3][1]));
			            casilla_18_sal.setText(String.valueOf(resultadoResta[3][2]));
			            casilla_19_sal.setText(String.valueOf(resultadoResta[3][3]));
			            casilla_20_sal.setText(String.valueOf(resultadoResta[3][4]));
			            
			            casilla_21_sal.setText(String.valueOf(resultadoResta[4][0]));
			            casilla_22_sal.setText(String.valueOf(resultadoResta[4][1]));
			            casilla_23_sal.setText(String.valueOf(resultadoResta[4][2]));
			            casilla_24_sal.setText(String.valueOf(resultadoResta[4][3]));
			            casilla_25_sal.setText(String.valueOf(resultadoResta[4][4]));
			    			
		    		}
		    		
		    		else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");		    			
		    		}		    		
		    	}
		    	
		        
		    }

		    private boolean areAllFieldsFilled3x3() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty();
		               	
		    }
		    
		    private boolean areAllFieldsFilled4x4() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_10_ent.getText().isEmpty() && 
		               !casilla_11_ent.getText().isEmpty() && 
		               !casilla_12_ent.getText().isEmpty() && 
		               !casilla_13_ent.getText().isEmpty() && 
		               !casilla_14_ent.getText().isEmpty() && 
		               !casilla_15_ent.getText().isEmpty() && 
		               !casilla_16_ent.getText().isEmpty() && 
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty() &&
		               !casilla_10_ent_1.getText().isEmpty() && 
		               !casilla_11_ent_1.getText().isEmpty() && 
		               !casilla_12_ent_1.getText().isEmpty() && 
		               !casilla_13_ent_1.getText().isEmpty() && 
		               !casilla_14_ent_1.getText().isEmpty() && 
		               !casilla_15_ent_1.getText().isEmpty() && 
		               !casilla_16_ent_1.getText().isEmpty();
		               	
		    }
		    
		    private boolean areAllFieldsFilled5x5() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_10_ent.getText().isEmpty() && 
		               !casilla_11_ent.getText().isEmpty() && 
		               !casilla_12_ent.getText().isEmpty() && 
		               !casilla_13_ent.getText().isEmpty() && 
		               !casilla_14_ent.getText().isEmpty() && 
		               !casilla_15_ent.getText().isEmpty() && 
		               !casilla_16_ent.getText().isEmpty() && 
		               !casilla_17_ent.getText().isEmpty() && 
		               !casilla_18_ent.getText().isEmpty() && 
		               !casilla_19_ent.getText().isEmpty() && 
		               !casilla_20_ent.getText().isEmpty() && 
		               !casilla_21_ent.getText().isEmpty() && 
		               !casilla_22_ent.getText().isEmpty() && 
		               !casilla_23_ent.getText().isEmpty() && 
		               !casilla_24_ent.getText().isEmpty() && 
		               !casilla_25_ent.getText().isEmpty() &&
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty() &&
		               !casilla_10_ent_1.getText().isEmpty() && 
		               !casilla_11_ent_1.getText().isEmpty() && 
		               !casilla_12_ent_1.getText().isEmpty() && 
		               !casilla_13_ent_1.getText().isEmpty() && 
		               !casilla_14_ent_1.getText().isEmpty() && 
		               !casilla_15_ent_1.getText().isEmpty() && 
		               !casilla_16_ent_1.getText().isEmpty() &&
		               !casilla_17_ent_1.getText().isEmpty() && 
		               !casilla_18_ent_1.getText().isEmpty() && 
		               !casilla_19_ent_1.getText().isEmpty() && 
		               !casilla_20_ent_1.getText().isEmpty() && 
		               !casilla_21_ent_1.getText().isEmpty() && 
		               !casilla_22_ent_1.getText().isEmpty() && 
		               !casilla_23_ent_1.getText().isEmpty() && 
		               !casilla_24_ent_1.getText().isEmpty() && 
		               !casilla_25_ent_1.getText().isEmpty();
		               	
		    }
		});
	
		calc_multiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		    	if(spinnerValor == 3) {
		    		if (areAllFieldsFilled3x3()) {
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[3][3];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[1][0] = Integer.parseInt(valor4);
			        	matrizInicialA[1][1] = Integer.parseInt(valor5);
			        	matrizInicialA[1][2] = Integer.parseInt(valor6);
			        	matrizInicialA[2][0] = Integer.parseInt(valor7);
			        	matrizInicialA[2][1] = Integer.parseInt(valor8);
			        	matrizInicialA[2][2] = Integer.parseInt(valor9);
			        	
			        	int[][] matrizInicialB = new int[3][3];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor4_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor5_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor6_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor7_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor8_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor9_2);
			        			        			        	
			        	int[][] resultadoMultiplicacion = MatricesOperacion.calcularMultiplicacion(matrizInicialA, matrizInicialB);
	        	     	
			            casilla_1_sal.setText(String.valueOf(resultadoMultiplicacion[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoMultiplicacion[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoMultiplicacion[0][2]));
			            
			            casilla_4_sal.setText(String.valueOf(resultadoMultiplicacion[1][0]));
			            casilla_5_sal.setText(String.valueOf(resultadoMultiplicacion[1][1]));
			            casilla_6_sal.setText(String.valueOf(resultadoMultiplicacion[1][2]));
			            
			            casilla_7_sal.setText(String.valueOf(resultadoMultiplicacion[2][0]));
			            casilla_8_sal.setText(String.valueOf(resultadoMultiplicacion[2][1]));
			            casilla_9_sal.setText(String.valueOf(resultadoMultiplicacion[2][2]));
	
			        } else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
			        }		    			
		    	}
		    	
		    	else if(spinnerValor == 4) {
		    		if (areAllFieldsFilled4x4()) {
		    			
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	String valor10 = casilla_10_ent.getText();
			        	String valor11 = casilla_11_ent.getText();
			        	String valor12 = casilla_12_ent.getText();
			        	String valor13 = casilla_13_ent.getText();
			        	String valor14 = casilla_14_ent.getText();
			        	String valor15 = casilla_15_ent.getText();
			        	String valor16 = casilla_16_ent.getText();

			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	String valor10_2 = casilla_10_ent_1.getText();
			        	String valor11_2 = casilla_11_ent_1.getText();
			        	String valor12_2 = casilla_12_ent_1.getText();
			        	String valor13_2 = casilla_13_ent_1.getText();
			        	String valor14_2 = casilla_14_ent_1.getText();
			        	String valor15_2 = casilla_15_ent_1.getText();
			        	String valor16_2 = casilla_16_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[4][4];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[0][3] = Integer.parseInt(valor4);
			        	
			        	matrizInicialA[1][0] = Integer.parseInt(valor5);
			        	matrizInicialA[1][1] = Integer.parseInt(valor6);
			        	matrizInicialA[1][2] = Integer.parseInt(valor7);
			        	matrizInicialA[1][3] = Integer.parseInt(valor8);
			        	
			        	matrizInicialA[2][0] = Integer.parseInt(valor9);
			        	matrizInicialA[2][1] = Integer.parseInt(valor10);
			        	matrizInicialA[2][2] = Integer.parseInt(valor11);
			        	matrizInicialA[2][3] = Integer.parseInt(valor12);
			        	
			        	matrizInicialA[3][0] = Integer.parseInt(valor13);
			        	matrizInicialA[3][1] = Integer.parseInt(valor14);
			        	matrizInicialA[3][2] = Integer.parseInt(valor15);
			        	matrizInicialA[3][3] = Integer.parseInt(valor16);
	
			        	
			        	int[][] matrizInicialB = new int[4][4];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	matrizInicialB[0][3] = Integer.parseInt(valor4_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor5_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor6_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor7_2);
			        	matrizInicialB[1][3] = Integer.parseInt(valor8_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor9_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor10_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor11_2);
			        	matrizInicialB[2][3] = Integer.parseInt(valor12_2);
			        	
			        	matrizInicialB[3][0] = Integer.parseInt(valor13_2);
			        	matrizInicialB[3][1] = Integer.parseInt(valor14_2);
			        	matrizInicialB[3][2] = Integer.parseInt(valor15_2);
			        	matrizInicialB[3][3] = Integer.parseInt(valor16_2);

			        			        			        	
			        	int[][] resultadoMultiplicacion = MatricesOperacion.calcularMultiplicacion(matrizInicialA, matrizInicialB);
			        	
			            casilla_1_sal.setText(String.valueOf(resultadoMultiplicacion[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoMultiplicacion[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoMultiplicacion[0][2]));
			            casilla_4_sal.setText(String.valueOf(resultadoMultiplicacion[0][3]));
			            
			            casilla_5_sal.setText(String.valueOf(resultadoMultiplicacion[1][0]));
			            casilla_6_sal.setText(String.valueOf(resultadoMultiplicacion[1][1]));
			            casilla_7_sal.setText(String.valueOf(resultadoMultiplicacion[1][2]));
			            casilla_8_sal.setText(String.valueOf(resultadoMultiplicacion[1][3]));
			            
			            casilla_9_sal.setText(String.valueOf(resultadoMultiplicacion[2][0]));
			            casilla_10_sal.setText(String.valueOf(resultadoMultiplicacion[2][1]));
			            casilla_11_sal.setText(String.valueOf(resultadoMultiplicacion[2][2]));
			            casilla_12_sal.setText(String.valueOf(resultadoMultiplicacion[2][3]));
			            
			            casilla_13_sal.setText(String.valueOf(resultadoMultiplicacion[3][0]));
			            casilla_14_sal.setText(String.valueOf(resultadoMultiplicacion[3][1]));
			            casilla_15_sal.setText(String.valueOf(resultadoMultiplicacion[3][2]));
			            casilla_16_sal.setText(String.valueOf(resultadoMultiplicacion[3][3]));

	
			        } else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
			        }			
		    	}
		    	
		    	else {
		    		if (areAllFieldsFilled5x5()) {
		    			System.out.println("Entra a suma");
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	String valor10 = casilla_10_ent.getText();
			        	String valor11 = casilla_11_ent.getText();
			        	String valor12 = casilla_12_ent.getText();
			        	String valor13 = casilla_13_ent.getText();
			        	String valor14 = casilla_14_ent.getText();
			        	String valor15 = casilla_15_ent.getText();
			        	String valor16 = casilla_16_ent.getText();
			        	String valor17 = casilla_17_ent.getText();
			        	String valor18 = casilla_18_ent.getText();
			        	String valor19 = casilla_19_ent.getText();
			        	String valor20 = casilla_20_ent.getText();
			        	String valor21 = casilla_21_ent.getText();
			        	String valor22 = casilla_22_ent.getText();
			        	String valor23 = casilla_23_ent.getText();
			        	String valor24 = casilla_24_ent.getText();
			        	String valor25 = casilla_25_ent.getText();

			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	String valor10_2 = casilla_10_ent_1.getText();
			        	String valor11_2 = casilla_11_ent_1.getText();
			        	String valor12_2 = casilla_12_ent_1.getText();
			        	String valor13_2 = casilla_13_ent_1.getText();
			        	String valor14_2 = casilla_14_ent_1.getText();
			        	String valor15_2 = casilla_15_ent_1.getText();
			        	String valor16_2 = casilla_16_ent_1.getText();
			        	String valor17_2 = casilla_17_ent_1.getText();
			        	String valor18_2 = casilla_18_ent_1.getText();
			        	String valor19_2 = casilla_19_ent_1.getText();
			        	String valor20_2 = casilla_20_ent_1.getText();
			        	String valor21_2 = casilla_21_ent_1.getText();
			        	String valor22_2 = casilla_22_ent_1.getText();
			        	String valor23_2 = casilla_23_ent_1.getText();
			        	String valor24_2 = casilla_24_ent_1.getText();
			        	String valor25_2 = casilla_25_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[5][5];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[0][3] = Integer.parseInt(valor4);
			        	matrizInicialA[0][4] = Integer.parseInt(valor5);
			        	
			        	matrizInicialA[1][0] = Integer.parseInt(valor6);
			        	matrizInicialA[1][1] = Integer.parseInt(valor7);
			        	matrizInicialA[1][2] = Integer.parseInt(valor8);
			        	matrizInicialA[1][3] = Integer.parseInt(valor9);
			        	matrizInicialA[1][4] = Integer.parseInt(valor10);
			        	
			        	matrizInicialA[2][0] = Integer.parseInt(valor11);
			        	matrizInicialA[2][1] = Integer.parseInt(valor12);
			        	matrizInicialA[2][2] = Integer.parseInt(valor13);
			        	matrizInicialA[2][3] = Integer.parseInt(valor14);
			        	matrizInicialA[2][4] = Integer.parseInt(valor15);
			        	
			        	matrizInicialA[3][0] = Integer.parseInt(valor16);
			        	matrizInicialA[3][1] = Integer.parseInt(valor17);
			        	matrizInicialA[3][2] = Integer.parseInt(valor18);
			        	matrizInicialA[3][3] = Integer.parseInt(valor19);
			        	matrizInicialA[3][4] = Integer.parseInt(valor20);
			        	
			        	matrizInicialA[4][0] = Integer.parseInt(valor21);
			        	matrizInicialA[4][1] = Integer.parseInt(valor22);
			        	matrizInicialA[4][2] = Integer.parseInt(valor23);
			        	matrizInicialA[4][3] = Integer.parseInt(valor24);
			        	matrizInicialA[4][4] = Integer.parseInt(valor25);
			        	
			        	
			        		
			        	
			        	int[][] matrizInicialB = new int[5][5];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	matrizInicialB[0][3] = Integer.parseInt(valor4_2);
			        	matrizInicialB[0][4] = Integer.parseInt(valor5_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor6_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor7_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor8_2);
			        	matrizInicialB[1][3] = Integer.parseInt(valor9_2);
			        	matrizInicialB[1][4] = Integer.parseInt(valor10_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor11_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor12_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor13_2);
			        	matrizInicialB[2][3] = Integer.parseInt(valor14_2);
			        	matrizInicialB[2][4] = Integer.parseInt(valor15_2);
			        	
			        	matrizInicialB[3][0] = Integer.parseInt(valor16_2);
			        	matrizInicialB[3][1] = Integer.parseInt(valor17_2);
			        	matrizInicialB[3][2] = Integer.parseInt(valor18_2);
			        	matrizInicialB[3][3] = Integer.parseInt(valor19_2);
			        	matrizInicialB[3][4] = Integer.parseInt(valor20_2);
			        	
			        	matrizInicialB[4][0] = Integer.parseInt(valor21_2);
			        	matrizInicialB[4][1] = Integer.parseInt(valor22_2);
			        	matrizInicialB[4][2] = Integer.parseInt(valor23_2);
			        	matrizInicialB[4][3] = Integer.parseInt(valor24_2);
			        	matrizInicialB[4][4] = Integer.parseInt(valor25_2);
			        	
			        			        			        	
			        	int[][] resultadoMultiplicacion = MatricesOperacion.calcularMultiplicacion(matrizInicialA, matrizInicialB);
			        	
			            casilla_1_sal.setText(String.valueOf(resultadoMultiplicacion[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoMultiplicacion[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoMultiplicacion[0][2]));
			            casilla_4_sal.setText(String.valueOf(resultadoMultiplicacion[0][3]));
			            casilla_5_sal.setText(String.valueOf(resultadoMultiplicacion[0][4]));
			            
			            casilla_6_sal.setText(String.valueOf(resultadoMultiplicacion[1][0]));
			            casilla_7_sal.setText(String.valueOf(resultadoMultiplicacion[1][1]));
			            casilla_8_sal.setText(String.valueOf(resultadoMultiplicacion[1][2]));
			            casilla_9_sal.setText(String.valueOf(resultadoMultiplicacion[1][3]));
			            casilla_10_sal.setText(String.valueOf(resultadoMultiplicacion[1][4]));
			            
			            casilla_11_sal.setText(String.valueOf(resultadoMultiplicacion[2][0]));
			            casilla_12_sal.setText(String.valueOf(resultadoMultiplicacion[2][1]));
			            casilla_13_sal.setText(String.valueOf(resultadoMultiplicacion[2][2]));
			            casilla_14_sal.setText(String.valueOf(resultadoMultiplicacion[2][3]));
			            casilla_15_sal.setText(String.valueOf(resultadoMultiplicacion[2][4]));
			            
			            casilla_16_sal.setText(String.valueOf(resultadoMultiplicacion[3][0]));
			            casilla_17_sal.setText(String.valueOf(resultadoMultiplicacion[3][1]));
			            casilla_18_sal.setText(String.valueOf(resultadoMultiplicacion[3][2]));
			            casilla_19_sal.setText(String.valueOf(resultadoMultiplicacion[3][3]));
			            casilla_20_sal.setText(String.valueOf(resultadoMultiplicacion[3][4]));
			            
			            casilla_21_sal.setText(String.valueOf(resultadoMultiplicacion[4][0]));
			            casilla_22_sal.setText(String.valueOf(resultadoMultiplicacion[4][1]));
			            casilla_23_sal.setText(String.valueOf(resultadoMultiplicacion[4][2]));
			            casilla_24_sal.setText(String.valueOf(resultadoMultiplicacion[4][3]));
			            casilla_25_sal.setText(String.valueOf(resultadoMultiplicacion[4][4]));
			    			
		    		}
		    		
		    		else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");		    			
		    		}		    		
		    	}
		    	
		        
		    }	

		    private boolean areAllFieldsFilled3x3() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty();
		               	
		    }
		    
		    private boolean areAllFieldsFilled4x4() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_10_ent.getText().isEmpty() && 
		               !casilla_11_ent.getText().isEmpty() && 
		               !casilla_12_ent.getText().isEmpty() && 
		               !casilla_13_ent.getText().isEmpty() && 
		               !casilla_14_ent.getText().isEmpty() && 
		               !casilla_15_ent.getText().isEmpty() && 
		               !casilla_16_ent.getText().isEmpty() && 
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty() &&
		               !casilla_10_ent_1.getText().isEmpty() && 
		               !casilla_11_ent_1.getText().isEmpty() && 
		               !casilla_12_ent_1.getText().isEmpty() && 
		               !casilla_13_ent_1.getText().isEmpty() && 
		               !casilla_14_ent_1.getText().isEmpty() && 
		               !casilla_15_ent_1.getText().isEmpty() && 
		               !casilla_16_ent_1.getText().isEmpty();
		               	
		    }
		    
		    private boolean areAllFieldsFilled5x5() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_10_ent.getText().isEmpty() && 
		               !casilla_11_ent.getText().isEmpty() && 
		               !casilla_12_ent.getText().isEmpty() && 
		               !casilla_13_ent.getText().isEmpty() && 
		               !casilla_14_ent.getText().isEmpty() && 
		               !casilla_15_ent.getText().isEmpty() && 
		               !casilla_16_ent.getText().isEmpty() && 
		               !casilla_17_ent.getText().isEmpty() && 
		               !casilla_18_ent.getText().isEmpty() && 
		               !casilla_19_ent.getText().isEmpty() && 
		               !casilla_20_ent.getText().isEmpty() && 
		               !casilla_21_ent.getText().isEmpty() && 
		               !casilla_22_ent.getText().isEmpty() && 
		               !casilla_23_ent.getText().isEmpty() && 
		               !casilla_24_ent.getText().isEmpty() && 
		               !casilla_25_ent.getText().isEmpty() &&
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty() &&
		               !casilla_10_ent_1.getText().isEmpty() && 
		               !casilla_11_ent_1.getText().isEmpty() && 
		               !casilla_12_ent_1.getText().isEmpty() && 
		               !casilla_13_ent_1.getText().isEmpty() && 
		               !casilla_14_ent_1.getText().isEmpty() && 
		               !casilla_15_ent_1.getText().isEmpty() && 
		               !casilla_16_ent_1.getText().isEmpty() &&
		               !casilla_17_ent_1.getText().isEmpty() && 
		               !casilla_18_ent_1.getText().isEmpty() && 
		               !casilla_19_ent_1.getText().isEmpty() && 
		               !casilla_20_ent_1.getText().isEmpty() && 
		               !casilla_21_ent_1.getText().isEmpty() && 
		               !casilla_22_ent_1.getText().isEmpty() && 
		               !casilla_23_ent_1.getText().isEmpty() && 
		               !casilla_24_ent_1.getText().isEmpty() && 
		               !casilla_25_ent_1.getText().isEmpty();
		               	
		    }
		});

		calc_division.addMouseListener(new java.awt.event.MouseAdapter() {

		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		    	if(spinnerValor == 3) {
		    		if (areAllFieldsFilled3x3()) {
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[3][3];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[1][0] = Integer.parseInt(valor4);
			        	matrizInicialA[1][1] = Integer.parseInt(valor5);
			        	matrizInicialA[1][2] = Integer.parseInt(valor6);
			        	matrizInicialA[2][0] = Integer.parseInt(valor7);
			        	matrizInicialA[2][1] = Integer.parseInt(valor8);
			        	matrizInicialA[2][2] = Integer.parseInt(valor9);
			        	
			        	int[][] matrizInicialB = new int[3][3];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor4_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor5_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor6_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor7_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor8_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor9_2);
			        			        			        	
			        	String[][] resultadoMultiplicacion = MatricesOperacion.calcularDivision(matrizInicialA, matrizInicialB);
	        	     	
			            casilla_1_sal.setText(String.valueOf(resultadoMultiplicacion[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoMultiplicacion[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoMultiplicacion[0][2]));
			            
			            casilla_4_sal.setText(String.valueOf(resultadoMultiplicacion[1][0]));
			            casilla_5_sal.setText(String.valueOf(resultadoMultiplicacion[1][1]));
			            casilla_6_sal.setText(String.valueOf(resultadoMultiplicacion[1][2]));
			            
			            casilla_7_sal.setText(String.valueOf(resultadoMultiplicacion[2][0]));
			            casilla_8_sal.setText(String.valueOf(resultadoMultiplicacion[2][1]));
			            casilla_9_sal.setText(String.valueOf(resultadoMultiplicacion[2][2]));
	
			        } else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
			        }		    			
		    	}
		    	
		    	else if(spinnerValor == 4) {
		    		if (areAllFieldsFilled4x4()) {
		    			
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	String valor10 = casilla_10_ent.getText();
			        	String valor11 = casilla_11_ent.getText();
			        	String valor12 = casilla_12_ent.getText();
			        	String valor13 = casilla_13_ent.getText();
			        	String valor14 = casilla_14_ent.getText();
			        	String valor15 = casilla_15_ent.getText();
			        	String valor16 = casilla_16_ent.getText();

			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	String valor10_2 = casilla_10_ent_1.getText();
			        	String valor11_2 = casilla_11_ent_1.getText();
			        	String valor12_2 = casilla_12_ent_1.getText();
			        	String valor13_2 = casilla_13_ent_1.getText();
			        	String valor14_2 = casilla_14_ent_1.getText();
			        	String valor15_2 = casilla_15_ent_1.getText();
			        	String valor16_2 = casilla_16_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[4][4];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[0][3] = Integer.parseInt(valor4);
			        	
			        	matrizInicialA[1][0] = Integer.parseInt(valor5);
			        	matrizInicialA[1][1] = Integer.parseInt(valor6);
			        	matrizInicialA[1][2] = Integer.parseInt(valor7);
			        	matrizInicialA[1][3] = Integer.parseInt(valor8);
			        	
			        	matrizInicialA[2][0] = Integer.parseInt(valor9);
			        	matrizInicialA[2][1] = Integer.parseInt(valor10);
			        	matrizInicialA[2][2] = Integer.parseInt(valor11);
			        	matrizInicialA[2][3] = Integer.parseInt(valor12);
			        	
			        	matrizInicialA[3][0] = Integer.parseInt(valor13);
			        	matrizInicialA[3][1] = Integer.parseInt(valor14);
			        	matrizInicialA[3][2] = Integer.parseInt(valor15);
			        	matrizInicialA[3][3] = Integer.parseInt(valor16);
	
			        	
			        	int[][] matrizInicialB = new int[4][4];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	matrizInicialB[0][3] = Integer.parseInt(valor4_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor5_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor6_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor7_2);
			        	matrizInicialB[1][3] = Integer.parseInt(valor8_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor9_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor10_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor11_2);
			        	matrizInicialB[2][3] = Integer.parseInt(valor12_2);
			        	
			        	matrizInicialB[3][0] = Integer.parseInt(valor13_2);
			        	matrizInicialB[3][1] = Integer.parseInt(valor14_2);
			        	matrizInicialB[3][2] = Integer.parseInt(valor15_2);
			        	matrizInicialB[3][3] = Integer.parseInt(valor16_2);

			        			        			        	
			        	String[][] resultadoMultiplicacion = MatricesOperacion.calcularDivision(matrizInicialA, matrizInicialB);
			        	
			            casilla_1_sal.setText(String.valueOf(resultadoMultiplicacion[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoMultiplicacion[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoMultiplicacion[0][2]));
			            casilla_4_sal.setText(String.valueOf(resultadoMultiplicacion[0][3]));
			            
			            casilla_5_sal.setText(String.valueOf(resultadoMultiplicacion[1][0]));
			            casilla_6_sal.setText(String.valueOf(resultadoMultiplicacion[1][1]));
			            casilla_7_sal.setText(String.valueOf(resultadoMultiplicacion[1][2]));
			            casilla_8_sal.setText(String.valueOf(resultadoMultiplicacion[1][3]));
			            
			            casilla_9_sal.setText(String.valueOf(resultadoMultiplicacion[2][0]));
			            casilla_10_sal.setText(String.valueOf(resultadoMultiplicacion[2][1]));
			            casilla_11_sal.setText(String.valueOf(resultadoMultiplicacion[2][2]));
			            casilla_12_sal.setText(String.valueOf(resultadoMultiplicacion[2][3]));
			            
			            casilla_13_sal.setText(String.valueOf(resultadoMultiplicacion[3][0]));
			            casilla_14_sal.setText(String.valueOf(resultadoMultiplicacion[3][1]));
			            casilla_15_sal.setText(String.valueOf(resultadoMultiplicacion[3][2]));
			            casilla_16_sal.setText(String.valueOf(resultadoMultiplicacion[3][3]));

	
			        } else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
			        }			
		    	}
		    	
		    	else {
		    		if (areAllFieldsFilled5x5()) {
		    			System.out.println("Entra a suma");
			        	String valor1 = casilla_1_ent.getText();
			        	String valor2 = casilla_2_ent.getText();
			        	String valor3 = casilla_3_ent.getText();
			        	String valor4 = casilla_4_ent.getText();
			        	String valor5 = casilla_5_ent.getText();
			        	String valor6 = casilla_6_ent.getText();
			        	String valor7 = casilla_7_ent.getText();
			        	String valor8 = casilla_8_ent.getText();
			        	String valor9 = casilla_9_ent.getText();
			        	String valor10 = casilla_10_ent.getText();
			        	String valor11 = casilla_11_ent.getText();
			        	String valor12 = casilla_12_ent.getText();
			        	String valor13 = casilla_13_ent.getText();
			        	String valor14 = casilla_14_ent.getText();
			        	String valor15 = casilla_15_ent.getText();
			        	String valor16 = casilla_16_ent.getText();
			        	String valor17 = casilla_17_ent.getText();
			        	String valor18 = casilla_18_ent.getText();
			        	String valor19 = casilla_19_ent.getText();
			        	String valor20 = casilla_20_ent.getText();
			        	String valor21 = casilla_21_ent.getText();
			        	String valor22 = casilla_22_ent.getText();
			        	String valor23 = casilla_23_ent.getText();
			        	String valor24 = casilla_24_ent.getText();
			        	String valor25 = casilla_25_ent.getText();

			        	
			        	String valor1_2 = casilla_1_ent_1.getText();
			        	String valor2_2 = casilla_2_ent_1.getText();
			        	String valor3_2 = casilla_3_ent_1.getText();
			        	String valor4_2 = casilla_4_ent_1.getText();
			        	String valor5_2 = casilla_5_ent_1.getText();
			        	String valor6_2 = casilla_6_ent_1.getText();
			        	String valor7_2 = casilla_7_ent_1.getText();
			        	String valor8_2 = casilla_8_ent_1.getText();
			        	String valor9_2 = casilla_9_ent_1.getText();
			        	String valor10_2 = casilla_10_ent_1.getText();
			        	String valor11_2 = casilla_11_ent_1.getText();
			        	String valor12_2 = casilla_12_ent_1.getText();
			        	String valor13_2 = casilla_13_ent_1.getText();
			        	String valor14_2 = casilla_14_ent_1.getText();
			        	String valor15_2 = casilla_15_ent_1.getText();
			        	String valor16_2 = casilla_16_ent_1.getText();
			        	String valor17_2 = casilla_17_ent_1.getText();
			        	String valor18_2 = casilla_18_ent_1.getText();
			        	String valor19_2 = casilla_19_ent_1.getText();
			        	String valor20_2 = casilla_20_ent_1.getText();
			        	String valor21_2 = casilla_21_ent_1.getText();
			        	String valor22_2 = casilla_22_ent_1.getText();
			        	String valor23_2 = casilla_23_ent_1.getText();
			        	String valor24_2 = casilla_24_ent_1.getText();
			        	String valor25_2 = casilla_25_ent_1.getText();
			        	
			        	int[][] matrizInicialA = new int[5][5];
			        	matrizInicialA[0][0] = Integer.parseInt(valor1);
			        	matrizInicialA[0][1] = Integer.parseInt(valor2);
			        	matrizInicialA[0][2] = Integer.parseInt(valor3);
			        	matrizInicialA[0][3] = Integer.parseInt(valor4);
			        	matrizInicialA[0][4] = Integer.parseInt(valor5);
			        	
			        	matrizInicialA[1][0] = Integer.parseInt(valor6);
			        	matrizInicialA[1][1] = Integer.parseInt(valor7);
			        	matrizInicialA[1][2] = Integer.parseInt(valor8);
			        	matrizInicialA[1][3] = Integer.parseInt(valor9);
			        	matrizInicialA[1][4] = Integer.parseInt(valor10);
			        	
			        	matrizInicialA[2][0] = Integer.parseInt(valor11);
			        	matrizInicialA[2][1] = Integer.parseInt(valor12);
			        	matrizInicialA[2][2] = Integer.parseInt(valor13);
			        	matrizInicialA[2][3] = Integer.parseInt(valor14);
			        	matrizInicialA[2][4] = Integer.parseInt(valor15);
			        	
			        	matrizInicialA[3][0] = Integer.parseInt(valor16);
			        	matrizInicialA[3][1] = Integer.parseInt(valor17);
			        	matrizInicialA[3][2] = Integer.parseInt(valor18);
			        	matrizInicialA[3][3] = Integer.parseInt(valor19);
			        	matrizInicialA[3][4] = Integer.parseInt(valor20);
			        	
			        	matrizInicialA[4][0] = Integer.parseInt(valor21);
			        	matrizInicialA[4][1] = Integer.parseInt(valor22);
			        	matrizInicialA[4][2] = Integer.parseInt(valor23);
			        	matrizInicialA[4][3] = Integer.parseInt(valor24);
			        	matrizInicialA[4][4] = Integer.parseInt(valor25);
			        	
			        	
			        		
			        	
			        	int[][] matrizInicialB = new int[5][5];
			        	matrizInicialB[0][0] = Integer.parseInt(valor1_2);
			        	matrizInicialB[0][1] = Integer.parseInt(valor2_2);
			        	matrizInicialB[0][2] = Integer.parseInt(valor3_2);
			        	matrizInicialB[0][3] = Integer.parseInt(valor4_2);
			        	matrizInicialB[0][4] = Integer.parseInt(valor5_2);
			        	
			        	matrizInicialB[1][0] = Integer.parseInt(valor6_2);
			        	matrizInicialB[1][1] = Integer.parseInt(valor7_2);
			        	matrizInicialB[1][2] = Integer.parseInt(valor8_2);
			        	matrizInicialB[1][3] = Integer.parseInt(valor9_2);
			        	matrizInicialB[1][4] = Integer.parseInt(valor10_2);
			        	
			        	matrizInicialB[2][0] = Integer.parseInt(valor11_2);
			        	matrizInicialB[2][1] = Integer.parseInt(valor12_2);
			        	matrizInicialB[2][2] = Integer.parseInt(valor13_2);
			        	matrizInicialB[2][3] = Integer.parseInt(valor14_2);
			        	matrizInicialB[2][4] = Integer.parseInt(valor15_2);
			        	
			        	matrizInicialB[3][0] = Integer.parseInt(valor16_2);
			        	matrizInicialB[3][1] = Integer.parseInt(valor17_2);
			        	matrizInicialB[3][2] = Integer.parseInt(valor18_2);
			        	matrizInicialB[3][3] = Integer.parseInt(valor19_2);
			        	matrizInicialB[3][4] = Integer.parseInt(valor20_2);
			        	
			        	matrizInicialB[4][0] = Integer.parseInt(valor21_2);
			        	matrizInicialB[4][1] = Integer.parseInt(valor22_2);
			        	matrizInicialB[4][2] = Integer.parseInt(valor23_2);
			        	matrizInicialB[4][3] = Integer.parseInt(valor24_2);
			        	matrizInicialB[4][4] = Integer.parseInt(valor25_2);
			        	
			        			        			        	
			        	String[][] resultadoMultiplicacion = MatricesOperacion.calcularDivision(matrizInicialA, matrizInicialB);
			        	
			            casilla_1_sal.setText(String.valueOf(resultadoMultiplicacion[0][0]));
			            casilla_2_sal.setText(String.valueOf(resultadoMultiplicacion[0][1]));
			            casilla_3_sal.setText(String.valueOf(resultadoMultiplicacion[0][2]));
			            casilla_4_sal.setText(String.valueOf(resultadoMultiplicacion[0][3]));
			            casilla_5_sal.setText(String.valueOf(resultadoMultiplicacion[0][4]));
			            
			            casilla_6_sal.setText(String.valueOf(resultadoMultiplicacion[1][0]));
			            casilla_7_sal.setText(String.valueOf(resultadoMultiplicacion[1][1]));
			            casilla_8_sal.setText(String.valueOf(resultadoMultiplicacion[1][2]));
			            casilla_9_sal.setText(String.valueOf(resultadoMultiplicacion[1][3]));
			            casilla_10_sal.setText(String.valueOf(resultadoMultiplicacion[1][4]));
			            
			            casilla_11_sal.setText(String.valueOf(resultadoMultiplicacion[2][0]));
			            casilla_12_sal.setText(String.valueOf(resultadoMultiplicacion[2][1]));
			            casilla_13_sal.setText(String.valueOf(resultadoMultiplicacion[2][2]));
			            casilla_14_sal.setText(String.valueOf(resultadoMultiplicacion[2][3]));
			            casilla_15_sal.setText(String.valueOf(resultadoMultiplicacion[2][4]));
			            
			            casilla_16_sal.setText(String.valueOf(resultadoMultiplicacion[3][0]));
			            casilla_17_sal.setText(String.valueOf(resultadoMultiplicacion[3][1]));
			            casilla_18_sal.setText(String.valueOf(resultadoMultiplicacion[3][2]));
			            casilla_19_sal.setText(String.valueOf(resultadoMultiplicacion[3][3]));
			            casilla_20_sal.setText(String.valueOf(resultadoMultiplicacion[3][4]));
			            
			            casilla_21_sal.setText(String.valueOf(resultadoMultiplicacion[4][0]));
			            casilla_22_sal.setText(String.valueOf(resultadoMultiplicacion[4][1]));
			            casilla_23_sal.setText(String.valueOf(resultadoMultiplicacion[4][2]));
			            casilla_24_sal.setText(String.valueOf(resultadoMultiplicacion[4][3]));
			            casilla_25_sal.setText(String.valueOf(resultadoMultiplicacion[4][4]));
			    			
		    		}
		    		
		    		else {
			            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");		    			
		    		}		    		
		    	}
		    	
		        
		    }	
			
		    private boolean areAllFieldsFilled3x3() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty();
		               	
		    }
		    
		    private boolean areAllFieldsFilled4x4() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_10_ent.getText().isEmpty() && 
		               !casilla_11_ent.getText().isEmpty() && 
		               !casilla_12_ent.getText().isEmpty() && 
		               !casilla_13_ent.getText().isEmpty() && 
		               !casilla_14_ent.getText().isEmpty() && 
		               !casilla_15_ent.getText().isEmpty() && 
		               !casilla_16_ent.getText().isEmpty() && 
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty() &&
		               !casilla_10_ent_1.getText().isEmpty() && 
		               !casilla_11_ent_1.getText().isEmpty() && 
		               !casilla_12_ent_1.getText().isEmpty() && 
		               !casilla_13_ent_1.getText().isEmpty() && 
		               !casilla_14_ent_1.getText().isEmpty() && 
		               !casilla_15_ent_1.getText().isEmpty() && 
		               !casilla_16_ent_1.getText().isEmpty();
		               	
		    }
		    
		    private boolean areAllFieldsFilled5x5() {
		        return !casilla_1_ent.getText().isEmpty() && 
		               !casilla_2_ent.getText().isEmpty() && 
		               !casilla_3_ent.getText().isEmpty() && 
		               !casilla_4_ent.getText().isEmpty() && 
		               !casilla_5_ent.getText().isEmpty() && 
		               !casilla_6_ent.getText().isEmpty() && 
		               !casilla_7_ent.getText().isEmpty() && 
		               !casilla_8_ent.getText().isEmpty() && 
		               !casilla_9_ent.getText().isEmpty() &&
		               !casilla_10_ent.getText().isEmpty() && 
		               !casilla_11_ent.getText().isEmpty() && 
		               !casilla_12_ent.getText().isEmpty() && 
		               !casilla_13_ent.getText().isEmpty() && 
		               !casilla_14_ent.getText().isEmpty() && 
		               !casilla_15_ent.getText().isEmpty() && 
		               !casilla_16_ent.getText().isEmpty() && 
		               !casilla_17_ent.getText().isEmpty() && 
		               !casilla_18_ent.getText().isEmpty() && 
		               !casilla_19_ent.getText().isEmpty() && 
		               !casilla_20_ent.getText().isEmpty() && 
		               !casilla_21_ent.getText().isEmpty() && 
		               !casilla_22_ent.getText().isEmpty() && 
		               !casilla_23_ent.getText().isEmpty() && 
		               !casilla_24_ent.getText().isEmpty() && 
		               !casilla_25_ent.getText().isEmpty() &&
		               !casilla_1_ent_1.getText().isEmpty() && 
		               !casilla_2_ent_1.getText().isEmpty() && 
		               !casilla_3_ent_1.getText().isEmpty() && 
		               !casilla_4_ent_1.getText().isEmpty() && 
		               !casilla_5_ent_1.getText().isEmpty() && 
		               !casilla_6_ent_1.getText().isEmpty() && 
		               !casilla_7_ent_1.getText().isEmpty() && 
		               !casilla_8_ent_1.getText().isEmpty() && 
		               !casilla_9_ent_1.getText().isEmpty() &&
		               !casilla_10_ent_1.getText().isEmpty() && 
		               !casilla_11_ent_1.getText().isEmpty() && 
		               !casilla_12_ent_1.getText().isEmpty() && 
		               !casilla_13_ent_1.getText().isEmpty() && 
		               !casilla_14_ent_1.getText().isEmpty() && 
		               !casilla_15_ent_1.getText().isEmpty() && 
		               !casilla_16_ent_1.getText().isEmpty() &&
		               !casilla_17_ent_1.getText().isEmpty() && 
		               !casilla_18_ent_1.getText().isEmpty() && 
		               !casilla_19_ent_1.getText().isEmpty() && 
		               !casilla_20_ent_1.getText().isEmpty() && 
		               !casilla_21_ent_1.getText().isEmpty() && 
		               !casilla_22_ent_1.getText().isEmpty() && 
		               !casilla_23_ent_1.getText().isEmpty() && 
		               !casilla_24_ent_1.getText().isEmpty() && 
		               !casilla_25_ent_1.getText().isEmpty();
		               	
		    }
		});

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
    
    private void abrirVentanaEstandar() {
	    this.dispose();
        Estandar Estandar= new Estandar(desktopPane);
        desktopPane.add(Estandar);
        Estandar.setVisible(true);
    }
    
    private void abrirVentanaVectores() {
	    this.dispose();
        VentanaVectores VentanaVectores= new VentanaVectores(desktopPane);
        desktopPane.add(VentanaVectores);
        VentanaVectores.setVisible(true);
    }
}
