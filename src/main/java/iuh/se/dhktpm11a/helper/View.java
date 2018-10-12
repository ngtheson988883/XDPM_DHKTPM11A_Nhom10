package iuh.se.dhktpm11a.helper;

import java.util.ResourceBundle;

public enum View {
    DANGNHAP{
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("");
        }

        @Override
        public String getFxmlFile() {
            return "/views/";
        }
    };
    public abstract String getTitle();
    public abstract String getFxmlFile();

    String getStringFromResourceBundle(String key){
        return ResourceBundle.getBundle("Bundle").getString(key);
    }
}
