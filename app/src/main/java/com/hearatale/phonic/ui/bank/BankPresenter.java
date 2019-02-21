package com.hearatale.phonic.ui.bank;

import com.hearatale.phonic.data.AppDataManager;
import com.hearatale.phonic.data.DataManager;
import com.hearatale.phonic.ui.base.activity.PresenterMVP;

public class BankPresenter extends PresenterMVP<IBank> implements IBankPresenter {
    DataManager mDataManager;

    BankPresenter(){
        mDataManager = AppDataManager.getInstance();
    }

    public int getTotalGoldCount(String appFeature){
        return mDataManager.getTotalGoldCount(appFeature);
    }

    public int getTotalSilverCount(String appFeature){
        return mDataManager.getTotalSilverCount(appFeature);
    }

}
