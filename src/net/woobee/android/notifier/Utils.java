package net.woobee.android.notifier;

import android.content.Context;
import android.telephony.TelephonyManager;

public final class Utils {
	
	private Utils() { /*_*/ }

	public static final String getPhoneNumber(Context context) {
		TelephonyManager tm = 
			(TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);

		return tm.getLine1Number();
	}
}
