package DesignPatterns.Adapter;

import DesignPatterns.Adapter.ThirdParty.YesBankApi;

public class yesBankApiAdapter implements BankAPIAdapter{
    YesBankApi yesBankApi=new YesBankApi();
    @Override
    public int fetchBal() {
        return (int) yesBankApi.getBal();
    }
}
