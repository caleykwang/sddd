package re_abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows style checkbox.");
    }
}