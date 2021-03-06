package tr.com.hkerembagci.coursescheduler.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("http://localhost:3000");
        config.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS"));
        config.setExposedHeaders(Arrays.asList("Authorization", "content-type"));
        config.setAllowedHeaders(Arrays.asList("Authorization", "content-type"));
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
