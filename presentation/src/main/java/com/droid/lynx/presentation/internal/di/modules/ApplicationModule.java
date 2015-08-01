package com.droid.lynx.presentation.internal.di.modules;

import com.droid.lynx.presentation.AndroidApplication;
import dagger.Module;

/**
 * Created by Bresiu on 01-08-2015
 */
@Module public class ApplicationModule {
	private final AndroidApplication androidApplication;

	public ApplicationModule(AndroidApplication androidApplication) {
		this.androidApplication = androidApplication;
	}
}
