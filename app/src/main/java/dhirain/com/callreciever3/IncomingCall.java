package dhirain.com.callreciever3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;



public class IncomingCall extends BroadcastReceiver {
    static MyPhoneStateListener phoneStateListener;

    @Override
    public void onReceive(Context arg0, Intent arg1) {
        TelephonyManager manager = (TelephonyManager) arg0
                .getSystemService(arg0.TELEPHONY_SERVICE);
        if (phoneStateListener == null) {
            phoneStateListener = new MyPhoneStateListener();
            manager.listen(phoneStateListener,
                    android.telephony.PhoneStateListener.LISTEN_CALL_STATE);
        }

    }

}

/*
public class IncomingCall extends BroadcastReceiver {

    static MyPhoneStateListener PhoneListener;

    public void onReceive(Context context, Intent intent) {

        try {
            // TELEPHONY MANAGER class object to register one listner
            TelephonyManager tmgr = (TelephonyManager) context
                    .getSystemService(Context.TELEPHONY_SERVICE);

            //Create Listner
            PhoneListener = new MyPhoneStateListener();

            // Register listener for LISTEN_CALL_STATE
            tmgr.listen(PhoneListener, PhoneStateListener.LISTEN_CALL_STATE);

            Log.d("in Income : callLog",MyPhoneStateListener.callLog.toString());

        } catch (Exception e) {
            Log.e("Phone Receive Error", " " + e);
        }

    }
*/


