package Patterns.Behavioral.Command;

public class Text {
    private final StringBuilder textBuilder;

    public Text() {
        this.textBuilder = new StringBuilder();
    }

    public void updateText(String s) {
        this.textBuilder.append(s);
    }

    public StringBuilder getText() {
        return this.textBuilder;
    }

    public String getTextToDisplay() {
        return this.textBuilder.toString();
    }
}
