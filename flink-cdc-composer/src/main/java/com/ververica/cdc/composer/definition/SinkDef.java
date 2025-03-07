/*
 * Copyright 2023 Ververica Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ververica.cdc.composer.definition;

import org.apache.flink.configuration.Configuration;

import javax.annotation.Nullable;

import java.util.Objects;
import java.util.Optional;

/**
 * Definition of a data sink.
 *
 * <p>A sink definition contains:
 *
 * <ul>
 *   <li>type: connector type of the sink, which will be used for discovering sink implementation.
 *       Required in the definition.
 *   <li>name: name of the sink. Optional in the definition.
 *   <li>config: configuration of the sink
 * </ul>
 */
public class SinkDef {
    private final String type;
    @Nullable private final String name;
    private final Configuration config;

    public SinkDef(String type, @Nullable String name, Configuration config) {
        this.type = type;
        this.name = name;
        this.config = config;
    }

    public String getType() {
        return type;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Configuration getConfig() {
        return config;
    }

    @Override
    public String toString() {
        return "SinkDef{"
                + "type='"
                + type
                + '\''
                + ", name='"
                + name
                + '\''
                + ", config="
                + config
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SinkDef sinkDef = (SinkDef) o;
        return Objects.equals(type, sinkDef.type)
                && Objects.equals(name, sinkDef.name)
                && Objects.equals(config, sinkDef.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, config);
    }
}
