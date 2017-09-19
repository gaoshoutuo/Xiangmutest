package tuo.com.xiangmutest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import tuo.com.xiangmutest.Model.Intelligence;
import tuo.com.xiangmutest.Model.IntelligenceTitle;

/**
 * Created by colorful on 2017-09-19.
 */

public class AdapterR1 extends RecyclerView.Adapter<AdapterR1.ViewHolder> {
        private List<IntelligenceTitle> lists1=new ArrayList<>();
        private List<Intelligence>lists2=new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if(lists1.size()!=0){
            return lists1.size();
        }
        return 0;
    }


    static class ViewHolder extends RecyclerView.ViewHolder{

        private View mConvertView;
        private Context mContext;

        public ViewHolder(View itemView) {
            super(itemView);
        }
        public <T extends View> T getView(int viewId)
        {


            return (T) view;
        }
        public static ViewHolder get(Context context, ViewGroup parent, int layoutId)
        {

            View itemView = LayoutInflater.from(context).inflate(layoutId, parent,
                    false);
            ViewHolder holder = new ViewHolder(context, itemView, parent, position);
            return holder;
        }

    }
}
