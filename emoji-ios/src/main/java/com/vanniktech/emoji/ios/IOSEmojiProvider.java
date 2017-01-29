package com.vanniktech.emoji.ios;

import android.support.annotation.NonNull;

import com.vanniktech.emoji.EmojiProvider;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.ios.category.ActivityCategory;
import com.vanniktech.emoji.ios.category.FlagsCategory;
import com.vanniktech.emoji.ios.category.FoodsCategory;
import com.vanniktech.emoji.ios.category.NatureCategory;
import com.vanniktech.emoji.ios.category.ObjectsCategory;
import com.vanniktech.emoji.ios.category.PeopleCategory;
import com.vanniktech.emoji.ios.category.PlacesCategory;
import com.vanniktech.emoji.ios.category.SymbolsCategory;

import java.util.LinkedHashMap;
import java.util.Map;

public class IOSEmojiProvider implements EmojiProvider {

    @Override
    @NonNull
    public Map<String, EmojiCategory> getCategories() {
        LinkedHashMap<String, EmojiCategory> result = new LinkedHashMap<>();

        result.put("People", new PeopleCategory());
        result.put("Nature", new NatureCategory());
        result.put("Activity", new ActivityCategory());
        result.put("Places", new PlacesCategory());
        result.put("Symbols", new SymbolsCategory());
        result.put("Objects", new ObjectsCategory());
        result.put("Foods", new FoodsCategory());
        result.put("Flags", new FlagsCategory());

        return result;
    }
}