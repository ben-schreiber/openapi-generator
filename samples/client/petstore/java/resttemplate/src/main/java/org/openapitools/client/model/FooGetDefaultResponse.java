/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.Foo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FooGetDefaultResponse
 */
@JsonPropertyOrder({
  FooGetDefaultResponse.JSON_PROPERTY_STRING
})
@JsonTypeName("_foo_get_default_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class FooGetDefaultResponse {
  public static final String JSON_PROPERTY_STRING = "string";
  @javax.annotation.Nullable
  private Foo string;

  public FooGetDefaultResponse() {
  }

  /**
   * Constructor with all args parameters
   */
  public FooGetDefaultResponse(@JsonProperty(JSON_PROPERTY_STRING) Foo string) {
    this.string = string;
  }

  public FooGetDefaultResponse string(@javax.annotation.Nullable Foo string) {
    
    this.string = string;
    return this;
  }

  /**
   * Get string
   * @return string
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Foo getString() {
    return string;
  }


  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setString(@javax.annotation.Nullable Foo string) {
    this.string = string;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FooGetDefaultResponse fooGetDefaultResponse = (FooGetDefaultResponse) o;
    return Objects.equals(this.string, fooGetDefaultResponse.string);
  }

  @Override
  public int hashCode() {
    return Objects.hash(string);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FooGetDefaultResponse {\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class Builder {

    private FooGetDefaultResponse instance;

    public Builder() {
      this(new FooGetDefaultResponse());
    }

    protected Builder(FooGetDefaultResponse instance) {
      this.instance = instance;
    }

    public FooGetDefaultResponse.Builder string(Foo string) {
      this.instance.string = string;
      return this;
    }


    /**
    * returns a built FooGetDefaultResponse instance.
    *
    * The builder is not reusable.
    */
    public FooGetDefaultResponse build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static FooGetDefaultResponse.Builder builder() {
    return new FooGetDefaultResponse.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public FooGetDefaultResponse.Builder toBuilder() {
    return new FooGetDefaultResponse.Builder()
      .string(getString());
  }


}

