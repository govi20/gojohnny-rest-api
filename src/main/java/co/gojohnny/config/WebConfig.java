package co.gojohnny.config;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    /**
     * This bean will be used by {@link com.fasterxml.jackson.databind.ObjectMapper}
     * to convert {@link com.vividsolutions.jts.geom.Geometry} into GeoJson and vice versa
     *
     * @return JtsModule instance
     */
    @Bean
    public JtsModule jtsModule() {
        return new JtsModule();
    }
}
