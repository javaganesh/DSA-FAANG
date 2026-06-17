package com.dsa.designpaatern.Abstart;

public class AbstratctClient {
    public static void main(String[] args) {
        GUIFactory factory =
                new WindowsFactory();

        Button button =
                factory.createButton();

        Checkbox checkbox =
                factory.createCheckbox();

        button.paint();
        checkbox.check();
    }
}
