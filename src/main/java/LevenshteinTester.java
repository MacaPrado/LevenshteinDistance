public class LevenshteinTester {
    public static void main(String[] args) {

        try{
            int distance1 = LevenshteinDistance.distance("e", "ex-amigo");
            System.out.println(distance1);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        int distance2 = LevenshteinDistance.distance("big data", "bigdata");

        System.out.println(distance2);

    }

}
