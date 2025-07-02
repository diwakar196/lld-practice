package Patterns.Behavioral.Command;

public class TextCommand implements Command {
    private Text text;
    public TextCommand(Text text) {
        this.text = text;
    }

    public void save() {
        System.out.println("Saved text : " + text.getText());
    }

    public void clear() {
        System.out.println("Clearing text");
        this.text.getText().setLength(0);
    }
}
