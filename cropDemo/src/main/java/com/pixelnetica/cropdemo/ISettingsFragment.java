package com.pixelnetica.cropdemo;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

/**
 * Created by Denis on 17.09.2016.
 */
public interface ISettingsFragment {
	boolean save(@NonNull SharedPreferences.Editor editor);
}
