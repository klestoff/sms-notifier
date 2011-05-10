package net.woobee.android.notifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootReciever extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.v(this.getClass().getName(), "rrrra ction: "  + intent.getAction());
		
		if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED))
			Log.v(this.getClass().getName(), "rrrra phone number: " + Utils.getPhoneNumber(context));
	}
	

}
