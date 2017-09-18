package tuo.com.xiangmutest.Model;

/**
 * Created by colorful on 2017-09-18.
 */

public class QingbaoTitle {
   private String content;
   private int resourceId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public QingbaoTitle(String content, int resourceId) {
        this.content = content;
        this.resourceId = resourceId;
    }
}
