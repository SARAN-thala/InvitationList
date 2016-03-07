
public enum Gender {
    Male {
        @Override
        public String title() {
            return "Mr ";
        }
    },
    Female {
        @Override
        public String title() {
            return "Ms ";
        }
    };

    public String title() {
        return "";
    }
}
