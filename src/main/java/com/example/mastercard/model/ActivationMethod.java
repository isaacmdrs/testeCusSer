/*
 * Mastercard Digital Enablement Service Customer Service API
 * The MDES Customer Service API provides our Issuer partners with resources to help resolve consumer queries about payment accounts enabled through our digitization platform.
 *
 * The version of the OpenAPI document: 2.1.7
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.example.mastercard.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.example.mastercard.JSON;

/**
 * ActivationMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T17:08:41.015538669-03:00[America/Sao_Paulo]")
public class ActivationMethod {
  public static final String SERIALIZED_NAME_ACTIVATION_METHOD_TYPE = "ActivationMethodType";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_METHOD_TYPE)
  private String activationMethodType;

  public static final String SERIALIZED_NAME_ACTIVATION_METHOD_VALUE = "ActivationMethodValue";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_METHOD_VALUE)
  private String activationMethodValue;

  public static final String SERIALIZED_NAME_ACTIVATION_METHOD_ID = "ActivationMethodId";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_METHOD_ID)
  private String activationMethodId;

  public static final String SERIALIZED_NAME_RESEND_INDICATOR = "ResendIndicator";
  @SerializedName(SERIALIZED_NAME_RESEND_INDICATOR)
  private String resendIndicator;

  public ActivationMethod() {
  }

  public ActivationMethod activationMethodType(String activationMethodType) {
    this.activationMethodType = activationMethodType;
    return this;
  }

   /**
   * Type of activation method. Valid values:   * \&quot;SMS\&quot; - Activation code sent in text message to masked mobile phone number   * \&quot;EMA\&quot; - Activation code sent in email to masked email address   * \&quot;ACC\&quot; - Cardholder to call automated call center phone number   * \&quot;CLC\&quot; - Cardholder to call Call Center phone number   * \&quot;WEB\&quot; - Website   * \&quot;BAP\&quot; - Mobile application   * \&quot;OBC\&quot; - Activation code spoken via call to cardholder on masked voice call phone number. 
   * @return activationMethodType
  **/
  @javax.annotation.Nonnull
  public String getActivationMethodType() {
    return activationMethodType;
  }

  public void setActivationMethodType(String activationMethodType) {
    this.activationMethodType = activationMethodType;
  }


  public ActivationMethod activationMethodValue(String activationMethodValue) {
    this.activationMethodValue = activationMethodValue;
    return this;
  }

   /**
   * Activation method details value.
   * @return activationMethodValue
  **/
  @javax.annotation.Nonnull
  public String getActivationMethodValue() {
    return activationMethodValue;
  }

  public void setActivationMethodValue(String activationMethodValue) {
    this.activationMethodValue = activationMethodValue;
  }


  public ActivationMethod activationMethodId(String activationMethodId) {
    this.activationMethodId = activationMethodId;
    return this;
  }

   /**
   * Unique identifier of the activation method.
   * @return activationMethodId
  **/
  @javax.annotation.Nonnull
  public String getActivationMethodId() {
    return activationMethodId;
  }

  public void setActivationMethodId(String activationMethodId) {
    this.activationMethodId = activationMethodId;
  }


  public ActivationMethod resendIndicator(String resendIndicator) {
    this.resendIndicator = resendIndicator;
    return this;
  }

   /**
   * Whether the activation method can be used to re-send an activation code. Valid values are TRUE and FALSE.
   * @return resendIndicator
  **/
  @javax.annotation.Nullable
  public String getResendIndicator() {
    return resendIndicator;
  }

  public void setResendIndicator(String resendIndicator) {
    this.resendIndicator = resendIndicator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivationMethod activationMethod = (ActivationMethod) o;
    return Objects.equals(this.activationMethodType, activationMethod.activationMethodType) &&
        Objects.equals(this.activationMethodValue, activationMethod.activationMethodValue) &&
        Objects.equals(this.activationMethodId, activationMethod.activationMethodId) &&
        Objects.equals(this.resendIndicator, activationMethod.resendIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationMethodType, activationMethodValue, activationMethodId, resendIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivationMethod {\n");
    sb.append("    activationMethodType: ").append(toIndentedString(activationMethodType)).append("\n");
    sb.append("    activationMethodValue: ").append(toIndentedString(activationMethodValue)).append("\n");
    sb.append("    activationMethodId: ").append(toIndentedString(activationMethodId)).append("\n");
    sb.append("    resendIndicator: ").append(toIndentedString(resendIndicator)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ActivationMethodType");
    openapiFields.add("ActivationMethodValue");
    openapiFields.add("ActivationMethodId");
    openapiFields.add("ResendIndicator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ActivationMethodType");
    openapiRequiredFields.add("ActivationMethodValue");
    openapiRequiredFields.add("ActivationMethodId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ActivationMethod
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActivationMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivationMethod is not found in the empty JSON string", ActivationMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActivationMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivationMethod` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ActivationMethod.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ActivationMethodType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ActivationMethodType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ActivationMethodType").toString()));
      }
      if (!jsonObj.get("ActivationMethodValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ActivationMethodValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ActivationMethodValue").toString()));
      }
      if (!jsonObj.get("ActivationMethodId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ActivationMethodId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ActivationMethodId").toString()));
      }
      if ((jsonObj.get("ResendIndicator") != null && !jsonObj.get("ResendIndicator").isJsonNull()) && !jsonObj.get("ResendIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ResendIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ResendIndicator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivationMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivationMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivationMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivationMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivationMethod>() {
           @Override
           public void write(JsonWriter out, ActivationMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivationMethod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActivationMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivationMethod
  * @throws IOException if the JSON string is invalid with respect to ActivationMethod
  */
  public static ActivationMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivationMethod.class);
  }

 /**
  * Convert an instance of ActivationMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

