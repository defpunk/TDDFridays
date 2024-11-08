import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class VendingMachineTest {
    @Test
    void shouldDisplayInsertCoinWhenNoCoinsAddedToMachine(){
        VendingMachine vendingMachine = new VendingMachine();
        assertThat(vendingMachine.getDisplay(), is("Insert Coins"));
    }

    @Test
    void shouldHaveBalanceOf_0_point_1_when_dimeAdded() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin("Dime");
        assertThat(vendingMachine.getBalance(), is(0.1F));
    }

    @Test
    void shouldHaveBalanceOf_0_point_25_when_dquarter_Added() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin("Quarter");
        assertThat(vendingMachine.getBalance(), is(0.25F));
    }

    @Test
    void addingAPennyShouldNotIncreaseBalance() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin("Penny");
        assertThat(vendingMachine.getBalance(), is(0.0F));
    }

}
