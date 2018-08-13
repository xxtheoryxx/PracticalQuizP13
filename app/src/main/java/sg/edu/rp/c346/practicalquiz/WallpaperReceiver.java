package sg.edu.rp.c346.practicalquiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by 15055494 on 13/8/2018.
 */

public class WallpaperReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int id = preferences.getInt("id", R.id.radioButton);

        if (id == R.id.radioButton){
            Toast.makeText(context,"You have a good taste!" , Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context,"Bro, think twice about it." , Toast.LENGTH_SHORT).show();
        }


    }
}
