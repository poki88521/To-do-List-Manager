package component;

public class Task {
    private String title;
    private String content;
    private boolean isComplete;

    public Task(String title, String content){
        this.title = title;
        this.content = content;
        isComplete = false; //初始化为未完成
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

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
