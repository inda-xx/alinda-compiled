import java.util.*;

// Class representing a session manager
public class SessionManager {

    // Nested static class representing a user session
    static class UserSession {
        long sessionExpiry;

        // Constructor for UserSession
        UserSession(long sessionExpiry) {
            this.sessionExpiry = sessionExpiry;
        }

        // Method to check if the session is expired
        boolean isExpired() {
            return System.currentTimeMillis() > sessionExpiry;
        }
    }

    // Method to remove expired sessions from a list
    public static void removeExpiredSessions(List<UserSession> sessions) {
        Iterator<UserSession> iterator = sessions.iterator();
        while (iterator.hasNext()) {
            UserSession session = iterator.next();
            if (session.isExpired()) {
                iterator.remove();
            }
        }
    }

    // Main method to demonstrate session management
    public static void main(String[] args) {
        List<UserSession> sessions = new ArrayList<>();
        sessions.add(new UserSession(System.currentTimeMillis() - 10000)); // Expired session
        sessions.add(new UserSession(System.currentTimeMillis() + 1000));  // Active session
        sessions.add(new UserSession(System.currentTimeMillis() - 4000));  // Expired session
        sessions.add(new UserSession(System.currentTimeMillis() + 50000)); // Active session

        removeExpiredSessions(sessions);

        System.out.println("Active sessions count: " + sessions.size());
    }
}