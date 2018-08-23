package cubex.mahesh.intentservicetest

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        get_image.setOnClickListener {
                    var i = Intent(this@MainActivity,
                                            MyService::class.java)
                    startService(i)
        }
        var i = IntentFilter( )
        i.addAction("image_loading_done")
        registerReceiver(MyReceiver(iview),i)
    }
}
