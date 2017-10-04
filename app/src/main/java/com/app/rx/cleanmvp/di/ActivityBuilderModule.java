package com.app.rx.cleanmvp.di;

import com.app.rx.cleanmvp.di.scopes.ActivityScope;
import com.app.rx.cleanmvp.presentation.userlistscreen.MainActivity;
import com.app.rx.cleanmvp.presentation.userlistscreen.MainFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by sarath on 4/10/17.
 */

@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    @ActivityScope
    abstract MainActivity bindsMainActivity();

}
