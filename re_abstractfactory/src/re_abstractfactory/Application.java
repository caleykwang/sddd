package re_abstractfactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        // Determine the OS type and choose the appropriate factory.
        String osType = args.length > 0 ? args[0] : "Windows";
        GUIFactory factory;
        if (osType.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else if (osType.equalsIgnoreCase("Mac")) {
            factory = new MacFactory();
        } else {
            throw new IllegalArgumentException("Unknown OS type: " + osType);
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
