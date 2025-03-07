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

package com.ververica.cdc.common.types;

import org.apache.flink.annotation.PublicEvolving;

/** An enumeration of data type families for clustering {@link DataTypeRoot}s into categories. */
@PublicEvolving
public enum DataTypeFamily {
    PREDEFINED,

    CONSTRUCTED,

    USER_DEFINED,

    CHARACTER_STRING,

    BINARY_STRING,

    NUMERIC,

    INTEGER_NUMERIC,

    EXACT_NUMERIC,

    APPROXIMATE_NUMERIC,

    DATETIME,

    TIME,

    TIMESTAMP,

    INTERVAL,

    COLLECTION,

    EXTENSION
}
