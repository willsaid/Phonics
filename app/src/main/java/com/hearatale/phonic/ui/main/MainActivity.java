package com.hearatale.phonic.ui.main;

import android.content.Intent;
import android.os.Bundle;

import com.hearatale.phonic.R;
import com.hearatale.phonic.data.Constants;
import com.hearatale.phonic.data.model.typedef.MainDef;
import com.hearatale.phonic.service.AudioPlayerHelper;
import com.hearatale.phonic.ui.base.activity.ActivityMVP;
import com.hearatale.phonic.ui.splash.SplashActivity;
import com.hearatale.phonic.utils.Config;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends ActivityMVP<MainPresenter, IMain> implements IMain {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void makeView() {
        mView = this;
    }

    @Override
    protected void makePresenter() {
        mPresenter = new MainPresenter();
    }

    @OnClick(R.id.image_button_alphabet_letters)
    void onAlphabetLetters() {
        playAudio("alphabet letters");
        pushIntent(MainDef.ALPHABET_LETTERS);
    }

    @OnClick(R.id.image_button_phonics)
    void onPhonics() {
        playAudio("phonics");
        pushIntent(MainDef.PHONICS);
    }

    private void playAudio(String fileName) {
        String path = Config.SOUND_PATH + fileName;
        AudioPlayerHelper.getInstance().playAudio(path);
    }

    public void pushIntent(@MainDef int mainDef) {
        Intent intent = new Intent(MainActivity.this, SplashActivity.class);
        Bundle args = new Bundle();
        args.putInt(Constants.Arguments.ARG_MAIN_DEF, mainDef);
        intent.putExtras(args);
        pushIntent(intent);
//        finish();  // uncomment when using
    }

}
