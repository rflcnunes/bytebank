package bytebank;

public class TestBank {

	public static void main(String[] args) {
		Client martin = new Client();
		martin.setName("Martin Richards");
		martin.setCpf("222.222.222-22");
		martin.setTitle("Developer");
		
		Account accountMartin = new Account(4598, 324378);
		accountMartin.credit(200);
		
		accountMartin.setClient(martin);
		System.out.println(accountMartin.getClient().getName());
		System.out.println(accountMartin.getClient());

	}

}
