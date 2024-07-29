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
 * AuditInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T17:08:41.015538669-03:00[America/Sao_Paulo]")
public class AuditInfo {
  public static final String SERIALIZED_NAME_USER_ID = "UserId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USER_NAME = "UserName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_ORGANIZATION = "Organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

  public static final String SERIALIZED_NAME_PHONE = "Phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public AuditInfo() {
  }

  public AuditInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User ID (as assigned by the Issuer/Processor) of the Customer Service Representative who triggered the API request. MDES is not the system of record for this field and does not perform any duplicate checks or other functional validations. The Issuer/Processor, must ensure that the contents of this field comply with their internal system of record. String of up to 50 characters.
   * @return userId
  **/
  @javax.annotation.Nonnull
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AuditInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * User Name of the Customer Service Representative who triggered the API request. String of up to 200 characters.
   * @return userName
  **/
  @javax.annotation.Nonnull
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public AuditInfo organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Name of the Issuer or Processor to which the Customer Service Representative who triggered the API request belongs. String of up to 200 characters.
   * @return organization
  **/
  @javax.annotation.Nonnull
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public AuditInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone Number of the Customer Service Representative who triggered the API request. String of up to 20 characters. Optional.
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditInfo auditInfo = (AuditInfo) o;
    return Objects.equals(this.userId, auditInfo.userId) &&
        Objects.equals(this.userName, auditInfo.userName) &&
        Objects.equals(this.organization, auditInfo.organization) &&
        Objects.equals(this.phone, auditInfo.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, organization, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditInfo {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    openapiFields.add("UserId");
    openapiFields.add("UserName");
    openapiFields.add("Organization");
    openapiFields.add("Phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("UserId");
    openapiRequiredFields.add("UserName");
    openapiRequiredFields.add("Organization");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuditInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuditInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditInfo is not found in the empty JSON string", AuditInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuditInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuditInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuditInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("UserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UserId").toString()));
      }
      if (!jsonObj.get("UserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UserName").toString()));
      }
      if (!jsonObj.get("Organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Organization").toString()));
      }
      if ((jsonObj.get("Phone") != null && !jsonObj.get("Phone").isJsonNull()) && !jsonObj.get("Phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditInfo>() {
           @Override
           public void write(JsonWriter out, AuditInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuditInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditInfo
  * @throws IOException if the JSON string is invalid with respect to AuditInfo
  */
  public static AuditInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditInfo.class);
  }

 /**
  * Convert an instance of AuditInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

