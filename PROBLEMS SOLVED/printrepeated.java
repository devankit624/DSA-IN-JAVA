// Repeated character in a astring
public char getmaxfreq(String s){
    int[] freq = new int[26];
    for (int i = 0; i < s.length() ; i++){
        char currchar = s.charAt(i);
        freq[currchar - 'a']++;
    }
    int maxfreq = -1;
    char ans = 'a';
    for (int i =0; i < 26 ; i++){
        if(freq[i] > maxfreq){
            maxfreq = freq[i];
            ans = (char)(i + 'a');
        }
    }
    return ans;
}
