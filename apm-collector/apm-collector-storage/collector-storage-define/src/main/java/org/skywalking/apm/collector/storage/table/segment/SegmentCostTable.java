/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
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
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.collector.storage.table.segment;

import org.skywalking.apm.collector.core.data.CommonTable;

/**
 * @author peng-yongsheng
 */
public class SegmentCostTable extends CommonTable {
    public static final String TABLE = "segment_cost";
    public static final String COLUMN_SEGMENT_ID = "segment_id";
    public static final String COLUMN_APPLICATION_ID = "application_id";
    public static final String COLUMN_START_TIME = "start_time";
    public static final String COLUMN_END_TIME = "end_time";
    public static final String COLUMN_SERVICE_NAME = "service_name";
    public static final String COLUMN_COST = "cost";
    public static final String COLUMN_IS_ERROR = "is_error";
}
