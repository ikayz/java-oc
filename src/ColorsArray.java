public class ColorsArray {
    public static void main(String[] args) {
        String[] colors;

        colors = new String[]{"Red", "Green", "Teal", "Rose Gold"};

        colors[1] = "Lavender";

        for(String color:colors) {
            System.out.println(color);
        }
    }
}
