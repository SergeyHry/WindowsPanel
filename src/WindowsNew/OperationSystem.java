package WindowsNew;

import oshi.software.os.OperatingSystem;

public class OperationSystem extends GeraetMen{
	public String getInfo(){
		String s = "";
		OperatingSystem os = si.getOperatingSystem();
		s+= "OS: "+os;
		s+= "\n"+os.getBitness()+" bit";
		return s;
	}

}
