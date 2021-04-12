package com.alipay.wasm;


import de.inetsoftware.jwebassembly.JWebAssembly;
import de.inetsoftware.jwebassembly.api.annotation.Export;
import de.inetsoftware.jwebassembly.api.annotation.Import;

import java.io.File;
import java.net.URL;

public class WasmFunctions {

    @Export
    public static int hello() {
        return 43;
    }

    @Import
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        File file = new File("build/test.wasm");
        JWebAssembly wasm = new JWebAssembly();

        Class clazz = WasmFunctions.class;
        URL url = clazz.getResource("/" + clazz.getName().replace(".", "/") + ".class");
        wasm.addFile(url);

        System.out.println(wasm.compileToText());

        wasm.compileToBinary(file);
    }
}