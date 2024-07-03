package main.java.com.calculadora.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Arc2D;

public class RoundedPanelEXT extends JPanel {
    private static final long serialVersionUID = 1L;
    private Color backgroundColor;
    private Color originalBackgroundColor;
    private int topLeftRadius = 15;
    private int topRightRadius = 15;
    private int bottomLeftRadius = 15;
    private int bottomRightRadius = 15;

    public RoundedPanelEXT(LayoutManager layout, int topLeftRadius, int topRightRadius, int bottomLeftRadius, int bottomRightRadius) {
        super(layout);
        this.topLeftRadius = topLeftRadius;
        this.topRightRadius = topRightRadius;
        this.bottomLeftRadius = bottomLeftRadius;
        this.bottomRightRadius = bottomRightRadius;
    }

    public RoundedPanelEXT(LayoutManager layout, int topLeftRadius, int topRightRadius, int bottomLeftRadius, int bottomRightRadius, Color bgColor) {
        super(layout);
        this.topLeftRadius = topLeftRadius;
        this.topRightRadius = topRightRadius;
        this.bottomLeftRadius = bottomLeftRadius;
        this.bottomRightRadius = bottomRightRadius;
        backgroundColor = bgColor;
        originalBackgroundColor = bgColor;
    }

    public RoundedPanelEXT(int topLeftRadius, int topRightRadius, int bottomLeftRadius, int bottomRightRadius) {
        super();
        this.topLeftRadius = topLeftRadius;
        this.topRightRadius = topRightRadius;
        this.bottomLeftRadius = bottomLeftRadius;
        this.bottomRightRadius = bottomRightRadius;
    }

    public RoundedPanelEXT(int topLeftRadius, int topRightRadius, int bottomLeftRadius, int bottomRightRadius, Color bgColor) {
        super();
        this.topLeftRadius = topLeftRadius;
        this.topRightRadius = topRightRadius;
        this.bottomLeftRadius = bottomLeftRadius;
        this.bottomRightRadius = bottomRightRadius;
        backgroundColor = bgColor;
        originalBackgroundColor = bgColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();

        if (backgroundColor != null) {
            graphics.setColor(backgroundColor);
        } else {
            graphics.setColor(getBackground());
        }

        // Draw rounded rectangle with different radii for each corner
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Top-left corner
        Arc2D.Double arcTL = new Arc2D.Double(0, 0, 2 * topLeftRadius, 2 * topLeftRadius, 180, 90, Arc2D.OPEN);
        graphics.fill(arcTL);

        // Top-right corner
        Arc2D.Double arcTR = new Arc2D.Double(width - 2 * topRightRadius, 0, 2 * topRightRadius, 2 * topRightRadius, 270, 90, Arc2D.OPEN);
        graphics.fill(arcTR);

        // Bottom-left corner
        Arc2D.Double arcBL = new Arc2D.Double(0, height - 2 * bottomLeftRadius, 2 * bottomLeftRadius, 2 * bottomLeftRadius, 90, 90, Arc2D.OPEN);
        graphics.fill(arcBL);

        // Bottom-right corner
        Arc2D.Double arcBR = new Arc2D.Double(width - 2 * bottomRightRadius, height - 2 * bottomRightRadius, 2 * bottomRightRadius, 2 * bottomRightRadius, 0, 90, Arc2D.OPEN);
        graphics.fill(arcBR);

        // Fill the remaining area
        graphics.fillRect(topLeftRadius, 0, width - topLeftRadius - topRightRadius, height);
        graphics.fillRect(0, topLeftRadius, width, height - topLeftRadius - bottomLeftRadius);

        graphics.dispose();
    }

    public void addMouseHoverEffect(final Color hoverColor) {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                originalBackgroundColor = backgroundColor;
                backgroundColor = hoverColor;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                backgroundColor = originalBackgroundColor;
                repaint();
            }
        });
    }
}
