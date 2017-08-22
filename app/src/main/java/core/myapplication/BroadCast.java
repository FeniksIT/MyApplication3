package core.myapplication;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import static core.myapplication.MainActivity.KYCH;

public class BroadCast extends BroadcastReceiver {
    int o;
    @Override
    public void onReceive(Context context, Intent intent) {
        this.o = intent.getIntExtra(KYCH, -1);
        Log.d("QQQQQQQQQQQ", "привет");
    }
}
