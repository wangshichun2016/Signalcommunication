package chat.signal.com.signalcommunication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * 作    者：高学军
 * 时    间：16/10/20
 * 描    述：
 * 修改时间：
 */
public class Adapter_Constact extends BaseAdapter {


    Context context;
    //初始化lsit
    List<String> usernames = new ArrayList<String>();

    public Adapter_Constact(Context context) {
        this.context = context;
    }


    //封装方法更新lsitview
    public void addresst(List<String> usernames){

        this.usernames.clear();
        this.usernames.addAll(usernames);
        this.notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return usernames.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_constact, null);
            viewHolder = new ViewHolder();
            viewHolder.tv_adapter_item = (TextView) convertView.findViewById(R.id.tv_adapter_item);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tv_adapter_item.setText(usernames.get(position));
        return convertView;
    }

    class ViewHolder {

        TextView tv_adapter_item;
    }
}
