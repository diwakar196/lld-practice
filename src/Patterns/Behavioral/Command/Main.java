package Patterns.Behavioral.Command;

public class Main {
    public static void main(String[] args) {
        Text text = new Text();
        Command command = new TextCommand(text);
        text.updateText("blah");
        text.updateText(" 2");
        command.save();
        text.updateText(" 4");
        command.save();
        command.clear();
        System.out.println(text.getTextToDisplay());
    }
}
