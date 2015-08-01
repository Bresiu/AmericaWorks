package com.droid.lynx.presentation.view.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.widget.Button;
import com.droid.lynx.R;

public class MainActivity extends Activity {

	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		this.testPalette();
	}

	private void testPalette() {
		Button button = (Button) findViewById(R.id.button);
		Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.android);
		Palette.Swatch swatch = paletteHelper(bmp);

		button.getBackground().setColorFilter(swatch.getRgb(), PorterDuff.Mode.MULTIPLY);
		button.setTextColor(swatch.getTitleTextColor());
	}

	private Palette.Swatch paletteHelper(Bitmap bitmap) {
		Palette palette = Palette.from(bitmap).generate();
		return palette.getVibrantSwatch();
	}
}
