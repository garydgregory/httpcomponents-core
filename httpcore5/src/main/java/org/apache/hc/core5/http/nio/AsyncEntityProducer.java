/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package org.apache.hc.core5.http.nio;

import org.apache.hc.core5.http.EntityDetails;

/**
 * Abstract asynchronous message entity producer.
 *
 * @since 5.0
 */
public interface AsyncEntityProducer extends AsyncDataProducer, EntityDetails {

    /**
     * Determines whether the producer can consistently produce the same content
     * after invocation of {@link ResourceHolder#close()}.
     */
    boolean isRepeatable();

    /**
     * Triggered to signal a failure in data generation.
     *
     * @param cause the cause of the failure.
     */
    void failed(Exception cause);

}
