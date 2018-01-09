package com.nongfenqi.controller.client;

import com.nongfenqi.controller.BaseResponse;
import com.nongfenqi.controller.model.PadLoginModel;
import com.nongfenqi.controller.model.PadLoginResultModel;
import com.nongfenqi.controller.model.TokenModel;
import com.nongfenqi.controller.model.system.FileModel;
import com.nongfenqi.controller.model.system.NewAppModel;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import rx.Observable;

/**
 * @author jiezhi
 * @version 1.0, 13/03/2017
 * @since [Sherlock/V1.0.0]
 */
public interface SystemClient {
    @POST("/boss/login/pad")
    Observable<BaseResponse<PadLoginResultModel>> loginPad(@Body PadLoginModel loginRequest);

    @PATCH("/boss/token/_refresh")
    Observable<BaseResponse<PadLoginResultModel>> refreshToken();

    @POST("/boss/login_sms/_send")
    Observable<BaseResponse<String>> postLoginSms(@Body PadLoginModel padLoginModel);

    @GET("/group/{groupId}")
    Observable<BaseResponse<List<FileModel>>> getFileList(@Path("groupId") String groupId);

    @DELETE("apply/file/{fileId}")
    Observable<BaseResponse<Object>> deleteFile(@Path("fileId") String fileId);

    // using a dynamic URL download file
    @GET
    Observable<ResponseBody> downloadFile(@Url String fileUrl);

    @Multipart
    @POST
    Observable<BaseResponse<String>> uploadFile(@Url String fileUrl, @Part MultipartBody.Part file);

    @Multipart
    @POST
    Call<BaseResponse<String>> uploadFileByCall(@Url String fileUrl, @Part MultipartBody.Part file);

    // app版本信息查询
    @GET("app/new")
    Observable<BaseResponse<NewAppModel>> getNewApp(@Query("appName") String appName);

}
