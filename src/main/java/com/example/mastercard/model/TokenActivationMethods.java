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
import com.example.mastercard.model.TokenActivationMethodsData;
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
 * TokenActivationMethods
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T17:08:41.015538669-03:00[America/Sao_Paulo]")
public class TokenActivationMethods {
  public static final String SERIALIZED_NAME_TOKEN_ACTIVATION_METHODS_REQUEST = "TokenActivationMethodsRequest";
  @SerializedName(SERIALIZED_NAME_TOKEN_ACTIVATION_METHODS_REQUEST)
  private TokenActivationMethodsData tokenActivationMethodsRequest;

  public TokenActivationMethods() {
  }

  public TokenActivationMethods tokenActivationMethodsRequest(TokenActivationMethodsData tokenActivationMethodsRequest) {
    this.tokenActivationMethodsRequest = tokenActivationMethodsRequest;
    return this;
  }

   /**
   * Get tokenActivationMethodsRequest
   * @return tokenActivationMethodsRequest
  **/
  @javax.annotation.Nullable
  public TokenActivationMethodsData getTokenActivationMethodsRequest() {
    return tokenActivationMethodsRequest;
  }

  public void setTokenActivationMethodsRequest(TokenActivationMethodsData tokenActivationMethodsRequest) {
    this.tokenActivationMethodsRequest = tokenActivationMethodsRequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenActivationMethods tokenActivationMethods = (TokenActivationMethods) o;
    return Objects.equals(this.tokenActivationMethodsRequest, tokenActivationMethods.tokenActivationMethodsRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenActivationMethodsRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenActivationMethods {\n");
    sb.append("    tokenActivationMethodsRequest: ").append(toIndentedString(tokenActivationMethodsRequest)).append("\n");
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
    openapiFields.add("TokenActivationMethodsRequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TokenActivationMethods
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenActivationMethods.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenActivationMethods is not found in the empty JSON string", TokenActivationMethods.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenActivationMethods.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenActivationMethods` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `TokenActivationMethodsRequest`
      if (jsonObj.get("TokenActivationMethodsRequest") != null && !jsonObj.get("TokenActivationMethodsRequest").isJsonNull()) {
        TokenActivationMethodsData.validateJsonElement(jsonObj.get("TokenActivationMethodsRequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenActivationMethods.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenActivationMethods' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenActivationMethods> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenActivationMethods.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenActivationMethods>() {
           @Override
           public void write(JsonWriter out, TokenActivationMethods value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenActivationMethods read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenActivationMethods given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenActivationMethods
  * @throws IOException if the JSON string is invalid with respect to TokenActivationMethods
  */
  public static TokenActivationMethods fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenActivationMethods.class);
  }

 /**
  * Convert an instance of TokenActivationMethods to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

