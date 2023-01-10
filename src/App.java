public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 5; i++) {
            String response = "";
            for(int j = 1 ; j <= i ; j++){
                response +=  i;
            }
            System.out.println(response);
        }
    }
}
