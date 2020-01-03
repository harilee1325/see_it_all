package com.harilee.seeitall.Utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;
import com.harilee.seeitall.BuildConfig;
import com.harilee.seeitall.R;
import com.wang.avi.AVLoadingIndicatorView;

import java.util.Objects;

public class Utility {


    private static Utility utilityInstance;

    private Utility() {
    }

    public static synchronized Utility getUtilityInstance() {
        if (null == utilityInstance) {
            utilityInstance = new Utility();
        }
        return utilityInstance;
    }

    public void setPreference(Context context, String key, String value) {

        SharedPreferences.Editor editor = context.getSharedPreferences("seeitall", Context.MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.apply();

    }

    public String getPreference(Context context, String key) {

        SharedPreferences prefs = context.getSharedPreferences("seeitall", Context.MODE_PRIVATE);
        String result = prefs.getString(key, "");
        //String a = prefs.getString(key,"");
        return result;
    }


    public static void showGifPopup(final Context mContext, boolean show, Dialog dialog) {

        dialog.setContentView(R.layout.progress_bar);
        dialog.setCancelable(false);
        AVLoadingIndicatorView imageView = dialog.findViewById(R.id.avi);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        if (!((Activity) mContext).isFinishing()) {
            try {
                if (show) {
                    dialog.show();
                } else {
                    dialog.dismiss();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void showSnackBar(View view, String message){
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show();
    }

    public static String getBaseUrl() {
        if (BuildConfig.DEBUG) {

            return "https://api.eventyay.com";
        }
        return "https://api.eventyay.com";
    }

}
