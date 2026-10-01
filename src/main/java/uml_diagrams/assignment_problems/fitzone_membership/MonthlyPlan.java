package fitzone_membership;

public class MonthlyPlan implements MembershipPlan {

    @Override
    public double calculateFee() {
        return 1000;
    }

    @Override
    public String getName() {
        return "Monthly";
    }
}