package com.ti;

import java.io.*;
import java.util.ArrayList;

public class InputOutputController {

    private static String inPath, outPath;

    private static FileInputStream fileInputStream;
    private static FileOutputStream fileOutputStream;
    private static BufferedInputStream bufferedInputStream;
    private static BufferedOutputStream bufferedOutputStream;

    private static byte[] arr;

    public static void init(String in, String out) throws IOException {
        inPath = in;
        outPath = out;

        File inFile = new File(inPath);
        fileInputStream = new FileInputStream(inFile);
        bufferedInputStream = new BufferedInputStream(fileInputStream);

        File outFile = new File(outPath);
        fileOutputStream = new FileOutputStream(outFile);
        bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        arr = new byte[256];
    }
}
