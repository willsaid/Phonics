package com.hearatale.phonic.ui.sentence;

import com.hearatale.phonic.data.AppDataManager;
import com.hearatale.phonic.data.DataManager;
import com.hearatale.phonic.ui.base.activity.PresenterMVP;

public class SentencePresenter extends PresenterMVP<ISentence> implements ISentencePresenter {

    private DataManager mDataManager;

    SentencePresenter() {
        mDataManager = AppDataManager.getInstance();
    }

}
