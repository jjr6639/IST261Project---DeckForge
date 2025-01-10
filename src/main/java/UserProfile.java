/**
 * Jordan Runyon - jjr6639
 */


public class UserProfile {
    private String displayName;
    private String bio;

    public UserProfile(String displayName, String bio) {
        this.displayName = displayName;
        this.bio = bio;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "UserProfile [displayName=" + displayName + ", bio=" + bio + "]";
    }
}
