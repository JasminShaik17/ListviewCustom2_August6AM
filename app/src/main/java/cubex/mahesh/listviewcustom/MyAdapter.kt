package cubex.mahesh.listviewcustom

import android.graphics.BitmapFactory
import android.media.ThumbnailUtils
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.indiview.view.*
import java.io.File

class MyAdapter(var files:Array<File>,
                var mActivity:MainActivity) : BaseAdapter() {

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {

            var inflater = LayoutInflater.from(mActivity)
            var v = inflater.inflate(R.layout.indiview,null)

            var file = files[position]

          //  v.iview.setImageURI(Uri.fromFile(file))
        var bmp = ThumbnailUtils.extractThumbnail(
                BitmapFactory.decodeFile(file.path),50,50)
            v.iview.setImageBitmap(bmp)
            v.name.text = file.name
            v.size.text = "${file.length()} bytes"
            v.del.setOnClickListener({
                file.delete()
                mActivity.readFiles()
            })

            return v
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