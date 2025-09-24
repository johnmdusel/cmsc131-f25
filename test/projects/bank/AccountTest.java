package projects.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    void testSameAs() {
        Account acct1 = new Account(
            "id1",
            "Al Davis",
            0.0,
            AccountType.CHECKING
        );
        Account acct2 = new Account(
            "id1",
            "Al Davis",
            0.0,
            AccountType.CHECKING
        );
        Account acct3 = new Account(
            "id2",
            "Betty White",
            1000.0,
            AccountType.SAVINGS
        );
        assertEquals(
            true,  // real answer
            acct1.sameAs(acct1)
        );
        assertEquals(
            true,
            acct1.sameAs(acct2)
        );
        assertEquals(
            false,
            acct1.sameAs(acct3)
        );
    }

}
