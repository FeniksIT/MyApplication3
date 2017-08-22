package core.mylibrary;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;


public class MyService extends Service {
    public static int a = 0;
    Intent intent1 = new Intent("JJJJ");



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        someTask();
        return super.onStartCommand(intent,flags,startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    void someTask() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    // Log.d("QQQQQQQQQQQ" , "сообщение " + i);
                    try {
                        Thread.sleep(1000);
                        //java.util.concurrent.TimeUnit.SECONDS.sleep(1);
                        intent1.putExtra("KYCH", 5);
                        sendBroadcast(intent1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //stopSelf();
            }
        }).start();
    }

}
