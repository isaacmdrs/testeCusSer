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
import com.example.mastercard.model.UpdateAccountData;
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
 * Used when account data is supplied in Search, Activate or Update APIs. Use only if account data is present, not required otherwise.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T17:08:41.015538669-03:00[America/Sao_Paulo]")
public class UpdateEncryptedAccountInformation {
  public static final String SERIALIZED_NAME_ENCRYPTED_DATA = "EncryptedData";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_DATA)
  private UpdateAccountData encryptedData;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_FINGERPRINT = "PublicKeyFingerprint";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_FINGERPRINT)
  private String publicKeyFingerprint;

  public static final String SERIALIZED_NAME_ENCRYPTED_KEY = "EncryptedKey";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_KEY)
  private String encryptedKey;

  public static final String SERIALIZED_NAME_OAEP_HASHING_ALGORITHM = "OaepHashingAlgorithm";
  @SerializedName(SERIALIZED_NAME_OAEP_HASHING_ALGORITHM)
  private String oaepHashingAlgorithm;

  public static final String SERIALIZED_NAME_IV = "Iv";
  @SerializedName(SERIALIZED_NAME_IV)
  private String iv;

  public UpdateEncryptedAccountInformation() {
  }

  public UpdateEncryptedAccountInformation encryptedData(UpdateAccountData encryptedData) {
    this.encryptedData = encryptedData;
    return this;
  }

   /**
   * Get encryptedData
   * @return encryptedData
  **/
  @javax.annotation.Nonnull
  public UpdateAccountData getEncryptedData() {
    return encryptedData;
  }

  public void setEncryptedData(UpdateAccountData encryptedData) {
    this.encryptedData = encryptedData;
  }


  public UpdateEncryptedAccountInformation publicKeyFingerprint(String publicKeyFingerprint) {
    this.publicKeyFingerprint = publicKeyFingerprint;
    return this;
  }

   /**
   * The fingerprint of the public key used to encrypt the ephemeral AES key. 
   * @return publicKeyFingerprint
  **/
  @javax.annotation.Nonnull
  public String getPublicKeyFingerprint() {
    return publicKeyFingerprint;
  }

  public void setPublicKeyFingerprint(String publicKeyFingerprint) {
    this.publicKeyFingerprint = publicKeyFingerprint;
  }


  public UpdateEncryptedAccountInformation encryptedKey(String encryptedKey) {
    this.encryptedKey = encryptedKey;
    return this;
  }

   /**
   * One-time use AES key encrypted by the MasterCard public key (as identified by publicKeyFingerprint) using the OAEP or PKCS#1 v1.5 scheme (depending on the value of oaepHashingAlgorithm. 
   * @return encryptedKey
  **/
  @javax.annotation.Nonnull
  public String getEncryptedKey() {
    return encryptedKey;
  }

  public void setEncryptedKey(String encryptedKey) {
    this.encryptedKey = encryptedKey;
  }


  public UpdateEncryptedAccountInformation oaepHashingAlgorithm(String oaepHashingAlgorithm) {
    this.oaepHashingAlgorithm = oaepHashingAlgorithm;
    return this;
  }

   /**
   * Hashing algorithm used with the OAEP scheme. Only present when EncryptedAccountInformation.EncryptedData is present. Must be either:   * SHA256   * SHA512. 
   * @return oaepHashingAlgorithm
  **/
  @javax.annotation.Nonnull
  public String getOaepHashingAlgorithm() {
    return oaepHashingAlgorithm;
  }

  public void setOaepHashingAlgorithm(String oaepHashingAlgorithm) {
    this.oaepHashingAlgorithm = oaepHashingAlgorithm;
  }


  public UpdateEncryptedAccountInformation iv(String iv) {
    this.iv = iv;
    return this;
  }

   /**
   * The initialization vector used when encrypting data using the one-time use AES key. Must be exactly 16 bytes (32 character hex string) to match the block size. Only present when EncryptedAccountInformation.EncryptedData is present. If not present, an IV of zero is assumed. 
   * @return iv
  **/
  @javax.annotation.Nonnull
  public String getIv() {
    return iv;
  }

  public void setIv(String iv) {
    this.iv = iv;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEncryptedAccountInformation updateEncryptedAccountInformation = (UpdateEncryptedAccountInformation) o;
    return Objects.equals(this.encryptedData, updateEncryptedAccountInformation.encryptedData) &&
        Objects.equals(this.publicKeyFingerprint, updateEncryptedAccountInformation.publicKeyFingerprint) &&
        Objects.equals(this.encryptedKey, updateEncryptedAccountInformation.encryptedKey) &&
        Objects.equals(this.oaepHashingAlgorithm, updateEncryptedAccountInformation.oaepHashingAlgorithm) &&
        Objects.equals(this.iv, updateEncryptedAccountInformation.iv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedData, publicKeyFingerprint, encryptedKey, oaepHashingAlgorithm, iv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEncryptedAccountInformation {\n");
    sb.append("    encryptedData: ").append(toIndentedString(encryptedData)).append("\n");
    sb.append("    publicKeyFingerprint: ").append(toIndentedString(publicKeyFingerprint)).append("\n");
    sb.append("    encryptedKey: ").append(toIndentedString(encryptedKey)).append("\n");
    sb.append("    oaepHashingAlgorithm: ").append(toIndentedString(oaepHashingAlgorithm)).append("\n");
    sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
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
    openapiFields.add("EncryptedData");
    openapiFields.add("PublicKeyFingerprint");
    openapiFields.add("EncryptedKey");
    openapiFields.add("OaepHashingAlgorithm");
    openapiFields.add("Iv");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("EncryptedData");
    openapiRequiredFields.add("PublicKeyFingerprint");
    openapiRequiredFields.add("EncryptedKey");
    openapiRequiredFields.add("OaepHashingAlgorithm");
    openapiRequiredFields.add("Iv");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateEncryptedAccountInformation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateEncryptedAccountInformation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateEncryptedAccountInformation is not found in the empty JSON string", UpdateEncryptedAccountInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateEncryptedAccountInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateEncryptedAccountInformation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateEncryptedAccountInformation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `EncryptedData`
      UpdateAccountData.validateJsonElement(jsonObj.get("EncryptedData"));
      if (!jsonObj.get("PublicKeyFingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PublicKeyFingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PublicKeyFingerprint").toString()));
      }
      if (!jsonObj.get("EncryptedKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EncryptedKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EncryptedKey").toString()));
      }
      if (!jsonObj.get("OaepHashingAlgorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OaepHashingAlgorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OaepHashingAlgorithm").toString()));
      }
      if (!jsonObj.get("Iv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Iv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Iv").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateEncryptedAccountInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateEncryptedAccountInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateEncryptedAccountInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateEncryptedAccountInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateEncryptedAccountInformation>() {
           @Override
           public void write(JsonWriter out, UpdateEncryptedAccountInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateEncryptedAccountInformation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateEncryptedAccountInformation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateEncryptedAccountInformation
  * @throws IOException if the JSON string is invalid with respect to UpdateEncryptedAccountInformation
  */
  public static UpdateEncryptedAccountInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateEncryptedAccountInformation.class);
  }

 /**
  * Convert an instance of UpdateEncryptedAccountInformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

