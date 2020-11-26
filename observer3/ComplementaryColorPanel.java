// UTEID: rrb2442
package observer3;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ComplementaryColorPanel extends ColorPanel implements PropertyChangeListener{

	public ComplementaryColorPanel(Color initialColor) {
		super(initialColor);
		DisplayColors.originalColorPanel.addPropertyChangeListener((PropertyChangeListener) this);
	}
	
	public void propertyChange(PropertyChangeEvent e) {
        if (DisplayColors.originalColorPanel.getHue() != null && DisplayColors.originalColorPanel.getSaturation()!= null && DisplayColors.originalColorPanel.getBrightness() != null) {
            float newHue = (float) DisplayColors.originalColorPanel.getHue().getValue() / 100;
            float newSaturation = (float) DisplayColors.originalColorPanel.getSaturation().getValue() / 100;
            float newBrightness = (float) DisplayColors.originalColorPanel.getBrightness().getValue() / 100;
            
            float complementaryHue = newHue - (float) 0.5;
            if (complementaryHue < 0) {
                complementaryHue = complementaryHue + 1;
            }
            
            Color complementaryColor = Color.getHSBColor(complementaryHue, newSaturation, newBrightness);
            setColor(complementaryColor);

        }
    }
	
	
	
	
}