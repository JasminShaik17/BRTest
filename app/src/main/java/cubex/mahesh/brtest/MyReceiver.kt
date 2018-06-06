package cubex.mahesh.brtest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class MyReceiver:BroadcastReceiver()
{
    override fun onReceive(context: Context?,
                           intent: Intent?) {
            var mActivity = context as MainActivity
            var tview:TextView = mActivity.findViewById(R.id.tv1)
            tview.setText(intent!!.action)
    }

}