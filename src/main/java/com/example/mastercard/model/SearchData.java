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
import com.example.mastercard.model.AuditInfo;
import com.example.mastercard.model.EncryptedAccountInformation;
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
 * SearchData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T17:08:41.015538669-03:00[America/Sao_Paulo]")
public class SearchData {
  public static final String SERIALIZED_NAME_ENCRYPTED_ACCOUNT_INFORMATION = "EncryptedAccountInformation";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_ACCOUNT_INFORMATION)
  private EncryptedAccountInformation encryptedAccountInformation;

  public static final String SERIALIZED_NAME_PAYMENT_APP_INSTANCE_ID = "PaymentAppInstanceId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_APP_INSTANCE_ID)
  private String paymentAppInstanceId;

  public static final String SERIALIZED_NAME_COMMENT_ID = "CommentId";
  @SerializedName(SERIALIZED_NAME_COMMENT_ID)
  private String commentId;

  public static final String SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE = "TokenUniqueReference";
  @SerializedName(SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE)
  private String tokenUniqueReference;

  public static final String SERIALIZED_NAME_EXCLUDE_DELETED_INDICATOR = "ExcludeDeletedIndicator";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_DELETED_INDICATOR)
  private String excludeDeletedIndicator;

  public static final String SERIALIZED_NAME_INCLUDE_DEVICE_TOKENS_ONLY = "IncludeDeviceTokensOnly";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DEVICE_TOKENS_ONLY)
  private String includeDeviceTokensOnly;

  public static final String SERIALIZED_NAME_EXCLUDE_TOKENS_DELETED_FROM_CONSUMER_APP = "ExcludeTokensDeletedFromConsumerApp";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_TOKENS_DELETED_FROM_CONSUMER_APP)
  private String excludeTokensDeletedFromConsumerApp;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "AuditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AuditInfo auditInfo;

  public SearchData() {
  }

  public SearchData encryptedAccountInformation(EncryptedAccountInformation encryptedAccountInformation) {
    this.encryptedAccountInformation = encryptedAccountInformation;
    return this;
  }

   /**
   * Get encryptedAccountInformation
   * @return encryptedAccountInformation
  **/
  @javax.annotation.Nullable
  public EncryptedAccountInformation getEncryptedAccountInformation() {
    return encryptedAccountInformation;
  }

  public void setEncryptedAccountInformation(EncryptedAccountInformation encryptedAccountInformation) {
    this.encryptedAccountInformation = encryptedAccountInformation;
  }


  public SearchData paymentAppInstanceId(String paymentAppInstanceId) {
    this.paymentAppInstanceId = paymentAppInstanceId;
    return this;
  }

   /**
   * When present, the search will return tokens already present or to be provisioned to the specified Payment App instance. Note - This may contain the identifier of the Secure Element or a mobile device for some programs. Cannot be used together with any of the following search request parameters (AccountPan, TokenUniqueReference, Token, CommentId, or AlternateAccountIdentifier). 
   * @return paymentAppInstanceId
  **/
  @javax.annotation.Nullable
  public String getPaymentAppInstanceId() {
    return paymentAppInstanceId;
  }

  public void setPaymentAppInstanceId(String paymentAppInstanceId) {
    this.paymentAppInstanceId = paymentAppInstanceId;
  }


  public SearchData commentId(String commentId) {
    this.commentId = commentId;
    return this;
  }

   /**
   * When present, the search will return one specific token linked to the comment. Cannot be used together with EncryptedAccountInformation 
   * @return commentId
  **/
  @javax.annotation.Nullable
  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }


  public SearchData tokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
    return this;
  }

   /**
   * A unique reference assigned to a token and used to identify the token for the duration of its lifetime. When present, the search will return one specific matching token.  
   * @return tokenUniqueReference
  **/
  @javax.annotation.Nullable
  public String getTokenUniqueReference() {
    return tokenUniqueReference;
  }

  public void setTokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
  }


  public SearchData excludeDeletedIndicator(String excludeDeletedIndicator) {
    this.excludeDeletedIndicator = excludeDeletedIndicator;
    return this;
  }

   /**
   * Indicates whether deleted tokens should be included or excluded from the search results. Valid values:   * \&quot;true\&quot; - indicates deleted tokens are excluded from the search results.   * \&quot;false\&quot; - indicates deleted tokens are included in the search results. 
   * @return excludeDeletedIndicator
  **/
  @javax.annotation.Nullable
  public String getExcludeDeletedIndicator() {
    return excludeDeletedIndicator;
  }

  public void setExcludeDeletedIndicator(String excludeDeletedIndicator) {
    this.excludeDeletedIndicator = excludeDeletedIndicator;
  }


  public SearchData includeDeviceTokensOnly(String includeDeviceTokensOnly) {
    this.includeDeviceTokensOnly = includeDeviceTokensOnly;
    return this;
  }

   /**
   * Gives issuers the choice to receive only device tokens mapped to their payment credentials. This is an optional parameter, if the issuer decides to not include this field in their \&quot;Search\&quot; request, MDES will return all tokens mapped to the payment credentials (server, device and COF based tokens). Valid values:   * \&quot;true\&quot; - When present with the \&quot;true\&quot; value, MDES will never return any server-based tokens associated to the payment credentials.    * \&quot;false\&quot; - When present with the \&quot;false\&quot; value, MDES will return all tokens mapped to the payment credentials (server, device and COF based tokens). 
   * @return includeDeviceTokensOnly
  **/
  @javax.annotation.Nullable
  public String getIncludeDeviceTokensOnly() {
    return includeDeviceTokensOnly;
  }

  public void setIncludeDeviceTokensOnly(String includeDeviceTokensOnly) {
    this.includeDeviceTokensOnly = includeDeviceTokensOnly;
  }


  public SearchData excludeTokensDeletedFromConsumerApp(String excludeTokensDeletedFromConsumerApp) {
    this.excludeTokensDeletedFromConsumerApp = excludeTokensDeletedFromConsumerApp;
    return this;
  }

   /**
   * Gives issuers the choice to only receive device tokens that are active on the consumer device. Tokens that have been deleted from the consumer app (digital wallet)  but active in MDES will be excluded when the response if set to true. This is an optional parameter, if the issuer decides to not include this field in their \&quot;Search\&quot; request, MDES will return all tokens including tokens deleted from the consumer app but active in MDES. Valid values:   * \&quot;true\&quot; - When present with the \&quot;true\&quot; value, MDES will never return any tokens that are deleted from the consumer app.    * \&quot;false\&quot; - When present with the \&quot;false\&quot; value, MDES will return tokens    that are deleted from the consumer app. 
   * @return excludeTokensDeletedFromConsumerApp
  **/
  @javax.annotation.Nullable
  public String getExcludeTokensDeletedFromConsumerApp() {
    return excludeTokensDeletedFromConsumerApp;
  }

  public void setExcludeTokensDeletedFromConsumerApp(String excludeTokensDeletedFromConsumerApp) {
    this.excludeTokensDeletedFromConsumerApp = excludeTokensDeletedFromConsumerApp;
  }


  public SearchData auditInfo(AuditInfo auditInfo) {
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nonnull
  public AuditInfo getAuditInfo() {
    return auditInfo;
  }

  public void setAuditInfo(AuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchData searchData = (SearchData) o;
    return Objects.equals(this.encryptedAccountInformation, searchData.encryptedAccountInformation) &&
        Objects.equals(this.paymentAppInstanceId, searchData.paymentAppInstanceId) &&
        Objects.equals(this.commentId, searchData.commentId) &&
        Objects.equals(this.tokenUniqueReference, searchData.tokenUniqueReference) &&
        Objects.equals(this.excludeDeletedIndicator, searchData.excludeDeletedIndicator) &&
        Objects.equals(this.includeDeviceTokensOnly, searchData.includeDeviceTokensOnly) &&
        Objects.equals(this.excludeTokensDeletedFromConsumerApp, searchData.excludeTokensDeletedFromConsumerApp) &&
        Objects.equals(this.auditInfo, searchData.auditInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedAccountInformation, paymentAppInstanceId, commentId, tokenUniqueReference, excludeDeletedIndicator, includeDeviceTokensOnly, excludeTokensDeletedFromConsumerApp, auditInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchData {\n");
    sb.append("    encryptedAccountInformation: ").append(toIndentedString(encryptedAccountInformation)).append("\n");
    sb.append("    paymentAppInstanceId: ").append(toIndentedString(paymentAppInstanceId)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    tokenUniqueReference: ").append(toIndentedString(tokenUniqueReference)).append("\n");
    sb.append("    excludeDeletedIndicator: ").append(toIndentedString(excludeDeletedIndicator)).append("\n");
    sb.append("    includeDeviceTokensOnly: ").append(toIndentedString(includeDeviceTokensOnly)).append("\n");
    sb.append("    excludeTokensDeletedFromConsumerApp: ").append(toIndentedString(excludeTokensDeletedFromConsumerApp)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
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
    openapiFields.add("EncryptedAccountInformation");
    openapiFields.add("PaymentAppInstanceId");
    openapiFields.add("CommentId");
    openapiFields.add("TokenUniqueReference");
    openapiFields.add("ExcludeDeletedIndicator");
    openapiFields.add("IncludeDeviceTokensOnly");
    openapiFields.add("ExcludeTokensDeletedFromConsumerApp");
    openapiFields.add("AuditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AuditInfo");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SearchData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchData is not found in the empty JSON string", SearchData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `EncryptedAccountInformation`
      if (jsonObj.get("EncryptedAccountInformation") != null && !jsonObj.get("EncryptedAccountInformation").isJsonNull()) {
        EncryptedAccountInformation.validateJsonElement(jsonObj.get("EncryptedAccountInformation"));
      }
      if ((jsonObj.get("PaymentAppInstanceId") != null && !jsonObj.get("PaymentAppInstanceId").isJsonNull()) && !jsonObj.get("PaymentAppInstanceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PaymentAppInstanceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PaymentAppInstanceId").toString()));
      }
      if ((jsonObj.get("CommentId") != null && !jsonObj.get("CommentId").isJsonNull()) && !jsonObj.get("CommentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CommentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CommentId").toString()));
      }
      if ((jsonObj.get("TokenUniqueReference") != null && !jsonObj.get("TokenUniqueReference").isJsonNull()) && !jsonObj.get("TokenUniqueReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TokenUniqueReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TokenUniqueReference").toString()));
      }
      if ((jsonObj.get("ExcludeDeletedIndicator") != null && !jsonObj.get("ExcludeDeletedIndicator").isJsonNull()) && !jsonObj.get("ExcludeDeletedIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExcludeDeletedIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExcludeDeletedIndicator").toString()));
      }
      if ((jsonObj.get("IncludeDeviceTokensOnly") != null && !jsonObj.get("IncludeDeviceTokensOnly").isJsonNull()) && !jsonObj.get("IncludeDeviceTokensOnly").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IncludeDeviceTokensOnly` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IncludeDeviceTokensOnly").toString()));
      }
      if ((jsonObj.get("ExcludeTokensDeletedFromConsumerApp") != null && !jsonObj.get("ExcludeTokensDeletedFromConsumerApp").isJsonNull()) && !jsonObj.get("ExcludeTokensDeletedFromConsumerApp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExcludeTokensDeletedFromConsumerApp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExcludeTokensDeletedFromConsumerApp").toString()));
      }
      // validate the required field `AuditInfo`
      AuditInfo.validateJsonElement(jsonObj.get("AuditInfo"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchData.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchData>() {
           @Override
           public void write(JsonWriter out, SearchData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchData
  * @throws IOException if the JSON string is invalid with respect to SearchData
  */
  public static SearchData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchData.class);
  }

 /**
  * Convert an instance of SearchData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

