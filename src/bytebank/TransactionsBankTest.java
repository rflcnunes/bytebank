package bytebank;

public class TransactionsBankTest {

	public static void main(String[] args) {
		Account accountPeter = new Account(2349, 348923);
		accountPeter.credit(100);
		System.out.println(accountPeter.getBalance());
		
		boolean debitOk = accountPeter.debit(20);
		System.out.println(debitOk);
	
		
		if (debitOk) {
			System.out.println("Success in Debit");

		} else {
			System.out.println("Dont have money");

		}
		
		System.out.println(accountPeter.getBalance());
	}

}
