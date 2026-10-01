package fitzone_membership;

public class QuarterlyPlan implements MembershipPlan {

    @Override
    public double calculateFee() {
        return 1000 * 3 * 0.90;
    }

    @Override
    public String getName() {
        return "Quarterly";
    }
}