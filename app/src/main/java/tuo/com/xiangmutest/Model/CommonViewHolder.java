package tuo.com.xiangmutest.Model;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by colorful on 2017-09-20.
 */

public class CommonViewHolder extends RecyclerView.ViewHolder{
    private SparseArray<View> lists;
    private View mView;
    private Context mContext;


    public CommonViewHolder(Context context, View itemView, ViewGroup viewGroup){
        super(itemView);
         mContext=context;
        mView=itemView;
        lists=new SparseArray<View>();

    }
    public static CommonViewHolder get(Context context,ViewGroup parent,int layoutId){
        View view= LayoutInflater.from(context).inflate(layoutId,parent,false);
        CommonViewHolder holder=new CommonViewHolder(context,view,parent);
         return holder;
    }
    public <T extends View> T getView(int viewId)
    {
        View view = lists.get(viewId);
        if (view == null)
        {
            view = mView.findViewById(viewId);
            lists.put(viewId, view);
        }
        return (T) view;
    }

    //持有
    public CommonViewHolder setText(int viewId, String text)
    {
        TextView tv = getView(viewId);
        tv.setText(text);
        return this;
    }

    public CommonViewHolder setImageResource(int viewId, int resId)
    {
        ImageView view = getView(viewId);
        view.setImageResource(resId);
        return this;
    }

    public CommonViewHolder setOnClickListener(int viewId,
                                         View.OnClickListener listener)
    {
        View view = getView(viewId);
        view.setOnClickListener(listener);
        return this;
    }
}
