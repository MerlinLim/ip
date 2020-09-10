package task;

public class Event extends Task {
    protected String at;

    public Event(String name, String at) {
        super(name);
        this.at = at;
    }

    @Override
    public String getParsedData() {
        return "E" + "/" + String.valueOf(super.isDone) + "/" + super.name + "/" + this.at;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at + ")";
    }
}
