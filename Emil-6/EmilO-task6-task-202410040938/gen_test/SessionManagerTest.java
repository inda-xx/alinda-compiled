package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SessionManagerTest {

    @Test
    public void removeExpiredSessionsRemovesAllExpiredSessions() {
        List<SessionManager.UserSession> sessions = new ArrayList<>();
        sessions.add(new SessionManager.UserSession(System.currentTimeMillis() - 10000)); // Expired
        sessions.add(new SessionManager.UserSession(System.currentTimeMillis() + 10000)); // Active

        SessionManager.removeExpiredSessions(sessions);

        assertEquals(1, sessions.size());
        assertFalse(sessions.get(0).isExpired());
    }

    @Test
    public void removeExpiredSessionsKeepsActiveSessions() {
        List<SessionManager.UserSession> sessions = new ArrayList<>();
        sessions.add(new SessionManager.UserSession(System.currentTimeMillis() + 20000)); // Active
        sessions.add(new SessionManager.UserSession(System.currentTimeMillis() + 10000)); // Active

        SessionManager.removeExpiredSessions(sessions);

        assertEquals(2, sessions.size());
    }

    @Test
    public void removeExpiredSessionsRemovesNoneWhenAllActive() {
        List<SessionManager.UserSession> sessions = new ArrayList<>();
        sessions.add(new SessionManager.UserSession(System.currentTimeMillis() + 5000)); 
        sessions.add(new SessionManager.UserSession(System.currentTimeMillis() + 15000));

        SessionManager.removeExpiredSessions(sessions);

        assertEquals(2, sessions.size());
    }

    @Test(expected = NullPointerException.class)
    public void removeExpiredSessionsThrowsExceptionOnNullList() {
        SessionManager.removeExpiredSessions(null);
    }
}

import static org.junit.Assert.*;
import org.junit.Test;

