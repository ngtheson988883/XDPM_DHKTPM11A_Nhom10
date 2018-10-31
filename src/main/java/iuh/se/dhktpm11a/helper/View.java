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
    },
    SAMPLE{
        @Override
        public String getTitle() {
            return "/views/Sample.fxml";
        }

        @Override
        public String getFxmlFile() {
            return "/views/Sample.fxml";
        }
    };
    public abstract String getTitle();
    public abstract String getFxmlFile();

    String getStringFromResourceBundle(String key){
        return ResourceBundle.getBundle("Bundle").getString(key);
    }
}
