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
import com.example.mastercard.model.TokenUpdateResultsData;
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
 * TokenUpdateResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T17:08:41.015538669-03:00[America/Sao_Paulo]")
public class TokenUpdateResults {
  public static final String SERIALIZED_NAME_TOKEN_UPDATE_RESPONSE = "TokenUpdateResponse";
  @SerializedName(SERIALIZED_NAME_TOKEN_UPDATE_RESPONSE)
  private TokenUpdateResultsData tokenUpdateResponse;

  public TokenUpdateResults() {
  }

  public TokenUpdateResults tokenUpdateResponse(TokenUpdateResultsData tokenUpdateResponse) {
    this.tokenUpdateResponse = tokenUpdateResponse;
    return this;
  }

   /**
   * Get tokenUpdateResponse
   * @return tokenUpdateResponse
  **/
  @javax.annotation.Nullable
  public TokenUpdateResultsData getTokenUpdateResponse() {
    return tokenUpdateResponse;
  }

  public void setTokenUpdateResponse(TokenUpdateResultsData tokenUpdateResponse) {
    this.tokenUpdateResponse = tokenUpdateResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenUpdateResults tokenUpdateResults = (TokenUpdateResults) o;
    return Objects.equals(this.tokenUpdateResponse, tokenUpdateResults.tokenUpdateResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenUpdateResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenUpdateResults {\n");
    sb.append("    tokenUpdateResponse: ").append(toIndentedString(tokenUpdateResponse)).append("\n");
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
    openapiFields.add("TokenUpdateResponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TokenUpdateResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenUpdateResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenUpdateResults is not found in the empty JSON string", TokenUpdateResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenUpdateResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenUpdateResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `TokenUpdateResponse`
      if (jsonObj.get("TokenUpdateResponse") != null && !jsonObj.get("TokenUpdateResponse").isJsonNull()) {
        TokenUpdateResultsData.validateJsonElement(jsonObj.get("TokenUpdateResponse"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenUpdateResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenUpdateResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenUpdateResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenUpdateResults.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenUpdateResults>() {
           @Override
           public void write(JsonWriter out, TokenUpdateResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenUpdateResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenUpdateResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenUpdateResults
  * @throws IOException if the JSON string is invalid with respect to TokenUpdateResults
  */
  public static TokenUpdateResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenUpdateResults.class);
  }

 /**
  * Convert an instance of TokenUpdateResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

