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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The resetClusterPassword options.
 */
public class ResetClusterPasswordOptions extends GenericModel {

  protected String instanceGuid;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGuid;

    private Builder(ResetClusterPasswordOptions resetClusterPasswordOptions) {
      this.instanceGuid = resetClusterPasswordOptions.instanceGuid;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceGuid the instanceGuid
     */
    public Builder(String instanceGuid) {
      this.instanceGuid = instanceGuid;
    }

    /**
     * Builds a ResetClusterPasswordOptions.
     *
     * @return the new ResetClusterPasswordOptions instance
     */
    public ResetClusterPasswordOptions build() {
      return new ResetClusterPasswordOptions(this);
    }

    /**
     * Set the instanceGuid.
     *
     * @param instanceGuid the instanceGuid
     * @return the ResetClusterPasswordOptions builder
     */
    public Builder instanceGuid(String instanceGuid) {
      this.instanceGuid = instanceGuid;
      return this;
    }
  }

  protected ResetClusterPasswordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGuid,
      "instanceGuid cannot be empty");
    instanceGuid = builder.instanceGuid;
  }

  /**
   * New builder.
   *
   * @return a ResetClusterPasswordOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceGuid.
   *
   * Service instance GUID.
   *
   * @return the instanceGuid
   */
  public String instanceGuid() {
    return instanceGuid;
  }
}

