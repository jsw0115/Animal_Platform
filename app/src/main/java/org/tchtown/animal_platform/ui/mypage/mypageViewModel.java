package org.tchtown.animal_platform.ui.mypage;
// NotificationsviewModel
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class mypageViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public mypageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}