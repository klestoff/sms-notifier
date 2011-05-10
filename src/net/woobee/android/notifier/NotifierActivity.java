/**
 * 
 */
package net.woobee.android.notifier;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * @author alan
 *
 */
public class NotifierActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main);
		
		Toast.
			makeText(
				this, 
				"phone  number: " + Utils.getPhoneNumber(this), 
				Toast.LENGTH_LONG
			).
			show();
	}
}
