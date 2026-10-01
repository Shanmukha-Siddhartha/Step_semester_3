package fitzone_membership;

public class Member {

    private String name;
    private Membership membership;

    public Member(String name) {
        this.name = name;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public Membership getMembership() {
        return membership;
    }
}