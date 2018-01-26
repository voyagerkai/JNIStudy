package com.example.myfristjnitest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	
	
	public native String helloJNI();
	
	static {
		System.loadLibrary("JNITest");
	}
	
	
	private TextView tv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv = (TextView) findViewById(R.id.tv_jni_test);
        tv.setOnClickListener(this);
    }

	@Override
	public void onClick(View arg0) {
		String result = helloJNI();
		tv.setText(result);
	}
    
}
