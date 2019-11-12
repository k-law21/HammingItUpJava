package zipcode;


public class Hamming {
    private String sequence1;
    private String sequence2;

    public Hamming(String s, String s1) throws IllegalArgumentException {
        this.sequence1 = s;
        this.sequence2 = s1;
        if (this.sequence1.length() != this.sequence2.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        int sum = 0;
        for (int i = 0; i < this.sequence1.length(); i++) {
            if (this.sequence1.charAt(i) != this.sequence2.charAt(i)) {
                sum++;
            }
        }
        return sum;
    }
}
}
