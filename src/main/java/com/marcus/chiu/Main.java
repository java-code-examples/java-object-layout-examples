package com.marcus.chiu;

import com.marcus.chiu.model.Example1;
import com.marcus.chiu.model.Example2;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

public class Main {

    public static void main(String[] args) {
        System.out.println(VMSupport.vmDetails());
        System.out.println(ClassLayout.parseClass(Example1.class).toPrintable());
        System.out.println(ClassLayout.parseClass(Example2.class).toPrintable());
    }
}
