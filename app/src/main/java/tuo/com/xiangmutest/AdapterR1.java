package tuo.com.xiangmutest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
       View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_qingbao,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        IntelligenceTitle ig=lists1.get(position);
            holder.textView.setText(ig.getTitle());
    }

    @Override
    public int getItemCount() {

            return lists1.size();

    }


    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
           textView=(TextView)itemView.findViewById(R.id.item_text);
            imageView=(ImageView)itemView.findViewById(R.id.item_id);
        }

    }
}
