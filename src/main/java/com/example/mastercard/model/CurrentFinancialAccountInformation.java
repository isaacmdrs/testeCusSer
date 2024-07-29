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
 * Current Financial Account Information of the token(s) to be updated.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T17:08:41.015538669-03:00[America/Sao_Paulo]")
public class CurrentFinancialAccountInformation {
  public static final String SERIALIZED_NAME_INTERBANK_CARD_ASSOCIATION_ID = "InterbankCardAssociationId";
  @SerializedName(SERIALIZED_NAME_INTERBANK_CARD_ASSOCIATION_ID)
  private String interbankCardAssociationId;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public CurrentFinancialAccountInformation() {
  }

  public CurrentFinancialAccountInformation interbankCardAssociationId(String interbankCardAssociationId) {
    this.interbankCardAssociationId = interbankCardAssociationId;
    return this;
  }

   /**
   * Current ICA associated with the Financial of the token(s) to be updated. Conditional field, used for updating all tokens mapped to a single Financial Account and must be present when &#39;CurrentFinancialAccountInformation.FinancialAccountId&#39; is present.
   * @return interbankCardAssociationId
  **/
  @javax.annotation.Nullable
  public String getInterbankCardAssociationId() {
    return interbankCardAssociationId;
  }

  public void setInterbankCardAssociationId(String interbankCardAssociationId) {
    this.interbankCardAssociationId = interbankCardAssociationId;
  }


  public CurrentFinancialAccountInformation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Current Country code associated with the Financial of the token(s) to be updated. Expressed as a 3-letter (alpha-3) country code as defined in ISO 3166-1.  Conditional field, used for updating all tokens mapped to a single Financial Account and must be present when &#39;CurrentFinancialAccountInformation.FinancialAccountId&#39; is present.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentFinancialAccountInformation currentFinancialAccountInformation = (CurrentFinancialAccountInformation) o;
    return Objects.equals(this.interbankCardAssociationId, currentFinancialAccountInformation.interbankCardAssociationId) &&
        Objects.equals(this.countryCode, currentFinancialAccountInformation.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interbankCardAssociationId, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentFinancialAccountInformation {\n");
    sb.append("    interbankCardAssociationId: ").append(toIndentedString(interbankCardAssociationId)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("InterbankCardAssociationId");
    openapiFields.add("CountryCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CurrentFinancialAccountInformation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CurrentFinancialAccountInformation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurrentFinancialAccountInformation is not found in the empty JSON string", CurrentFinancialAccountInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CurrentFinancialAccountInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurrentFinancialAccountInformation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("InterbankCardAssociationId") != null && !jsonObj.get("InterbankCardAssociationId").isJsonNull()) && !jsonObj.get("InterbankCardAssociationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InterbankCardAssociationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InterbankCardAssociationId").toString()));
      }
      if ((jsonObj.get("CountryCode") != null && !jsonObj.get("CountryCode").isJsonNull()) && !jsonObj.get("CountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurrentFinancialAccountInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurrentFinancialAccountInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurrentFinancialAccountInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurrentFinancialAccountInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<CurrentFinancialAccountInformation>() {
           @Override
           public void write(JsonWriter out, CurrentFinancialAccountInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurrentFinancialAccountInformation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CurrentFinancialAccountInformation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurrentFinancialAccountInformation
  * @throws IOException if the JSON string is invalid with respect to CurrentFinancialAccountInformation
  */
  public static CurrentFinancialAccountInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurrentFinancialAccountInformation.class);
  }

 /**
  * Convert an instance of CurrentFinancialAccountInformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

