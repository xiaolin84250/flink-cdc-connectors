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

package com.ververica.cdc.runtime.operators.schema.event;

import org.apache.flink.runtime.operators.coordination.OperatorEvent;

import com.ververica.cdc.runtime.operators.schema.SchemaOperator;
import com.ververica.cdc.runtime.operators.schema.coordinator.SchemaOperatorCoordinator;

/**
 * A {@link OperatorEvent} from {@link SchemaOperatorCoordinator} to notify {@link SchemaOperator}
 * that the coordinator has finished schema change and the {@link SchemaOperator} should continue to
 * push data.
 */
public class ReleaseUpstreamEvent implements OperatorEvent {
    private static final long serialVersionUID = 1L;
}
