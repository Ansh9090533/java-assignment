class ScoreBox {
    private int score;

    ScoreBox(int score) {
        setScore(score);
    }

    void setScore(int score) {
        if (score < 0)
            throw new IllegalArgumentException("Score cannot be negative");

        this.score = score;
    }

    int getScore() {
        return score;
    }

    public String toString() {
        return "ScoreBox[score=" + score + "]";
    }
}

public class ObjectReferenceLab {

    static void addBonus(ScoreBox box, int bonus) {
        box.setScore(box.getScore() + bonus);
    }

    static void reassignLocally(ScoreBox box) {
        box = new ScoreBox(999);
        System.out.println("Inside method: " + box);
    }

    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }

    public static void main(String[] args) {

        ScoreBox box1 = new ScoreBox(50);

        ScoreBox box2 = box1;

        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);
        System.out.println("Same object: " + (box1 == box2));

        addBonus(box2, 10);

        System.out.println("After bonus through box2:");
        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);

        ScoreBox box3 = new ScoreBox(100);

        System.out.println("box3: " + box3);
        System.out.println("box1 == box3: " + (box1 == box3));

        reassignLocally(box1);

        System.out.println("After reassignLocally:");
        System.out.println("box1: " + box1);

        ScoreBox box4 = createScoreBox(200);

        System.out.println("box4: " + box4);
    }
}
