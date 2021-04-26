package org.acme.testcoverage;

import java.net.URL;

public class Util {

    private Util() {}

    public static boolean isSlashSuffixedURL(URL url) {
        String serializedUrl = url.toString();

        return serializedUrl.endsWith("/");
    }
}
