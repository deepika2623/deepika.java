package control_structures;
 class Switchcase {
    public static void main(String[] args) {
        byte StudentGradLevel = 8;
        int tutionFee = 40000;
        byte discount = 2;
        boolean isAcademicTopper = true;

        switch (StudentGradLevel){
            case 9,10,11,12 -> {
                if (isAcademicTopper) {
                    discount = 20;
                } else {
                    discount = 10;
                }
            }
            
            case 6,7,8 -> discount = 5;
            default -> discount = 0;
        }
        switch (StudentGradLevel){
            case 10 -> discount += 3;
            case 12 -> discount += 5;
            default -> discount += 0;
        }


        int discountedFee = tutionFee - (tutionFee * discount/100);

        System.out.println("Student's Grade Level:" + StudentGradLevel);
        System.out.println("Base Tution Fee: "+ tutionFee);
        System.out.println("Total Discount Percentage: " + discount + "%");
        System.out.println("Tution fee after discount : "+ discountedFee);

    }
}