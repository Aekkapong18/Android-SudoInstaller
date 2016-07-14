/*
 * Sudo for Android Installer
 * com.darkrealmgaming.androidsudo.AboutActivity
 * 
 * Copyright (c) 2014-2016 ColtonDRG.com
 * Licensed under The MIT License (https://github.com/ColtonDRG/Android-SudoInstaller/blob/master/LICENSE)
 */



package com.darkrealmgaming.androidsudo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AboutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		
		
	}
	
	
	
	public void github(View view) {
		Uri uri = Uri.parse(getResources().getString(R.string.github_uri));
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}

	public void playstore(View view) {
		Uri uri = Uri.parse(getResources().getString(R.string.darkrealmgaming_goodbye_playstore_link));
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}

	public void apkdownload(View view) {
		Uri uri = Uri.parse(getResources().getString(R.string.darkrealmgaming_goodbye_apk_link));
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}
	
	public void ossLicenses(View view) {
		Intent intent = new Intent(AboutActivity.this, OssLicensesActivity.class);
		startActivity(intent);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		// int id = item.getItemId();
		// if (id == R.id.action_settings) {
			// return true;
		// }
		return super.onOptionsItemSelected(item);
	}
}
