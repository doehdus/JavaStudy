public class FindStringWithFor {
    public static void main(String[] args){
        String[] cities = {"New York", "Beijing", "Seoul"};
        int index = 0;

        for (int i = 0; i < cities.length; i++){
            if(cities[i].equals("Seoul")){
                System.out.printf("%d %s\n", i, cities[i]);
            }
        }
    }
}
