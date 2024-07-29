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
 * TokenActivateData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T17:08:41.015538669-03:00[America/Sao_Paulo]")
public class TokenActivateData {
  public static final String SERIALIZED_NAME_ENCRYPTED_ACCOUNT_INFORMATION = "EncryptedAccountInformation";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_ACCOUNT_INFORMATION)
  private EncryptedAccountInformation encryptedAccountInformation;

  public static final String SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE = "TokenUniqueReference";
  @SerializedName(SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE)
  private String tokenUniqueReference;

  public static final String SERIALIZED_NAME_PAYMENT_APP_INSTANCE_ID = "PaymentAppInstanceId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_APP_INSTANCE_ID)
  private String paymentAppInstanceId;

  public static final String SERIALIZED_NAME_COMMENT_TEXT = "CommentText";
  @SerializedName(SERIALIZED_NAME_COMMENT_TEXT)
  private String commentText;

  public static final String SERIALIZED_NAME_REASON_CODE = "ReasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "AuditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AuditInfo auditInfo;

  public TokenActivateData() {
  }

  public TokenActivateData encryptedAccountInformation(EncryptedAccountInformation encryptedAccountInformation) {
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


  public TokenActivateData tokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
    return this;
  }

   /**
   * TokenUniqueReference for the token to be activated. Conditional field, present when AccountPan and PaymentAppInstanceId are not present.
   * @return tokenUniqueReference
  **/
  @javax.annotation.Nullable
  public String getTokenUniqueReference() {
    return tokenUniqueReference;
  }

  public void setTokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
  }


  public TokenActivateData paymentAppInstanceId(String paymentAppInstanceId) {
    this.paymentAppInstanceId = paymentAppInstanceId;
    return this;
  }

   /**
   * Identifier of the Payment App instance within a device that will be provisioned with a token. NOTE - This may contain the identifier of the Secure Element or a mobile device for some programs. Conditional field, must be present when &#x60;EncryptedAccountInformation.EncryptedData.AccountPan&#x60; is present. Must not be present when TokenUniqueReference is present.
   * @return paymentAppInstanceId
  **/
  @javax.annotation.Nullable
  public String getPaymentAppInstanceId() {
    return paymentAppInstanceId;
  }

  public void setPaymentAppInstanceId(String paymentAppInstanceId) {
    this.paymentAppInstanceId = paymentAppInstanceId;
  }


  public TokenActivateData commentText(String commentText) {
    this.commentText = commentText;
    return this;
  }

   /**
   * Comment related to activating this token.
   * @return commentText
  **/
  @javax.annotation.Nullable
  public String getCommentText() {
    return commentText;
  }

  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }


  public TokenActivateData reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Reason for the activation. Valid values:   * \&quot;A\&quot; - Cardholder successfully authenticated with an activation method (activation code by text message, email, Issuer mobile application etc...) prior to activation.   * \&quot;C\&quot; - Cardholder successfully authenticated with a customer service agent prior to activation. 
   * @return reasonCode
  **/
  @javax.annotation.Nonnull
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public TokenActivateData auditInfo(AuditInfo auditInfo) {
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
    TokenActivateData tokenActivateData = (TokenActivateData) o;
    return Objects.equals(this.encryptedAccountInformation, tokenActivateData.encryptedAccountInformation) &&
        Objects.equals(this.tokenUniqueReference, tokenActivateData.tokenUniqueReference) &&
        Objects.equals(this.paymentAppInstanceId, tokenActivateData.paymentAppInstanceId) &&
        Objects.equals(this.commentText, tokenActivateData.commentText) &&
        Objects.equals(this.reasonCode, tokenActivateData.reasonCode) &&
        Objects.equals(this.auditInfo, tokenActivateData.auditInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedAccountInformation, tokenUniqueReference, paymentAppInstanceId, commentText, reasonCode, auditInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenActivateData {\n");
    sb.append("    encryptedAccountInformation: ").append(toIndentedString(encryptedAccountInformation)).append("\n");
    sb.append("    tokenUniqueReference: ").append(toIndentedString(tokenUniqueReference)).append("\n");
    sb.append("    paymentAppInstanceId: ").append(toIndentedString(paymentAppInstanceId)).append("\n");
    sb.append("    commentText: ").append(toIndentedString(commentText)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
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
    openapiFields.add("TokenUniqueReference");
    openapiFields.add("PaymentAppInstanceId");
    openapiFields.add("CommentText");
    openapiFields.add("ReasonCode");
    openapiFields.add("AuditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ReasonCode");
    openapiRequiredFields.add("AuditInfo");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TokenActivateData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenActivateData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenActivateData is not found in the empty JSON string", TokenActivateData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenActivateData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenActivateData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokenActivateData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `EncryptedAccountInformation`
      if (jsonObj.get("EncryptedAccountInformation") != null && !jsonObj.get("EncryptedAccountInformation").isJsonNull()) {
        EncryptedAccountInformation.validateJsonElement(jsonObj.get("EncryptedAccountInformation"));
      }
      if ((jsonObj.get("TokenUniqueReference") != null && !jsonObj.get("TokenUniqueReference").isJsonNull()) && !jsonObj.get("TokenUniqueReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TokenUniqueReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TokenUniqueReference").toString()));
      }
      if ((jsonObj.get("PaymentAppInstanceId") != null && !jsonObj.get("PaymentAppInstanceId").isJsonNull()) && !jsonObj.get("PaymentAppInstanceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PaymentAppInstanceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PaymentAppInstanceId").toString()));
      }
      if ((jsonObj.get("CommentText") != null && !jsonObj.get("CommentText").isJsonNull()) && !jsonObj.get("CommentText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CommentText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CommentText").toString()));
      }
      if (!jsonObj.get("ReasonCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ReasonCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ReasonCode").toString()));
      }
      // validate the required field `AuditInfo`
      AuditInfo.validateJsonElement(jsonObj.get("AuditInfo"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenActivateData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenActivateData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenActivateData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenActivateData.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenActivateData>() {
           @Override
           public void write(JsonWriter out, TokenActivateData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenActivateData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenActivateData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenActivateData
  * @throws IOException if the JSON string is invalid with respect to TokenActivateData
  */
  public static TokenActivateData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenActivateData.class);
  }

 /**
  * Convert an instance of TokenActivateData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

