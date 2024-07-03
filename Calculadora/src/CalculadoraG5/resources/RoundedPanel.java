package CalculadoraG5.resources;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RoundedPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private Color backgroundColor;
    private Color originalBackgroundColor;
    private int cornerRadius = 15;
    private float brightnessFactor = 0.86f; // Factor de brillo para el hover

    public RoundedPanel(LayoutManager layout, int radius) {
        super(layout);
        cornerRadius = radius;
        init();
    }

    public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
        super(layout);
        cornerRadius = radius;
        backgroundColor = bgColor;
        originalBackgroundColor = bgColor;
        init();
    }

    public RoundedPanel(int radius) {
        super();
        cornerRadius = radius;
        init();
    }

    public RoundedPanel(int radius, Color bgColor) {
        super();
        cornerRadius = radius;
        backgroundColor = bgColor;
        originalBackgroundColor = bgColor;
        init();
    }

    private void init() {
        setOpaque(false); // Hacer que el panel sea transparente para ver el fondo del contenedor
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                originalBackgroundColor = backgroundColor;
                backgroundColor = brightenColor(originalBackgroundColor, brightnessFactor);
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                backgroundColor = originalBackgroundColor;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (backgroundColor != null) {
            graphics.setColor(backgroundColor);
        } else {
            graphics.setColor(getBackground());
        }
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); // paint background
        graphics.setColor(getForeground());
        graphics.dispose();
    }

    private Color brightenColor(Color color, float factor) {
        float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float brightness = hsb[2];
        float newBrightness = Math.min(1.0f, brightness * factor);
        return new Color(Color.HSBtoRGB(hsb[0], hsb[1], newBrightness));
    }
}
