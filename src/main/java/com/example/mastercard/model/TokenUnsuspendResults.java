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
import com.example.mastercard.model.SimpleTokenResults;
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
 * TokenUnsuspendResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T17:08:41.015538669-03:00[America/Sao_Paulo]")
public class TokenUnsuspendResults {
  public static final String SERIALIZED_NAME_TOKEN_UNSUSPEND_RESPONSE = "TokenUnsuspendResponse";
  @SerializedName(SERIALIZED_NAME_TOKEN_UNSUSPEND_RESPONSE)
  private SimpleTokenResults tokenUnsuspendResponse;

  public TokenUnsuspendResults() {
  }

  public TokenUnsuspendResults tokenUnsuspendResponse(SimpleTokenResults tokenUnsuspendResponse) {
    this.tokenUnsuspendResponse = tokenUnsuspendResponse;
    return this;
  }

   /**
   * Get tokenUnsuspendResponse
   * @return tokenUnsuspendResponse
  **/
  @javax.annotation.Nullable
  public SimpleTokenResults getTokenUnsuspendResponse() {
    return tokenUnsuspendResponse;
  }

  public void setTokenUnsuspendResponse(SimpleTokenResults tokenUnsuspendResponse) {
    this.tokenUnsuspendResponse = tokenUnsuspendResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenUnsuspendResults tokenUnsuspendResults = (TokenUnsuspendResults) o;
    return Objects.equals(this.tokenUnsuspendResponse, tokenUnsuspendResults.tokenUnsuspendResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenUnsuspendResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenUnsuspendResults {\n");
    sb.append("    tokenUnsuspendResponse: ").append(toIndentedString(tokenUnsuspendResponse)).append("\n");
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
    openapiFields.add("TokenUnsuspendResponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TokenUnsuspendResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenUnsuspendResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenUnsuspendResults is not found in the empty JSON string", TokenUnsuspendResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenUnsuspendResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenUnsuspendResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `TokenUnsuspendResponse`
      if (jsonObj.get("TokenUnsuspendResponse") != null && !jsonObj.get("TokenUnsuspendResponse").isJsonNull()) {
        SimpleTokenResults.validateJsonElement(jsonObj.get("TokenUnsuspendResponse"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenUnsuspendResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenUnsuspendResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenUnsuspendResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenUnsuspendResults.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenUnsuspendResults>() {
           @Override
           public void write(JsonWriter out, TokenUnsuspendResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenUnsuspendResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenUnsuspendResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenUnsuspendResults
  * @throws IOException if the JSON string is invalid with respect to TokenUnsuspendResults
  */
  public static TokenUnsuspendResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenUnsuspendResults.class);
  }

 /**
  * Convert an instance of TokenUnsuspendResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

