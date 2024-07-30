package com.example;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import com.example.mastercard.ApiClient;
import com.example.mastercard.ApiException;
import com.example.mastercard.api.SearchApi;
import com.example.mastercard.api.TokenActivateApi;
import com.example.mastercard.model.AccountData;
import com.example.mastercard.model.AccountDataCurrentAccount;
import com.example.mastercard.model.AuditInfo;
import com.example.mastercard.model.EncryptedAccountInformation;
import com.example.mastercard.model.Search;
import com.example.mastercard.model.SearchData;
import com.example.mastercard.model.SearchResults;
import com.example.mastercard.model.TokenActivate;
import com.example.mastercard.model.TokenActivateData;
import com.example.mastercard.model.TokenActivateResults;
import com.mastercard.developer.encryption.EncryptionException;
import com.mastercard.developer.encryption.FieldLevelEncryptionConfig;
import com.mastercard.developer.encryption.FieldLevelEncryptionConfig.FieldValueEncoding;
import com.mastercard.developer.encryption.FieldLevelEncryptionConfigBuilder;
import com.mastercard.developer.interceptors.OkHttpEncryptionInterceptor;
import com.mastercard.developer.interceptors.OkHttpOAuth1Interceptor;
import com.mastercard.developer.utils.AuthenticationUtils;
import com.mastercard.developer.utils.EncryptionUtils;

import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnrecoverableKeyException, KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException, EncryptionException, ApiException
    {
        System.out.println( "Iniciando..." );

        FieldLevelEncryptionConfig encryptionConfig = FieldLevelEncryptionConfigBuilder.aFieldLevelEncryptionConfig()
        .withEncryptionPath("$.TokenActivateRequest.EncryptedAccountInformation.EncryptedData", "$.TokenActivateRequest.EncryptedAccountInformation")
        .withEncryptionCertificate(EncryptionUtils.loadEncryptionCertificate("src/main/java/com/example/Public-Key-Encrypt.crt"))
        .withOaepPaddingDigestAlgorithm("SHA-512")
        .withEncryptedValueFieldName("EncryptedData")
        .withEncryptedKeyFieldName("EncryptedKey")
        .withIvFieldName("Iv")
        .withOaepPaddingDigestAlgorithmFieldName("OaepHashingAlgorithm")
        .withEncryptionCertificateFingerprintFieldName("PublicKeyFingerprint")
        .withFieldValueEncoding(FieldValueEncoding.HEX)
        .build();

        ApiClient client = new ApiClient();
        Builder httpClientBuilder = client.getHttpClient().newBuilder();

        httpClientBuilder.addInterceptor(OkHttpEncryptionInterceptor.from(encryptionConfig));

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(Level.BODY); // Define o nível de logging
        httpClientBuilder.addInterceptor(loggingInterceptor);

               // Interceptor personalizado para formatar a saída da requisição
               httpClientBuilder.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request();
                    long t1 = System.nanoTime();
                    System.out.println(String.format("MANDANDO A REQUEST %s on %s%n%s",
                            request.url(), chain.connection(), request.headers()));
    
                    Response response = chain.proceed(request);
    
                    long t2 = System.nanoTime();
                    System.out.println(String.format("RESPOSTA RECEBIDA EM %s in %.1fms%n%s",
                            response.request().url(), (t2 - t1) / 1e6d, response.headers()));
    
                    return response;
                }
            });

        // Configure the Mastercard service URL
        client.setBasePath("https://sandbox.api.mastercard.com/mdes/csapi");
        // Load the signing key
        PrivateKey signingKey = AuthenticationUtils.loadSigningKey("src/main/java/com/example/customer-service-desenv-sandbox.p12", "keyalias", "keystorepassword");
        // Add the interceptor code responsible for signing HTTP requests
        httpClientBuilder.addInterceptor(new OkHttpOAuth1Interceptor("pWaQlGrSuIcwF59QQ_c3-vZGKsukPZILbJFHS30122531de3!e3b290dad44e4e3eac4609c546fe3c5d0000000000000000", signingKey));
        // Add the interceptor code responsible for encrypting requests and decrypting responses
        client.setHttpClient(httpClientBuilder.build());

 



        TokenActivateApi api2 = new TokenActivateApi(client);

        TokenActivate request2 = new TokenActivate();

        AuditInfo auditInfo = new AuditInfo();
        auditInfo.setUserId("A1435477A1435477");
        auditInfo.setUserName("John Smith");
        auditInfo.setOrganization("Any Bank");
        auditInfo.setPhone("555 1234");


        TokenActivateData tokenActivateData  = new TokenActivateData();
        /* usando TUR (Token Unique Reference) */
        // tokenActivateData.setTokenUniqueReference("DWSPMC00000000010906a349d9ca4eb1a4d53e3c90a11d9cv");
        tokenActivateData.setCommentText("Confirmed cardholder identity");
        tokenActivateData.setReasonCode("C");
        tokenActivateData.setAuditInfo(auditInfo);


        /* usando PAN  */
        tokenActivateData.setPaymentAppInstanceId("645b532a245e4723d7a9c4f62b24f24a24ba98e27d43e34e");
        EncryptedAccountInformation encryptedAccountInformation = new EncryptedAccountInformation();
        
        AccountData encryptedData = new AccountData();

        AccountDataCurrentAccount accountDataCurrentAccount = new AccountDataCurrentAccount();
        
        accountDataCurrentAccount.setAccountPan("5412345678901234");

        encryptedData.setCurrentAccount(accountDataCurrentAccount);

        encryptedAccountInformation.setEncryptedData(encryptedData);

        encryptedAccountInformation.setPublicKeyFingerprint("4c4ead5927f0df8117f178eea9308daa58e27c2b");
        encryptedAccountInformation.setEncryptedKey("A1B2C3D4E5F6112233445566");
        encryptedAccountInformation.setOaepHashingAlgorithm("SHA512");
        encryptedAccountInformation.setIv("1b9396c98ab2bfd195de661d70905a45");

        tokenActivateData.setEncryptedAccountInformation(encryptedAccountInformation);

        request2.setTokenActivateRequest(tokenActivateData);

        System.out.println("ENVIANDO REQUISICAO");

        try {
            // Chamada da função tokenActivationCall de forma síncrona
            TokenActivateResults response2 = api2.tokenActivation("v2", request2);

            // Exibindo a resposta
            System.out.println("Resposta: " + response2.toString());
        } catch (ApiException e) {
            System.err.println("Erro na chamada da API: " + e.getResponseBody());
        }
    }
}
