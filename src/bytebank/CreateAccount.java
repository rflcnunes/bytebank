package bytebank;

public class CreateAccount {

	public static void main(String[] args) {
		Account firstAccount = new Account(4598, 324378);
		firstAccount.credit(200);
		System.out.println(firstAccount.getBalance());

	}

}
