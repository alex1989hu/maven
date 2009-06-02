package org.apache.maven.model.profile;

/*
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
 */

import java.util.List;
import java.util.Properties;

/**
 * Describes the environmental context used to determine the activation status of profiles.
 * 
 * @author Benjamin Bentmann
 */
public interface ProfileActivationContext
{

    /**
     * Gets the identifiers of those profiles that should be activated by explicit demand.
     * 
     * @return The identifiers of those profiles to activate, never {@code null}.
     */
    List<String> getActiveProfileIds();

    /**
     * Sets the identifiers of those profiles that should be activated by explicit demand.
     * 
     * @param activeProfileIds The identifiers of those profiles to activate, may be {@code null}.
     * @return This context, never {@code null}.
     */
    ProfileActivationContext setActiveProfileIds( List<String> activeProfileIds );

    /**
     * Gets the identifiers of those profiles that should be deactivated by explicit demand.
     * 
     * @return The identifiers of those profiles to deactivate, never {@code null}.
     */
    List<String> getInactiveProfileIds();

    /**
     * Sets the identifiers of those profiles that should be deactivated by explicit demand.
     * 
     * @param inactiveProfileIds The identifiers of those profiles to deactivate, may be {@code null}.
     * @return This context, never {@code null}.
     */
    ProfileActivationContext setInactiveProfileIds( List<String> inactiveProfileIds );

    /**
     * Gets the execution properties.
     * 
     * @return The execution properties, never {@code null}.
     */
    Properties getExecutionProperties();

    /**
     * Sets the execution properties.
     * 
     * @param executionProperties The execution properties, may be {@code null}.
     * @return This context, never {@code null}.
     */
    ProfileActivationContext setExecutionProperties( Properties executionProperties );

}