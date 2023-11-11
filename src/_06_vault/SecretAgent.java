package _06_vault;

public class SecretAgent {

public int findCode(Vault  vault ) {
	for(int x = 0;x<1000001;x++) {
		if(vault.tryCode(x)){
			return x;
		
		}
		
	}
return -1;




}






}
