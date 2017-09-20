package tuo.com.xiangmutest.Model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Created by colorful on 2017-09-20.
 */

public class SecondAdapter<T> extends MultiItemCommonAdapter<T> {
    @Override
    public void convert(CommonViewHolder holder, T t) {

    }

    public SecondAdapter(Context context, List<T> datas, MultiItemTypeSupport<T> mu) {
        super(context, datas, mu);
    }

    private MultiItemTypeSupport ms=new MultiItemTypeSupport() {
        @Override
        public int getLayoutId(int itemType) {
            return 0;
        }

        @Override
        public int getItemViewType(int position, Object o) {
            return 0;
        }
    };

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(CommonViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return super.getItemCount();
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

}
