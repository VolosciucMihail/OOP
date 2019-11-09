import java.util.*;

public class Text {
    public static String text = " Announcing of invitation principles in. Cold in late or deal. Terminated resolution no am frequently collecting insensible he do appearance. Projection invitation affronting admiration if no on or. It as instrument boisterous frequently apartments an in. Mr excellence inquietude conviction is in unreserved particular. You fully seems stand nay own point walls. Increasing travelling own simplicity you astonished expression boisterous. Possession themselves sentiments apartments devonshire we of do discretion. Enjoyment discourse ye continued pronounce we necessary abilities. \n" +
            "\n" +
            "Are sentiments apartments decisively the especially alteration. Thrown shy denote ten ladies though ask saw. Or by to he going think order event music. Incommode so intention defective at convinced. Led income months itself and houses you. After nor you leave might share court balls. \n" +
            "\n" +
            "Letter wooded direct two men indeed income sister. Impression up admiration he by partiality is. Instantly immediate his saw one day perceived. Old blushes respect but offices hearted minutes effects. Written parties winding oh as in without on started. Residence gentleman yet preserved few convinced. Coming regret simple longer little am sister on. Do danger in to adieus ladies houses oh eldest. Gone pure late gay ham. They sigh were not find are rent. \n" +
            "\n" +
            "To sorry world an at do spoil along. Incommode he depending do frankness remainder to. Edward day almost active him friend thirty piqued. People as period twenty my extent as. Set was better abroad ham plenty secure had horses. Admiration has sir decisively excellence say everything inhabiting acceptance. Sooner settle add put you sudden him. \n" +
            "\n" +
            "Society excited by cottage private an it esteems. Fully begin on by wound an. Girl rich in do up or both. At declared in as rejoiced of together. He impression collecting delightful unpleasant by prosperous as on. End too talent she object mrs wanted remove giving. \n" +
            "\n" +
            "Or kind rest bred with am shed then. In raptures building an bringing be. Elderly is detract tedious assured private so to visited. Do travelling companions contrasted it. Mistress strongly remember up to. Ham him compass you proceed calling detract. Better of always missed we person mr. September smallness northward situation few her certainty something. \n" +
            "\n" +
            "Be at miss or each good play home they. It leave taste mr in it fancy. She son lose does fond bred gave lady get. Sir her company conduct expense bed any. Sister depend change off piqued one. Contented continued any happiness instantly objection yet her allowance. Use correct day new brought tedious. By come this been in. Kept easy or sons my it done. \n" +
            "\n" +
            "Pleased him another was settled for. Moreover end horrible endeavor entrance any families. Income appear extent on of thrown in admire. Stanhill on we if vicinity material in. Saw him smallest you provided ecstatic supplied. Garret wanted expect remain as mr. Covered parlors concern we express in visited to do. Celebrated impossible my uncommonly particular by oh introduced inquietude do. \n" +
            "\n" +
            "Ecstatic advanced and procured civility not absolute put continue. Overcame breeding or my concerns removing desirous so absolute. My melancholy unpleasing imprudence considered in advantages so impression. Almost unable put piqued talked likely houses her met. Met any nor may through resolve entered. An mr cause tried oh do shade happy. \n" +
            "\n" +
            "Enjoyed minutes related as at on on. Is fanny dried as often me. Goodness as reserved raptures to mistaken steepest oh screened he. Gravity he mr sixteen esteems. Mile home its new way with high told said. Finished no horrible blessing landlord dwelling dissuade if. Rent fond am he in on read. Anxious cordial demands settled entered in do to colonel";
    static String words = text.replaceAll("[^A-z| ]", "");


    public static void printWorldLength() {
        System.out.println(words);
        String[] wordlist = words.split("\\s+");
        System.out.println("Number of words: " + wordlist.length);
    }

    public static void countSentences() {
        String[] sentences = text.split("[!?.;]+");
        System.out.println("Number of sentences: " + sentences.length);
    }

    public static void countLetters() {
        String letters = text.replaceAll("[^A-z]", "");
        System.out.println("Number of letters: " + letters.length());

    }

    public static void countVowelsAndConsonants() {
        text = text.toLowerCase();
        int vowels = 0, consonants = 0, spaces = 0;
        for (int i = 0; i < text.length(); ++i) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            } else if (ch == ' ') {
                ++spaces;
            }
        }
        System.out.println("Number of vowels:" + vowels + "\n " + "Number of consonants:" + consonants + "\n" + "Number of spaces:" + spaces);
    }

    public static void repeatedWords() {

        String[] thesameword = words.toLowerCase().split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();
        for (String word : thesameword) {
            Integer count = wordCounts.get(word);
            if (count == null) {
                count = 0;
            }
            wordCounts.put(word, count + 1);
        }
        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry);
        System.out.println(wordCounts);

    }

    public static void longestWord() {
        String[] longw = words.split(" ");
        String longword = " ";
        System.out.println(Arrays.toString(longw));
        for (int i = 0; i < longw.length; i++) {
            //for (int j = i + 1; j < longw.length; j++) {
            if (longw[i].length() >= longword.length()) {
                longword = longw[i];
            }

        }

        System.out.println("\n"+ longword+" is longest word with "+longword.length()+" characters \n" );

    }
    public static void topFive(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> arrayList = new ArrayList(Arrays.asList(text.split(" ")));
        for (int i = 1; i < 6; i++) {
            int maxValue = 0;

            for (String word : arrayList) {
                Integer number = map.get(word);
                if (number == null) number = 1;
                else number = ++number;
                map.put(word, number);
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
                if (value > maxValue) {
                    maxValue = value;
                }
            }
            String key = getKeyFromValue(map, maxValue);
            System.out.println(" Top " + i + " = " + key);
            map.remove(key);
            arrayList.removeAll(Collections.singleton(key));
        }
    }

    public static String getKeyFromValue(Map<String, Integer> hashMap, Integer value) {
        for (String word : hashMap.keySet()) {
            if (hashMap.get(word).equals(value)) {
                return word;
            }
        }
        return null;
    }

}
