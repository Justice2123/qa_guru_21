package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:host/${deviceHost}.properties",
        "classpath:browserstack.properties"
})

public interface BrowserStackConfig extends Config {

    @Key("browserstackApp")
    String app();

    @Key("browserstackDevice")
    String device();

    @Key("browserstackOsVersion")
    String version();

    @Key("browserstackProject")
    String project();

    @Key("browserstackBuild")
    String build();

    @Key("browserstackName")
    String name();

    @Key("browserstackUrl")
    String url();

}