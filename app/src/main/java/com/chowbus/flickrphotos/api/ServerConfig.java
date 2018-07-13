package com.chowbus.flickrphotos.api;

public class ServerConfig {

    public static final int SERVER_RESPONSE_SUCCESS_CODE                = 200;
    public static final int SERVER_RESPONSE_ERROR_CODE                  = 400;
    public static final int SERVER_RESPONSE_ERROR_CODE_TOKEN            = 401;
    public static final int SERVER_RESPONSE_ERROR_CODE_FORBIDDEN        = 403;
    public static final int SERVER_RESPONSE_ERROR_CODE_NOT_FOUND        = 404;
    public static final int SERVER_RESPONSE_ERROR_CODE_INTERNAL_ERROR   = 500;

    public static final String AUTH_HEADER = "Authorization";

    public static final String MSG_NETWORK_ERROR = "Unable to reach to server, please try again";
    public static final String MSG_SERVER_ERROR = "Unknown response from server";
    public static final String MSG_LOGIN_FAILED = "Failed to login, Please try again";
    public static final String MSG_ADD_DEVICE_FAILED = "Adding device token failed";
    public static final String MSG_REGISTER_FAILED = "Failed to register, Please try again";
    public static final String MSG_VERIFY_FAILED = "Failed to verify, Please try again";
    public static final String MSG_CREATE_CHAT_FAILED = "Failed to create new chat";
    public static final String MSG_SEND_CHAT_MESSAGE_FAILED = "Failed to send the message";
    public static final String MSG_SEND_CHAT_IMAGE_FAILED = "Failed to send the image";
    public static final String MSG_CANCEL_PAYMENT_FAILED = "Failed to cancel payment";
    public static final String MSG_CREATE_BANK_CREDENTION_FAILED = "Failed to create bank account";
    public static final String MSG_CREATE_PAYMENT_FAILED = "Failed to create payment";

    public static final String RESPONSE_STATUS_SUCCESS = "SUCCESS";

    public static final String SERVER_ADDRESS_PROD = "https://api.flickr.com/services/";
    public static final String SERVER_ADDRESS_DEV = "";
    public static final String END_POINT = "/v1/";

    public static final String METHOD_INTERESTINGNES = "flickr.interestingness.getList";
    public static final String API_KEY = "9846af40be5167ade5edad8d76675ded";
    public static final String SECRET_KEY = "ab14ba6c4788a4a3";
    public static final String FORMAT_JSON = "json";
    public static final String EXTRAS = "description, license, date_upload, date_taken, owner_name, icon_server, original_format, last_update, views, url_z";

    public static final int COUNT_FOR_PAGENATION = 10;
}
