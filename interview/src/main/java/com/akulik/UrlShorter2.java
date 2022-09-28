package com.akulik;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlShorter2 {

    public static void main(String[] args) throws MalformedURLException {
        String rawLink = "https://www.amazon.com/HIFIMAN-Audiophiles-Great-Sounding-Sensitivity-Comfortable/dp/B08Z2SK5C4";
        URL url = new URL(rawLink);
        String host = url.getHost();
        System.out.println("### " + 10%2);

    }

}
