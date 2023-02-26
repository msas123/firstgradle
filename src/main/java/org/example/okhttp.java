package org.example;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.http.HttpMethod;

public class okhttp {
    OkHttpClient client;
    public okhttp(){client = new OkHttpClient();}
    public String getExampleDotCom(){
        var request = new Request.Builder()
                .url("http://example.com")
                .build();
       try(var response= client.newCall(request).execute()){
                return response.body().string();
           } catch (Exception e) {
                return e.getMessage();
            }
        }
    }

