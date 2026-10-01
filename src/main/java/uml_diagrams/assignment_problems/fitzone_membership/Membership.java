package fitzone_membership;

public class Membership {

    private Member member;
    private MembershipPlan plan;
    private String status;

    public Membership(Member member, MembershipPlan plan) {
        this.member = member;
        this.plan = plan;
        this.status = "Active";
    }

    public double getFee() {
        return plan.calculateFee();
    }

    public void checkIn() {

        if (status.equals("Active")) {
            System.out.println(
                    member.getName() + " checked in."
            );
        } else {
            System.out.println(
                    member.getName()
                            + " check-in denied."
            );
        }
    }

    public void freeze() {

        if (status.equals("Active")) {
            status = "Frozen";
            System.out.println(
                    member.getName() + " membership frozen."
            );
        } else {
            System.out.println(
                    member.getName()
                            + " cannot freeze membership."
            );
        }
    }

    public void unfreeze() {

        if (status.equals("Frozen")) {
            status = "Active";
            System.out.println(
                    member.getName()
                            + " membership unfrozen."
            );
        } else {
            System.out.println(
                    member.getName()
                            + " cannot unfreeze membership."
            );
        }
    }

    public void expire() {
        status = "Expired";
    }

    public String getStatus() {
        return status;
    }
}