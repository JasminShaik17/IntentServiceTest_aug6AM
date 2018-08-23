package cubex.mahesh.intentservicetest

import android.app.IntentService
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL

var bmp:Bitmap? = null

class MyService:IntentService( "aug6am")
{
    override fun onHandleIntent(p0: Intent?) {
            var url = URL("https://optiinfo.files.wordpress.com/2013/01/android-960x854-wallpaper-1095.jpg")
            var isr = url.openStream()
            bmp = BitmapFactory.decodeStream(isr)

            var i = Intent( )
            i.action = "image_loading_done"
            sendBroadcast(i)
    }
}