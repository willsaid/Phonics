package com.hearatale.phonic.ui.letter;

import com.hearatale.phonic.data.AppDataManager;
import com.hearatale.phonic.data.DataManager;
import com.hearatale.phonic.data.model.phonics.letters.LetterModel;
import com.hearatale.phonic.ui.base.activity.PresenterMVP;

import java.util.List;
import java.util.Map;

public class LetterPresenter extends PresenterMVP<ILetter> implements ILetterPresenter {

    DataManager mDataManager;

    LetterPresenter() {
        mDataManager = AppDataManager.getInstance();
    }

    Map<String, List<LetterModel>> getLetter() {
        return mDataManager.getLetters();
    }
}
