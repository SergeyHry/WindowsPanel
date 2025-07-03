package WindowsNew;
import java.io.IOException;
public class Fenster {
	   public void getFenster() {
	        try {
	            Process process = Runtime.getRuntime().exec("cmd /c start devmgmt.msc");
	        } catch (IOException e) {
	            System.err.println("Fehler beim Öffnen des Geräte-Managers: " + e.getMessage());
	        }}
	        public void getFenster2() {
	        	   try {
	   	            Process process = Runtime.getRuntime().exec("cmd /c start taskmgr");
	   	        } catch (IOException e) {
	   	            System.err.println("Fehler beim Öffnen des Geräte-Managers: " + e.getMessage());
	   	        }
	        }
	        public void dnsCaschClean() {
	            try {
	                ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "ipconfig /flushdns");
	                builder.inheritIO();
	                Process process = builder.start();
	                process.waitFor();
	            } catch (IOException | InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	      
	       
	       public void sysCaschClean() {
	    	   try {
	    		   ProcessBuilder builder = new ProcessBuilder("cmd /c  cleanmnr /sagerun: 1");
	    		   builder.inheritIO();
	    		   Process process = builder.start();
	    		   process.waitFor();
	    	   }
	    	   catch (IOException | InterruptedException e) {
	                e.printStackTrace();
	            }
	       }
	       public void basketClean() {
	    	   try {
	    		   Process process = Runtime.getRuntime().exec("powershell -command \"Clear-RecycleBin -Force\"");
	    	   }
	    	   catch (IOException e) {
		    	   System.err.println("Fehler beim Korb Leeren" + e.getMessage());
	       }
	       }
	    }
	
	    
	
