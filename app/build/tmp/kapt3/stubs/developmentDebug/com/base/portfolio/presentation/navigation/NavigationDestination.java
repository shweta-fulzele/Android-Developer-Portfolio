package com.base.portfolio.presentation.navigation;

import com.base.portfolio.utils.apputils.constant.navconstants.NavRoutes;

/**
 * Interface to describe the navigation destinations for the app
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0012\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\"\u00020\u0001\u00a2\u0006\u0002\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u0082\u0001\u0012\"#$%&\'()*+,-./0123\u00a8\u00064"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "", "route", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getRoute", "setRoute", "withArgs", "args", "", "([Ljava/lang/Object;)Ljava/lang/String;", "AboutMeEditScreen", "AboutMeScreen", "AboutMeViewScreen", "AchievementScreen", "CategoryScreen", "CertificationScreen", "ContactMe", "EducationScreen", "ExperienceScreen", "FAQ", "HomeScreen", "MainScreen", "PreviewScreen", "ProfileScreen", "ProjectsScreen", "RecipeScreen", "SplashScreen", "TechnicalSkills", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$AboutMeEditScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$AboutMeScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$AboutMeViewScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$AchievementScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$CategoryScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$CertificationScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$ContactMe;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$EducationScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$ExperienceScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$FAQ;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$HomeScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$MainScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$PreviewScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$ProfileScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$ProjectsScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$RecipeScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$SplashScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination$TechnicalSkills;", "app_developmentDebug"})
public abstract class NavigationDestination {
    @org.jetbrains.annotations.NotNull
    private java.lang.String route;
    @org.jetbrains.annotations.NotNull
    private java.lang.String id;
    
    private NavigationDestination(java.lang.String route, java.lang.String id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    public final void setRoute(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String withArgs(@org.jetbrains.annotations.NotNull
    java.lang.Object... args) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$AboutMeEditScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class AboutMeEditScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.AboutMeEditScreen INSTANCE = null;
        
        private AboutMeEditScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$AboutMeScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class AboutMeScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.AboutMeScreen INSTANCE = null;
        
        private AboutMeScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$AboutMeViewScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class AboutMeViewScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.AboutMeViewScreen INSTANCE = null;
        
        private AboutMeViewScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$AchievementScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class AchievementScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.AchievementScreen INSTANCE = null;
        
        private AchievementScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$CategoryScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class CategoryScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.CategoryScreen INSTANCE = null;
        
        private CategoryScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$CertificationScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class CertificationScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.CertificationScreen INSTANCE = null;
        
        private CertificationScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$ContactMe;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class ContactMe extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.ContactMe INSTANCE = null;
        
        private ContactMe() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$EducationScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class EducationScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.EducationScreen INSTANCE = null;
        
        private EducationScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$ExperienceScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class ExperienceScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.ExperienceScreen INSTANCE = null;
        
        private ExperienceScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$FAQ;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class FAQ extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.FAQ INSTANCE = null;
        
        private FAQ() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$HomeScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class HomeScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.HomeScreen INSTANCE = null;
        
        private HomeScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$MainScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class MainScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.MainScreen INSTANCE = null;
        
        private MainScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$PreviewScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class PreviewScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.PreviewScreen INSTANCE = null;
        
        private PreviewScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$ProfileScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class ProfileScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.ProfileScreen INSTANCE = null;
        
        private ProfileScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$ProjectsScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class ProjectsScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.ProjectsScreen INSTANCE = null;
        
        private ProjectsScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$RecipeScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class RecipeScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.RecipeScreen INSTANCE = null;
        
        private RecipeScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$SplashScreen;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class SplashScreen extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.SplashScreen INSTANCE = null;
        
        private SplashScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/base/portfolio/presentation/navigation/NavigationDestination$TechnicalSkills;", "Lcom/base/portfolio/presentation/navigation/NavigationDestination;", "()V", "app_developmentDebug"})
    public static final class TechnicalSkills extends com.base.portfolio.presentation.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull
        public static final com.base.portfolio.presentation.navigation.NavigationDestination.TechnicalSkills INSTANCE = null;
        
        private TechnicalSkills() {
        }
    }
}