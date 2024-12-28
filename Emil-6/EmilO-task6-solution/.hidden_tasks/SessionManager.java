import java.util.List;
import java.util.ArrayList;

public class SessionManager {

    static class UserSession {
        long sessionExpiry;

        UserSession(long sessionExpiry) {
            this.sessionExpiry = sessionExpiry;
        }

        boolean isExpired() {
            return System.currentTimeMillis() > sessionExpiry;
        }
    }

    public static void removeExpiredSessions(List<UserSession> sessions) {
        Iterator<UserSession> iterator = sessions.iterator();
        while (iterator.hasNext()) {
            UserSession session = iterator.next();
            if (session.isExpired()) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<UserSession> sessions = new ArrayList<>();
        sessions.add(new UserSession(System.currentTimeMillis() - 10000)); // Expired session
        sessions.add(new UserSession(System.currentTimeMillis() + 10000)); // Active session

        removeExpiredSessions(sessions);

        System.out.println("Active sessions count: " + sessions.size());
    }
}