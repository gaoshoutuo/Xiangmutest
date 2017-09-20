package tuo.com.xiangmutest.Model;

/**
 * Created by colorful on 2017-09-20.
 */

public interface MultiItemTypeSupport<T> {
    int getLayoutId(int itemType);
    int getItemViewType(int position,T t);
}
