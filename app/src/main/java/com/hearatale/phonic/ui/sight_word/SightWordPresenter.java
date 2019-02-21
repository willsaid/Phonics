package com.hearatale.phonic.ui.sight_word;

import com.hearatale.phonic.data.AppDataManager;
import com.hearatale.phonic.data.DataManager;
import com.hearatale.phonic.data.model.phonics.SightWordModel;
import com.hearatale.phonic.data.model.typedef.SightWordsCategoryDef;
import com.hearatale.phonic.ui.base.activity.PresenterMVP;

import java.util.List;

public class SightWordPresenter extends PresenterMVP<ISightWord> implements ISightWordPresenter {

    private DataManager mDataManager;

    SightWordPresenter() {
        mDataManager = AppDataManager.getInstance();
    }

    @Override
    public List<SightWordModel> getSightWords(@SightWordsCategoryDef int category) {
        return mDataManager.getSightWords(category);
    }
}
