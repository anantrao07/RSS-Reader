package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            //url = new URL("https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json" );
            url = new URL("https://d17h27t6h515a5.cloudfront.net/topher/2017/March/58c5d68f_xyz-reader/xyz-reader.json");
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}
