package com.alipay.wasm;

import de.mirkosertic.bytecoder.api.Export;
import de.mirkosertic.bytecoder.api.Import;

/**
 * https://mirkosertic.github.io/Bytecoder/chapter-1/page-1-a/
 */
public class WasmFunctions {

    @Import(module = "", name = "begin")
    public static native void statsBegin();

    @Export("hello")
    public static int hello() {
        return 43;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}