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

package com.ververica.cdc.common.sink;

import org.apache.flink.annotation.PublicEvolving;
import org.apache.flink.api.connector.sink2.Sink;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;

/**
 * A marker interface used to provide an event sink for writing change events to external systems.
 * We can reuse exiting Flink {@link Sink} and Flink {@link SinkFunction} implementation, and we can
 * support our own {@code EventSink} Implementation in the future.
 */
@PublicEvolving
public interface EventSinkProvider {}
