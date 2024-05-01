package homework.code.model;

public class Code {
    private long code;

    public Code(long code) {
        this.code = code;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    // creating methods:
    public int lengthCode() {
        return String.valueOf(code).length();
    }
    public int controlSum() {
        int sum = 0;
        String codeString = String.valueOf(code);
        for (int i = 0; i < codeString.length(); i++) {
            sum += Character.getNumericValue(codeString.charAt(i));
        }
        return sum;
    }
    public boolean isValid() {
        int codeLength = lengthCode();
        return codeLength == 8 || codeLength == 13;
    }
}
