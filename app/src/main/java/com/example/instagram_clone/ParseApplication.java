package com.example.instagram_clone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fD6E6AyPD1E0e5fvDGJ8XViPo1HEsfq19FtsJwyT")
                .clientKey("8Q7ggQOv2PgqiRpvXz8oIEBI6q7Qrx5NZz2pfkqP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
