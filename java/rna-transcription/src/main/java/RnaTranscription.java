class RnaTranscription {

    String transcribe(String dnaStrand) {
        String[] arr = dnaStrand.split("");
        StringBuilder sb = new StringBuilder();
        do {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equalsIgnoreCase("G")) {
                    sb.append("C");
                } else if (arr[i].equalsIgnoreCase("C")) {
                    sb.append("G");
                } else if (arr[i].equalsIgnoreCase("T")) {
                    sb.append("A");
                } else if (arr[i].equalsIgnoreCase("A")) {
                    sb.append("U");
                }
            }
        }
        while (sb.length() == 4);
        return sb.toString();
    }
}
