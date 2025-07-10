package exception;

class ExceptProgram extends RuntimeException {
    public ExceptProgram(String message) {
        super(message);
    }
    
    public String languageException() {
        return "Language exception occurred.";
    }

    public String genderException() {
        return "Gender exception occurred.";
    }
}

   
