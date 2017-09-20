package tuo.com.xiangmutest.Model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import java.util.List;

/**
 * Created by colorful on 2017-09-20.
 */

public abstract class CommonAdapter<T> extends RecyclerView.Adapter <CommonViewHolder>{
    protected Context mContext;
    protected int mLayoutId;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;


    public CommonAdapter(Context context, int layoutId, List<T> datas)
    {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mLayoutId = layoutId;
        mDatas = datas;
    }
    @Override
    public CommonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CommonViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
    public abstract void convert(CommonViewHolder holder, T t);

}
