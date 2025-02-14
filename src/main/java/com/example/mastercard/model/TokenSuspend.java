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
import com.example.mastercard.model.TokenSuspendData;
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
 * TokenSuspend
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T17:08:41.015538669-03:00[America/Sao_Paulo]")
public class TokenSuspend {
  public static final String SERIALIZED_NAME_TOKEN_SUSPEND_REQUEST = "TokenSuspendRequest";
  @SerializedName(SERIALIZED_NAME_TOKEN_SUSPEND_REQUEST)
  private TokenSuspendData tokenSuspendRequest;

  public TokenSuspend() {
  }

  public TokenSuspend tokenSuspendRequest(TokenSuspendData tokenSuspendRequest) {
    this.tokenSuspendRequest = tokenSuspendRequest;
    return this;
  }

   /**
   * Get tokenSuspendRequest
   * @return tokenSuspendRequest
  **/
  @javax.annotation.Nullable
  public TokenSuspendData getTokenSuspendRequest() {
    return tokenSuspendRequest;
  }

  public void setTokenSuspendRequest(TokenSuspendData tokenSuspendRequest) {
    this.tokenSuspendRequest = tokenSuspendRequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenSuspend tokenSuspend = (TokenSuspend) o;
    return Objects.equals(this.tokenSuspendRequest, tokenSuspend.tokenSuspendRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenSuspendRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenSuspend {\n");
    sb.append("    tokenSuspendRequest: ").append(toIndentedString(tokenSuspendRequest)).append("\n");
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
    openapiFields.add("TokenSuspendRequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TokenSuspend
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenSuspend.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenSuspend is not found in the empty JSON string", TokenSuspend.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenSuspend.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenSuspend` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `TokenSuspendRequest`
      if (jsonObj.get("TokenSuspendRequest") != null && !jsonObj.get("TokenSuspendRequest").isJsonNull()) {
        TokenSuspendData.validateJsonElement(jsonObj.get("TokenSuspendRequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenSuspend.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenSuspend' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenSuspend> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenSuspend.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenSuspend>() {
           @Override
           public void write(JsonWriter out, TokenSuspend value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenSuspend read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenSuspend given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenSuspend
  * @throws IOException if the JSON string is invalid with respect to TokenSuspend
  */
  public static TokenSuspend fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenSuspend.class);
  }

 /**
  * Convert an instance of TokenSuspend to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

