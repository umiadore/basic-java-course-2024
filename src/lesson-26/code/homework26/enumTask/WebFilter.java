package homework26.enumTask;

public class WebFilter implements  Filter{
    private static final String ACCESS_FOR_USER = "http://web-for-user";
    @Override
    public boolean checkAccess(String site, Type type) {
        if (type == Type.ADMIN) {
            return true;
        } if (type == Type.USER && site.startsWith(ACCESS_FOR_USER))  {
            return true;
        }
        return false;
    }
}
