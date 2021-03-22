package com.linjiahao.javaWithdll.Windows;

public class WindowsFormBasics implements IWindowsForm {
    private int windowsHandle;

    public WindowsFormBasics(int windowsHandle) {
        this.windowsHandle = windowsHandle;
        String arch = System.getProperty("sun.arch.data.model");

    }

    @Override
    public String getTitle() {

        return null;
    }

    @Override
    public String getClassName() {
        return null;
    }

    @Override
    public WindowsRect getWindowsRect() {
        WindowsRect windowsRect = new WindowsRect();
        windowsRect.left = 0;
        windowsRect.top = 0;
        windowsRect.width = 0;
        windowsRect.height = 0;
        return windowsRect;
    }

    @Override
    public void setWindowsRect(WindowsRect windowsRect) {

    }
}
