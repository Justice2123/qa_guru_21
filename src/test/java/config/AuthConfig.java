package config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:auth.properties"
})


public interface AuthConfig extends Config {

    @Key("mobileUser")
    String mobileUser();

    @Key("mobilePass")
    String mobilePass();

}
