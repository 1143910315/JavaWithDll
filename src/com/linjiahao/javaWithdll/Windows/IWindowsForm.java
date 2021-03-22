package com.linjiahao.javaWithdll.Windows;

public interface IWindowsForm {
    String getTitle();
    String getClassName();
    WindowsRect getWindowsRect();
    void setWindowsRect(WindowsRect windowsRect);
}
