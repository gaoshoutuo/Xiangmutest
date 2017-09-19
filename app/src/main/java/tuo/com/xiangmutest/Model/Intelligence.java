package tuo.com.xiangmutest.Model;

/**
 * Created by colorful on 2017-09-19.
 */

public class Intelligence {
    private String content;
    private String title;
    private String imagePath;
    private String videoPath;

    public Intelligence(String content, String title, String imagePath, String videoPath) {
        this.content = content;
        this.title = title;
        this.imagePath = imagePath;
        this.videoPath = videoPath;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    //一力降十会
}
