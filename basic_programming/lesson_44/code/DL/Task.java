package DL;

public class Task {
    private static int idCounter = 1;
    private int id;
    private String title;
    private Status status;
    private int storyPoints;
    private Priority priority;

    public Task(String title, Status status, int storyPoints, Priority priority) {
        this.id = idCounter++;
        this.title = title;
        this.status = status;
        setStoryPoints(storyPoints);
        this.priority = priority;
    }

    public void setStoryPoints(int v) {
        this.storyPoints = (v >= 1 && v <= 10)? v : 10;
    }
}


/*
id - число
title - строка
status - enum (DONE, IN_PROGRESS, REJECTED, NEW)
storyPoints - int (от 1 до 10) если пользователь ввел что-то другое, то 10
priority - enum (LOW, MEDIUM, HIGH)
 */