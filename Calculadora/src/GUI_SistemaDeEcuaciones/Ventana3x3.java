package GUI_SistemaDeEcuaciones;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import resources.RoundedPanel;
import resources.RoundedTextfield;

public class Ecuaciones3x3 extends JInternalFrame{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JDesktopPane desktopPane;
	
	// Declaracion de variables
	private JTextField casilla_x_1;
	private JTextField casilla_y_1;
	private JTextField casilla_z_1;
	private JTextField casilla_x_2;
	private JTextField casilla_y_2;
	private JTextField casilla_z_2;
	private JTextField casilla_x_3;
	private JTextField casilla_y_3;
	private JTextField casilla_z_3;
	
	private JTextField casilla_x_sal;
	private JTextField casilla_y_sal;
	private JTextField casilla_z_sal;
    private final RoundedPanel matrices_operaciones = new RoundedPanel(15,Color.WHITE);
    private final JLabel texto_matrices = new JLabel("MATRICES");

	// Se crea el frame
	public Ecuaciones3x3(JDesktopPane desktopPane) {
	    this.desktopPane = desktopPane;
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
		entrada.setBounds(0, 0, 410, 264);
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
		casilla_x_1.setBounds(34, 11, 70, 70);
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
		casilla_y_1.setBounds(189, 11, 70, 70);
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
		
		casilla_z_1 = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_z_1.setBackground(new Color(30, 36, 53));
		casilla_z_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_z_1.setForeground(new Color(254, 254, 254));
		casilla_z_1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_z_1.setColumns(10);
		casilla_z_1.setBounds(340, 11, 70, 70);
		casilla_z_1.setBorder(BorderFactory.createEmptyBorder());
		casilla_z_1.setCaretColor(Color.WHITE);

		casilla_z_1.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_z_1.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_z_1);
		
		casilla_x_2 = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_x_2.setBackground(new Color(30, 36, 53));
		casilla_x_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_x_2.setForeground(new Color(254, 254, 254));
		casilla_x_2.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_x_2.setColumns(10);
		casilla_x_2.setBounds(34, 98, 70, 70);
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
		casilla_y_2.setBounds(189, 98, 70, 70);
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
		
		casilla_z_2 = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_z_2.setBackground(new Color(30, 36, 53));
		casilla_z_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_z_2.setForeground(new Color(254, 254, 254));
		casilla_z_2.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_z_2.setColumns(10);
		casilla_z_2.setBounds(340, 98, 70, 70);
		casilla_z_2.setBorder(BorderFactory.createEmptyBorder());
		casilla_z_2.setCaretColor(Color.WHITE);
		casilla_z_2.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_z_2.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_z_2);
		
		casilla_x_3 = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_x_3.setBackground(new Color(30, 36, 53));
		casilla_x_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_x_3.setForeground(new Color(254, 254, 254));
		casilla_x_3.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_x_3.setColumns(10);
		casilla_x_3.setBounds(34, 186, 70, 70);
		casilla_x_3.setBorder(BorderFactory.createEmptyBorder());
		casilla_x_3.setCaretColor(Color.WHITE);
		casilla_x_3.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_x_3.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_x_3);
		
		casilla_y_3 = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_y_3.setBackground(new Color(30, 36, 53));
		casilla_y_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_y_3.setForeground(new Color(254, 254, 254));
		casilla_y_3.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_y_3.setColumns(10);
		casilla_y_3.setBounds(189, 186, 70, 70);
		casilla_y_3.setBorder(BorderFactory.createEmptyBorder());
		casilla_y_3.setCaretColor(Color.WHITE);
		casilla_y_3.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_y_3.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_y_3);
		
		casilla_z_3 = new RoundedTextfield(10,gris,Color.WHITE);
		casilla_z_3.setBackground(new Color(30, 36, 53));
		casilla_z_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_z_3.setForeground(new Color(254, 254, 254));
		casilla_z_3.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_z_3.setColumns(10);
		casilla_z_3.setBounds(340, 186, 70, 70);
		casilla_z_3.setBorder(BorderFactory.createEmptyBorder());
		casilla_z_3.setCaretColor(Color.WHITE);
		casilla_z_3.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_z_3.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});
		entrada.add(casilla_z_3);
		
		JLabel igual_1_1 = new JLabel("x");
		igual_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1.setForeground(Color.WHITE);
		igual_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_1.setBounds(82, 11, 80, 70);
		entrada.add(igual_1_1);
		
		JLabel igual_1_2 = new JLabel("x");
		igual_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_2.setForeground(Color.WHITE);
		igual_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_2.setBounds(82, 100, 80, 70);
		entrada.add(igual_1_2);
		
		JLabel igual_1_1_1 = new JLabel("x");
		igual_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_1.setForeground(Color.WHITE);
		igual_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_1_1.setBounds(82, 188, 80, 70);
		entrada.add(igual_1_1_1);
		
		JLabel igual_1_1_2 = new JLabel("y");
		igual_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_2.setForeground(Color.WHITE);
		igual_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_1_2.setBounds(238, 11, 80, 70);
		entrada.add(igual_1_1_2);
		
		JLabel igual_1_2_1 = new JLabel("y");
		igual_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_2_1.setForeground(Color.WHITE);
		igual_1_2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_2_1.setBounds(238, 100, 80, 70);
		entrada.add(igual_1_2_1);
		
		JLabel igual_1_1_1_1 = new JLabel("y");
		igual_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_1_1.setForeground(Color.WHITE);
		igual_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_1_1_1.setBounds(238, 188, 80, 70);
		entrada.add(igual_1_1_1_1);
		
		JLabel igual_1_1_2_1 = new JLabel("+");
		igual_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_2_1.setForeground(Color.WHITE);
		igual_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual_1_1_2_1.setBounds(122, 13, 80, 68);
		entrada.add(igual_1_1_2_1);
		
		JLabel igual_1_2_1_1 = new JLabel("+");
		igual_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_2_1_1.setForeground(Color.WHITE);
		igual_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual_1_2_1_1.setBounds(122, 100, 80, 70);
		entrada.add(igual_1_2_1_1);
		
		JLabel igual_1_1_1_1_1 = new JLabel("+");
		igual_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_1_1_1.setForeground(Color.WHITE);
		igual_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual_1_1_1_1_1.setBounds(122, 188, 80, 70);
		entrada.add(igual_1_1_1_1_1);
		
		JLabel igual_1_1_2_1_1 = new JLabel("+");
		igual_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_2_1_1.setForeground(Color.WHITE);
		igual_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual_1_1_2_1_1.setBounds(278, 11, 80, 70);
		entrada.add(igual_1_1_2_1_1);
		
		JLabel igual_1_2_1_1_1 = new JLabel("+");
		igual_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_2_1_1_1.setForeground(Color.WHITE);
		igual_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual_1_2_1_1_1.setBounds(278, 100, 80, 70);
		entrada.add(igual_1_2_1_1_1);
		
		JLabel igual_1_1_1_1_1_1 = new JLabel("+");
		igual_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_1_1_1_1.setForeground(Color.WHITE);
		igual_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual_1_1_1_1_1_1.setBounds(278, 188, 80, 70);
		entrada.add(igual_1_1_1_1_1_1);
		
		JPanel salida = new JPanel();
		salida.setBorder(null);
		salida.setBackground(new Color(128, 128, 192));
		salida.setBounds(444, 0, 370, 264);
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
		
		casilla_z_sal = new RoundedTextfield(10,Color.WHITE,gris);
		casilla_z_sal.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_z_sal.setForeground(new Color(30, 36, 53));
		casilla_z_sal.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		casilla_z_sal.setColumns(10);
		casilla_z_sal.setBorder(BorderFactory.createEmptyBorder());
		casilla_z_sal.setBounds(181, 186, 70, 70);
		casilla_z_sal.setEditable(false); 
		casilla_z_sal.setFocusable(false);
		salida.add(casilla_z_sal);
		
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
		
		RoundedTextfield casilla_result_3 = new RoundedTextfield(10, new Color(30, 36, 53), Color.WHITE);
		casilla_result_3.setHorizontalAlignment(SwingConstants.CENTER);
		casilla_result_3.setForeground(new Color(254, 254, 254));
		casilla_result_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		casilla_result_3.setColumns(10);
		casilla_result_3.setCaretColor(Color.WHITE);
		casilla_result_3.setBorder(BorderFactory.createEmptyBorder());
		casilla_result_3.setBackground(new Color(30, 36, 53));
		casilla_result_3.setBounds(32, 186, 70, 70);
		casilla_result_3.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        String text = casilla_result_3.getText();

		    
		        int digitCount = text.replace("-", "").length();

		        if (digitCount >= 3 && Character.isDigit(c)) {
		            evt.consume();
		        } else if (!Character.isDigit(c) && (c != '-' || text.contains("-") || text.length() != 0)) {
		            evt.consume();
		        }
		    }
		});		
		
		salida.add(casilla_result_3);
		
		JLabel igual_1 = new JLabel("=");
		igual_1.setBounds(-27, 99, 80, 70);
		salida.add(igual_1);
		igual_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1.setForeground(Color.WHITE);
		igual_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel igual_2 = new JLabel("=");
		igual_2.setBounds(-27, 186, 80, 70);
		salida.add(igual_2);
		igual_2.setHorizontalAlignment(SwingConstants.CENTER);
		igual_2.setForeground(Color.WHITE);
		igual_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
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
		
		JLabel igual_1_1_1_1_2_1 = new JLabel("z");
		igual_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_1_1_2_1.setForeground(Color.WHITE);
		igual_1_1_1_1_2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_1_1_1_2_1.setBounds(122, 187, 80, 70);
		salida.add(igual_1_1_1_1_2_1);
		
		JLabel igual_1_1_2_2 = new JLabel("z");
		igual_1_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_2_2.setForeground(Color.WHITE);
		igual_1_1_2_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_1_2_2.setBounds(381, 11, 80, 70);
		matrices.add(igual_1_1_2_2);
		
		JLabel igual_1_2_1_2 = new JLabel("z");
		igual_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_2_1_2.setForeground(Color.WHITE);
		igual_1_2_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_2_1_2.setBounds(381, 100, 80, 70);
		matrices.add(igual_1_2_1_2);
		
		JLabel igual_1_1_1_1_2 = new JLabel("z");
		igual_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		igual_1_1_1_1_2.setForeground(Color.WHITE);
		igual_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		igual_1_1_1_1_2.setBounds(381, 188, 80, 70);
		matrices.add(igual_1_1_1_1_2);
		
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
				casilla_z_1.setBounds(266, 11, 70, 70);
				casilla_x_2.setBounds(34, 98, 70, 70);
				casilla_y_2.setBounds(150, 98, 70, 70);
				casilla_z_2.setBounds(266, 98, 70, 70);
				casilla_x_3.setBounds(34, 186, 70, 70);
				casilla_y_3.setBounds(150, 186, 70, 70);
				casilla_z_3.setBounds(266, 186, 70, 70);
				
				
				// visibilidad
		        casilla_x_1.setVisible(true);
		        casilla_y_1.setVisible(true);
		        casilla_z_1.setVisible(true);
		        casilla_x_2.setVisible(true);
		        casilla_y_2.setVisible(true);
		        casilla_z_2.setVisible(true);
		        casilla_x_3.setVisible(true);
		        casilla_y_3.setVisible(true);
		        casilla_z_3.setVisible(true);
		        
		        // Mostrar las casillas de salida
		        casilla_x_sal.setVisible(true);
		        casilla_2_sal.setVisible(true);
		        casilla_3_sal.setVisible(true);
		        casilla_y_sal.setVisible(true);
		        casilla_5_sal.setVisible(true);
		        casilla_6_sal.setVisible(true);
		        casilla_z_sal.setVisible(true);
		        casilla_8_sal.setVisible(true);
		        casilla_9_sal.setVisible(true);
		    } 
		    
		    else if(valor == 4){
		        casilla_x_1.setVisible(false);
		        casilla_y_1.setVisible(false);
		        casilla_z_1.setVisible(false);
		        casilla_x_2.setVisible(false);
		        casilla_y_2.setVisible(false);
		        casilla_z_2.setVisible(false);
		        casilla_x_3.setVisible(false);
		        casilla_y_3.setVisible(false);
		        casilla_z_3.setVisible(false);
		        
		        casilla_x_sal.setVisible(false);
		        casilla_2_sal.setVisible(false);
		        casilla_3_sal.setVisible(false);
		        casilla_y_sal.setVisible(false);
		        casilla_5_sal.setVisible(false);
		        casilla_6_sal.setVisible(false);
		        casilla_z_sal.setVisible(false);
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
		
		JPanel panel_sistema_2x2 = new RoundedPanel(15,new Color(30, 36, 53));
		panel_sistema_2x2.setBackground(new Color(30, 36, 53));
		panel_sistema_2x2.setBounds(10, 11, 390, 67);
		panel_sistema_2x2.setOpaque(false);
		menu_matrices.add(panel_sistema_2x2);
		panel_sistema_2x2.setLayout(new GridLayout(1, 0, 0, 0));

		
		JLabel sistema_2x2 = new JLabel("Sistema 2x2");
		sistema_2x2.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		sistema_2x2.setForeground(letrasColor);
		sistema_2x2.setHorizontalAlignment(SwingConstants.CENTER);
		sistema_2x2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_sistema_2x2.add(sistema_2x2);
		
		panel_sistema_2x2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_sistema_2x2.setBackground(new Color(48, 58, 85));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_sistema_2x2.setBackground(new Color(30, 36, 53));
			}
			
			public void mouseClicked(MouseEvent e) {
				abrirVentanaEcuaciones();
			}
			
		});
		JPanel panel_sistema_3x3 = new RoundedPanel(15,miColorSec);
		panel_sistema_3x3.setOpaque(false);
		panel_sistema_3x3.setBackground(miColorSec);
		panel_sistema_3x3.setBounds(434, 11, 390, 67);
		menu_matrices.add(panel_sistema_3x3);
		panel_sistema_3x3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel sistema_3x3 = new JLabel("Sistema 3x3");
		sistema_3x3.setHorizontalAlignment(SwingConstants.CENTER);
		sistema_3x3.setForeground(letrasColor);
		sistema_3x3.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		sistema_3x3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_sistema_3x3.add(sistema_3x3);
		
		JPanel menu_general = new JPanel();
		menu_general.setLayout(null);
		menu_general.setBackground(new Color(26, 27, 40));
		menu_general.setBounds(22, 34, 834, 80);
		contentPane.add(menu_general);
		
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

    	matrices_operaciones.setOpaque(false);
    	matrices_operaciones.setBackground(new Color(30, 36, 53));
    	matrices_operaciones.setBounds(432, 11, 185, 58);
    	
		matrices_operaciones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaMatricesUno();
            }
		});
    	
    	menu_general.add(matrices_operaciones);
    	matrices_operaciones.setLayout(new GridLayout(1, 0, 0, 0));
    	
    	JLabel texto_matrices_1 = new JLabel("MATRICES");
    	texto_matrices_1.setHorizontalAlignment(SwingConstants.CENTER);
    	texto_matrices_1.setForeground(new Color(30, 36, 53));
    	texto_matrices_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		texto_matrices_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	texto_matrices_1.setBackground(new Color(87, 116, 250));
    	matrices_operaciones.add(texto_matrices_1);
    	texto_matrices.setHorizontalAlignment(SwingConstants.CENTER);
    	texto_matrices.setForeground(new Color(30, 36, 53));
		texto_matrices.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	texto_matrices.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
    	texto_matrices.setBackground(new Color(87, 116, 250));
		RoundedPanel ecuaciones = new RoundedPanel(15, new Color(87, 116, 250));
		ecuaciones.setOpaque(false);
		ecuaciones.setBackground(Color.WHITE);
		ecuaciones.setBounds(639, 11, 185, 58);
		menu_general.add(ecuaciones);
		ecuaciones.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel texto_ecuaciones = new JLabel("ECUACIONES");
		texto_ecuaciones.setHorizontalAlignment(SwingConstants.CENTER);
		texto_ecuaciones.setForeground(Color.WHITE);
		texto_ecuaciones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		texto_ecuaciones.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
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
				        	int valor1 = Integer.parseInt(casilla_x_1.getText());
				        	int valor2 = Integer.parseInt(casilla_y_1.getText());
				        	int valor3 = Integer.parseInt(casilla_z_1.getText());
				        	int valor4 = Integer.parseInt(casilla_result_1.getText());
				        	int valor5 = Integer.parseInt(casilla_x_2.getText());
				        	int valor6 = Integer.parseInt(casilla_y_2.getText());
				        	int valor7 = Integer.parseInt(casilla_z_2.getText());
				        	int valor8 = Integer.parseInt(casilla_result_2.getText());
				        	int valor9 = Integer.parseInt(casilla_x_3.getText());
				        	int valor10 = Integer.parseInt(casilla_y_3.getText());
				        	int valor11 = Integer.parseInt(casilla_z_3.getText());
				        	int valor12 = Integer.parseInt(casilla_result_3.getText());

				        	// Llamado a la logica de calcular determinante
				        	resolverSistema3x3(valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9, valor10, valor11, valor12);
				        	
				        }else {
				            JOptionPane.showMessageDialog(null, "Por favor, complete todas las casillas antes de continuar.");
				        }
					}
					
				    private boolean areAllFieldsFilled() {
				        return !casilla_x_1.getText().isEmpty() &&
				               !casilla_y_1.getText().isEmpty() &&
				               !casilla_z_1.getText().isEmpty() &&
				               !casilla_result_1.getText().isEmpty() &&
				               !casilla_x_2.getText().isEmpty() &&
				               !casilla_y_2.getText().isEmpty() &&
				               !casilla_z_2.getText().isEmpty() &&
				               !casilla_result_2.getText().isEmpty() &&
				               !casilla_x_3.getText().isEmpty() &&
				               !casilla_y_3.getText().isEmpty() &&
				               !casilla_z_3.getText().isEmpty() &&
				               !casilla_result_3.getText().isEmpty();
				    }
				});
	}

	public void resolverSistema3x3(int a1, int b1, int c1, int d1, int a2, int b2, int c2, int d2, int a3, int b3, int c3, int d3) {
	
	    double determinante = a1 * (b2 * c3 - b3 * c2) - b1 * (a2 * c3 - a3 * c2) + c1 * (a2 * b3 - a3 * b2);
	
	    if (determinante == 0) {
	        System.out.println("El sistema no tiene solución única.");
	    } else {
	        double x = (d1 * (b2 * c3 - b3 * c2) - b1 * (d2 * c3 - d3 * c2) + c1 * (d2 * b3 - d3 * b2)) / determinante;
	        double y = (a1 * (d2 * c3 - d3 * c2) - d1 * (a2 * c3 - a3 * c2) + c1 * (a2 * d3 - a3 * d2)) / determinante;
	        double z = (a1 * (b2 * d3 - b3 * d2) - b1 * (a2 * d3 - a3 * d2) + d1 * (a2 * b3 - a3 * b2)) / determinante;
	        
	        casilla_x_sal.setText(String.format("%.2f", x));
	        casilla_y_sal.setText(String.format("%.2f", y));
	        casilla_z_sal.setText(String.format("%.2f", z));
	    }
	    
	    
	}
    private void abrirVentanaMatricesUno() {
	    this.dispose();
    	MatricesUno ventanaMatricesUno = new MatricesUno(desktopPane);
        desktopPane.add(ventanaMatricesUno);
        ventanaMatricesUno.setVisible(true);
        this.setVisible(false);
    }
    
	private void abrirVentanaEcuaciones() {
	    // Cerrar la ventana actual
	    this.dispose();

	    // Abrir Ventana2x2 en el mismo JDesktopPane
	    Ecuaciones2x2 ventana2x2 = new Ecuaciones2x2(desktopPane);
	    desktopPane.add(ventana2x2);
	    ventana2x2.setVisible(true);
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