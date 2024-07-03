package CalculadoraG5.GUI;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import CalculadoraG5.resources.RoundedPanel;
import CalculadoraG5.resources.RoundedTextfield;

public class MatricesUno extends JInternalFrame{
	private static final long serialVersionUID = 1L;
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
	
	
	
	private JTextField num_escalar;
	private int spinnerValor = 3;
	private RoundedPanel clear;
	private JLabel clear_uno;
	


	// Se crea el frame
    public MatricesUno(JDesktopPane desktopPane) {
        super("", false, false, false, false);
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
        
        Color miColorPrin = new Color(26, 27, 40);
        Color miColorSec = new Color(87, 116, 250);
        Color letrasColor = new Color(255, 255, 255);
        Color gris = new Color(30, 36, 53);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setBounds(0, 0, 900, 650);
        setResizable(false);

        JPanel contentPane = new JPanel();
        contentPane.setBackground(miColorPrin);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
		
		JPanel principal = new JPanel();
		principal.setBackground(miColorPrin);
		principal.setBounds(23, 215, 834, 373);
		contentPane.add(principal);
		principal.setLayout(null);
		
		JPanel mult_escalar = new RoundedPanel(15,miColorSec);
		mult_escalar.setBounds(10, 300, 260, 47);
		principal.add(mult_escalar);
		mult_escalar.setOpaque(false);
		mult_escalar.setLayout(new GridLayout(0, 1, 0, 0));
 
		
		JLabel calc_escalar = new JLabel("Calcular escalar");
		calc_escalar.setForeground(letrasColor);
		calc_escalar.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		calc_escalar.setAlignmentX(Component.CENTER_ALIGNMENT);
		calc_escalar.setHorizontalAlignment(SwingConstants.CENTER);
		calc_escalar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mult_escalar.add(calc_escalar);
		
		JPanel determinante = new RoundedPanel(15,miColorSec);
		determinante.setBackground(new Color(255, 255, 255));
		determinante.setBounds(280, 300, 274, 47);
		determinante.setOpaque(false);
		principal.add(determinante);
		determinante.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel calc_determinante = new JLabel("Calcular determinante");
		calc_determinante.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		calc_determinante.setForeground(letrasColor);
		calc_determinante.setHorizontalAlignment(SwingConstants.CENTER);
		calc_determinante.setAlignmentX(0.5f);
		calc_determinante.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		determinante.add(calc_determinante);
		
		JPanel inversa = new RoundedPanel(15,miColorSec);
		inversa.setBackground(miColorSec);
		inversa.setBounds(564, 300, 260, 47);
		inversa.setOpaque(false);
		principal.add(inversa);
		inversa.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel calc_inversa = new JLabel("Calcular inversa");
		calc_inversa.setForeground(letrasColor);
		calc_inversa.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		calc_inversa.setHorizontalAlignment(SwingConstants.CENTER);
		calc_inversa.setAlignmentX(0.5f);
		calc_inversa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		inversa.add(calc_inversa);
		
		JPanel matrices = new JPanel();
		matrices.setBackground(new Color(0, 64, 128));
		matrices.setBounds(10, 11, 814, 264);
		matrices.setOpaque(false);
		principal.add(matrices);
		matrices.setLayout(null);
		
		JPanel entrada = new JPanel();
		entrada.setBackground(new Color(128, 128, 192));
		entrada.setOpaque(false);
		entrada.setBounds(0, 0, 374, 264);
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
		casilla_1_ent.setBackground(new Color(30, 36, 53));
		casilla_1_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_1_ent.setForeground(new Color(254, 254, 254));
		casilla_1_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_1_ent.setBounds(44, 11, 70, 70);
		entrada.add(casilla_1_ent);
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
		
		
		casilla_2_ent = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_2_ent.setBackground(new Color(30, 36, 53));
		casilla_2_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_2_ent.setForeground(new Color(254, 254, 254));
		casilla_2_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_2_ent.setColumns(10);
		casilla_2_ent.setBounds(132, 11, 70, 70);
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
		casilla_3_ent.setForeground(new Color(254, 254, 254));
		casilla_3_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_3_ent.setColumns(10);
		casilla_3_ent.setBounds(220, 11, 70, 70);
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
		casilla_4_ent.setForeground(new Color(254, 254, 254));
		casilla_4_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_4_ent.setColumns(10);
		casilla_4_ent.setBounds(44, 98, 70, 70);
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
		casilla_5_ent.setForeground(new Color(254, 254, 254));
		casilla_5_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_5_ent.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_5_ent.setColumns(10);
		casilla_5_ent.setBounds(132, 98, 70, 70);
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
		casilla_6_ent.setForeground(new Color(254, 254, 254));
		casilla_6_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_6_ent.setColumns(10);
		casilla_6_ent.setBounds(220, 98, 70, 70);
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
		casilla_7_ent.setForeground(new Color(254, 254, 254));
		casilla_7_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_7_ent.setColumns(10);
		casilla_7_ent.setBounds(44, 186, 70, 70);
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
		casilla_8_ent.setForeground(new Color(254, 254, 254));
		casilla_8_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_8_ent.setColumns(10);
		casilla_8_ent.setBounds(132, 186, 70, 70);
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
		casilla_9_ent.setForeground(new Color(254, 254, 254));
		casilla_9_ent.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_9_ent.setColumns(10);
		casilla_9_ent.setBounds(220, 186, 70, 70);
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
		
		// 4x4 
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
		
		JLabel corchete_izq = new JLabel();
		corchete_izq.setVerticalAlignment(SwingConstants.TOP);
		corchete_izq.setHorizontalAlignment(SwingConstants.LEFT);
		corchete_izq.setBounds(0, 0, 29, 264);

		entrada.add(corchete_izq);


		
		JLabel corchete_der = new JLabel("");
		corchete_der.setVerticalAlignment(SwingConstants.TOP);
		corchete_der.setHorizontalAlignment(SwingConstants.RIGHT);

		corchete_der.setBounds(310, 0, 29, 264);
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

		corchete_izq_1.setBounds(36, 0, 29, 264);
		salida.add(corchete_izq_1);
		
		JLabel corchete_der_1 = new JLabel("");
		corchete_der_1.setVerticalAlignment(SwingConstants.TOP);
		corchete_der_1.setHorizontalAlignment(SwingConstants.RIGHT);

		corchete_der_1.setBounds(341, 0, 29, 264);
		salida.add(corchete_der_1);
		
		casilla_1_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_1_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_1_sal.setForeground(new Color(30, 36, 53));
		casilla_1_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_1_sal.setColumns(10);
		casilla_1_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_1_sal.setBounds(80, 11, 70, 70);
		casilla_1_sal.setEditable(false); 
		casilla_1_sal.setFocusable(false);
		salida.add(casilla_1_sal);
		
		casilla_2_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_2_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_2_sal.setForeground(new Color(30, 36, 53));
		casilla_2_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_2_sal.setColumns(10);
		casilla_2_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_2_sal.setBounds(168, 11, 70, 70);
		casilla_2_sal.setEditable(false); 
		casilla_2_sal.setFocusable(false);
		salida.add(casilla_2_sal);
		
		casilla_3_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_3_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_3_sal.setForeground(new Color(30, 36, 53));
		casilla_3_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_3_sal.setColumns(10);
		casilla_3_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_3_sal.setBounds(256, 11, 70, 70);
		casilla_3_sal.setEditable(false); 
		casilla_3_sal.setFocusable(false);
		salida.add(casilla_3_sal);
		
		casilla_4_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_4_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_4_sal.setForeground(new Color(30, 36, 53));
		casilla_4_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_4_sal.setColumns(10);
		casilla_4_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_4_sal.setBounds(80, 98, 70, 70);
		casilla_4_sal.setEditable(false); 
		casilla_4_sal.setFocusable(false);
		salida.add(casilla_4_sal);
		
		casilla_5_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_5_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_5_sal.setForeground(new Color(30, 36, 53));
		casilla_5_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_5_sal.setColumns(10);
		casilla_5_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_5_sal.setBounds(168, 98, 70, 70);
		casilla_5_sal.setEditable(false); 
		casilla_5_sal.setFocusable(false);
		salida.add(casilla_5_sal);
		
		casilla_6_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_6_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_6_sal.setForeground(new Color(30, 36, 53));
		casilla_6_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_6_sal.setColumns(10);
		casilla_6_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_6_sal.setBounds(256, 98, 70, 70);
		casilla_6_sal.setEditable(false); 
		casilla_6_sal.setFocusable(false);
		salida.add(casilla_6_sal);
		
		casilla_7_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_7_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_7_sal.setForeground(new Color(30, 36, 53));
		casilla_7_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_7_sal.setColumns(10);
		casilla_7_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_7_sal.setBounds(80, 186, 70, 70);
		casilla_7_sal.setEditable(false); 
		casilla_7_sal.setFocusable(false);
		salida.add(casilla_7_sal);
		
		casilla_8_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_8_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_8_sal.setForeground(new Color(30, 36, 53));
		casilla_8_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_8_sal.setColumns(10);
		casilla_8_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_8_sal.setBounds(168, 186, 70, 70);
		casilla_8_sal.setEditable(false); 
		casilla_8_sal.setFocusable(false);
		salida.add(casilla_8_sal);
		
		casilla_9_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_9_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_9_sal.setForeground(new Color(30, 36, 53));
		casilla_9_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_9_sal.setColumns(10);
		casilla_9_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_9_sal.setBounds(256, 186, 70, 70);
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
		
		JLabel igual = new JLabel("=");
		igual.setForeground(new Color(255, 255, 255));
		igual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual.setHorizontalAlignment(SwingConstants.CENTER);
		igual.setBounds(368, 98, 80, 70);
		matrices.add(igual);
		
		num_escalar = new RoundedTextfield(10,gris,Color.WHITE);
		num_escalar.setHorizontalAlignment(SwingConstants.CENTER);
		num_escalar.setForeground(new Color(254, 254, 254));
		num_escalar.setFont(new Font("Tahoma", Font.BOLD, 18));
		num_escalar.setColumns(10);
		num_escalar.setBorder(BorderFactory.createEmptyBorder());
		num_escalar.setBackground(new Color(30, 36, 53));
		num_escalar.setBounds(384, 204, 50, 50);
		matrices.add(num_escalar);
		
		JLabel lblNewLabel = new JLabel("Escalar");
		lblNewLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(388, 185, 46, 14);
		matrices.add(lblNewLabel);

		JSpinner spinner = new JSpinner(new SpinnerNumberModel(3, 3, 5, 1));
		spinner.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		spinner.setBounds(378, 25, 62, 38);
		spinner.setBorder(BorderFactory.createLineBorder(gris));
		spinner.setFocusable(false);
		spinner.setBackground(gris);
		
		JComponent editor = spinner.getEditor();
		if (editor instanceof JSpinner.DefaultEditor) {
		    JTextField textField = ((JSpinner.DefaultEditor) editor).getTextField();
		    textField.setEditable(false); // Evitar que el texto sea editable
		    textField.setFocusable(false); // Evitar que el texto sea seleccionable
		    textField.setBackground(gris);
		    textField.setForeground(letrasColor);
		    textField.setHorizontalAlignment(JTextField.CENTER);
		}

		matrices.add(spinner);


		
		spinner.addChangeListener(new ChangeListener() {
		    @Override
		    public void stateChanged(ChangeEvent e) {
		        SpinnerNumberModel model = (SpinnerNumberModel) spinner.getModel();
		        int valorSpinner = model.getNumber().intValue();

		        // Limpiar todas las casillas de entrada y salida
		        JTextField[] casillasEntrada = {casilla_1_ent, casilla_2_ent, casilla_3_ent, casilla_4_ent, casilla_5_ent, casilla_6_ent, casilla_7_ent, casilla_8_ent, casilla_9_ent, casilla_10_ent, casilla_11_ent, casilla_12_ent, casilla_13_ent, casilla_14_ent, casilla_15_ent, casilla_16_ent, casilla_17_ent, casilla_18_ent, casilla_19_ent, casilla_20_ent, casilla_21_ent, casilla_22_ent, casilla_23_ent, casilla_24_ent, casilla_25_ent};
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
		            
		            casilla_1_ent.setBounds(42, 11, 50, 50);
		            casilla_2_ent.setBounds(108, 11, 50, 50);
		            casilla_3_ent.setBounds(174, 11, 50, 50);
		            casilla_4_ent.setBounds(240, 11, 50, 50);

		            casilla_5_ent.setBounds(42, 78, 50, 50);
		            casilla_6_ent.setBounds(108, 78, 50, 50);
		            casilla_7_ent.setBounds(174, 78, 50, 50);
		            casilla_8_ent.setBounds(240, 78, 50, 50);

		            casilla_9_ent.setBounds(42, 145, 50, 50);
		            casilla_10_ent.setBounds(108, 145, 50, 50);
		            casilla_11_ent.setBounds(174, 145, 50, 50);
		            casilla_12_ent.setBounds(240, 145, 50, 50);

		            casilla_13_ent.setBounds(42, 212, 50, 50);
		            casilla_14_ent.setBounds(108, 212, 50, 50);
		            casilla_15_ent.setBounds(174, 212, 50, 50);
		            casilla_16_ent.setBounds(240, 212, 50, 50);

		            
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

		            casilla_1_sal.setBounds(75, 11, 50, 50);
		            casilla_2_sal.setBounds(145, 11, 50, 50);
		            casilla_3_sal.setBounds(215, 11, 50, 50);
		            casilla_4_sal.setBounds(285, 11, 50, 50);

		            casilla_5_sal.setBounds(75, 78, 50, 50);
		            casilla_6_sal.setBounds(145, 78, 50, 50);
		            casilla_7_sal.setBounds(215, 78, 50, 50);
		            casilla_8_sal.setBounds(285, 78, 50, 50);

		            casilla_9_sal.setBounds(75, 145, 50, 50);
		            casilla_10_sal.setBounds(145, 145, 50, 50);
		            casilla_11_sal.setBounds(215, 145, 50, 50);
		            casilla_12_sal.setBounds(285, 145, 50, 50);

		            casilla_13_sal.setBounds(75, 212, 50, 50);
		            casilla_14_sal.setBounds(145, 212, 50, 50);
		            casilla_15_sal.setBounds(215, 212, 50, 50);
		            casilla_16_sal.setBounds(285, 212, 50, 50);
		        } else if (valorSpinner == 3) {
		            spinnerValor = 3;
		            casilla_10_ent.setVisible(false);
		            casilla_11_ent.setVisible(false);
		            casilla_12_ent.setVisible(false);
		            casilla_13_ent.setVisible(false);
		            casilla_14_ent.setVisible(false);
		            casilla_15_ent.setVisible(false);
		            casilla_16_ent.setVisible(false);
		            casilla_1_ent.setBounds(44, 11, 70, 70);
		            casilla_2_ent.setBounds(132, 11, 70, 70);
		            casilla_3_ent.setBounds(220, 11, 70, 70);
		            casilla_4_ent.setBounds(44, 98, 70, 70);
		            casilla_5_ent.setBounds(132, 98, 70, 70);
		            casilla_6_ent.setBounds(220, 98, 70, 70);
		            casilla_7_ent.setBounds(44, 186, 70, 70);
		            casilla_8_ent.setBounds(132, 186, 70, 70);
		            casilla_9_ent.setBounds(220, 186, 70, 70);

		            casilla_1_sal.setVisible(true);
		            casilla_2_sal.setVisible(true);
		            casilla_3_sal.setVisible(true);
		            casilla_4_sal.setVisible(true);
		            casilla_5_sal.setVisible(true);
		            casilla_6_sal.setVisible(true);
		            casilla_7_sal.setVisible(true);
		            casilla_8_sal.setVisible(true);
		            casilla_9_sal.setVisible(true);
		         
		            casilla_10_sal.setVisible(false);
		            casilla_11_sal.setVisible(false);
		            casilla_12_sal.setVisible(false);
		            casilla_13_sal.setVisible(false);
		            casilla_14_sal.setVisible(false);
		            casilla_15_sal.setVisible(false);
		            casilla_16_sal.setVisible(false);
		            
		            casilla_17_sal.setVisible(false);
		            casilla_18_sal.setVisible(false);
		            casilla_19_sal.setVisible(false);
		            casilla_20_sal.setVisible(false);
		            casilla_21_sal.setVisible(false);
		            casilla_22_sal.setVisible(false);
		            casilla_23_sal.setVisible(false);
		            casilla_24_sal.setVisible(false);
		            casilla_25_sal.setVisible(false);
		            
		            casilla_1_sal.setBounds(80, 11, 70, 70);
		            casilla_2_sal.setBounds(168, 11, 70, 70);
		            casilla_3_sal.setBounds(256, 11, 70, 70);
		            casilla_4_sal.setBounds(80, 98, 70, 70);
		            casilla_5_sal.setBounds(168, 98, 70, 70);
		            casilla_6_sal.setBounds(256, 98, 70, 70);
		            casilla_7_sal.setBounds(80, 186, 70, 70);
		            casilla_8_sal.setBounds(168, 186, 70, 70);
		            casilla_9_sal.setBounds(256, 186, 70, 70);
		        }
		        
		        else {
		            spinnerValor = 5;
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
		            
		            
		            casilla_1_ent.setBounds(42, 9, 40, 40);
		            casilla_2_ent.setBounds(95, 9, 40, 40);
		            casilla_3_ent.setBounds(148, 9, 40, 40);
		            casilla_4_ent.setBounds(201, 9, 40, 40);
		            casilla_5_ent.setBounds(254, 9, 40, 40);
		            
		            casilla_6_ent.setBounds(42, 62, 40, 40);
		            casilla_7_ent.setBounds(95, 62, 40, 40);
		            casilla_8_ent.setBounds(148, 62, 40, 40);
		            casilla_9_ent.setBounds(201, 62, 40, 40);
		            casilla_10_ent.setBounds(254, 62, 40, 40);
		            
		            casilla_11_ent.setBounds(42, 115, 40, 40);
		            casilla_12_ent.setBounds(95, 115, 40, 40);
		            casilla_13_ent.setBounds(148, 115, 40, 40);
		            casilla_14_ent.setBounds(201, 115, 40, 40);
		            casilla_15_ent.setBounds(254, 115, 40, 40);
		            
		            casilla_16_ent.setBounds(42, 168, 40, 40);
		            casilla_17_ent.setBounds(95, 168, 40, 40);
		            casilla_18_ent.setBounds(148, 168, 40, 40);
		            casilla_19_ent.setBounds(201, 168, 40, 40);
		            casilla_20_ent.setBounds(254, 168, 40, 40);
		            
		            casilla_21_ent.setBounds(42, 223, 40, 40);
		            casilla_22_ent.setBounds(95, 223, 40, 40);
		            casilla_23_ent.setBounds(148, 223, 40, 40);
		            casilla_24_ent.setBounds(201, 223, 40, 40);
		            casilla_25_ent.setBounds(254, 223, 40, 40);
		            
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

		            casilla_1_sal.setBounds(80, 9, 40, 40);
		            casilla_2_sal.setBounds(133, 9, 40, 40);
		            casilla_3_sal.setBounds(186, 9, 40, 40);
		            casilla_4_sal.setBounds(239, 9, 40, 40);
		            casilla_5_sal.setBounds(292, 9, 40, 40);
		            
		            casilla_6_sal.setBounds(80, 62, 40, 40);
		            casilla_7_sal.setBounds(133, 62, 40, 40);
		            casilla_8_sal.setBounds(186, 62, 40, 40);
		            casilla_9_sal.setBounds(239, 62, 40, 40);
		            casilla_10_sal.setBounds(292, 62, 40, 40);
		            
		            casilla_11_sal.setBounds(80, 115, 40, 40);
		            casilla_12_sal.setBounds(133, 115, 40, 40);
		            casilla_13_sal.setBounds(186, 115, 40, 40);
		            casilla_14_sal.setBounds(239, 115, 40, 40);
		            casilla_15_sal.setBounds(292, 115, 40, 40);
		            
		            casilla_16_sal.setBounds(80, 168, 40, 40);
		            casilla_17_sal.setBounds(133, 168, 40, 40);
		            casilla_18_sal.setBounds(186, 168, 40, 40);
		            casilla_19_sal.setBounds(239, 168, 40, 40);
		            casilla_20_sal.setBounds(292, 168, 40, 40);
		            
		            casilla_21_sal.setBounds(80, 223, 40, 40);
		            casilla_22_sal.setBounds(133, 223, 40, 40);
		            casilla_23_sal.setBounds(186, 223, 40, 40);
		            casilla_24_sal.setBounds(239, 223, 40, 40);
		            casilla_25_sal.setBounds(292, 223, 40, 40);
		        }
		    }
		});

		
		
		JLabel lblLongitud = new JLabel("Longitud");
		lblLongitud.setHorizontalAlignment(SwingConstants.CENTER);
		lblLongitud.setForeground(Color.WHITE);
		lblLongitud.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblLongitud.setBounds(319, 0, 178, 20);
		matrices.add(lblLongitud);
		
		clear = new RoundedPanel(10, Color.WHITE);
		clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				casilla_1_ent.setText("");
				casilla_2_ent.setText("");
				casilla_3_ent.setText("");
				casilla_4_ent.setText("");;

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
				
				casilla_17_ent.setText("");
				casilla_18_ent.setText("");
				casilla_19_ent.setText("");
				casilla_20_ent.setText("");
				
				casilla_21_ent.setText("");
				casilla_22_ent.setText("");
				casilla_23_ent.setText("");
				casilla_24_ent.setText("");
				casilla_25_ent.setText("");
				
				casilla_1_sal.setText("");
				casilla_2_sal.setText("");
				casilla_3_sal.setText("");
				casilla_4_sal.setText("");;

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
		});
		clear.setOpaque(false);
		clear.setBounds(384, 75, 52, 29);
		matrices.add(clear);
		clear.setLayout(new GridLayout(0, 1, 0, 0));
		
		clear_uno = new JLabel("BORRAR");
		clear_uno.setHorizontalAlignment(SwingConstants.CENTER);
		clear_uno.setForeground(new Color(86, 116, 250));
		clear_uno.setFont(new Font("Microsoft YaHei", Font.BOLD, 10));
		clear.add(clear_uno);

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

		
		JLabel ingreso_una = new JLabel("Ingresar una matriz");
		ingreso_una.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		ingreso_una.setForeground(letrasColor);
		ingreso_una.setHorizontalAlignment(SwingConstants.CENTER);
		ingreso_una.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ingresar_una_matriz.add(ingreso_una);
		
		JPanel ingresar_dos_matrices = new RoundedPanel(15, new Color(30, 36, 53));

		ingresar_dos_matrices.setOpaque(false);
		ingresar_dos_matrices.setBackground(new Color(30, 36, 53));
		ingresar_dos_matrices.setBounds(434, 11, 390, 67);
		menu_matrices.add(ingresar_dos_matrices);
		ingresar_dos_matrices.setLayout(new GridLayout(1, 0, 0, 0));

        ingresar_dos_matrices.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaMatricesMasDeUno();
            }
        });
		
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
		
		
		corchete_izq.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/CorcheteIzq.png")));
		corchete_der.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/CorcheteDer.png")));
		corchete_izq_1.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/CorcheteIzq.png")));
		corchete_der_1.setIcon(new ImageIcon(MatricesDos.class.getResource("/main/imagenes/CorcheteDer.png")));
		
		// Parte logica simplificada
				mult_escalar.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseClicked(java.awt.event.MouseEvent evt) {
				        	if(spinnerValor == 4) {
				        		if(areAllFieldsFilled4X4()) {
				        			
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

				        			
				        			System.out.println("Entra al 4");	
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
		
						        	String escalar_num = num_escalar.getText();
						        	
						        	int[][] matrizInicial = new int[4][4];
						        	matrizInicial[0][0] = Integer.parseInt(valor1);
						        	matrizInicial[0][1] = Integer.parseInt(valor2);
						        	matrizInicial[0][2] = Integer.parseInt(valor3);
						        	matrizInicial[0][3] = Integer.parseInt(valor4);
						        	
						        	matrizInicial[1][0] = Integer.parseInt(valor5);
						        	matrizInicial[1][1] = Integer.parseInt(valor6);
						        	matrizInicial[1][2] = Integer.parseInt(valor7);
						        	matrizInicial[1][3] = Integer.parseInt(valor8);
						        	
						        	matrizInicial[2][0] = Integer.parseInt(valor9);
						        	matrizInicial[2][1] = Integer.parseInt(valor10);
						        	matrizInicial[2][2] = Integer.parseInt(valor11);
						        	matrizInicial[2][3] = Integer.parseInt(valor12);
						        	
						        	matrizInicial[3][0] = Integer.parseInt(valor13);
						        	matrizInicial[3][1] = Integer.parseInt(valor14);
						        	matrizInicial[3][2] = Integer.parseInt(valor15);
						        	matrizInicial[3][3] = Integer.parseInt(valor16);
						        	
						        	int numEscalar = Integer.parseInt(escalar_num);
						        	
						        	int[][] resultadoEscalar = MatricesOperacion.calcularEscalar(matrizInicial, numEscalar);	
		
						    		casilla_1_sal.setBounds(75, 11, 50, 50);
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
						            
						            casilla_1_sal.setText(String.valueOf(resultadoEscalar[0][0]));
						            casilla_2_sal.setText(String.valueOf(resultadoEscalar[0][1]));
						            casilla_3_sal.setText(String.valueOf(resultadoEscalar[0][2]));
						            casilla_4_sal.setText(String.valueOf(resultadoEscalar[0][3]));
						            
						            casilla_5_sal.setText(String.valueOf(resultadoEscalar[1][0]));
						            casilla_6_sal.setText(String.valueOf(resultadoEscalar[1][1]));
						            casilla_7_sal.setText(String.valueOf(resultadoEscalar[1][2]));
						            casilla_8_sal.setText(String.valueOf(resultadoEscalar[1][3]));
						            
						            casilla_9_sal.setText(String.valueOf(resultadoEscalar[2][0]));
						            casilla_10_sal.setText(String.valueOf(resultadoEscalar[2][1]));
						            casilla_11_sal.setText(String.valueOf(resultadoEscalar[2][2]));
						            casilla_12_sal.setText(String.valueOf(resultadoEscalar[2][3]));
						            
						            casilla_13_sal.setText(String.valueOf(resultadoEscalar[3][0]));
						            casilla_14_sal.setText(String.valueOf(resultadoEscalar[3][1]));
						            casilla_15_sal.setText(String.valueOf(resultadoEscalar[3][2]));
						            casilla_16_sal.setText(String.valueOf(resultadoEscalar[3][3]));
				        			
				        		}
				        		
				        		else {
									JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");						        			
				        		}
				        	}
				        	
				        	else if(spinnerValor == 3) {
				        		if(areAllFieldsFilled3X3()) {
					        		System.out.println("Entra al 3");
					        		String valor1 = casilla_1_ent.getText();
						        	String valor2 = casilla_2_ent.getText();
						        	String valor3 = casilla_3_ent.getText();
						        	String valor4 = casilla_4_ent.getText();
						        	String valor5 = casilla_5_ent.getText();
						        	String valor6 = casilla_6_ent.getText();
						        	String valor7 = casilla_7_ent.getText();
						        	String valor8 = casilla_8_ent.getText();
						        	String valor9 = casilla_9_ent.getText();
						        	String escalar_num = num_escalar.getText();
						        	
	
						        	
						        	int[][] matrizInicial = new int[3][3];
						        	matrizInicial[0][0] = Integer.parseInt(valor1);
						        	matrizInicial[0][1] = Integer.parseInt(valor2);
						        	matrizInicial[0][2] = Integer.parseInt(valor3);
						        	matrizInicial[1][0] = Integer.parseInt(valor4);
						        	matrizInicial[1][1] = Integer.parseInt(valor5);
						        	matrizInicial[1][2] = Integer.parseInt(valor6);
						        	matrizInicial[2][0] = Integer.parseInt(valor7);
						        	matrizInicial[2][1] = Integer.parseInt(valor8);
						        	matrizInicial[2][2] = Integer.parseInt(valor9);
						        	int numEscalar = Integer.parseInt(escalar_num);
						        	
						        	
						
						        	int[][] resultadoEscalar = MatricesOperacion.calcularEscalar(matrizInicial, numEscalar);	
	
						    		casilla_1_sal.setBounds(80, 11, 70, 70);
						            casilla_2_sal.setVisible(true);
						            casilla_3_sal.setVisible(true);
						            casilla_4_sal.setVisible(true);
						            casilla_5_sal.setVisible(true);
						            casilla_6_sal.setVisible(true);
						            casilla_7_sal.setVisible(true);
						            casilla_8_sal.setVisible(true);
						            casilla_9_sal.setVisible(true);
						            
						            casilla_1_sal.setText(String.valueOf(resultadoEscalar[0][0]));
						            casilla_2_sal.setText(String.valueOf(resultadoEscalar[0][1]));
						            casilla_3_sal.setText(String.valueOf(resultadoEscalar[0][2]));
						            casilla_4_sal.setText(String.valueOf(resultadoEscalar[1][0]));
						            casilla_5_sal.setText(String.valueOf(resultadoEscalar[1][1]));
						            casilla_6_sal.setText(String.valueOf(resultadoEscalar[1][2]));
						            casilla_7_sal.setText(String.valueOf(resultadoEscalar[2][0]));
						            casilla_8_sal.setText(String.valueOf(resultadoEscalar[2][1]));
						            casilla_9_sal.setText(String.valueOf(resultadoEscalar[2][2]));						        			
				        		}
				        		
					        	else {
									JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");						        		
					        	}
				        	}
				        	
				        	else {
				        		if(areAllFieldsFilled5x5()) {
					        		System.out.println("Entra al 3");
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
						        	String escalar_num = num_escalar.getText();
						        	
	
						        	
						        	int[][] matrizInicial = new int[5][5];
						        	matrizInicial[0][0] = Integer.parseInt(valor1);
						        	matrizInicial[0][1] = Integer.parseInt(valor2);
						        	matrizInicial[0][2] = Integer.parseInt(valor3);
						        	matrizInicial[0][3] = Integer.parseInt(valor4);
						        	matrizInicial[0][4] = Integer.parseInt(valor5);
						        	
						        	matrizInicial[1][0] = Integer.parseInt(valor6);
						        	matrizInicial[1][1] = Integer.parseInt(valor7);
						        	matrizInicial[1][2] = Integer.parseInt(valor8);
						        	matrizInicial[1][3] = Integer.parseInt(valor9);
						        	matrizInicial[1][4] = Integer.parseInt(valor10);
						        	
						        	matrizInicial[2][0] = Integer.parseInt(valor11);
						        	matrizInicial[2][1] = Integer.parseInt(valor12);
						        	matrizInicial[2][2] = Integer.parseInt(valor13);
						        	matrizInicial[2][3] = Integer.parseInt(valor14);
						        	matrizInicial[2][4] = Integer.parseInt(valor15);
						        	
						        	matrizInicial[3][0] = Integer.parseInt(valor16);
						        	matrizInicial[3][1] = Integer.parseInt(valor17);
						        	matrizInicial[3][2] = Integer.parseInt(valor18);
						        	matrizInicial[3][3] = Integer.parseInt(valor19);
						        	matrizInicial[3][4] = Integer.parseInt(valor20);
						        	
						        	matrizInicial[4][0] = Integer.parseInt(valor21);
						        	matrizInicial[4][1] = Integer.parseInt(valor22);
						        	matrizInicial[4][2] = Integer.parseInt(valor23);
						        	matrizInicial[4][3] = Integer.parseInt(valor24);
						        	matrizInicial[4][4] = Integer.parseInt(valor25);

						        	int numEscalar = Integer.parseInt(escalar_num);
						        	
						        	
						
						        	int[][] resultadoEscalar = MatricesOperacion.calcularEscalar(matrizInicial, numEscalar);	
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

						    		casilla_1_sal.setBounds(80, 9, 40, 40);
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
						            
						            casilla_1_sal.setText(String.valueOf(resultadoEscalar[0][0]));
						            casilla_2_sal.setText(String.valueOf(resultadoEscalar[0][1]));
						            casilla_3_sal.setText(String.valueOf(resultadoEscalar[0][2]));
						            casilla_4_sal.setText(String.valueOf(resultadoEscalar[0][3]));
						            casilla_5_sal.setText(String.valueOf(resultadoEscalar[0][4]));
						            casilla_6_sal.setText(String.valueOf(resultadoEscalar[1][0]));
						            casilla_7_sal.setText(String.valueOf(resultadoEscalar[1][1]));
						            casilla_8_sal.setText(String.valueOf(resultadoEscalar[1][2]));
						            casilla_9_sal.setText(String.valueOf(resultadoEscalar[1][3]));			
						            casilla_10_sal.setText(String.valueOf(resultadoEscalar[1][4]));
						            casilla_11_sal.setText(String.valueOf(resultadoEscalar[2][0]));
						            casilla_12_sal.setText(String.valueOf(resultadoEscalar[2][1]));
						            casilla_13_sal.setText(String.valueOf(resultadoEscalar[2][2]));
						            casilla_14_sal.setText(String.valueOf(resultadoEscalar[2][3]));
						            casilla_15_sal.setText(String.valueOf(resultadoEscalar[2][4]));
						            casilla_16_sal.setText(String.valueOf(resultadoEscalar[3][0]));
						            casilla_17_sal.setText(String.valueOf(resultadoEscalar[3][1]));
						            casilla_18_sal.setText(String.valueOf(resultadoEscalar[3][2]));		
						            casilla_19_sal.setText(String.valueOf(resultadoEscalar[3][3]));
						            casilla_20_sal.setText(String.valueOf(resultadoEscalar[3][4]));
						            casilla_21_sal.setText(String.valueOf(resultadoEscalar[4][0]));
						            casilla_22_sal.setText(String.valueOf(resultadoEscalar[4][1]));
						            casilla_23_sal.setText(String.valueOf(resultadoEscalar[4][2]));
						            casilla_24_sal.setText(String.valueOf(resultadoEscalar[4][3]));
						            casilla_25_sal.setText(String.valueOf(resultadoEscalar[4][4]));
	
				        		}
				        		
					        	else {
									JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");						        		
					        	}
				        	}				        		
				        	
				        	
			
				    }

				    private boolean areAllFieldsFilled3X3() {
				        return !num_escalar.getText().isEmpty() &&
				        	   !casilla_1_ent.getText().isEmpty() && 
				               !casilla_2_ent.getText().isEmpty() && 
				               !casilla_3_ent.getText().isEmpty() && 
				               !casilla_4_ent.getText().isEmpty() && 
				               !casilla_5_ent.getText().isEmpty() && 
				               !casilla_6_ent.getText().isEmpty() && 
				               !casilla_7_ent.getText().isEmpty() && 
				               !casilla_8_ent.getText().isEmpty() && 
				               !casilla_9_ent.getText().isEmpty();
				    }
				    
				    private boolean areAllFieldsFilled4X4() {
				        return !num_escalar.getText().isEmpty() &&
				        	   !casilla_1_ent.getText().isEmpty() && 
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
				               !casilla_16_ent.getText().isEmpty();
				    }
				    
				    private boolean areAllFieldsFilled5x5() {
				        return !num_escalar.getText().isEmpty() &&
				        	   !casilla_1_ent.getText().isEmpty() && 
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
				               !casilla_25_ent.getText().isEmpty();
				    }
				});

				determinante.addMouseListener(new java.awt.event.MouseAdapter() {

					@Override
					public void mouseClicked(MouseEvent e) {

			        	if(spinnerValor == 4) {
								if (areAllFieldsFilled4X4()) {
									
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

									
						        	System.out.println("Det 4");	
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
				        	
						        	int[][] matrizInicial = new int[4][4];
						        	matrizInicial[0][0] = Integer.parseInt(valor1);
						        	matrizInicial[0][1] = Integer.parseInt(valor2);
						        	matrizInicial[0][2] = Integer.parseInt(valor3);
						        	matrizInicial[0][3] = Integer.parseInt(valor4);
						        	
						        	matrizInicial[1][0] = Integer.parseInt(valor5);
						        	matrizInicial[1][1] = Integer.parseInt(valor6);
						        	matrizInicial[1][2] = Integer.parseInt(valor7);
						        	matrizInicial[1][3] = Integer.parseInt(valor8);
						        	
						        	matrizInicial[2][0] = Integer.parseInt(valor9);
						        	matrizInicial[2][1] = Integer.parseInt(valor10);
						        	matrizInicial[2][2] = Integer.parseInt(valor11);
						        	matrizInicial[2][3] = Integer.parseInt(valor12);
						        	
						        	matrizInicial[3][0] = Integer.parseInt(valor13);
						        	matrizInicial[3][1] = Integer.parseInt(valor14);
						        	matrizInicial[3][2] = Integer.parseInt(valor15);
						        	matrizInicial[3][3] = Integer.parseInt(valor16);
					        	
						        	int resultadoDeterminante = MatricesOperacion.calcularDeterminante4x4(matrizInicial);	
		
						            casilla_2_sal.setVisible(false);
						            casilla_3_sal.setVisible(false);
						            casilla_4_sal.setVisible(false);
						            casilla_5_sal.setVisible(false);
						            casilla_6_sal.setVisible(false);
						            casilla_7_sal.setVisible(false);
						            casilla_8_sal.setVisible(false);
						            casilla_9_sal.setVisible(false);
						            casilla_10_sal.setVisible(false);
						            casilla_11_sal.setVisible(false);
						            casilla_12_sal.setVisible(false);
						            casilla_13_sal.setVisible(false);
						            casilla_14_sal.setVisible(false);
						            casilla_15_sal.setVisible(false);
						            casilla_16_sal.setVisible(false);
						            
						            casilla_1_sal.setBounds(154, 80, 100, 100);		
						            casilla_1_sal.setText(String.valueOf(resultadoDeterminante));
				        	}
								
							else {
								JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");							
							}
			        	}
			        	
		        		else if(spinnerValor == 3) {
		        				if(areAllFieldsFilled3X3()) {
			        					System.out.println("Det 3");
						        		String valor1 = casilla_1_ent.getText();
							        	String valor2 = casilla_2_ent.getText();
							        	String valor3 = casilla_3_ent.getText();
							        	String valor4 = casilla_4_ent.getText();
							        	String valor5 = casilla_5_ent.getText();
							        	String valor6 = casilla_6_ent.getText();
							        	String valor7 = casilla_7_ent.getText();
							        	String valor8 = casilla_8_ent.getText();
							        	String valor9 = casilla_9_ent.getText();
							        	
							        	int[][] matrizInicial = new int[3][3];
							        	matrizInicial[0][0] = Integer.parseInt(valor1);
							        	matrizInicial[0][1] = Integer.parseInt(valor2);
							        	matrizInicial[0][2] = Integer.parseInt(valor3);
							        	matrizInicial[1][0] = Integer.parseInt(valor4);
							        	matrizInicial[1][1] = Integer.parseInt(valor5);
							        	matrizInicial[1][2] = Integer.parseInt(valor6);
							        	matrizInicial[2][0] = Integer.parseInt(valor7);
							        	matrizInicial[2][1] = Integer.parseInt(valor8);
							        	matrizInicial[2][2] = Integer.parseInt(valor9);
							        	
							        	int resultadoDeterminante = MatricesOperacion.calcularDeterminante3x3(matrizInicial);	
	
							            casilla_2_sal.setVisible(false);
							            casilla_3_sal.setVisible(false);
							            casilla_4_sal.setVisible(false);
							            casilla_5_sal.setVisible(false);
							            casilla_6_sal.setVisible(false);
							            casilla_7_sal.setVisible(false);
							            casilla_8_sal.setVisible(false);
							            casilla_9_sal.setVisible(false);
							            casilla_10_sal.setVisible(false);
							            casilla_11_sal.setVisible(false);						            
							            casilla_12_sal.setVisible(false);
							            casilla_13_sal.setVisible(false);
							            casilla_14_sal.setVisible(false);
							            casilla_15_sal.setVisible(false);
							            casilla_16_sal.setVisible(false);
							            
							            casilla_1_sal.setBounds(153, 80, 100, 100);		   
							            casilla_1_sal.setText(String.valueOf(resultadoDeterminante));
		        				}
				        		
		        				else {
									JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");			        					
		        				}
				        
						}
					
		        		else {
							if (areAllFieldsFilled5x5()) {	
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
					    		casilla_13_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
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
					    		casilla_13_ent.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
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
			        	
					        	int[][] matrizInicial = new int[5][5];
					        	matrizInicial[0][0] = Integer.parseInt(valor1);
					        	matrizInicial[0][1] = Integer.parseInt(valor2);
					        	matrizInicial[0][2] = Integer.parseInt(valor3);
					        	matrizInicial[0][3] = Integer.parseInt(valor4);
					        	matrizInicial[0][4] = Integer.parseInt(valor5);
					        	
					        	matrizInicial[1][0] = Integer.parseInt(valor6);
					        	matrizInicial[1][1] = Integer.parseInt(valor7);
					        	matrizInicial[1][2] = Integer.parseInt(valor8);
					        	matrizInicial[1][3] = Integer.parseInt(valor9);
					        	matrizInicial[1][4] = Integer.parseInt(valor10);
					        	
					        	matrizInicial[2][0] = Integer.parseInt(valor11);
					        	matrizInicial[2][1] = Integer.parseInt(valor12);
					        	matrizInicial[2][2] = Integer.parseInt(valor13);
					        	matrizInicial[2][3] = Integer.parseInt(valor14);
					        	matrizInicial[2][4] = Integer.parseInt(valor15);
					        	
					        	matrizInicial[3][0] = Integer.parseInt(valor16);
					        	matrizInicial[3][1] = Integer.parseInt(valor17);
					        	matrizInicial[3][2] = Integer.parseInt(valor18);
					        	matrizInicial[3][3] = Integer.parseInt(valor19);
					        	matrizInicial[3][4] = Integer.parseInt(valor20);
					        	
					        	matrizInicial[4][0] = Integer.parseInt(valor21);
					        	matrizInicial[4][1] = Integer.parseInt(valor22);
					        	matrizInicial[4][2] = Integer.parseInt(valor23);
					        	matrizInicial[4][3] = Integer.parseInt(valor24);
					        	matrizInicial[4][4] = Integer.parseInt(valor25);
				        	
					        	int resultadoDeterminante = MatricesOperacion.calcularDeterminante5x5(matrizInicial);	
	
					            casilla_2_sal.setVisible(false);
					            casilla_3_sal.setVisible(false);
					            casilla_4_sal.setVisible(false);
					            casilla_5_sal.setVisible(false);
					            casilla_6_sal.setVisible(false);
					            casilla_7_sal.setVisible(false);
					            casilla_8_sal.setVisible(false);
					            casilla_9_sal.setVisible(false);
					            casilla_10_sal.setVisible(false);
					            casilla_11_sal.setVisible(false);
					            casilla_12_sal.setVisible(false);
					            casilla_13_sal.setVisible(false);
					            casilla_14_sal.setVisible(false);
					            casilla_15_sal.setVisible(false);
					            casilla_16_sal.setVisible(false);
					            casilla_17_sal.setVisible(false);
					            casilla_18_sal.setVisible(false);
					            casilla_19_sal.setVisible(false);
					            casilla_20_sal.setVisible(false);
					            casilla_21_sal.setVisible(false);
					            casilla_22_sal.setVisible(false);
					            casilla_23_sal.setVisible(false);
					            casilla_24_sal.setVisible(false);
					            casilla_25_sal.setVisible(false);
					            
					            casilla_1_sal.setBounds(154, 80, 100, 100);		
					            casilla_1_sal.setText(String.valueOf(resultadoDeterminante));
			        	}
							
						else {
							JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");							
						}		        			
		        		}
			        	
					}
					
				    private boolean areAllFieldsFilled3X3() {
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
				    
				    private boolean areAllFieldsFilled4X4() {
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
				               !casilla_16_ent.getText().isEmpty();
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
				               !casilla_25_ent.getText().isEmpty();
				    }
				    
				});
				
				inversa.addMouseListener(new java.awt.event.MouseAdapter() {
				    @Override
				    public void mouseEntered(MouseEvent e) {
				        calc_inversa.setForeground(new Color(205, 205, 205));
				    }
				    @Override
				    public void mouseExited(MouseEvent e) {
				        calc_inversa.setForeground(letrasColor);    
				    }
				    @Override
				    public void mouseClicked(MouseEvent e) {
				        if(spinnerValor == 4) {
					        if (areAllFieldsFilled4X4()) {
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
					            
					            int[][] matrizInicial = new int[4][4];
					        	matrizInicial[0][0] = Integer.parseInt(valor1);
					        	matrizInicial[0][1] = Integer.parseInt(valor2);
					        	matrizInicial[0][2] = Integer.parseInt(valor3);
					        	matrizInicial[0][3] = Integer.parseInt(valor4);

					        	matrizInicial[1][0] = Integer.parseInt(valor5);
					        	matrizInicial[1][1] = Integer.parseInt(valor6);
					        	matrizInicial[1][2] = Integer.parseInt(valor7);
					        	matrizInicial[1][3] = Integer.parseInt(valor8);
					        	
					        	matrizInicial[2][0] = Integer.parseInt(valor9);
					        	matrizInicial[2][1] = Integer.parseInt(valor10);
					        	matrizInicial[2][2] = Integer.parseInt(valor11);
					        	matrizInicial[2][3] = Integer.parseInt(valor12);
					        	
					        	matrizInicial[3][0] = Integer.parseInt(valor13);
					        	matrizInicial[3][1] = Integer.parseInt(valor14);
					        	matrizInicial[3][2] = Integer.parseInt(valor15);
					        	matrizInicial[3][3] = Integer.parseInt(valor16);
					        	
					        	// Llamado a la logica de calcular inversa
					        	int resultadoDeterminanteEnInversa = MatricesOperacion.calcularDeterminante3x3(matrizInicial);
					        	
					        	if(resultadoDeterminanteEnInversa != 0) {
					        		String[][] resultadoInversa = MatricesOperacion.calcularInversa(matrizInicial);
						    		casilla_1_sal.setBounds(75, 11, 50, 50);
						            
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
						            
						            casilla_1_sal.setText(resultadoInversa[0][0]);
						            casilla_2_sal.setText(resultadoInversa[0][1]);
						            casilla_3_sal.setText(resultadoInversa[0][2]);
						            casilla_4_sal.setText(resultadoInversa[0][3]);
						            casilla_5_sal.setText(resultadoInversa[1][0]);
						            casilla_6_sal.setText(resultadoInversa[1][1]);
						            casilla_7_sal.setText(resultadoInversa[1][2]);
						            casilla_8_sal.setText(resultadoInversa[1][3]);
						            casilla_9_sal.setText(resultadoInversa[2][0]);
						            casilla_10_sal.setText(resultadoInversa[2][1]);
						            casilla_11_sal.setText(resultadoInversa[2][2]);
						            casilla_12_sal.setText(resultadoInversa[2][3]);
						            casilla_13_sal.setText(resultadoInversa[3][0]);
						            casilla_14_sal.setText(resultadoInversa[3][1]);
						            casilla_15_sal.setText(resultadoInversa[3][2]);
						            casilla_16_sal.setText(resultadoInversa[3][3]);

					        	}
					        	
					        	else {
					                JOptionPane.showMessageDialog(null, "La matriz no tiene inversa porque su determinante es cero.");
					                return;
					        	}
					        } else {
					            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
					        }				        	
				        }
				        
				        else if(spinnerValor == 3) {
					        if (areAllFieldsFilled3X3()) {
					            String valor1 = casilla_1_ent.getText();
					            String valor2 = casilla_2_ent.getText();
					            String valor3 = casilla_3_ent.getText();
					            String valor4 = casilla_4_ent.getText();
					            String valor5 = casilla_5_ent.getText();
					            String valor6 = casilla_6_ent.getText();
					            String valor7 = casilla_7_ent.getText();
					            String valor8 = casilla_8_ent.getText();
					            String valor9 = casilla_9_ent.getText();

					            int[][] matrizInicial = new int[3][3];
					        	matrizInicial[0][0] = Integer.parseInt(valor1);
					        	matrizInicial[0][1] = Integer.parseInt(valor2);
					        	matrizInicial[0][2] = Integer.parseInt(valor3);
					        	matrizInicial[1][0] = Integer.parseInt(valor4);
					        	matrizInicial[1][1] = Integer.parseInt(valor5);
					        	matrizInicial[1][2] = Integer.parseInt(valor6);
					        	matrizInicial[2][0] = Integer.parseInt(valor7);
					        	matrizInicial[2][1] = Integer.parseInt(valor8);
					        	matrizInicial[2][2] = Integer.parseInt(valor9);

					        	// Llamado a la logica de calcular inversa
					        	int resultadoDeterminanteEnInversa = MatricesOperacion.calcularDeterminante3x3(matrizInicial);
					        	
					        	if(resultadoDeterminanteEnInversa != 0) {
					        		String[][] resultadoInversa = MatricesOperacion.calcularInversa(matrizInicial);
						    		casilla_1_sal.setBounds(80, 11, 70, 70);
						            
						            casilla_2_sal.setVisible(true);
						            casilla_3_sal.setVisible(true);
						            casilla_4_sal.setVisible(true);
						            casilla_5_sal.setVisible(true);
						            casilla_6_sal.setVisible(true);
						            casilla_7_sal.setVisible(true);
						            casilla_8_sal.setVisible(true);
						            casilla_9_sal.setVisible(true);
						            
						            casilla_1_sal.setText(resultadoInversa[0][0]);
						            casilla_2_sal.setText(resultadoInversa[0][1]);
						            casilla_3_sal.setText(resultadoInversa[0][2]);
						            casilla_4_sal.setText(resultadoInversa[1][0]);
						            casilla_5_sal.setText(resultadoInversa[1][1]);
						            casilla_6_sal.setText(resultadoInversa[1][2]);
						            casilla_7_sal.setText(resultadoInversa[2][0]);
						            casilla_8_sal.setText(resultadoInversa[2][1]);
						            casilla_9_sal.setText(resultadoInversa[2][2]);

					        	}
					        	
					        	else {
					                JOptionPane.showMessageDialog(null, "La matriz no tiene inversa porque su determinante es cero.");
					                return;
					        	}
					        } else {
					            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
					        }				        	
				        }
				        
				        else {
				        	System.out.println("Entra a inversa 5x5");
				            if (areAllFieldsFilled5x5()) {
				            	
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

				                int[][] matrizInicial = new int[5][5];
				                matrizInicial[0][0] = Integer.parseInt(valor1);
				                matrizInicial[0][1] = Integer.parseInt(valor2);
				                matrizInicial[0][2] = Integer.parseInt(valor3);
				                matrizInicial[0][3] = Integer.parseInt(valor4);
				                matrizInicial[0][4] = Integer.parseInt(valor5);

				                matrizInicial[1][0] = Integer.parseInt(valor6);
				                matrizInicial[1][1] = Integer.parseInt(valor7);
				                matrizInicial[1][2] = Integer.parseInt(valor8);
				                matrizInicial[1][3] = Integer.parseInt(valor9);
				                matrizInicial[1][4] = Integer.parseInt(valor10);

				                matrizInicial[2][0] = Integer.parseInt(valor11);
				                matrizInicial[2][1] = Integer.parseInt(valor12);
				                matrizInicial[2][2] = Integer.parseInt(valor13);
				                matrizInicial[2][3] = Integer.parseInt(valor14);
				                matrizInicial[2][4] = Integer.parseInt(valor15);

				                matrizInicial[3][0] = Integer.parseInt(valor16);
				                matrizInicial[3][1] = Integer.parseInt(valor17);
				                matrizInicial[3][2] = Integer.parseInt(valor18);
				                matrizInicial[3][3] = Integer.parseInt(valor19);
				                matrizInicial[3][4] = Integer.parseInt(valor20);

				                matrizInicial[4][0] = Integer.parseInt(valor21);
				                matrizInicial[4][1] = Integer.parseInt(valor22);
				                matrizInicial[4][2] = Integer.parseInt(valor23);
				                matrizInicial[4][3] = Integer.parseInt(valor24);
				                matrizInicial[4][4] = Integer.parseInt(valor25);

				                // Asegúrate de que las casillas de salida estén visibles
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

				                String[][] resultadoInversa = MatricesOperacion.calcularInversa(matrizInicial);
	      
					    		casilla_1_sal.setBounds(80, 9, 40, 40);
					    		casilla_1_sal.setText(resultadoInversa[0][0]);
					    		casilla_2_sal.setText(resultadoInversa[0][1]);
					    		casilla_3_sal.setText(resultadoInversa[0][2]);
					    		casilla_4_sal.setText(resultadoInversa[0][3]);
					    		casilla_5_sal.setText(resultadoInversa[0][4]);
					    		casilla_6_sal.setText(resultadoInversa[1][0]);
					    		casilla_7_sal.setText(resultadoInversa[1][1]);
					    		casilla_8_sal.setText(resultadoInversa[1][2]);
					    		casilla_9_sal.setText(resultadoInversa[1][3]);
					    		casilla_10_sal.setText(resultadoInversa[1][4]);
					    		casilla_11_sal.setText(resultadoInversa[2][0]);
					    		casilla_12_sal.setText(resultadoInversa[2][1]);
					    		casilla_13_sal.setText(resultadoInversa[2][2]);
					    		casilla_14_sal.setText(resultadoInversa[2][3]);
					    		casilla_15_sal.setText(resultadoInversa[2][4]);
					    		casilla_16_sal.setText(resultadoInversa[3][0]);
					    		casilla_17_sal.setText(resultadoInversa[3][1]);
					    		casilla_18_sal.setText(resultadoInversa[3][2]);
					    		casilla_19_sal.setText(resultadoInversa[3][3]);
					    		casilla_20_sal.setText(resultadoInversa[3][4]);
					    		casilla_21_sal.setText(resultadoInversa[4][0]);
					    		casilla_22_sal.setText(resultadoInversa[4][1]);
					    		casilla_23_sal.setText(resultadoInversa[4][2]);
					    		casilla_24_sal.setText(resultadoInversa[4][3]);
					    		casilla_25_sal.setText(resultadoInversa[4][4]);
				            }
				            
				        	else {
				                JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
				                return;
				        	}
				        }


				    }
				    
				    private boolean areAllFieldsFilled3X3() {
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
				    
				    private boolean areAllFieldsFilled4X4() {
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
				               !casilla_16_ent.getText().isEmpty();
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
				               !casilla_25_ent.getText().isEmpty();
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

    
    private void abrirVentanaMatricesMasDeUno() {
	    this.dispose();
        MatricesDos VentanaMatricesMasDeUno = new MatricesDos(desktopPane);
        desktopPane.add(VentanaMatricesMasDeUno);
        VentanaMatricesMasDeUno.setVisible(true);
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
