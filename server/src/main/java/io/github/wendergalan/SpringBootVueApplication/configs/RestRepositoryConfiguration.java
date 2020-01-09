package io.github.wendergalan.SpringBootVueApplication.configs;

import io.github.wendergalan.SpringBootVueApplication.models.entities.Todo;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

/**
 * Classe para expor os endpoints disponiveis
 */
@Component
public class RestRepositoryConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Todo.class);
    }
}
