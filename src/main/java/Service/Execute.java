package Service;


import Util.InfosRequette;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.*;

import java.io.IOException;

public class Execute {
    public static String start(String JsonRequest, String url, String method) throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse(InfosRequette.MediaType);
        RequestBody body = RequestBody.create(mediaType, JsonRequest);
        Request request = new Request.Builder()
                .url(url)
                .method(method, body)
                .build();

        Response response = client.newCall(request).execute();

        String data = response.body().string();

        System.out.println((data != null) ? data : "No result");

        return data;
    }
}
