package WindowsNew;

import java.util.List;

import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;


public class Laufwerk extends GeraetMen {
	public String getInfo() {
		List<HWDiskStore> disks = si.getHardware().getDiskStores();
		StringBuilder sb = new StringBuilder();
		for (HWDiskStore d:disks) {
			
			sb.append("Name: " +d.getName()+"\n");
			sb.append("Model :" +d.getModel()+"\n");
			sb.append("SerialNr: " +d.getSerial()+"\n");
			sb.append("Kapazität: " +d.getSize()/1024/1024/1024+"\n"); }   //GB 
		
		return sb.toString();

	
	}
	public String Memo() {
	
	     GlobalMemory memory = si.getHardware().getMemory();
	        long total = memory.getTotal();
	        long available = memory.getAvailable();
	        long used = total - available;
	        return "Arbeitsspeicher: \nTotal : " + (total/1024/1024)+ " MB\n" +
	        "Verfügbar : " + (available/1024/1024)+ " MB\n"+
	        "Belegt : " + (used/1024/1024)+ " MB\n";
	}

}
