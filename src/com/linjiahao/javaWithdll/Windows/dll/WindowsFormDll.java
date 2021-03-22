package com.linjiahao.javaWithdll.Windows.dll;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

//http://java-native-access.github.io/jna/5.7.0/javadoc/
public interface WindowsFormDll extends Library {
    //WindowsFormDll_64 instance = (WindowsFormDll_64) Native.loadLibrary("Dll1", WindowsFormDll_64.class);
    WindowsFormDll instance_64=Native.load("javaDll",WindowsFormDll.class);
    Pointer n(int n);
}
