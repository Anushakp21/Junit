import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

	private BankAccount account;

	@BeforeEach
	void setUp() {
		account = new BankAccount(100.0); 
	}

	@Test
	void testDeposit() {
		account.deposit(50.0);
		assertEquals(150.0, account.getBalance(),"Balance should be 150 after deposit");
	}

	@Test
	void testWithdraw() throws InsufficientFundsException {
		account.withdraw(40.0);
		assertEquals(60.0, account.getBalance(), "Balance should be 60 after withdrawal");
	}

	@Test
	void testWithdrawInsufficientFunds() {
		assertThrows(InsufficientFundsException.class, () -> {
			account.withdraw(200.0); 
		});
	}
}
