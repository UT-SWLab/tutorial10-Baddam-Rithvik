package observer3;

import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel {
    private Color color;
    private JSlider hueSlider;
    private JSlider saturationSlider;
    private JSlider brightnessSlider;

    public ColorPanel(Color initialColor) {
        this.color = initialColor;
    }

    public void setColor(Color newColor) {
        this.color = newColor;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        this.setBackground(color);
        super.paintComponent(g);
    }
    
    public void setHue(JSlider hueSlider) {
    	this.hueSlider = hueSlider;
    }
    
    public void setSaturation(JSlider saturationSlider) {
    	this.saturationSlider = saturationSlider;
    }
    
    public void setBrightness(JSlider brightnessSlider) {
    	this.brightnessSlider = brightnessSlider;
    }
    
    public JSlider getHue() {
    	return hueSlider;
    }
    
    public JSlider getSaturation() {
    	return saturationSlider;
    }
    
    public JSlider getBrightness() {
    	return brightnessSlider;
    }
}