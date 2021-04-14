package com.alipay.wasm;


import org.teavm.interop.Export;
import org.teavm.interop.Import;

public class WasmFunctions {

    @Export(name = "thePurposeOfLife")
    public static int getThePurposeOfLife() {
        hello();
        return 43;
    }

    @Import(name = "hello")
    public static native int hello();

    public static void main(String[] args) {

    }
}