
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(12121212);
		
		Conta conta2 = new Conta(1337, 16548);
		Conta conta3 = new Conta(13332, 16544);
		
		System.out.println(Conta.getTotal());
	}

}
