package personDetails;

public enum Gender {
    Male {
        public String toString() {
            return "Mr ";
        }
    },
    Female{
        public String toString() {
            return "Ms ";
        }
    }
}
