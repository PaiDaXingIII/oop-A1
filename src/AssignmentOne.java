import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        //Part 3
        //Create three objects for General Practitioners
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Practitioner", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "General Practitioner", "Internal Medicine");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Brown", "General Practitioner", "Pediatrics");

        //Create two objects for other health professional types
        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Nurse Lisa", "Nurse", "Cardiology Department");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Physiotherapist Tom", "Physiotherapist", "Rehabilitation Department");

        //Print the details of the General Practitioners object
        gp1.printAllVariables();
        System.out.println("------------------------------");
        gp2.printAllVariables();
        System.out.println("------------------------------");
        gp3.printAllVariables();
        System.out.println("------------------------------");

        //Print details of other health professional types of objects
        ohp1.printAllVariables();
        System.out.println("------------------------------");
        ohp2.printAllVariables();
        System.out.println("------------------------------");

        //Part 5
        ArrayList<Appointment> appointmentList = new ArrayList<>();
        // Make 2 appointments with your GP
        createAppointment(appointmentList, "John Doe", "1234567890", "09:00", gp1);
        createAppointment(appointmentList, "Jane Smith", "0987654321", "10:30", gp2);
        // Make 2 more appointments with other types of health professionals
        createAppointment(appointmentList, "John Doe", "1234567890", "09:00", gp1);
        createAppointment(appointmentList, "Jane Smith", "0987654321", "10:30", gp2);
        // Print an existing appointment
        printExistingAppointments(appointmentList);
        // Cancel an existing reservation
        cancelBooking(appointmentList, "0987654321");
        // Print the existing appointment again to display the updated appointment collection
        printExistingAppointments(appointmentList);
    }
        // Create a method named createAppointment to create a new reservation and add it to the ArrayList
        public static void createAppointment(ArrayList<Appointment> appointmentList, String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
            Appointment newAppointment = new Appointment(patientName, patientPhone, preferredTimeSlot, selectedDoctor);
            appointmentList.add(newAppointment);
    }
        //Create a method, called printExistingAppointments to print all the existing appointments in the ArrayList
        public static void printExistingAppointments(ArrayList<Appointment> appointmentList) {
            if (appointmentList.isEmpty()) {
                System.out.println("No existing appointments.");
            } else {
                for (Appointment appointment : appointmentList) {
                    appointment.printAllVariables();
                    System.out.println("------------------------------");
                }
            }
        }
         //Create a method called cancelBooking to cancel the appointment using the patient's phone
    public static void cancelBooking(ArrayList<Appointment> appointmentList, String patientPhone) {
        boolean found = false;
        for (int i = 0; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).getPatientPhone().equals(patientPhone)) {
                appointmentList.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No reservation can be found for this phone.");
        }
    }
}
