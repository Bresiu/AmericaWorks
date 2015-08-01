package com.droid.lynx.presentation.internal.di.components;

import com.droid.lynx.presentation.internal.di.modules.ApplicationModule;
import com.droid.lynx.presentation.view.activity.BaseActivity;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by Bresiu on 01-08-2015
 */
@Singleton @Component(modules = ApplicationModule.class) public interface ApplicationComponent {
	void inject(BaseActivity baseActivity);
}
