package com.base.portfolio.domain.model.manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/base/portfolio/domain/model/manager/ResponseCodes;", "", "()V", "Companion", "app_developmentDebug"})
public final class ResponseCodes {
    
    /**
     * The Constant Success.
     */
    public static final int SUCCESS = 200;
    
    /**
     * The Constant Success.
     */
    public static final int ACCEPTED = 201;
    
    /**
     * The Constant AccessToken expired.
     */
    public static final int ACCESS_TOKEN_EXPIRED = 401;
    
    /**
     * The Constant RefreshToken expired.
     */
    public static final int REFRESH_TOKEN_EXPIRED = 400;
    
    /**
     * The Constant InvalidUseridPassword
     */
    public static final int BAD_REQUEST = 400;
    public static final int REQUEST_CANCEL = -1;
    public static final int RESPONSE_JSON_NOT_VALID = 1;
    public static final int MODEL_TYPE_CAST_EXCEPTION = 2;
    public static final int INTERNET_NOT_AVAILABLE = 3;
    public static final int WRONG_URL = 4;
    public static final int WRONG_METHOD_NAME = 5;
    public static final int URL_CONNECTION_ERROR = 6;
    public static final int UNKNOWN_ERROR = 10;
    private static final int NOT_ALLOWED = 403;
    @org.jetbrains.annotations.NotNull
    public static final com.base.portfolio.domain.model.manager.ResponseCodes.Companion Companion = null;
    
    public ResponseCodes() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/base/portfolio/domain/model/manager/ResponseCodes$Companion;", "", "()V", "ACCEPTED", "", "ACCESS_TOKEN_EXPIRED", "BAD_REQUEST", "INTERNET_NOT_AVAILABLE", "MODEL_TYPE_CAST_EXCEPTION", "NOT_ALLOWED", "REFRESH_TOKEN_EXPIRED", "REQUEST_CANCEL", "RESPONSE_JSON_NOT_VALID", "SUCCESS", "UNKNOWN_ERROR", "URL_CONNECTION_ERROR", "WRONG_METHOD_NAME", "WRONG_URL", "logErrorMessage", "", "code", "app_developmentDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String logErrorMessage(int code) {
            return null;
        }
    }
}