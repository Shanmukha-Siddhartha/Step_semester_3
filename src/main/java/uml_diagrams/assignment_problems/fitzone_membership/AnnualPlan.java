package fitzone_membership;

public class AnnualPlan implements MembershipPlan {

    @Override
    public double calculateFee() {
        return 1000 * 12 * 0.75;
    }

    @Override
    public String getName() {
        return "Annual";
    }
}