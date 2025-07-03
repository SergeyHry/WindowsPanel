package WindowsNew;


import java.util.Arrays;
import java.util.List;

import oshi.hardware.NetworkIF;

public class Netzwerk extends GeraetMen {
	public String getInfo() {
		List<NetworkIF> netzwerkKarten = si.getHardware().getNetworkIFs();
		StringBuilder sb =  new StringBuilder();
        for (NetworkIF netzwerk : netzwerkKarten) {
        	
            sb.append("Netzwerkschnittstelle: " + netzwerk.getName());
            sb.append("Display-Name: " + netzwerk.getDisplayName());
            sb.append("MAC-Adresse: " + netzwerk.getMacaddr());

            // IP-Adressen
            String[] ipv4 = netzwerk.getIPv4addr();
            String[] ipv6 = netzwerk.getIPv6addr();

            sb.append("\nIPv4: " + Arrays.toString(ipv4));
            sb.append("\nIPv6: " + Arrays.toString(ipv6)+"\n");
            
        }
        return sb.toString();
       
    }
}