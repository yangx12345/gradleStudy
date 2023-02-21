package org.example;

import com.sun.media.jfxmediaimpl.HostUtils;

/**
 * Description: main
 *
 * @author yangxiao
 * @date 2022/11/22 15:05
 **/

public class Main {
    public static void main(String[] args) {
        System.out.println("hello gradle");
        System.out.println(HostUtils.isWindows());
        System.out.println(HostUtils.isLinux());
    }
}
