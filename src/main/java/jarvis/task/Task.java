package jarvis.task;

public abstract class Task {
    public static enum TaskType {
        ToDo,
        Deadline,
        Event
    }
    protected String description;
    protected boolean isDone;
    protected TaskType taskType;

    public Task(boolean isDone) {
        this.isDone = isDone;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public void markAsUnDone() {
        this.isDone = false;
    }

    public abstract TaskType getTaskType();

    public abstract String toDataForm();
}
