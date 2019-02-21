package com.hearatale.phonic.ui.quiz;

import com.hearatale.phonic.data.model.phonics.SectionQuiz;
import com.hearatale.phonic.ui.base.activity.IViewMVP;

import java.util.List;

public interface IQuiz extends IViewMVP {

    void updateDataQuiz(List<SectionQuiz> data);

    int getDifficulty();
}
