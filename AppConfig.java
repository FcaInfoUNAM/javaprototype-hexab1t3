public class AppConfig {
    private static final AppConfig instance = new AppConfig();
    
    private String theme;
    private String language;

    private AppConfig() {
        this.theme = "Light";
        this.language = "English";
    }

    public static AppConfig getInstance() {
        return instance;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return String.format("AppConfig [theme=%s, language=%s]", theme, language);
    }
}
