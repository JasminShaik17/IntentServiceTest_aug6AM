package cubex.mahesh.intentservicetest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.ImageView
import android.widget.Toast

class MyReceiver(var iview:ImageView):BroadcastReceiver( )
{
    override fun onReceive(p0: Context?, p1: Intent?) {
            iview.setImageBitmap(bmp)
        Toast.makeText(p0,"Image Loading is Done",
                        Toast.LENGTH_LONG).show()
    }
}