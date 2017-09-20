package tuo.com.xiangmutest.Model;

/**
 * Created by colorful on 2017-09-18.
 */

public class IntelligenceTitle {
   private String title;
   private int resourceId;

    public IntelligenceTitle(String title, int resourceId) {
        this.title = title;
        this.resourceId = resourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
