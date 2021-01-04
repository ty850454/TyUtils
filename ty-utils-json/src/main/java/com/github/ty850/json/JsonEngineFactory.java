package com.github.ty850.json;

import com.github.ty850.core.exceptions.TyException;

import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/**
 * @author xy
 */
public class JsonEngineFactory {

    public static JsonEngine create() {
        ServiceLoader<JsonEngine> jsonEngines = ServiceLoader.load(JsonEngine.class);
        for (JsonEngine engine : jsonEngines) {
            try {
                return engine;
            } catch (ServiceConfigurationError ignore) {
            }
        }
        throw new TyException("未引入json库");
    }

}
