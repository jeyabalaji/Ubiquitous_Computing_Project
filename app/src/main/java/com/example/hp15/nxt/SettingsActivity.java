package com.example.hp15.nxt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.Preference.OnPreferenceChangeListener;

public class SettingsActivity extends PreferenceActivity  {

    CheckBoxPreference cb_sync;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
        CheckBoxPreference cb_speed = (CheckBoxPreference) findPreference("PREF_REG_SPEED");
        cb_sync = (CheckBoxPreference) findPreference("PREF_REG_SYNC");

        cb_speed.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                if (!((Boolean) newValue).booleanValue()) {
                    cb_sync.setChecked(false);
                }
                return true;
            }
        });
    }
}