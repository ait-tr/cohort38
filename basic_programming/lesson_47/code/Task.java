import java.time.LocalDate;


public class Task {
    public String title;
    public boolean done;
    public String description;

    public LocalDate deadLine;
    public Task(String title, LocalDate deadLine, String description) {
        this.title = title;
        this.deadLine = deadLine;
        this.done = false;
        this.description = description;
    }
    public void makeDone(){
        this.done = true;
    }
    @Override
    public String toString() {
        return String.format("%s %s", this.title, this.done? "СДЕЛАНА": "В ПРОЦЕССЕ");
    }
}
