package com.app.rx.cleanmvp.presentation.userlistscreen;

import com.app.rx.cleanmvp.presentation.userlistscreen.UserListFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.FragmentKey;

/**
 * Created by sarath on 4/10/17.
 */

@Module
abstract class MainFragmentModule {
    @ContributesAndroidInjector(modules = UserListModule.class)
    @FragmentKey(UserListFragment.class)
    abstract UserListFragment bindsUserListFragment();

}
