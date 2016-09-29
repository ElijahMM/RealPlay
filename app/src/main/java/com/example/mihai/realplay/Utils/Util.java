package com.example.mihai.realplay.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by mihai on 29.09.2016.
 */

public class Util {

    public static void openActivity(Context ctx, Class c) {
        Intent intent = new Intent(ctx, c);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ctx.startActivity(intent);
    }

    public static void openActivityClosingStack(Context ctx, Class c) {
        Intent intent = new Intent(ctx, c);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        ctx.startActivity(intent);
    }

    public static void openActivityClosingParent(Context ctx, Class c) {
        Intent intent = new Intent(ctx, c);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ctx.startActivity(intent);
        ((Activity) ctx).finish();
    }
    //endregion

    //region Toast Region
    public static void showToast(Context ctx, String message) {
        if (ctx != null) {
            try {
                Toast.makeText(ctx, message, Toast.LENGTH_LONG).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void showShortToast(Context ctx, String message) {
        if (ctx != null) {
            try {
                Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //endregion

    //region Show Log Region
    public static void showObjectLog(Object o) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(o);
        customInfoLog("GSON Object", "Content", json);
    }

    public static void showObjectLog(String objectName, Object o) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(o);
        customInfoLog("GSON " + objectName, "^", json);
    }

    public static void customInfoLog(String activityName, String viewId, int infoMessage) {
        Log.i("--->", " \n");
        Log.i("--->", activityName + "\n---------------------------------------------");
        Log.i("--->" + viewId + "       ", Integer.toString(infoMessage));
        Log.i("--->", "---------------------------------------------\n");
        Log.i("--->", " ");
    }

    public static void customInfoLog(String activityName, String viewId, String infoMessage) {
        Log.i("--->", " \n");
        Log.i("--->", activityName + "\n---------------------------------------------");
        Log.i("--->" + viewId + "       ", infoMessage);
        Log.i("--->", "---------------------------------------------\n");
        Log.i("--->", " ");
    }
}
