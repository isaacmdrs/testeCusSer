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
import com.example.mastercard.model.ActivationMethods;
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
 * TokenActivationMethodsResultsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T17:08:41.015538669-03:00[America/Sao_Paulo]")
public class TokenActivationMethodsResultsData {
  public static final String SERIALIZED_NAME_ACTIVATION_METHODS = "ActivationMethods";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_METHODS)
  private ActivationMethods activationMethods;

  public TokenActivationMethodsResultsData() {
  }

  public TokenActivationMethodsResultsData activationMethods(ActivationMethods activationMethods) {
    this.activationMethods = activationMethods;
    return this;
  }

   /**
   * Get activationMethods
   * @return activationMethods
  **/
  @javax.annotation.Nullable
  public ActivationMethods getActivationMethods() {
    return activationMethods;
  }

  public void setActivationMethods(ActivationMethods activationMethods) {
    this.activationMethods = activationMethods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenActivationMethodsResultsData tokenActivationMethodsResultsData = (TokenActivationMethodsResultsData) o;
    return Objects.equals(this.activationMethods, tokenActivationMethodsResultsData.activationMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenActivationMethodsResultsData {\n");
    sb.append("    activationMethods: ").append(toIndentedString(activationMethods)).append("\n");
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
    openapiFields.add("ActivationMethods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TokenActivationMethodsResultsData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenActivationMethodsResultsData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenActivationMethodsResultsData is not found in the empty JSON string", TokenActivationMethodsResultsData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenActivationMethodsResultsData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenActivationMethodsResultsData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ActivationMethods`
      if (jsonObj.get("ActivationMethods") != null && !jsonObj.get("ActivationMethods").isJsonNull()) {
        ActivationMethods.validateJsonElement(jsonObj.get("ActivationMethods"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenActivationMethodsResultsData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenActivationMethodsResultsData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenActivationMethodsResultsData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenActivationMethodsResultsData.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenActivationMethodsResultsData>() {
           @Override
           public void write(JsonWriter out, TokenActivationMethodsResultsData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenActivationMethodsResultsData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenActivationMethodsResultsData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenActivationMethodsResultsData
  * @throws IOException if the JSON string is invalid with respect to TokenActivationMethodsResultsData
  */
  public static TokenActivationMethodsResultsData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenActivationMethodsResultsData.class);
  }

 /**
  * Convert an instance of TokenActivationMethodsResultsData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

