package com.dsa.designpaatern.abstart1;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}
