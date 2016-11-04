package com.bradcorp.bitsotest;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Emisael Calderon on 10/23/2016.
 */

public class Utils {
    public static final String TAG = "JsonUtils";

    public static String AssetJSONFile(String filename, Context context) {
        try {
            AssetManager manager = context.getAssets();
            InputStream file = manager.open(filename);
            byte[] formArray = new byte[file.available()];
            file.read(formArray);
            file.close();

            return new String(formArray);
        } catch (Exception ex) {
            Log.e(TAG, "AssetJSONFile:: " + ex.getLocalizedMessage());
            return "";
        }
    }

    static boolean[] control = new boolean[100];
    static List<Lineas> lineasEntreIslas = new ArrayList<>();
    static List<Lineas[]> combinacionDelineasEntreIslas = new ArrayList<>();

    static void combinations2Island(Island[] arr, int len, int startPosition, Island[] result) {
        if (len == 0) {
            Log.i("COMBINCAIONES-->", Arrays.toString(result));
            lineasEntreIslas.add(new Lineas(result[0], result[1]));
            return;
        }
        for (int i = startPosition; i <= arr.length - len; i++) {
            result[result.length - len] = arr[i];
            combinations2Island(arr, len - 1, i + 1, result);
        }
    }

    static void combinations2Lienas(Lineas[] arr, int len, int startPosition, Lineas[] result) {
        if (len == 0) {
            Log.i("COMBINCAIONES-->", Arrays.toString(result));
            combinacionDelineasEntreIslas.add(result.clone());
            return;
        }
        for (int i = startPosition; i <= arr.length - len; i++) {
            result[result.length - len] = arr[i];
            combinations2Lienas(arr, len - 1, i + 1, result);
        }
    }
}
