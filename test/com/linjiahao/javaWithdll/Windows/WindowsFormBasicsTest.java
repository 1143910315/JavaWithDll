package com.linjiahao.javaWithdll.Windows;

import com.linjiahao.javaWithdll.Windows.dll.WindowsFormDll;
import com.sun.jna.Pointer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowsFormBasicsTest {
    @Test
    public void testArch(){
        WindowsFormBasics windowsFormBasics=new WindowsFormBasics(0);
    }
    @Test
    public void testInstance_64(){
        Pointer n = WindowsFormDll.instance_64.n(0);
        System.out.println(n.hashCode());

    }
}