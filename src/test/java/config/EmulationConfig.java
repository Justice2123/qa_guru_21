package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${platform}.properties"
})

public interface EmulationConfig extends Config {

    @Key("mobilePlatform")
    String mobilePlatform();

    @Key("deviceName")
    String deviceName();

    @Key("mobileUrl")
    String mobileUrl();


}
