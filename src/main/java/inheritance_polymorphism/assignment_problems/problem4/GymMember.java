package inheritance_polymorphism.assignment_problems.problem4;

public class GymMember {
    protected String memberId;
    protected int monthlyFee;
    protected int sessionsAttended;

    public GymMember(String memberId, int monthlyFee) {
        this.memberId = memberId;
        this.monthlyFee = monthlyFee;
        this.sessionsAttended = 0;
    }

    public void attendSession() {
        sessionsAttended++;
    }

    public int getSessionsAttended() {
        return sessionsAttended;
    }

    public String displayInfo() {
        return "Standard | Sessions: " + sessionsAttended;
    }

    public static String batchPrint(GymMember[] members) {
        StringBuilder result = new StringBuilder();

        for (GymMember member : members) {
            result.append(member.displayInfo());

            if (member instanceof PremiumMember) {
                PremiumMember premium = (PremiumMember) member;

                result.append(
                        " [Trainer via downcast: "
                                + premium.getTrainerName()
                                + "]"
                );
            }

            result.append(" | ");
        }

        return result.toString();
    }
}