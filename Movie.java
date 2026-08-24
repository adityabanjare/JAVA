class Movie {

    String name;
    String hero;
    double rating;

    // Parameterized Constructor
    Movie(String name, String hero, double rating) {
        this.name = name;
        this.hero = hero;
        this.rating = rating;
    }

    void display() {
        System.out.println("Movie: " + name);
        System.out.println("Hero: " + hero);
        System.out.println("Rating: " + rating);
        System.out.println();
    }

    public static void main(String[] args) {

        Movie m1 = new Movie("RRR", "Ram Charan", 9.0);
        Movie m2 = new Movie("KGF", "Yash", 8.5);

        m1.display();
        m2.display();
    }
}
