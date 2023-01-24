public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }
    public boolean getIsDone() {
        return isDone;
    }

    public void switchIsDone() {
        isDone = !isDone;
    }

    public String getDescription() {
        return description;
    }
}

