package fuku;

public class Initials {
    public String getInitials(String name) {
        String[] ns = name.split(" ");
        String ans = "";
        for (int i = 0; i < ns.length; i++) {
            ans += ns[i].charAt(0);
        }
        return ans;
    }
}
