public class Main {
    public static void main(String[] args) {
        Boy boy=new Boy("Aktan","Asanov",2005,"male");
        Girl girl=new Girl("Akylai","Usonova",2006,"female");


        if(2023-boy.getYearOfBirth()>2023-girl.getYearOfBirth()){
            System.out.println(boy);
        } else if (boy.getYearOfBirth()== girl.getYearOfBirth()) {
            System.out.println("The same ages");



        }
        else {
            System.out.println(girl);
        }
}}