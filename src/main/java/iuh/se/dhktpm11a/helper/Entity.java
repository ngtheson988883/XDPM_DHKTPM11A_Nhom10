package iuh.se.dhktpm11a.helper;

public enum Entity {
    Disk{
        @Override
        public String getPrefixId() {
            return "DN-";
        }
    },
    Customer{
        @Override
        public String getPrefixId() {
            return "CN-";
        }
    },
    Title {
        @Override
        public String getPrefixId() {
            return "TN-";
        }
    };
    public abstract String getPrefixId();
}
