package tuo.com.xiangmutest.Model;

import android.content.Context;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by colorful on 2017-09-20.
 */

public abstract class MultiItemCommonAdapter<T> extends CommonAdapter<T>{
    MultiItemTypeSupport<T> mu;
    public MultiItemCommonAdapter(Context context, List<T> datas,MultiItemTypeSupport<T> mu) {
        super(context, -1, datas);
        this.mu=mu;
    }
    @Override
    public int getItemViewType(int position)
    {
        return mu.getItemViewType(position, mDatas.get(position));
    }

    @Override
    public CommonViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        int layoutId = mu.getLayoutId(viewType);
       CommonViewHolder holder = CommonViewHolder.get(mContext, parent, layoutId);
        return holder;
    }
}
