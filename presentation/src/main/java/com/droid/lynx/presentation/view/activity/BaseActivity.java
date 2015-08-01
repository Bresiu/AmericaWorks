package com.droid.lynx.presentation.view.activity;

import android.app.Activity;
import android.os.Bundle;
import com.droid.lynx.presentation.AndroidApplication;
import com.droid.lynx.presentation.internal.di.components.ApplicationComponent;

/**
 * Created by Bresiu on 01-08-2015
 */
public class BaseActivity extends Activity {
	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	protected ApplicationComponent getApplicationComponent() {
		return ((AndroidApplication) getApplication()).getApplicationComponent();
	}
}
