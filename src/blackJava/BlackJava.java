package blackJava;

import java.io.*;

public class BlackJava {

	private
		Process p;
		BufferedReader pRead;
		BufferedWriter pWrite;
	
	public void processBuilder(String _type){
			try {
				this.p = Runtime.getRuntime().exec("ls");
				this.pRead= new BufferedReader(new InputStreamReader(p.getInputStream()));
				String line = null;
	            while ((line = pRead.readLine()) != null) {
	                System.out.println(line);
	            }
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public void runCommand(String _args){
		System.out.println("Does this work?");
	}
	
	public BlackJava() {
		// TODO Auto-generated constructor stub
	}

}
