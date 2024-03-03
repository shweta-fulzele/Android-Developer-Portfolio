package com.base.portfolio.utils.apputils;

import android.util.Log;
import com.base.portfolio.BuildConfig;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/base/portfolio/utils/apputils/Logger;", "", "()V", "Companion", "app_developmentDebug"})
public final class Logger {
    private static final boolean LOG_DISABLED = false;
    @org.jetbrains.annotations.NotNull
    public static final com.base.portfolio.utils.apputils.Logger.Companion Companion = null;
    
    public Logger() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/base/portfolio/utils/apputils/Logger$Companion;", "", "()V", "LOG_DISABLED", "", "debug", "", "tag", "", "message", "error", "info", "isLoggingEnabled", "warn", "app_developmentDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void info(@org.jetbrains.annotations.NotNull
        java.lang.String tag, @org.jetbrains.annotations.NotNull
        java.lang.String message) {
        }
        
        public final void warn(@org.jetbrains.annotations.NotNull
        java.lang.String tag, @org.jetbrains.annotations.NotNull
        java.lang.String message) {
        }
        
        public final void debug(@org.jetbrains.annotations.NotNull
        java.lang.String tag, @org.jetbrains.annotations.NotNull
        java.lang.String message) {
        }
        
        public final void error(@org.jetbrains.annotations.NotNull
        java.lang.String tag, @org.jetbrains.annotations.NotNull
        java.lang.String message) {
        }
        
        public final boolean isLoggingEnabled() {
            return false;
        }
    }
}