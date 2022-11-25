package org.tchtown.animal_platform.ui.mypage;
// NotificationsFragment
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import org.tchtown.animal_platform.databinding.FragmentMypageBinding;
import org.tchtown.animal_platform.databinding.FragmentMypageBinding;

public class mypageFragment extends Fragment {

    private FragmentMypageBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mypageViewModel notificationsViewModel =
                new ViewModelProvider(this).get(mypageViewModel.class);

        binding = FragmentMypageBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textmypage;
//        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}