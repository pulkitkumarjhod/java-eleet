class Solution {
public:
    string countAndSay(int n) {
        string current="1";
        for(int step=1; step<n; ++step) {
            string s;//new string
            //
            int pos=0;
            while(pos<current.size()) {
                // for current[pos] find its' count
                char ch=current[pos];
                int cnt=0;
                while((pos<current.size()) and (current[pos]==ch)) {
                    pos++;
                    cnt++;
                }
                // write count and character into result
                s=s+to_string(cnt)+ch;
            }
            current=s;
        }
        return current;
    }
};