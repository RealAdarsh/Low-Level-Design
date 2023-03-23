package DesignPatterns.Adapter;

import DesignPatterns.Adapter.ThirdParty.ICICIBankApi;

public class ICICIBankApiAdapter implements BankAPIAdapter{
    ICICIBankApi iciciBankApi=new ICICIBankApi();
    @Override
    public int fetchBal() {
        return iciciBankApi.checkBal();
    }
}
