package ru.mirea.vorobevavi.yandexdriver;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final static String YANDEX_MAP_API_KEY = "78d2c08f-f10c-4b4c-a620-ebff1da77669";

    @Override
    public void onCreate() {
        super.onCreate();
        MapKitFactory.setApiKey(YANDEX_MAP_API_KEY);
    }
}