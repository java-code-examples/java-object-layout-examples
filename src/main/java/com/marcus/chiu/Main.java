package com.marcus.chiu;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

public class Main {

    public static void main(String[] args) {
        System.out.println(VMSupport.vmDetails());
        System.out.println(ClassLayout.parseClass(Integer.class).toPrintable());
    }
}
