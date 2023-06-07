package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {

    @Test
    public void shouldAddToPositiveBalance() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(3_000);

        Assertions.assertEquals(3_000, account.getBalance());
    }

    @Test
    public void shouldAddToNegativeBalance() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(-3_000);

        Assertions.assertEquals(0, account.getBalance());
    }


    @Test
    void payTest() {
        CreditAccount account = new CreditAccount(
                1000,
                5_000,
                15
        );
        account.pay(500);
        Assertions.assertEquals(500, account.getBalance());
        System.out.println(account.balance);
    }

    @Test
    void payOverTest() {
        CreditAccount account = new CreditAccount(
                0,
                500,
                15
        );
        account.pay(1000);
        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    void payNegativeTest() {
        CreditAccount account = new CreditAccount(
                4000,
                5_000,
                15
        );
        account.pay(-1000);
        Assertions.assertEquals(4000, account.getBalance());
    }

    @Test
    void addTest() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );
        account.add(1000);
        Assertions.assertEquals(1000, account.getBalance());


    }

    @Test
    void addWhenOver0Test() {
        CreditAccount account = new CreditAccount(
                500,
                5_000,
                15
        );
        account.add(1000);
        Assertions.assertEquals(1500, account.getBalance());


    }

    @Test
    void addNegativeTest() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );
        account.add(-1000);
        Assertions.assertEquals(0, account.getBalance());


    }

    @Test
    void yearChangeTest() {
        CreditAccount account = new CreditAccount(
                200,
                5_000,
                15
        );
        account.yearChange();

        Assertions.assertEquals(200, account.getBalance());
    }

    @Test
    void yearNegativeChangeTest() {
        CreditAccount account = new CreditAccount(
                -200,
                5_000,
                15
        );
        account.yearChange();

        Assertions.assertEquals(-230, account.getBalance());
    }


    @Test
    void getCreditLimitTest() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );
        account.getCreditLimit();
        Assertions.assertEquals(5000, account.getCreditLimit());

    }

    @Test
    void throwsTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CreditAccount account = new CreditAccount(
                    0,
                    5000,
                    -15
            );
            account.getBalance();
        });
    }
}