/*
 * Copyright 2015 Flipkart Internet, pvt ltd.
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

package com.flipkart.hydra.example.employee.callables;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;

public class LatLngService implements Callable {

    private final Object location;

    public LatLngService(Object location) {
        this.location = location;
    }

    @Override
    public Object call() throws Exception {
        return Arrays.asList(-90 + Math.random() * 180, -180 + Math.random() * 360);
    }
}
