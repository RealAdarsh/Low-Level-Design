package DesignPatterns.Adapter;

public class PhonePe {
    public static void main(String[] args) {
        BankAPIAdapter bankAPIAdapter= new ICICIBankApiAdapter();
        System.out.println(bankAPIAdapter.fetchBal());
    }
}
