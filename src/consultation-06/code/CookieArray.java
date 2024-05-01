public class CookieArray {
    public static void main(String[] args) {
        Cookie cookie1 = new Cookie();
        Cookie cookie2 = new Cookie();
        Cookie cookie3 = new Cookie();
        Cookie cookie4 = new Cookie();

        Cookie[] cookies = new Cookie [4]; // создание пустой коробки для печенья
        cookies [0] = cookie1;
        cookies [1] = cookie2;
        cookies [3] = cookie4;

        for (int i = 0; i < cookies.length; i = i +1) {
            System.out.println(cookies[i]);

        }
    }
}

class Cookie{}