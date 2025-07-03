package WindowsNew;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.TimeUnit;



import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OSProcess;

import oshi.software.os.OperatingSystem;

public class CPU extends GeraetMen {
	
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
	    HardwareAbstractionLayer hal = si.getHardware();
	    CentralProcessor cpu = hal.getProcessor();
	    ComputerSystem cs = hal.getComputerSystem();
	    String info ="";
	    
	    info +="CPU: " + cpu.getProcessorIdentifier().getName()+"\n";
	    info += "Hersteller: " + cs.getManufacturer()+"\n";
	    info+="Modell: " + cs.getModel()+"\n";
	    return info;
	}

	public void busy() throws InterruptedException {
	 
	   while(true) {
		CentralProcessor processor = si.getHardware().getProcessor();
	    long[] prevTicks = processor.getSystemCpuLoadTicks();
	    TimeUnit.SECONDS.sleep(1);
	    double cpuLoad = processor.getSystemCpuLoadBetweenTicks(prevTicks) * 100;
	    System.out.printf("CPU-Auslastung: %.1f %%\n", cpuLoad );
	   try {
           Thread.sleep(3000); // 3 Sekunden warten
       } catch (InterruptedException e) {
           e.printStackTrace();
       }}   
	   }public String getProcInfo() {
		    OperatingSystem os = si.getOperatingSystem();
		    List<OSProcess> proc = os.getProcesses();
		    
		    StringBuilder sb = new StringBuilder();
		    for (OSProcess procs : proc) {
		        sb.append(String.format(
		            "PID: %d, Name: %s, CPU: %.2f%%, Memory: %d MB\n",
		            procs.getProcessID(),
		            procs.getName(),
		            100d * procs.getProcessCpuLoadCumulative(),
		            procs.getResidentSetSize() / 1024 / 1024));
		    }
		    
		    return "CPU PROCESSE: \n" +sb.toString();
	   }


       }
	   



	