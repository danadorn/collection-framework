import java.util.HashMap; // import the HashMap class
public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<>();
    // add some key-value pairs
    capitalCities.put("Cambodia", "Phnom Penh");
    capitalCities.put("Japan", "Tokyo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities.remove("Cambodia")); // Output: Phnom Penh
    System.out.println(capitalCities.remove("Japan"));

}