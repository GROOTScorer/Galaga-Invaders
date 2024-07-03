package CalculadoraG5.resources;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RoundedButtons extends JButton {
    private static final long serialVersionUID = 1L;
    private Color originalBackgroundColor;
    private int cornerRadius = 15;
    private float brightnessFactor = 0.86f; // Factor de brillo para el hover

    public RoundedButtons(String text, int radius) {
        super(text);
        cornerRadius = radius;
        init();
    }

    public RoundedButtons(String text, int radius, Color bgColor) {
        super(text);
        cornerRadius = radius;
        setBackground(bgColor);
        originalBackgroundColor = bgColor;
        init();
    }

    private void init() {
        setOpaque(false); // Hacer que el botón sea transparente para ver el fondo del contenedor
        setContentAreaFilled(false); // Evitar que el botón llene su área de contenido
        setBorderPainted(false); // Evitar que el botón pinte su borde
        setFocusPainted(false); // Evitar que el botón pinte su borde de enfoque

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                originalBackgroundColor = getBackground();
                setBackground(brightenColor(originalBackgroundColor, brightnessFactor));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(originalBackgroundColor);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        graphics.setColor(getBackground());

        // Dibuja el borde redondeado
        graphics.fillRoundRect(0, 0, width - 1, height - 1, cornerRadius, cornerRadius);

        // Dibuja el texto centrado
        graphics.setColor(getForeground());
        graphics.setFont(getFont());
        FontMetrics fm = graphics.getFontMetrics();
        Rectangle stringBounds = fm.getStringBounds(getText(), graphics).getBounds();
        int textX = (width - stringBounds.width) / 2;
        int textY = (height - stringBounds.height) / 2 + fm.getAscent();
        graphics.drawString(getText(), textX, textY);

        graphics.dispose();
    }

    private Color brightenColor(Color color, float factor) {
        float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float brightness = hsb[2];
        float newBrightness = Math.min(1.0f, brightness * factor);
        return new Color(Color.HSBtoRGB(hsb[0], hsb[1], newBrightness));
    }

    @Override
    public void setBorder(Border border) {
        // Sobrescribe este método para asegurarte de que el borde se establezca correctamente
        // y se respete la forma redondeada del botón.
        super.setBorder(border);
    }
}
