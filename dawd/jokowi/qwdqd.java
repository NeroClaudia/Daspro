package jokowi;

public class qwdqd {
    public static void main(String[] args) throws InterruptedException {
        String[][] lyrics = {
            {"And", "there", "was", "something", "about", "you", "that", "now", "i", "can't", "remember"},
            {"It's", "the", "same", "damn", "thing", "that", "made", "my", "heart", "surrender"},
            {"And", "I'll", "miss", "you", "on", "a", "train"},
            {"I", "never", "know", "what", "to", "think", "about"}
        };

        // waktu muncul tiap kata (dalam milidetik)
        int[][] wordTimes = {
            {0, 400, 800, 1200, 1700, 2500, 2900, 3500, 4100, 4500, 4900},
            {0, 300, 900, 1500, 2100, 2700, 3000, 3600, 3900, 4300},
            {0, 350, 700, 1050, 1400, 1750, 2100},
            {0, 250, 600, 950, 1300, 1650, 2000}
        };

        long start = System.currentTimeMillis();

        for (int i = 0; i < lyrics.length; i++) {
            for (int j = 0; j < lyrics[i].length; j++) {
                long targetTime = start + wordTimes[i][j];
                long now = System.currentTimeMillis();
                if (targetTime > now) {
                    Thread.sleep(targetTime - now);
                }
                System.out.print(lyrics[i][j] + " ");
            }
            System.out.println();
            Thread.sleep(500); // jeda antar baris
            start = System.currentTimeMillis(); // reset waktu untuk baris berikut
        }
    }
}
