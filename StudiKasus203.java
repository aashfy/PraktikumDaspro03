import java.util.Scanner;

public class StudiKasus203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String status, reason;

        System.out.print("Student name: ");
        String name = sc.nextLine();
        System.out.print("Type of activity (BELMAWA/BAKORMA/Mandiri/PKM/Other): ");
        String activity = sc.nextLine().trim();

        if (activity.equalsIgnoreCase("BELMAWA") || activity.equalsIgnoreCase("BAKORMA")
                || activity.equalsIgnoreCase("Mandiri")) {

            System.out.print("Winner rank (1/2/3, 0 if not a winner): ");
            int rank = sc.nextInt();

            if (rank >= 1 && rank <= 3) {
                System.out.print("Number of documents uploaded (0-4): ");
                int docs = sc.nextInt();

                if (docs == 4) {
                    status = "RECEIVES award funds";
                    reason = "Winner (rank " + rank + ") and all 4 documents are complete";
                } else {
                    status = "DOES NOT receive award funds";
                    reason = "Documents incomplete, " + (4 - docs) + " document(s) still missing";
                }
            } else {
                status = "DOES NOT receive award funds";
                reason = "Not a 1st, 2nd, or 3rd place winner";
            }

        } else if (activity.equalsIgnoreCase("PKM")) {

            System.out.print("PKM funding status (1 = funded, 0 = not funded): ");
            int funded = sc.nextInt();

            if (funded == 1) {
                System.out.print("Number of documents uploaded (0-4): ");
                int docs = sc.nextInt();

                if (docs == 4) {
                    status = "RECEIVES award funds";
                    reason = "PKM funded and all 4 documents are complete";
                } else {
                    status = "DOES NOT receive award funds";
                    reason = "Documents incomplete, " + (4 - docs) + " document(s) still missing";
                }
            } else {
                status = "DOES NOT receive award funds";
                reason = "PKM team is not selected for funding";
            }

        } else {
            status = "DOES NOT receive award funds";
            reason = "Activity type is Others";
        }

        System.out.println("\nStudent name : " + name);
        System.out.println("Status       : " + status);
        System.out.println("Reason       : " + reason);
    }
}