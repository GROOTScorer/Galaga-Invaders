package main.java.com.calculadora.gui;

import javax.swing.*;
import java.awt.*;

public class RoundedTextfield extends JTextField {
    private static final long serialVersionUID = 1L;
    private Color backgroundColor;
    private Color foregroundColor;
    private int cornerRadius = 15;

    public RoundedTextfield() {
        super();
        setOpaque(false);
    }

    public RoundedTextfield(int columns) {
        super(columns);
        setOpaque(false);
    }

    public RoundedTextfield(String text) {
        super(text);
        setOpaque(false);
    }

    public RoundedTextfield(String text, int columns) {
        super(text, columns);
        setOpaque(false);
    }

    public RoundedTextfield(int columns, Color bgColor, Color fgColor) {
        super(columns);
        setOpaque(false);
        backgroundColor = bgColor;
        foregroundColor = fgColor;
    }

    public RoundedTextfield(String text, int columns, Color bgColor, Color fgColor) {
        super(text, columns);
        setOpaque(false);
        backgroundColor = bgColor;
        foregroundColor = fgColor;
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
}
