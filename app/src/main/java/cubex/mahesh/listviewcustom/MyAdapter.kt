package cubex.mahesh.listviewcustom

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import java.io.File

class MyAdapter(var files:Array<File>,
                var mActivity:MainActivity) : BaseAdapter() {

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(p0: Int): Any {
        return  0
    }

    override fun getItemId(p0: Int): Long {
        return 0
      }

    override fun getCount(): Int {
          return  files.size
    }
}