package CalculadoraG5.resources;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RoundedTextfield extends JTextField {
    private static final long serialVersionUID = 1L;
    private Color backgroundColor;
    private Color foregroundColor;
    private int cornerRadius = 15;

    public RoundedTextfield() {
        super();
        setOpaque(false);
        addKeyListener(new NavigationKeyAdapter());
    }

    public RoundedTextfield(int columns) {
        super(columns);
        setOpaque(false);
        addKeyListener(new NavigationKeyAdapter());
    }

    public RoundedTextfield(String text) {
        super(text);
        setOpaque(false);
        addKeyListener(new NavigationKeyAdapter());
    }

    public RoundedTextfield(String text, int columns) {
        super(text, columns);
        setOpaque(false);
        addKeyListener(new NavigationKeyAdapter());
    }

    public RoundedTextfield(int columns, Color bgColor, Color fgColor) {
        super(columns);
        setOpaque(false);
        backgroundColor = bgColor;
        foregroundColor = fgColor;
        addKeyListener(new NavigationKeyAdapter());
    }

    public RoundedTextfield(String text, int columns, Color bgColor, Color fgColor) {
        super(text, columns);
        setOpaque(false);
        backgroundColor = bgColor;
        foregroundColor = fgColor;
        addKeyListener(new NavigationKeyAdapter());
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (backgroundColor != null) {
            graphics.setColor(backgroundColor);
            graphics.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius);
        } else if (isOpaque()) {
            graphics.setColor(getBackground());
            graphics.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius);
        }

        if (foregroundColor != null) {
            setForeground(foregroundColor);
        }

        super.paintComponent(graphics);
        graphics.dispose();
    }

    public void setBackgroundColor(Color bgColor) {
        this.backgroundColor = bgColor;
    }

    public void setForegroundColor(Color fgColor) {
        this.foregroundColor = fgColor;
    }

    private class NavigationKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            Component source = (Component) e.getSource();
            Container parent = source.getParent();

            int index = -1;
            Component[] components = parent.getComponents();
            for (int i = 0; i < components.length; i++) {
                if (components[i] == source) {
                    index = i;
                    break;
                }
            }

            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (index > 0) {
                        components[index - 1].requestFocus();
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (index < components.length - 1) {
                        components[index + 1].requestFocus();
                    }
                    break;
 
                default:
                    break;
            }
        }
    }
}
