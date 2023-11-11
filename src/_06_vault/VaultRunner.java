package _06_vault;

public class VaultRunner {
public static void main(String[] args) {

Vault vault = new Vault();
SecretAgent agent = new SecretAgent();
int y = agent.findCode(vault);
if(y==-1) {
	System.out.println("You got the wrong code");
}
else {
	System.out.println("You got it secret agent, the code is: "+y);

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
