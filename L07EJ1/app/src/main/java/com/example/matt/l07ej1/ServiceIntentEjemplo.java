package com.example.matt.l07ej1;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.os.Handler;
import android.widget.Toast;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class ServiceIntentEjemplo extends IntentService {

    public ServiceIntentEjemplo() {
        super("ServiceIntentEjemplo");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        try {
            Thread.sleep(5000);

            // create a handler to post messages to the main thread
            Handler mHandler = new Handler(getMainLooper());
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(getApplicationContext(), "service ending", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (InterruptedException e) {
            // Restore interrupt status.
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent,flags,startId);
    }
}
