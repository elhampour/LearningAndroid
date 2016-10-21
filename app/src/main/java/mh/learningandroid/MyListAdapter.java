package mh.learningandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private String names[];

    public MyListAdapter(Context mContext,String[] names){
        this.mContext = mContext;
        this.names = names;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View roView = LayoutInflater.from(mContext).inflate(R.layout.mylist_item,parent,false);
        TextView name = (TextView)roView.findViewById(R.id.name);
        name.setText(names[position]);
        return roView;
    }
}
