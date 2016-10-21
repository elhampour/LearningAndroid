package mh.learningandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentListAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<StudentModel> students;

    public StudentListAdapter(Context mContext,ArrayList<StudentModel> students){
        this.mContext = mContext;
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View roView = LayoutInflater.from(mContext).inflate(R.layout.mylist_item,parent,false);
        TextView name = (TextView)roView.findViewById(R.id.name);
        StudentModel student = students.get(position);
        name.setText(student.GetNamne());
        return roView;
    }
}
