package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${platform}.properties",
        "classpath:realDevice.properties"
})

public interface RealDeviceConfig extends Config {

    @Config.Key("mobileDevice")
    String deviceName();

    @Config.Key("mobileUrl")
    String mobileUrl();

}
