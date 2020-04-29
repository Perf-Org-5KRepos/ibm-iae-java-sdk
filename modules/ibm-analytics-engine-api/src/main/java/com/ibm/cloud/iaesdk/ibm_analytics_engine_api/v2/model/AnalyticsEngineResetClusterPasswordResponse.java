/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.iaesdk.ibm_analytics_engine_api.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response for resetting cluster password.
 */
public class AnalyticsEngineResetClusterPasswordResponse extends GenericModel {

  protected String id;
  @SerializedName("user_credentials")
  protected AnalyticsEngineResetClusterPasswordResponseUserCredentials userCredentials;

  /**
   * Gets the id.
   *
   * Instance guid.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the userCredentials.
   *
   * User credentials.
   *
   * @return the userCredentials
   */
  public AnalyticsEngineResetClusterPasswordResponseUserCredentials getUserCredentials() {
    return userCredentials;
  }
}

