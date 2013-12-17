package com.example.quotesandroid;

import com.example.quotesandroid.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;

public class AddQuote extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_quote);
	}
	
	private EditText mName;
	private EditText mProjectName;
//	private EditText mQuoteText;


	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_quote, menu);
		return true;
	}

}
