package com.bolsadeideas.springboot.app.springbootweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
    @PropertySource("classpath:mensajes.properties")
})
public class MensajesPropertiesConfig {
    
}
