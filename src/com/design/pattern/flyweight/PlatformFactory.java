package com.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlatformFactory {
    static Map<String, Platform> map = new HashMap<>();

    static Platform getPlatformInstance(String platformName) {
        Platform platform = map.get(platformName);

        if (platform == null) {
            platform = switch (platformName) {
                case "JAVA" -> new JavaPlatform();
                case "DOTNET" -> new DotNetPlatform();
                default -> throw new RuntimeException("Unsupported platform: " + platformName);
            };
            map.put(platformName, platform);
            return platform;
        }

        return platform;
    }
}
