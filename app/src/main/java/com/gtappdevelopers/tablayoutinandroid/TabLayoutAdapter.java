package com.gtappdevelopers.tablayoutinandroid;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabLayoutAdapter extends FragmentPagerAdapter {
    private Context context;
    int tabCount;

    public TabLayoutAdapter(Context ctx, FragmentManager fm, int tabCount) {
        super(fm);
        context = ctx;
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                ClassesFragment classesFragment = new ClassesFragment();
                return classesFragment;
            case 2:
                SettingsFragment settingsFragment = new SettingsFragment();
                return settingsFragment;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
