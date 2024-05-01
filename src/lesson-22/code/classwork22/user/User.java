package classwork22.user;

public class User {

    // fields
    private String email;
    private String password;

    // constructor
    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    // getter
    public String getEmail() {
        return email;
    }
    //setter
    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " is wrong email.");
        }
    }

    /*
1) @ exists and only one
2) dot after @
3) after last dot minimum 2 symbols (.ru, .de, .com)
4) alphabetic, digits, _ , - , . , @
     */
    private boolean validateEmail(String email) {
        // negative options - return false
        int indexAt = email.indexOf('@');
        if (indexAt <=0 || indexAt != email.lastIndexOf('@')){
            return false;
        }
        if (email.indexOf('.', indexAt) == -1) { //точка после собачки и минус 1 это его отствуствие, то возвращать ложь
            return false;
        }
        if (email.indexOf('.') >= email.length() - 2) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) { // проверка на допустимые символы
            char c = email.charAt(i);
            if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')) { // это все взято в ! говоря что это "не"
                return false;
            }
        }
            //positive options - return true
        return true;
    }

    private boolean validatePassword (String password) {
        return password.length() >= 8;
    }
    private void setPassword(String password) {
        if (validatePassword(password)){
            this.password = password;
        } else {
            System.out.println(password + " is weak!");
        }
    }
}
