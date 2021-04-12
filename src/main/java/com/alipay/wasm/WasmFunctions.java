package com.alipay.wasm;


import org.teavm.interop.Export;

public class WasmFunctions {

    @Export(name = "thePurposeOfLife")
    public static int getThePurposeOfLife() {
        return 43;
    }

    @Export(name = "hello")
    public static int hello() {
        return 43;
    }

    public static void main(String[] args) {

    }
}