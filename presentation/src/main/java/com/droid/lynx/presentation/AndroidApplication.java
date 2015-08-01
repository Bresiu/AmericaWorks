package com.droid.lynx.presentation;

import android.app.Application;
import com.droid.lynx.presentation.internal.di.components.ApplicationComponent;
import com.droid.lynx.presentation.internal.di.components.DaggerApplicationComponent;
import com.droid.lynx.presentation.internal.di.modules.ApplicationModule;

/**
 * Created by Bresiu on 01-08-2015
 */
public class AndroidApplication extends Application {
	private ApplicationComponent applicationComponent;

	@Override public void onCreate() {
		super.onCreate();
		this.initializeInjector();
	}

	private void initializeInjector() {
		this.applicationComponent = DaggerApplicationComponent.builder()
			.applicationModule(new ApplicationModule(this))
			.build();
	}

	public ApplicationComponent getApplicationComponent() {
		return this.applicationComponent;
	}
}