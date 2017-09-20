package tuo.com.xiangmutest.Model;

/**
 * Created by colorful on 2017-09-20.
 */

public interface SectionSupport<T> {
     int sectionLayoutId();
     int sectionTextViewId();
    String getTitle(T t);
}
