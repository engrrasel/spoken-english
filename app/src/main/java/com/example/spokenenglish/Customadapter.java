package com.example.spokenenglish;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

class Customadapter extends BaseExpandableListAdapter {

    private Context context;
    List<String> listdataHeader;
    HashMap<String,List<String>> listDatachild;


    public Customadapter(Context context, List<String> listdataHeader, HashMap<String, List<String>> listDatachild) {
        this.context = context;
        this.listdataHeader = listdataHeader;
        this.listDatachild = listDatachild;
    }

    @Override
    public int getGroupCount() {
        return listdataHeader.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listDatachild.get(listdataHeader.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listdataHeader.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listDatachild.get(listdataHeader.get(i)).get(i1) ;
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {

        String headerText = (String) getGroup(i);

        if (view==null){

            LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.grup_layout,null);
        }

       TextView textView = view.findViewById(R.id.headerTextviewId);
        textView.setText(headerText);

        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {

        String childText = (String) getChild(i,i1);

        if (view==null){

            LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.child_layout,null);
        }

        TextView textView = view.findViewById(R.id.childTextviewId);
        textView.setText(childText);

        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
 /*   public Customadapter(spoken spoken, List<String> listdataHeader, HashMap<String, List<String>> listDatachild) {
    }*/
}
