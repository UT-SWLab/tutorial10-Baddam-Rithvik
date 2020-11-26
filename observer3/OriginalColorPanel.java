// UTEID: rrb2442
package observer3;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import javax.swing.*;

public class OriginalColorPanel extends ColorPanel implements ChangeListener{

	public OriginalColorPanel(Color initialColor, JSlider hueSlider, JSlider saturationSlider, JSlider brightnessSlider) {
		super(initialColor);
		setHue(hueSlider);
		setSaturation(saturationSlider);
		setBrightness(brightnessSlider);
		
		getHue().addChangeListener(this);
		getSaturation().addChangeListener(this);
		getBrightness().addChangeListener(this);
	}
	
	public void stateChanged(ChangeEvent e) {
        if (getHue() != null && getSaturation() != null && getBrightness() != null) {
            
        	float newHue = (float) getHue().getValue() / 100;
            float newSaturation = (float) getSaturation().getValue() / 100;
            float newBrightness = (float) getBrightness().getValue() / 100;
            
            Color newColor = Color.getHSBColor(newHue, newSaturation, newBrightness);
            setColor(newColor);

        }
    }
	
}
