public class cardetails {
    public static void main(String[] args) {
        String VehicleName = "Hyundai Creta SX (Petrol)";
        String EngineType = "1.5L MPi Petrol Engine";
        String Displacement = "1497 cc";
        String MaxPower = "113.45bhp@6300rpm";
        String MaxTorque = "143.8Nm@4500rpm";
        byte noofcylinders = 4;
        byte valuepercylinders = 4;
        String Fuelsupplysystem ="Multi Point Injection";
        boolean TurboCharger = false;
        String Transmissiontype = "Manual";
        String Geartype ="6-speed";
        String Drivetype ="FWD";

        System.out.println("Vehicle Name:"+ VehicleName);
        System.out.println("Engine Type:"+ EngineType);
        System.out.println("Displacement:"+ Displacement);
        System.out.println("Max power:"+ MaxPower);
        System.out.println("Max Torque:"+ MaxTorque);
        System.out.println("No Of Cylinders:"+ noofcylinders);
        System.out.println("Value Per Cylinders:"+ valuepercylinders);
        System.out.println("Fuel Supply System:"+ Fuelsupplysystem);
        System.out.println("Turbo Charger:"+ TurboCharger);
        System.out.println("Trasmission Type:"+ Transmissiontype);
        System.out.println("Gear Type:"+ Geartype);
        System.out.println("Drive Type:"+ Drivetype);
    }
    
}
