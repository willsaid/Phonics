package com.hearatale.phonic.ui.sight_word;

import com.hearatale.phonic.data.model.phonics.SightWordModel;
import com.hearatale.phonic.data.model.typedef.SightWordsCategoryDef;

import java.util.List;

public interface ISightWordPresenter {
    List<SightWordModel> getSightWords(@SightWordsCategoryDef int category);
}
