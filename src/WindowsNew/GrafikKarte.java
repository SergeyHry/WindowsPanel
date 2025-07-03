package WindowsNew;

import java.util.List;

import oshi.SystemInfo;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
public class GrafikKarte extends GeraetMen{
public String getInfo(){
	StringBuilder sb = new StringBuilder();
	
	HardwareAbstractionLayer hal = si.getHardware();
	List<GraphicsCard> Card = hal.getGraphicsCards();
	for(GraphicsCard card: Card) {
		sb.append(card.getName()+"\n");
		sb.append(card.getVendor()+"\n");
		sb.append(card.getVRam()/(1024*1024) + " MB");
	}
	return sb.toString();
}

}
