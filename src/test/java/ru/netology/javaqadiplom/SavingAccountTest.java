package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {

    @Test
    public void shouldAddLessThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(3_000);


        Assertions.assertEquals(2_000 + 3_000, account.getBalance());
    }

    @Test
    public void shouldAddMoreThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(11_000);

        Assertions.assertEquals(2_000, account.getBalance());
    }

    @Test
    public void shouldAddEqualsMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(8_000);

        Assertions.assertEquals(10_000, account.getBalance());
    }

    @Test
    public void shouldPayLessThenBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.pay(1_000);

        Assertions.assertEquals(1_000, account.getBalance());
    }

    @Test
    public void shouldPayMoreThenBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.pay(3_000);

        Assertions.assertEquals(2_000, account.getBalance());
    }

    @Test
    public void shouldPayEqualsBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.pay(2_000);

        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    public void shouldShowYearChange() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.yearChange();

        Assertions.assertEquals(2_100, account.yearChange());
    }


}
