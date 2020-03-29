package com.square.common.ui.view.viewpager;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public abstract class FragmentStatePagerAdapter2 extends FragmentStatePagerAdapter {
    protected int currentPosition = -1;
    protected Fragment currentFragment;

    public FragmentStatePagerAdapter2(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        super.setPrimaryItem(container, position, object);
        this.currentPosition = position;
        if (object instanceof Fragment) {
            this.currentFragment = (Fragment) object;
        }
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public <T extends Fragment> T getCurrentFragment() {
        return (T) currentFragment;
    }
}