/*
 * Copyright (C) 2011-2013 Mojavemvc.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mojavemvc.core;

import java.util.Enumeration;

import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;

/**
 * @author Luis Antunes
 */
public class FilterBasedConfig implements Config {

    private final FilterConfig config;
    
    public FilterBasedConfig(FilterConfig config) {
        this.config = config;
    }
    
    @Override
    public ServletContext getServletContext() {
        return config.getServletContext();
    }

    @Override
    public String getInitParameter(String name) {
        return config.getInitParameter(name);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Enumeration<String> getInitParameterNames() {
        return (Enumeration<String>)config.getInitParameterNames();
    }
}
