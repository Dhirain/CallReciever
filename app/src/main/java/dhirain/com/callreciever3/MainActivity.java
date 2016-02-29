package dhirain.com.callreciever3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IncomingCall incomingCall=new IncomingCall();
        MyPhoneStateListener myPhoneStateListener=new MyPhoneStateListener();

        //String[] callLogarray= myPhoneStateListener.callLog.toString().;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.id_Main);
        //TextView textView=new TextView(this);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.activity_textview,myPhoneStateListener.callLog);

        ListView listView=(ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        //textView.setText(myPhoneStateListener.callLog.toString());

        ///linearLayout.addView(textView);
    }
}
